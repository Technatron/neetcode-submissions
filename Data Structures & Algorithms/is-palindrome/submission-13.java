class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        StringBuilder w = new StringBuilder();
        boolean isPalindrome = true;

        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                w.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println("Cleaned String: "+w);
        if(w.length()==0) return true;
        int j = w.length()-1;

        for(int i=0; i< w.length() && j>0; ){
            if( w.charAt(i) != w.charAt(j) ){
                return false;
            }
            i++;
            j--;
        }

        return isPalindrome;
    }
}
