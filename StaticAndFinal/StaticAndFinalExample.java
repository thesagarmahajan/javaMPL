package StaticAndFinal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class StaticAndFinalExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using className.StaticMemberName syntax to access static members 
        Student.setClgName("IIT Mumbai");

        ArrayList<Student> divisiona = new ArrayList<>();

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        Student st = null;

        for(int i=1;i<=n;i++){
            System.out.println(i);
            String name = sc.nextLine();
            st = new Student(name);
            divisiona.add(st);
        }

        System.out.println(st.toString());
        
        // for(int i=0;i<n;i++){
        //     System.out.println(divisiona.get(i).toString());
        // }
        
    }
}
