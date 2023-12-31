package Basic6;

public class Lab103 {
    public static void main(String[] args) {
        int[] arr1 = {99, 92, 33, 43, 15};
       // int arr2[] = {99, 92, 33, 43, 15};
        int arr2[] = new int[arr1.length];
        // Double this array
        for (int i = 0; i < arr1.length; i++) {
            int res = arr1[i] * 2;
            System.out.println(res);//    System.out.println(arr1[i] * 2);
        }
        //Copying all elements of one array into another
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i]*2;
        }
            System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        //Displaying elements of array arr2
        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }


    }
}
