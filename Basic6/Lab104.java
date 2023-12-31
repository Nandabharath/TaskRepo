package Basic6;

public class Lab104 {
    public static void main(String[] args) {
        int[] int_arr= {2,3,3,5,6};
        long[] long_arr={39l,78l,98l,90l};
        float[] float_arr={23.2f,34.5f,45.7f,90.0f};
        double[] double_arr ={67.0,90.98,67.90};

        boolean[] b_array = {true,false,true,false};
        char[] c_array = {'A','B','D'};
        String[] str_arry={"nanda","hiremath"};
        System.out.println(int_arr.length);
        System.out.println(str_arry.length);

        for (int i = 0; i < str_arry.length; i++) {
            System.out.println(str_arry[i]);
        }

    }
}
