class Solution {
    public boolean checkIfPangram(String sentence) {
        // Set<Character> t = new HashSet<Character>();
        // for(int i =0;i<sentence.length();i++){
        //     t.add(sentence.charAt(i));
            
        // }
        // if(t.size()==26) return true;
        // return false;
        for(char ch = 'a';ch<='z';ch++ ){
            if(!sentence.contains(String.valueOf(ch))) return false;
        }
        return true;
        
    }
}