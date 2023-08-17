//1. You are given a string that contains only lowercase and uppercase alphabets.
//2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
//        For "abecd", the answer should be "a1b3e-2c1d", as
//        'b'-'a' = 1
//        'e'-'b' = 3
//        'c'-'e' = -2
//        'd'-'c' = 1

public class Difference_of_2_consecutive_characters {
    public static void main(String[] args) {
        String s = "abddkao";
        System.out.println(findDifference(s));
    }

    static String findDifference(String s){
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        for (int i=1 ; i<s.length() ; i++){
            char current = s.charAt(i);
            char previous = s.charAt(i-1);
            int difference = current - previous;
            result.append(difference);
            result.append(current);
        }
        return result.toString();
    }
}

//Output : 

// a1b2d0d7k-10a14o
