class max{
    public static void main(String[] args) {
        int arr[]={100, 200,700,8000,2000,1000};
        int max = f(arr,0);
        System.err.println(max);
    }
    static int f(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int max = f(arr, index +1 );
    return Math.max(arr[index],max);
    }
    
    
}