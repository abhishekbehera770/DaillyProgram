
// public class large_value {

//     public static void main(String[] args) {
//         int arr[] = {10, 20, 30, 40, 50};

//         int len = arr.length;
//         int large = arr[0];

//         for (int i = 0; i <= len; i++) {

//             if (arr[i + 1] < large) {
//                 large = arr[i + 1];
//             }
//         }
//         System.out.println("large element is " + large);

//     }
// }


public class large_value {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        int len = arr.length;
        int large = arr[0];

        for (int i = 1; i < len; i++) {
            if (arr[i] > large) {       
                large = arr[i];
            }
        }
        // for (int i = 1; i < len; i++) { 
        //     if (arr[i] < large) {       
        //         large = arr[i];
        //     }
        // }
        System.out.println("smallest element is " + large);
    }
}