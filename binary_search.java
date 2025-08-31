public class binary_search {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int t =5;
        int res=search(arr,t);
        if(res!=-1){
            System.out.println("ELement found:"+res);
        }else {
            System.out.println("ELement not found");
        }
        

    }
    public static int search(int arr[],int t){
        int left=0;
        int right=arr.length -1;
        while(left<=right){
        int mid=(left+right )/2;
            if(arr[mid]==t){
                return mid;
            }else if(arr[mid]<t){
                left=mid+1;
            }else{
                right=mid-1;
            }
            
        } return -1;
    }
}
//ELement found:4
