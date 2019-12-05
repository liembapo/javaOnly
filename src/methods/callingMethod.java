//Write a method that takes two Strings. Check if the second String is found
//        inside of the first String. If it does, remove that part from the String,
//        but if the second String is not in the first
//        String ask the user to enter another String to try again
package methods;


import staticClass.Lexus;

public class callingMethod {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String correctOne = "cybertek1234";
//        String containWord = "";
//        do {
//            System.out.println("enter your word: ");
//             containWord = input.nextLine();
//             removesContain(correctOne,containWord);
//
//        }while(!correctOne.contains(containWord));
//    }
//
//    public static void removesContain(String strOne, String strTwo){
//        String finalWord = "";
//        if(strOne.contains(strTwo)){
//            finalWord = strOne.replace(strTwo,"");
//            System.out.println(finalWord);
//        }
        Lexus abc = new Lexus("c-class",2019);
        Lexus bca = new Lexus("b-class",2018);
        System.out.println();
        abc.info();
        System.out.println();
        System.out.println(Lexus.totalNumOfLexus);
    }
}
