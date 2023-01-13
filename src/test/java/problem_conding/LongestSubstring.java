package problem_conding;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        String firstsubstr = "";
        String secondsubstr = "";

        for(int i=0; i<str.length()-1; i++) {
            for(int j=i+1; j<str.length(); j++) {
                firstsubstr = str.substring(i,j);
               if(firstsubstr.contains(""+str.charAt(j)) && firstsubstr.length()<secondsubstr.length())
                   secondsubstr = firstsubstr;
            }
        }
        System.out.println("Length of Longest Substring:- "+ firstsubstr.length());
    }
}
