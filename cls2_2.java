import java.util.*;
public class cls2_2 {
    Scanner s = new Scanner(System.in);
    System.out.print("enter the size of an array:");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.print("enter the array elements:");
    for(int i=0; i<n; i++){
        arr[i]=s.nextInt();
    }
}
