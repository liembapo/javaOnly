//Position Task


package string;

public class Quiz10 {
    public static void main(String[] args) {
        String a =" “Sender: <James Bond>. From Number: [202-123-3456]. +Message: {“I love programming and problem solving} ";

        int b = a.indexOf("<");
        int c = a.indexOf(">");

        System.out.println("Sender is " + a.substring(b+1,c));

        int d = a.indexOf("[");
        int e = a.indexOf("]");

        System.out.println("Number is "+ a.substring(d+1,e));

        int f = a.indexOf("{");
        int g = a.indexOf("}");

        System.out.println("Message is "+ a.substring(f+1,g));


        }
}
