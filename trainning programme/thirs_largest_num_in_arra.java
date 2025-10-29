    
public class thirs_largest_num_in_arra {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50 ,70 ,70};

        int len = arr.length;
        int large = 1;
        int large1 = 1;
        int large2=1;

         for (int i = 0; i < len; i++) {
            if (arr[i] > large) {
                large2 = large1;
                large1 = large;
                large = arr[i];
            } 
            else if (arr[i] > large1 && arr[i] != large) {
                large2 = large1;
                large1 = arr[i];
            } 
            else if (arr[i] > large2 && arr[i] != large && arr[i] != large1) {
                large2 = arr[i];
            }
        }
        System.out.println(" the third largest element is " + large2);
        } 
    }


