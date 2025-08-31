
import java.util.*;

public class linear_search1 {
   
public static  void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size:");
    int n=s.nextInt();
    System.out.println("Enter the array elemts");
    int arr[]=new int[n];
    for (int i = 0 ; i< arr.length; i++) {
        arr[i]=s.nextInt();
        
    }
        int t=3;
        int res=search(arr,t);
        if(res!=-1){
            System.out.println("element found:"+res);
        }else{
            System.out.println("element not found:");
        }
    s.close();
    }
     public static  int search(int []arr,int t){
        for(int i=0;i<arr.length; i++){
            if(arr[i]==t){
                return i;
            }
        } return -1;
}
} //Enter the size:
//4
//Enter the array elemts
//1 2 3 4
//element found:2


