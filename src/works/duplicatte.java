package works;

import java.util.ArrayList;

public class duplicatte {
    public static void main(String[] args) {

        String [] r = { "1","aa","b","1","b","b"};


        int count = 0;
        for(int i =0 ; i< r.length ; i++){
                for(int j =0; j < r.length;j++){
                    if(i==j){
                        continue;
                    }
                    if(r[i]==r[j]) {
                        count++;
                    }
                }
            }
        System.out.println(count);
    }
}

