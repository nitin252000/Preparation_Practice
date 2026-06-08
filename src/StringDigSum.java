public class StringDigSum {
    public static void main(String[] args) {
        String s="ab12pq34";
        //Using Java 8
        //Create a stream of characters in string
        //filter stream to include only digit character in stream
        //Map the Filtered characters to respective numeric value
        //Sum the numeric value using teminal operation sum
        int sum=s.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
        System.out.println("Sum Of Digits in String :"+sum);
    }
}
