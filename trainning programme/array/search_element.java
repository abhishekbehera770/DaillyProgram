// search a number in an array
public class search_element {

    public static void main(String[] args) {
        int num = 5;
        int arr[] = {1, 3, 5, 6, 7};
        int len = arr.length;
        boolean found = false;
        for (int i = 0; i < len; i++) {
            if (arr[i] == num) {

                found = true;
                break;
            }
        }

        if (found == true) {
            System.out.println("number found ");
        } else {
            System.out.println("number is not  found");

        }

    }

}
