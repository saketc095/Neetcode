class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", ""); 
        int left = 0;
        int right = cleanString.length()-1;

        while(left < right){
            char l = Character.toLowerCase(cleanString.charAt(left));
            char r = Character.toLowerCase(cleanString.charAt(right));
            if(Character.isLetterOrDigit(l) && Character.isLetterOrDigit(r) && l != r) {
                System.out.println(l + " " + r);
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
