//find the second largest number in an array where the large elements comes 2 times 

public class second_largest2 {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 70, 70};

        int len = arr.length;
        int large = 1;
        int large1 = 1;
        

        for (int i = 0; i < len; i++) {
            if (arr[i] > large) {

                large1 = large;
                large = arr[i];
            } else if (arr[i] > large1 && arr[i] != large) {

                large1 = arr[i];
            }

        }
        System.out.println(" the secons largest element is " + large1);
    }
}

// import java.util.Arrays;

// public class second_largest2 {
//     public static void main(String[] args) {
//         int arr[] = {10, 20, 30, 40, 50, 70, 70};

//         // Step 1: Sort in descending order
//         Arrays.sort(arr);
//         int len = arr.length;

//         // Step 2: Traverse from second last to find second largest
//         int largest = arr[len - 1];
//         int secondLargest = -1;

//         for (int i = len - 2; i >= 0; i--) {
//             if (arr[i] != largest) {
//                 secondLargest = arr[i];
//                 break;
//             }
//         }

//         if (secondLargest != -1) {
//             System.out.println("The second largest element is " + secondLargest);
//         } else {
//             System.out.println("No second largest element found.");
//         }
//     }
// }