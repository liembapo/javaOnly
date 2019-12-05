package mentoring.tuesday;

import java.util.ArrayList;

public class realClass {
    public static void main(String[] args) {


        Student bobby = new Student();
        bobby.firstName = "Fat";
        bobby.lastName = "Ass";
        bobby.age = 29;
        bobby.isActive = true;

        Student kurry = new Student();
        kurry.firstName = "Kurmanzhan";
        kurry.lastName = "Ahmadnova";
        kurry.age = 28;
        kurry.isActive = false;

        Student nurdin = new Student();
        nurdin.firstName = "Nur";
        nurdin.lastName = "Din";
        nurdin.age = 27;
        nurdin.isActive = true;

        ArrayList<Student> active = new ArrayList<>();
        active.add(bobby);
        active.add(kurry);
        active.add(nurdin);

        for (int i = 0; i < active.size(); i++) {
            if(active.get(i).isActive ){

                System.out.println(active.get(i).firstName + " " + active.get(i).lastName);
            }

        }
    }
}