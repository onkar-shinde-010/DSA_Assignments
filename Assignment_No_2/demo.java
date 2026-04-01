class Demo{
    public static void main(String args[]){
        int n=10;
        int original=n;
        int sum =0;
        while(n>0){
            int digit=  n%10;
            sum = sum + digit;
            n= n/10;
        }
        if(original % sum==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not Harshad Num");
        }
    }
}