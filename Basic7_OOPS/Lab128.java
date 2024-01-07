package Basic7_OOPS;

public class Lab128 {
    public static void main(String[] args) {
        //reverse string
      String name ="Nanda";
      char [] char_array = name.toCharArray();
        System.out.println(char_array.length);

        //output --adnaN

        int left =0;
        int right =char_array.length-1;

        while (left < right){
            char temp = char_array[left];
            char_array[left]=char_array[right];
            char_array[right]=temp;

            left++;
            right--;

        }
        System.out.println(char_array);
    }
}
