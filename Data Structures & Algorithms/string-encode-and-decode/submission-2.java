class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0) return new String();

        StringBuilder sb = new StringBuilder();
        
        for( String s: strs){
            // System.out.println(s);
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        // System.out.println(sb);

        return sb.toString();
    }

    public List<String> decode(String str) {

        // System.out.println("Input String for decoder: "+str);
        // if(str.length()==0) return new ArrayList<String>(Arrays.asList(str));
        if(str.length()==0) return new ArrayList<String>();


        ArrayList<String> list = new ArrayList<>();

        int i=0;
        int start=0;
        while(i< str.length() ){
            int seperatorIndex = str.indexOf("#", i);
            // System.out.println("seperatorIndex: "+seperatorIndex);
            // System.out.println("length: "+str.substring(i, seperatorIndex));

            int lengthValue = Integer.parseInt(str.substring(i, seperatorIndex));
            
            start = seperatorIndex+1;
            String word = str.substring(start, start+lengthValue);
            // System.out.println("word: "+word);
            list.add(word);
            i= start+lengthValue;
            // start = start+lengthValue;
            // i++;
        }

        return list;
    }
}
