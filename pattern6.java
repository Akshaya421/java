public class pattern6 {
   public static void main(String[] args){
    int n=5;
    for(int i=0; i<=n; i++){
        for(int j=0; j<=n-i; j++){
         
            System.out.print("_");
}
        
        for(int k=0; k<=i; k++){
  
           System.out.print(k+"_"); 
        } for(int l=0; l<=n-i-1; l++){
  
           System.out.print("_"); 
        } 
        
        System.out.println(" ");
    } 
    
}
   /*
______0______ 
_____0_1_____ 
____0_1_2____ 
___0_1_2_3___ 
__0_1_2_3_4__ 
_0_1_2_3_4_5_ 
   */

}
    


