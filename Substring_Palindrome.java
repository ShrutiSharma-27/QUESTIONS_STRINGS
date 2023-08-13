public class Substring_Palindrome {
    public static void main(String[] args){
        String s = "abccbc";
        for(int i=0 ; i<s.length() ; i++){
            for(int j=i+1 ; j<=s.length() ; j++){
                String subSTR = s.substring(i,j);
                if(isPalindrome(subSTR)) System.out.println(subSTR);
            }
        }
    }

    static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<=end){
            if (s.charAt(start)!=s.charAt(end)) return false;
            else start++; end--;
        }
        return true;
    }
}

//Output :

// a
// b
// bccb
// c
// cc
// c
// cbc
// b
// c
