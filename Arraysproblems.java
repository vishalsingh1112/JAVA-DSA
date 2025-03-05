public class Arraysproblems {
    public static void main(String[] args) {

        // int [] arr = {1,2,4,5,6,1};
        // int sum = 0;

        // for (int i = 0; i < arr.length; i++) {
        // sum = sum + arr[i];

        // }
        // System.out.println(sum);




        // maximum value out of all the elements in the arrays

        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 24 };
        // int ans = 0;

        // for (int i = 0; i < arr.length; i++) {

        //     if (arr[i] > ans) {
        //         ans = arr[i]; 
        //     }
        // }
        // System.out.println("max is " + ans);





        // search the given elements x in the array . if present then return the index
        // else return -1


     int arr [] = {1,2,3,2,4,5,6,7,8,9};
     int x = 2;
      int ans = -1;

      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            ans =i;
            break;
            
        }
       
      }
      System.out.println("found " +x + " at index "+ ans  );


































































    }

}
