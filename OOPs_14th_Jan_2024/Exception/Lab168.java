package OOPs_14th_Jan_2024.Exception;

import java.io.File;
import java.io.FileReader;

public class Lab168 {
    public static void main(String[] args) {
try {
    String path = "c://a.text";
    File file = new File(path);
    FileReader fr = new FileReader(file);
}catch (Exception e){
    System.out.println(e.getMessage());

}

    }
}
