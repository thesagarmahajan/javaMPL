package JavaEight.NewIterators;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NewIterators {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        Random r = new Random();

        for (int i = 1; i <= 10; i++) {
            nums.add(r.nextInt(1000));
        }

        // List<Integer> squares = nums.stream().map(num -> num*num).collect(Collectors.toList());
        
        // List<Integer> squares = nums.stream().filter(num -> num%2==0).collect(Collectors.toList());

        List<String> electronics = Arrays.asList("Laptops", "Smartphones", "Smarwatches");
        List<String> wfh = Arrays.asList("Office Chairs", "Desks", "Cofee Mugs", "Tables Lamps");
        List<String> fashion = Arrays.asList("Men", "Women", "Kids");
        List<List<String>> productCategories = new ArrayList<>();
        productCategories.add(electronics);
        productCategories.add(wfh);
        productCategories.add(fashion);

        System.out.println("-----------Original Structure-----------");
        System.out.println(productCategories);

        // Flattening using for
        // List<String> products = new ArrayList<>();

        /* for (List<String> cat : productCategories) {

            for (String productName : cat) {

                products.add(productName);

            }

        } */

        List<String> products = productCategories.stream().flatMap(plist -> plist.stream()).collect(Collectors.toList());
        System.out.println(products);

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
