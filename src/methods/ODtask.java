package methods;

public class ODtask {
    public static void main(String[] args) {
        dayName("day","name",4);
        System.out.println("\n");

        System.out.println(wordCheck("jamesjail","ja",2));
    }
    public static void dayName(String day,String name){
        System.out.println(day+name);
    }

    public static void dayName(String word, String yaya, int num){
        for (int i =0 ; i<num;i++){
            if(i==num-1){
                System.out.print(word);
            }else {
                System.out.print(word + yaya);
            }
        }
    }
    public static boolean wordCheck(String word, String begin){
        if(word.startsWith("begin")) return true;
        return  false;
    }
    public static boolean wordCheck(String word,String check,int num){
       int count = 0;
       for(int i = 0 ;i < word.length()-check.length()+1;i++){
           String sub = word.substring(i,i+check.length());
           if(sub.equals(check) ){
               count++;
           }
       }
        if(count==num) return true;
        return false;
    }
}
