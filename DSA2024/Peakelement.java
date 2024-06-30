
// Input: n = 3, arr[] = {1, 2, 3} 
// Output: 1
// Explanation: If the index returned is 2, then the output printed will be 1. Since arr[2] = 3 is greater than its adjacent elements, and there is no element after it, we can consider it as a peak element. No other index satisfies the same property, so answer will be printed as 0.
// Input: n = 7, arr[] = {1, 1, 1, 2, 1, 1, 1}
// Output: 1
// Explanation: In this case there are 5 peak elements with indices as {0,1,3,5,6}. Returning any of them will give you correct answer.
// import java.util.Scanner;
// class Peakelement{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//        int arr[]= new int[n];
//        for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//        }
//     //    for(int i=0;i<n;i++){
//     //     System.out.println(arr[i]);
//     //    }
       

//        Peakelement obj = new Peakelement();
//       int result= obj.Peak(arr);
//       System.out.println(result);
//     }


//     public int Peak(int arr[]){

//         for(int i=1;i<arr.length;i++){
//             if(arr[i-1]<=arr[i] && arr[i+1]>=arr[i]){
//                 return i ;
//             }
//         }
//         return -1;
//     }
// } 




