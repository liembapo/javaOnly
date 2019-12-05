package StringBuilder;

import works.A;

import java.util.ArrayList;

public class StringBuilderTasks {

    public static ArrayList insertWord(ArrayList <String> word){

        for (int i = 0; i < word.size(); i++) {
            if(word.get(i).length()%2==0){
                int indexMid = word.get(i).length()/2;
                StringBuilder kurry = new StringBuilder(word.get(i));
                kurry = kurry.insert(indexMid,"-Hello-");
                word.set(i ,kurry.toString());
            }
        }
        return word;
    }

    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<String>();
        word.add("bobby");
        word.add("boby");
        word.add("bobbyy");
        word.add("boobby");
        word.add("bo000bby");
        insertWord(word);
        System.out.println(word.get(2));
        System.gc();
    }
}
