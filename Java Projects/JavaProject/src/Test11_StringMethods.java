public class Test11_StringMethods {
    public static void main (String[] args) {
        String str = "  QWERTY  ";
        boolean result = str.equals("qwerty");
        boolean result2 = str.equalsIgnoreCase("qwerty"),
                isEmpty = str.isEmpty();
        int length = str.length();
        char char_At = str.charAt(3);
        String  Uppcase = str.toUpperCase(),
                Lowcase = str.toLowerCase(),
                strStrim = str.trim(),
                replaced_STR = str.replace('Q', 'Z') ;



        System.out.println(result);
        System.out.println(result2);
        System.out.println(length);
        System.out.println(char_At);
        System.out.println(isEmpty);
        System.out.println(Uppcase);
        System.out.println(Lowcase);
        System.out.println(strStrim);
        System.out.println(replaced_STR);
    }
}
