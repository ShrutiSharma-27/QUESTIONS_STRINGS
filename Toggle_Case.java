//1. You are given a string that contains only lowercase and uppercase alphabets.
//2. You have to toggle the case of every character of the given string.


public class Toggle_Case {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("ElePHanT");
        System.out.println(toggled(s));
    }

    static StringBuilder toggled(StringBuilder sb){
        for (int i=0 ; i<sb.length() ; i++){
            char c = sb.charAt(i);
            if(c>='a' && c<='z'){
                char upper_case = (char)('A' + c - 'a'); //'A' + gap : hence the uppercase letter will be achieved
                sb.setCharAt(i,upper_case);
            }
            else{
                char lower_case = (char)('a' + c - 'A');
                sb.setCharAt(i,lower_case);
            }
        }
        return sb;
    }
}

//Output :

// eLEphANt
