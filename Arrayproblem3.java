import java.util.Scanner;

public class Arrayproblem3 {
//     swap without temp variable

static void swapWithoutTemp(int a , int b ){

    System.out.println("original values before swap ");
    System.out.println("a= " +a);
    System.out.println("b= " +b);
 
  
 a = a+b;
 b = a-b;
 a = a-b;

 System.out.println("values after swap");
 System.out.println("a = " + a);
 System.out.println("b = "+b);  
}


    //  to swap array elements using temp variable 
 static void swap(int a , int b ){
    System.out.println("original values before swap ");
    System.out.println("a= " +a);
    System.out.println("b= " +b);
 
  
 int temp = a;
 a = b;
 b= temp;

 System.out.println("values after swap");
 System.out.println("a = " + a);
 System.out.println("b = "+b);

  
 }

//   reverse the order of the array 

static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
   System.out.println(arr[i] + "");

    }
    System.out.println();
}


// static int[] reverseArray(int[] arr){
//     int n = arr.length;
//     int [] ans =  new int[n];
//     // int j =0;

//     //  traverse the original arrays in reverse 

//     // for (int i = n-1; i >= 0 ; i--) {
//     //     ans[j++]= arr[i];
        
//     // }

//     int i = n-1 , j=0;
//     while (i >=0) {
//         ans[j++] = arr[i--];

        
//     }

//     return ans ;


// }

//  reverse without making the memory use 

static void swapInArray(int [] arr , int i , int j ){
    int temp = arr[i]; 
    arr[i] = arr[j];
     arr[j] = temp;
}
  
static void reverseArray(int arr[]){
   int i = 0 , j = arr.length -1 ;
    while (i<j) {
        swapInArray (arr , i , j);
        i++;
        j--;
        
    }
}

//  to rotate the array 

static int [] rotate(int[] arr ,int k){
    int n = arr.length;
    k = k % n;
    int [] ans = new int[n];
    int j = 0;


    for (int i = n-k; i < n; i++) {
     ans [j++] = arr[i] ;       
    }

    for (int i = 0; i < n-k; i++) {
        ans[j++] = arr[i];
        
    }
    return ans ;
}
   

 


    public static void main(String[] args) {
        
        int a = 9;
        int b = 3;

        int [] arr = {1,2,3,4,5,};
        // int [] ans =reverseArray(arr);
        // 

        

        // swap(a, b);
        // swapWithoutTemp(a, b);
        //    reverseArray(arr);
        //    printArray(arr);
             

        Scanner sc  =  new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        System.out.println("Enter " + n +  " elements ");
         for (int i = 0; i < arr.length; i++) {
            arr[i] =  sc.nextInt();

         }

         System.out.println("Enter k : " );
         int k = sc.nextInt();

          
         System.out.println("original array");
          printArray(arr);
          int []  ans = rotate(arr, k);
          System.out.println("Array after rotation ");
          printArray(ans );
  














































































































    }
    
}
