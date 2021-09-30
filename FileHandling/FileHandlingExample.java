package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample{
    public static void main(String[] args) {
        // C:\Users\Mobile Programming\Documents\Trainings\javaTraining\FileHandling\myfile.txt
        File f1 = new File("C:\\Users\\Mobile Programming\\Documents\\Trainings\\javaTraining\\FileHandling\\myfile.txt");
        try {
            /* FileWriter fw = new FileWriter("C:\\User\\Mobile Programming\\Documents\\Trainings\\javaTraining\\FileHandling\\myfile.txt");
            fw.write("Some random string");
            fw.close(); */
            Scanner sc = new Scanner(f1);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Some issuw | Please contact developer.");
            // TODO Auto-generated catch block
            e.printStackTrace();
            // Logs
        }
    
    }
}