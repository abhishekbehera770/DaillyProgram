
public class second_large_element_in_arra {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50 ,70 ,70};

        int len = arr.length;
        int large = 1;
        int large1 = 1;

        for (int i = 0; i < len; i++) {
            if (arr[i] > large) {
                large1 = large;
                large = arr[i];
            } else if (arr[i] > large1) {
                large1 = arr[i];
            }
            
        }

        System.out.println(" the secons largest element is " + large1);
    }
}
