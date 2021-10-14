import java.util.ArrayList;
import java.util.List;
public class Query1 {
    public static void main(String[] args) {

        /* 
            nums1 will be able to access the methods which belogs natively to 
            the ArrayList class as well as List interface
        */
        ArrayList<Integer> nums1 = new ArrayList<>();


        /* 
            nums2 will be able to access the methods which belogs to List interface
            and which are being overrided (Implemented) inside the ArrayList class.
            And not those methods which natively belogs to the ArrayList class.
        */
        List<Integer> nums2 = new ArrayList<Integer>();
        
    }
}
