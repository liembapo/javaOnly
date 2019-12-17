package mentoring.GurhanRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GurhanMethods {
    public static void login() {
        String expecId = "johnjava";
        String expecPass = "123456";


        Scanner scan = new Scanner(System.in);
        System.out.print(" please enter your ID ");
        String iD = scan.nextLine();
        System.out.print(" please enter your password ");
        String pass = scan.nextLine();

        if (iD.equalsIgnoreCase(expecId) && pass.equals(expecPass)) System.out.println("login succesfully");
        else System.out.println("either your Account Id or Password is not correct");

//
    }
    public static int mon;
   public static String director ;

    static {

        mon = 10;
        System.out.print("its bobby");
    }
    static {

        mon += 180;
        System.out.println(" and who are you?");}
    public static boolean isPalindrome(String builder){
        mon++;
        builder = builder.trim().toLowerCase();
        for (int i = 0; i < builder.length()/2; i++) {
            if(builder.charAt(i)==builder.charAt(builder.length()-1)-i)continue;
            return false;
        }
        return true;
    }

    public static String resultCount(String builder){
        int s = builder.indexOf("(")+1;
        int e = builder.indexOf(")");
        return (builder.substring(s,e));
    }
    public static boolean doesContain(String builder){
        builder = builder.toLowerCase();
        String [] boby = builder.split("\\.");
        if( boby[2].contains("massa"))return true;
        return false;
    } public static boolean isAnagram(String a,String b){
        char [] z = a.toCharArray() ;
        char [] x = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(z);
        if(Arrays.equals(x,z))return true;


        return false;
    }
    public static void beFibonachhi(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int [] num = new int [a];
        num[0]=0;
        num[1]=1;
        String b = "0 + 1 ";
        for (int i = 2; i < num.length; i++) {
            num[i]=num[i-2]+num[i-1];
            b+= " + " + num[i];
        }
        System.out.println(b);
    }

    public static void main(String[] args) {
//        login();
//        System.out.println(isPalindrome("Civic "));
//        System.out.println(resultCount("About 1,910,000,000 results (1.39 seconds)"));
//        System.out.println(isAnagram("islent","lentis"));
//        System.out.println(doesContain("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Risus in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut. Quisque non tellus orci ac. In nisl nisi scelerisque eu ultrices vitae auctor eu augue.\n"));

//    beFibonachhi();


        System.out.println(mon);

        mon -= 100;

        System.out.println(mon);
        director = director.substring(0,3);
        System.out.println(director);

        System.gc();
    }


}
