//reverse an array using the one extra array

public class reverse_array_array {
    
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,50};
        int len=arr1.length;
        int arr2[]=new int[len];
        int j=0;

        for (int i = len-1; i >= 0; i--) {
           arr2[j]=arr1[i];
           j++;
        }
        System.out.println("show the array");
        for(int i=0;i<len;i++){
            System.out.println(arr2[i]);
        }
    }
}


