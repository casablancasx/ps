public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("Processo Seletivo"));
        System.out.println(reverseStringWithASwap("Processo Seletivo"));
    }

    private static String reverseString(String string){
        StringBuffer sb = new StringBuffer(string);
        return sb.reverse().toString();
    }

    private static String reverseStringWithASwap(String string){
        var arrayReversed = string.toCharArray();
        var lastIndex = string.length() -1;
        for(int i = 0; i< string.length();i++){
            arrayReversed[i] = string.charAt(lastIndex - i);
            arrayReversed[lastIndex - i] = string.charAt(i);
        }
        return String.valueOf(arrayReversed);
    }

}
