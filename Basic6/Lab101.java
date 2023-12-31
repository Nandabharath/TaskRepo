package Basic6;

public class Lab101 {
    public static void main(String[] args) {
        int[] arr1 ={2,3,4,5,6,};

        System.out.println("Length ->" + arr1.length);
        System.out.println("ref address" + arr1);

        for(int i=0; i<=4;i++){
            System.out.println(arr1[i]);
        }


        for (int i = 0; i <= arr1.length-1; i++) {
            System.out.println(arr1[i]);
        }
    }
}
