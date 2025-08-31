

public class bubble_sort {
    public static void main(String []args){
        int arr[]={8,6,9,2,4,5};
        int temp=0;
        System.out.println("Before sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }System.out.println();
        System.out.print("iterations");
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }
        System.out.println();
        for(int num : arr){
            System.out.print(num+" ");
        }
        }
        System.out.println();
       
        System.out.println("after sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
         System.out.println();
    }
}
    

//Before sorting
// 8 6 9 2 4 5
//iterations
//6 8 2 4 5 9
//6 2 4 5 8 9
//2 4 5 6 8 9
//2 4 5 6 8 9
//2 4 5 6 8 9
 //after sorting
//2 4 5 6 8 9

