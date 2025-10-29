
public class Diamond_of_Star {

    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * *
//     *