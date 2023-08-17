//1. You are given a string.
//2. You have to print all permutations of the given string iteratively.

public class All_Permutations_of_String_Iteratively {
    public static void main(String[] args) {
        String s = "abc";
        int str_len = s.length();
        for(int i=0 ; i<findFactorial(str_len) ; i++){
            StringBuilder sb = new StringBuilder(s);
            int remain_index; //the index that'll come out to get printed
            int quotient=i; //that get divided at first by the divisor below at every iteration. But later on it get replaced by new quotient.
            for(int divisor=str_len ; divisor>=1 ; divisor--){
                remain_index=quotient%divisor;
                quotient/=divisor;
                System.out.print(sb.charAt(remain_index));
                sb.deleteCharAt(remain_index);
            }
            System.out.println();
        }
    }

    static int findFactorial(int n){
        int factorial = 1;
        for (int i=2 ; i<=n ; i++){
            factorial*=i;
        }
        return factorial;
    }
}

//Output :

// abc
// bac
// cab
// acb
// bca
// cba

//Output in case of String "abcd" :

// abcd
// bacd
// cabd
// dabc
// acbd
// bcad
// cbad
// dbac
// adbc
// bdac
// cdab
// dcab
// abdc
// badc
// cadb
// dacb
// acdb
// bcda
// cbda
// dbca
// adcb
// bdca
// cdba
// dcba
