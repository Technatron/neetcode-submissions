class Solution {
    public boolean isValid(String s) {
        if(s.length()==0) return false;
        
        // boolean ans = false;
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        char first = s.charAt(0);

        Deque<Character> queue = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(c=='('|| c=='{' || c=='['){
                queue.push(c);
            }else{
                if(queue.isEmpty()) return false;
                char popped = queue.isEmpty()? ' ': queue.poll();
                System.out.println("Last: "+popped+" "+"current brace: "+c);
                if(map.get(popped)==null) return false;
                if(c!= map.get(popped)){
                    return false;
                }
                // else if(map.get(popped)==c) ans =true;
            }
        }
        if(queue.size()>0) return false;

        return true;
    }
}
