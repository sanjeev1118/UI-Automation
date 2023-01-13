package problem_conding;

public class RevereseWordAtSamePosition {
    public static void main(String[] args) {
        String str = "This is a cow"; // op:  sihT si a woc
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            for (int j=chars.length-1; j>=0; j--) {
                sb.append(chars[j]);
            }
            sb.append(" ");
        }
        System.out.println("String Before: "+ str);
        System.out.println("String After: "+ sb.toString());
    }
}
