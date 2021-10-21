//import java.util.Arrays;
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        else if (0 <= x && x <= 9) {
            return true;
        }
        else  {
            // Convert integer to array
            String number = String.valueOf(x);
            int[] array_1 = new int[number.length()];
            for (int i = 0; i < number.length(); i++) {
                array_1[i] = number.charAt(i) - '0';
            }
            //System.out.println(Arrays.toString(array_1));
            
            // Reverse array                                    
            int length = array_1.length;
            for (int i = 0; i < length / 2; i++) {
                int swap = array_1[i];
                array_1[i] = array_1[length - i - 1];
                array_1[length - i - 1] = swap;
            }
            //System.out.println(Arrays.toString(array_1));
            
            // Convert reversed array to integer
            int res = 0;
            for (int i = 0; i < array_1.length; i++) {
                res = res * 10 + array_1[i];
            }
            //System.out.println(res);
            
            //if (Arrays.toString(array_1) == Arrays.toString(array_2)) {
            if (x == res) {
                return true;
            }
            else {
                return false;
            }
        }
        
    }
}
