package problem_conding;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "This is a cow";
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=arr.length-1; i>=0; i--) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println("String Before: "+ str);
        System.out.println("String After: "+ sb.toString());
    }
}
