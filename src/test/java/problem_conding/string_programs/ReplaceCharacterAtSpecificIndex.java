package problem_conding.string_programs;

public class ReplaceCharacterAtSpecificIndex {
    public static void main(String[] args) {
        String str = "Hello India!";

        System.out.println(replaceCharUsingStringBuilder(str,6,'T'));
        System.out.println(replaceCharUsingStringBuilder(str,6,'J'));
        System.out.println(replaceCharUsingString(str,6,'K'));
        System.out.println("Original String Object: "+ str);
    }
    public static String replaceCharUsingString(String str, int index, char c) {
        if (str.isEmpty())
            return "";

        return str.substring(0,index)+c+str.substring(index+1).toString();
    }
    public static String replaceCharUsingStringBuilder(String str,int index,char c) {
        StringBuilder builder = new StringBuilder(str);
        builder.setCharAt(index,c);
        return builder.toString();
    }
    public static String replaceCharUsingStringBuffer(String str,int index,char c) {
        StringBuffer buffer = new StringBuffer(str);
        buffer.setCharAt(index,c);
        return buffer.toString();
    }
}
