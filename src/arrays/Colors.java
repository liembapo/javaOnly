//Create String array for the colors.
//        Initialize 4 colors.
//        Loop through each element using for loop and print each color names.
//
//        Part II
//        Print the color names if the length of the color is 4 or more.


package arrays;
public class Colors {
    public static void main(String[] args) {
        String [] colors = {"red", "green","orange", "blue"};
        for(int i =0; i < colors.length; i++) {
            String color = colors[i];
            if(colors[i].length() >= 4) {
                System.out.println(color);
            }
        }
    }
}
