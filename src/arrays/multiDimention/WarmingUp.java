package arrays.multiDimention;

        import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.gc();
        // TASK 1

//        System.out.println("Enter word:");
//        String str = input.next().toLowerCase();

        // Your code here
        //------------------------------------
        String word = "";
        String help = "";

        // for(int i = 0 ; i < str.length();i++){
        //     word = str.charAt(i) + "";
        //     if(!help.contains(word)){
        //         help+= word;
        //         int count = 0;
        //         for(int j =0 ; j<str.length();j++){
        //             if(word.equals(str.charAt(j)+"")){
        //                 count++;

        //             }
        //         }
        //         if(word.equals("r")){
        //             System.out.print(word +":" + count );
        //         }else{
        //             System.out.print(word +":" + count + " ");
        //         }
        //     }
        // }
        System.out.println();
        // TASK 2
        // Your code here
        // ------------------------------------

        int money = 100;
        int totalPrice = 0;
        int countEligible=3;
        int countItem = 0;
        do{
            System.out.println("Enter cost of item:");
            int price = input.nextInt();
            totalPrice+=price;
            if(money>totalPrice) {
                countItem++;
                countEligible--;
                if(countEligible==0){
                    System.out.println("You bought " + countItem+ " items, spent $" + totalPrice+ " and done shopping\n");
                    break;
                }
                System.out.println("You spent $" + totalPrice + " so far");
                System.out.println("You may buy up to " + countEligible + " items");
            }else if(money<totalPrice){
                totalPrice-= price;
                System.out.println("You can't spend more than $100 \n");
            }
            else {
                countItem++;
                System.out.println("You bought " + countItem + " items, spent $"+ totalPrice+" and done shopping\n");
            }
        }while (totalPrice<100);


        // TASK 3
        // Your code here
        //------------------------------------
        // int [] arr = {5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2};
        // String add="";
        // for (int a =0 ; a < arr.length;a++){
        //     int counting = 0;
        //     for(int b =0 ; b< arr.length;b++){
        //         if(arr[a]==arr[b]){
        //             counting++;
        //         }
        //     }
        //     if(counting==1){
        //         add += arr[a]+ " ";
        //     }
        // }
        // System.out.print(add.substring(0,add.length()-1));
    }
}