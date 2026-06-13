public class printSubstrings {
    public static void printSubStr(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
              System.out.println(str.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        String input="abc";
        printSubStr(input);

    }
}
