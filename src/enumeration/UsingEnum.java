package enumeration;

public class UsingEnum {
    public static void main(String[] args) {
        Base.LetterGrade grade;
        grade = Base.LetterGrade.B;

        getGrade(grade);



    }
    public static void getGrade(Base.LetterGrade grade){
        switch (grade){
            case A: System.out.println("You got an A");break;
            case B: System.out.println("not bad");break;
            case C:System.out.println("you could do better");break;
            case D: System.out.println("not so good");break;
            case F:System.out.println("you failed");break;

        }
    }
}
