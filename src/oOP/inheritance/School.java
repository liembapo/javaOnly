package oOP.inheritance;

public class School {


    String name ;
    String address;
    String type;
//public School(String name){
//    this.name = name;
//
//}

    public void giveHW(){
        System.out.printf("%s is giving home work",name);
    }
    public  void hostEvent(String date){

        System.out.printf("Hosting an event on %s",date);
    }
}
