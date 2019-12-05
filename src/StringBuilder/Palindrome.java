package StringBuilder;

public class Palindrome {

    public static boolean isPalindrome(String word) {

        StringBuilder check = new StringBuilder(word);
        String a = check.reverse().toString();
        if (a.equalsIgnoreCase(word)) {
            return true;
        }
        return false;
    }

    public static String deleteWord(String string) {
        if (string.contains("con")) {
            int a = string.indexOf("con");

            StringBuilder word = new StringBuilder(string);
            word = word.delete(a, (a + 3));

            return word.toString();
        }
        System.out.println(string);
        return "does not contain \" con \" ";
    }

    public static String deleteWord(String a, String b) {
        if (a.contains(b)) {
            int ab = a.indexOf(b);

            StringBuilder word = new StringBuilder(a);
            word = word.delete(ab,ab+(b.length()));

            return word.toString();
        }
        return "does not contain " + b;
    }

    public static void main(String[] args) {


//        System.out.println(isPalindrome("Civic"));

        StringBuilder bob = new StringBuilder("bobby");

        bob = bob.append(" handsome");
        System.out.println(Integer.toHexString(System.identityHashCode(bob)));
        bob = bob.reverse();
        System.out.println(Integer.toHexString(System.identityHashCode(bob)));

        String zz = "bobby";
        System.out.println(Integer.toHexString(System.identityHashCode(zz)));

        zz = zz + " Liem ";
        System.out.println(Integer.toHexString(System.identityHashCode(zz)));


        System.out.println(deleteWord("\nI want to cncate"));
        System.out.println(deleteWord("\nI want to concate", " want"));

        String b = " i want to concate the concate";


    }
}
