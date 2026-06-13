import java.util.HashSet;

public class RemoveConsecutiveDuplicates {
    public static String removeDuplicates(String str){
        if(str==null || str.length()==0){
            return null;
        }
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(str.charAt(0));//S
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    public static String removeAllDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Suhhaaannii";

        System.out.println(removeDuplicates(str));
        System.out.println(removeAllDuplicates(str));
    }
}
