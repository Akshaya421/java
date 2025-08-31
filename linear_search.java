public class linear_search {
    public static  int search(int []arr,int t){
        for(int i=0;i<arr.length; i++){
            if(arr[i]==t){
                return i;
            }
        } return -1;
}
public static  void main(String args[]){
        int arr[]={1,2,3,4,5};
        int t=3;
        int res=search(arr,t);
        if(res!=-1){
            System.out.println("element found:"+res);
        }else{
            System.out.println("element not found:");
        }
    
    }
} //element found:2
