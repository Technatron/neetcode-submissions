class Solution {
    public boolean isPalindrome(String s) {
        // String w = s.replaceAll("\\s+", ""); 
        // System.out.println(Character.isLetter('2'));
        // System.out.println(Character.isLetter('#'));
        // System.out.println(Character.isLetter('_'));
        
        StringBuilder w = new StringBuilder();
        boolean isPalindrome = true;

        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                w.append(Character.toLowerCase(s.charAt(i)));
            }
            // if(Character.isDigit(s.charAt(i))) return false;
        }
        System.out.println("Cleaned String: "+w);
        if(w.length()==0) return true;
        int j = w.length()-1;
        // if(w.length()==1 && s.length()>1) return false;

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
