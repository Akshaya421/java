public class Missing_number{
    public static void main(String[] args){
        int N=10;
        int sum=0;
        int[] arr={1,6,9,10,2,7,5,4,8};
        /* initially add array and then 
        we know that sum of elements up to n elements is
        original_sum=n(n+1)/2
        then substract array sum from original_sum */
        for(int i=0; i<arr.length; i++){
               sum=sum+arr[i];
        }
        int o_sum=N*(N+1)/2;
        System.out.print(o_sum-sum);
        
    }
}