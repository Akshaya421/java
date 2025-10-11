import java.util.*;
public class remove_duplicates{
    public static void main(String[] args){
        int[] arr={9,7,8,3,9,7,2,4,1,3};
        // first we need to sort the array 
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //[1, 2, 3, 3, 4, 7, 7, 8, 9, 9] we got this then
        int index=0;
        System.out.println("initial value:"+arr[0]);
        /* here we comparing the arr[1] means 2 with arr[0] means 1
         2!=1 then true ...index increment due to initial arr[index means 0] stores 1
          so we don't overwrite it (1 unique and no duplicates ) 
         now arr[index=1]stores 2
         continue 
        */
        
        for(int i=1;i<arr.length; i++){
            if(arr[i]!=arr[index]){
                index++;
                arr[index]=arr[i];
            }
        }
        
       
        int[] s=Arrays.copyOf(arr,index+1);
        System.out.print(Arrays.toString(s));
        
    }
}
/* output :
[1, 2, 3, 3, 4, 7, 7, 8, 9, 9]
[1, 2, 3, 4, 7, 8, 9] */