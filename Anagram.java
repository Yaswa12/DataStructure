public class Anagram{
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        int[] char_count= new int[26]; 
        for(int i=0;i<s.length();i++){
            char_count[s.charAt(i)-'a']++;
            char_count[t.charAt(i)-'a']--;
        }
        for(int count:char_count){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String s="anagram"; 
        String t="nagaram";
        boolean result = anagram.isAnagram(s, t);
        if (result) {
            System.out.println("The strings \"" + s + "\" and \"" + t + "\" are anagrams.");
        } else {
            System.out.println("The strings \"" + s + "\" and \"" + t + "\" are not anagrams.");
        }
        
    }
}
