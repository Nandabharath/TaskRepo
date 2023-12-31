package Basic6;

public class Lab099 {
    public static void main(String[] args) {
        int mark[]= {98,89,78,76,90};
        System.out.println(mark[3]);
        int[] marks ={98,89,78,98,90};

         int legnth =marks.length;
        System.out.println(legnth);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        //System.out.println(marks_10[5);  // Exception in thread "main"
        //        // Index - 0 to (length -1)

        int[] a =new int[4];
        // a -> [0,0,0,0] - default value of int -> 0
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        a[0]=89;
        a[1]=78;
        a[2]=89;
        System.out.println(a[0]);
        //System.out.println(a[5]); // java.lang.ArrayIndexOutOfBoundsException

        final int[] b= new int[4];//b[]=0000
        b[0]=89;
        System.out.println(b[0]);
        b[0]=98;
        System.out.println(b[0]);

        //final in array index is fixec and constant not element




    }
}
