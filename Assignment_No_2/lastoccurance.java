import java.util.Scanner;

public class lastoccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int [n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int index  = fun(arr, arr.length-1,num);
        System.out.println(index);

    }
    static int fun(int []arr, int index, int num){
        if(index==0){
            return -1;
        }
        if(arr[index]==num){
            return index;
        }
        return fun(arr, index-1, num);
    }
}
