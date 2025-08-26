
class pattern10 {
    public static void main(String[] args) {
        int n=5;
        int temp=0;
        for(int i =0; i<=n; i++){
           temp=temp +(int)Math.pow(10,i);
           System.out.println(temp*i);
        }
    }
}
