import java.util.*;
class MaxMinele{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int arr[]= new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println("Array is"+Arrays.toString(arr));
        
        MaxMinele s= new MaxMinele();
       int result= s.max(arr);
       System.out.println(result);



    }



    public int max(int[]arr){
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        
        return min;
    }
}


    
   
