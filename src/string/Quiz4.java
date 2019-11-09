
package string;

import java.util.Scanner;

        public class Quiz4 {
            public static void main(String[] args) {
                String word = "We will have a picnic when the weather gets nicer";
                Scanner input = new Scanner(System.in);
                System.out.print("Aim the word to change : ");
                String userInput = input.nextLine();
                System.out.print("put the words to change it : ");
                String userInput2 = input.nextLine();

                String newWord = word.toLowerCase().replace(userInput,userInput2);

                System.out.println(newWord);


            }
        }

