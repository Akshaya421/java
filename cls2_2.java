import java.util.*;
public class p1 {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the year:");
    int year=s.newInt();
    if((year%4==0 && year %100!=0)&& year %400==0){
        System.out.println("It is leap year");
    }else{
        System.out.println("It is  not a leap year");
    }

}

