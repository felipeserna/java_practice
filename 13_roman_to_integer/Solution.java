class Solution {
    public int romanToInt(String s) {
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                output += 50;
            }
            if (s.charAt(i) == 'V') {
                output += 5;
            }
            if (s.charAt(i) == 'M') {
                output += 1000;
            }
            else if (s.charAt(i) == 'D') {
                output += 500;
            }
            if (i + 1 < s.length() && s.charAt(i) == 'C') {
                if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                    output -= 100;
                    }
                else {
                    output += 100;
                    }
                }
            if (i + 1 == s.length() && s.charAt(i) == 'C') {
                output += 100;
            }
            if (i + 1 < s.length() && s.charAt(i) == 'X') {
                if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                    output -= 10;
                    }
                else {
                    output += 10;
                    }
                }
            if (i + 1 == s.length() && s.charAt(i) == 'X') {
                output += 10;
            }
            if (i + 1 < s.length() && s.charAt(i) == 'I') {
                if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                    output -= 1;
                    }
                else {
                    output += 1;
                    }
                }
            if (i + 1 == s.length() && s.charAt(i) == 'I') {
                output += 1;
            }
        }
        return output;
    }
}
