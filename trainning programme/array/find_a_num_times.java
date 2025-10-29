

public class find_a_num_times {

    public static void main(String[] args) {
        int key = 5;
        int arr[] = {1, 3, 5, 6, 7, 5, 5, 6, 7, 5,};//5->4times
        int len = arr.length;//9
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("my key value is " + count + " times appears");

    }

}
