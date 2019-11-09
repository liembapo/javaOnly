package methods;

import java.util.Arrays;

public class AgainoverloadedTask {

    public static void main(String[] args) {
        String [] arraaa = {"how","are","you","baby"};

        increaseArray(arraaa,"bobby",1);
    }
    String [] arraaa = {"how","are","you","baby"};

        public static String [] increaseArray(String [] arr, String word) {
            String [] newArr = new String[arr.length + 1];
            for(int i=0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[newArr.length-1] = word;
            return newArr;
        }
        public static void increaseArray(String [] arr, String word,int num){

        String[]newArr = new String[arr.length+1];

        for(int i =0,j=0 ; j < newArr.length ; j++){
            if(j==num){
                newArr[j]=word;
            }else{
                newArr[j]=arr[i];

                i++;
            }
        }
            System.out.println(Arrays.toString(newArr));
        }
}
