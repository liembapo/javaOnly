package oOP.encapsulation;

public class CheckingApp {
    public static void main(String[] args) {

        App whatsapp = new App("WhatsApp","Social Network",2.3);
        whatsapp.appInfo();
        whatsapp.updateApp();
        whatsapp.setSize(2.6);

//        App.setReviews();
    }
}
