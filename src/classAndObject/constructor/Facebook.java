package classAndObject.constructor;

public class Facebook {

    String username;
    String password;
    String name;
    int age;
    int numberOfFriend;

    public Facebook() {                              //constructor
        password = "default";
        age = 0;
        numberOfFriend = 0;
    }

    public Facebook(String usName, String pass) {
        this();
        username = usName;
        if (pass.toLowerCase().contains(usName.toLowerCase())) {
            System.out.println("dont use your name for your password");
            System.out.println(password);
        } else {
            System.out.println("all good");
            password = pass;
        }
    }

    public Facebook(String usName, String pass, String realName) {
        this(usName, pass);
        realName = realName.toLowerCase();
        boolean check = true;
        for (int i = 0; i < realName.length(); i++) {
            char a = realName.charAt(i);
            if (a < 'a' || a > 'z') {
                check = false;
                break;
            }
        }
        if (check) {
            name = realName;
        } else {
            System.out.println("shud be on alphabetic only");
        }
    }

    public Facebook(String usName, String pass, String realName, int agee, int friend) {
        this(usName, pass, realName);
        if (agee > 0) {
            age = agee;
        } else {
            System.out.println("invalid number of age");
            System.out.println(age);
        }
        if (friend > 0) {
            numberOfFriend = friend;
        } else {
            System.out.println("invalid number of friend");
            System.out.println(numberOfFriend);
        }
    }

    public void info() {
        System.out.println("Your name is " + name);
        System.out.println("Your username is " + username);
        System.out.println("Your password is " + password);
        System.out.println("Your age is " + age);
        System.out.println("Your friend is" + numberOfFriend);
    }

    public boolean sendFriendRequest(Facebook obj) {
        if (this.numberOfFriend > 5000) {
            System.out.println("you have reach limit of friend");
            return false;
        } else if (obj.numberOfFriend >= 5000) {
            System.out.println(obj.name + " Has reach the limit of friends");
        } else {
            numberOfFriend++;
            obj.numberOfFriend++;
            System.out.println("request sent");
            return true;
        }
    }

}
