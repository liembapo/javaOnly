package works;

public class B {
    public static int  sum67(int[] nums) {
        int sum =0;
        if(nums!=null){
            String num = "";
            for(int i =0 ; i<nums.length;i++){
                num+=nums[i];
            }

            while(num.contains("6")){
                int a = num.indexOf("6");
                int b = num.indexOf("7");

                for(int i =a;i<=b ; i++){
                    nums[i]=0;

                }

            }
            for (int value : nums) {
                sum += value;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int [] no = {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7};
        System.out.println(sum67(no));
    }
}
