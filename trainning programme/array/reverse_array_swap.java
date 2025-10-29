//revrse an array using swaping 

public class reverse_array_swap {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int len = arr.length;
        int a = 0;
        int b = len - 1;

        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        System.out.println("Reversed array is:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
