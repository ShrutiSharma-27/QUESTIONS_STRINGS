//1. You are given a string.
//2. You have to compress the given string in the following two ways -

//First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//For "aaabbccdee", the compressed string will be "abcde".
//Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//For "aaabbccdee", the compressed string will be "a3b2c2de2".

public class String_Compression {
    public static void main(String[] args) {
        String s = "abbbccdd" ;
        System.out.println(compression1(s));
        System.out.println(compression2 (s));
    }

    static String compression1(String s){
        String result = ""+s.charAt(0); //because IntelliJ is not allowing to give only a character value to the result string
        for (int i=1 ; i<s.length() ; i++){
            char current = s.charAt(i);
            char previous = s.charAt(i-1);
            if (current != previous){
                result+=current;
            }
        }
        return result;
    }

    static String compression2(String s){
        String result = ""+s.charAt(0);
        int sum=1;
        for (int i=1 ; i<s.length() ; i++){
            char current = s.charAt(i);
            char previous = s.charAt(i-1);
            if (current == previous){
                sum++;
            }
            else{ //for last character of string this loop will not execute so the sum will also not get added
                if(sum != 1) result+=sum; //first add sum of previous character
                result+=current; //then print new character
                sum=1; //start new character's sum from 1
            }
        }
        if (sum != 1) result+=sum; //to add sum of last character of string
        return result;
    }
}

//Output :

// abcd
// ab3c2d2
