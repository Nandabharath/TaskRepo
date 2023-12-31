package Basic6;

public class Lab110 {
    public static void main(String[] args) {
        //1D
       // int[] oned_Arr={21,23,34,45};
        //int[] res = new int[3];
        //2D
        int a[]= {1,2,3};

        int[][] arr = new int[3][3];
        int res1[][]= new int[3][3];


        // row 0 to 2
        arr[0][0] = 12;
        arr[0][1] = 34;
        arr[0][2] = 34;

        // Initializing 2nd Array/2nd Row
        arr[1][0] = 100;
        arr[1][1] = 98;
        arr[1][2] = 45;
        // Initializing 3rd Array/3rd Row
        arr[2][0] = 1;
        arr[2][1] = 43;
        arr[2][2] = 45;
        //

        for(int i=0;i < a.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "\t");
            }

            System.out.println("");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }



    }
}
