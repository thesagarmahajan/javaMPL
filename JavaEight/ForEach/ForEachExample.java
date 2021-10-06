package JavaEight.ForEach;

import java.util.ArrayList;
import java.util.Random;

public class ForEachExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random r = new Random();
        for (int i = 1; i <= 10; i++) {
            nums.add(r.nextInt(1000));
        }

        /* for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        } */

        /* for (Integer num : nums) {
            System.out.println(num);
        } */

        /* nums.forEach(num -> {
            if(num%2==0){
                System.out.println(num);
            }
        }); */
        
    }
}
