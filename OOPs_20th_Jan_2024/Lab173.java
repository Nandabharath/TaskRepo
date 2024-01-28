package OOPs_20th_Jan_2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab173 {
    public static void main(String[] args) {
        int a= 10/0;// unchceked exception--JVM dont know
        //checked
        try {
            FileReader f =new FileReader(new File("//a.text"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
