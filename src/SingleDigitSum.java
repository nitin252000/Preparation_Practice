public class SingleDigitSum {
    public  static  int getSum(double n){
        String s= String.valueOf(n);
        s=s.replace(".","");
        int sum=0;
        for(char c:s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        while(sum>9){
            int temp=0;
            while(sum>0){
                temp+=sum%10;
                sum/=10;
            }sum=temp;
        }return sum;
    }
    public static void main(String[] args){
        double n=247;
        System.out.println(getSum(n));
    }
}
