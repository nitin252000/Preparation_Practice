import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s="hello";
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(map.get(c)==1){
                System.out.println("First Non Repaeating Character is"+c);
                break;
            }
        }
    }
}
