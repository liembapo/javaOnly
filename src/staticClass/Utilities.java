package staticClass;

public class Utilities {

        private String data;
        private int yint;

        public void insertData(String data, int yint){
            this.data = data;
            this.yint = yint;
        }

        public String getData(){
            return data;
        }
        public int getYint(){
            return yint;
        }
        public String setData(String a){
            data = a;
            return data;
        }
        public int setYint(int yi){
            yint=yi;
            return yint;
        }
    }