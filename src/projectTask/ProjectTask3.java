//Task 3
//        Given a String, str , perform the following conditional actions:
//        Check if str has 3 or more character, if less than 3 or bigger than 100 character, print only Invalid enter
//        Convert str to all lower characters
//        If number of character is odd convert middle character Upper case
//        If number of character is even convert middle two character Upper case (ex: name -> nAMe)
//        Sample Input:
//        apple
//        Sample Output:
//        apPle
//        Sample Input:
//        BANANA
//        Sample Output:
//        baNAna
//        Sample Input:
//        xy
//        Sample Output:
//        Invalid enter
package projectTask;

import java.util.*;

class ProjectTask3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter word : ");
        String user = input.nextLine();

        int a = user.length() / 2;
        String word1= " ";      //begining value,these are dinamic value after goes to if else
        String word2=" ";       //begining value,these are dinamic value after goes to if else
        String word3= " ";      //begining value,these are dinamic value after goes to if else

        if (user.length() >= 3 && user.length() <= 100) {

            user = user.toLowerCase();
            if (user.length() % 2 == 1) {
                System.out.println("its odd word");
                word1 = user.substring(0, a);
                String midLetter  = user.substring(a,a+1);
                word2 = midLetter.toUpperCase();
                word3 = user.substring(a + 1);

                System.out.println(word1 + word2 + word3);
            } else {
                System.out.println("its even word ");

                word1 = user.substring(0, a-1);
                word2 = user.substring(a-1, a + 1).toUpperCase();
                word3 = user.substring(a+1);
                System.out.println(word1 + word2 + word3);

            }
        }else{
            System.out.println("Invalid length of character");

        }
    }
}
