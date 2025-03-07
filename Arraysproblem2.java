import java.util.*;

public class Arraysproblem2 {

 static int lastOccurrence(int[] arr  , int x){
   int lastIndex = -1;
   for (int i = 0; i < arr.length; i++) {
    if (arr[i] == x) {
      lastIndex = i;        
    }
    
   }
   return lastIndex; 
 }



    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter the size of array");
      int n = sc.nextInt();

     
     int arr[] = new int[n];
     System.out.println("enter n elements");
     for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
        
     }
     
      
      System.out.println("enter x ");
      int x = sc.nextInt();
       int count = 0;

       for (int i = 0; i < arr.length; i++) {
        
        if (arr[i] >x) {
            count++;
            
        }
        
       }
       
       System.out.println(" the  elements greater than x is " + count);
    //    System.out.println("last occurrence " + lastOccurrence(arr, x));






























}
    
}
