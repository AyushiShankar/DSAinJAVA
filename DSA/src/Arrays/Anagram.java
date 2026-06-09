package Arrays;

import java.util.HashMap;

public class Anagram {
    
public static void main(String[] args) {
    String s = "listen";
    String t = "silent";
    System.out.println(isAnagram(s, t));
}
  public static boolean isAnagram(String s, String t) {
        if(t.length()!= s.length()) return false;
int left = 0;
HashMap<Character, Integer> map = new HashMap<>();

for (int i = 0; i < s.length(); i++){
    char ch = s.charAt(i);
    map.put(ch, map.getOrDefault(ch, 0)+1);
}

while(left < t.length()){
    char ch = t.charAt(left);
                if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
        map.put(ch, map.get(ch)-1);
        if(map.get(ch)==0){
            map.remove(ch);
        }
    left++;
}
return map.isEmpty() ? true : false;
    }
}
