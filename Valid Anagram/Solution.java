class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> Shm = new HashMap<>();
        HashMap<Character, Integer> Thm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Shm.put(s.charAt(i), Shm.getOrDefault(s.charAt(i),0)+1);
            Thm.put(t.charAt(i), Thm.getOrDefault(t.charAt(i),0)+1);
        }
        return Shm.equals(Thm);
    }
}
