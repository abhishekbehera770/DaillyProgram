public class large {
    
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        int len = arr.length;
        int large = arr[0];

        for (int i = 0; i <= len; i++) {

            if (arr[i + 1] > large) {
                large = arr[i + 1];
            }

        }
        System.out.println("large element is " + large);

    }
}


