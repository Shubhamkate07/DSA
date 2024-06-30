import java.util.*;

public class Reverse {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int arr[]= new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println("orignial array is:"+Arrays.toString(arr));

        Reverse s= new Reverse();
        // s.RevfunLeft(arr); //left to right 
        s.RevfunRight(arr); //right to left 
    }

    public void RevfunLeft(int arr[]){
// left to right 
int fisrt=arr[0];
for (int i = 0; i < arr.length-1; i++) {
    arr[i]=arr[i+1];

}
arr[arr.length-1]=fisrt;

System.out.println(Arrays.toString(arr));
    }


    public void RevfunRight(int arr[]){
        // left to right 
        int last=arr[arr.length-1];
        for (int i = arr.length-1; i>0; i--) {
            arr[i]=arr[i-1];
        
        }
        arr[0]=last;
        
        System.out.println(Arrays.toString(arr));
            }



    

}
