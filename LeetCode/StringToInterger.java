class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0 || str.trim().length() == 0) return 0;

        String s = str.trim();
        int i = 0, n = s.length(), maxIntLen = String.valueOf(Integer.MAX_VALUE).length();
        char operator = ' ';
        
        // step1: parse operator
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) operator = s.charAt(i++);
        // step2: parse zero
        while (i < n && s.charAt(i) == '0') i++; // parse 0
        // step3: get number string
        StringBuffer sb = getNumStr(s, i);

        // validation1: max length over max integer length
        if (sb.length() > maxIntLen) return operator == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        // validateion2: exceed min/max value
        long num = Long.parseLong(sb.toString()) * (operator == '-' ? -1 : 1);
        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) num;
    }
    
    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
    
    private StringBuffer getNumStr(String s, int i) {
        StringBuffer sb = new StringBuffer();
        if (i >= s.length() || !isDigit(s.charAt(i))) {
            sb.append(0); // leading char validation, return 0 if invalid
            return sb; 
        }
        while (i < s.length()) {
            char c = s.charAt(i++);
            if (!isDigit(c)) break;
            sb.append(c);
        }
        return sb;
    }
}