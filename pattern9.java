public class pattern9 {
   public static void main(String[] args){
    int n=5;
        for(int j=n-1; j>=0; j--){
        for(int k=0; k<n-j-1; k++)
            System.out.print(" ");

        for(int i=0; i<j+1; i++){
         
            System.out.print((char)('a'+i));
}
        
        for(int i=j; i>0; i--){
  
           System.out.print((char)('a'+(i-1))); 
        }
        
        System.out.println(" ");
    } 
    
}

}
/*
abcdedcba 
 abcdcba 
  abcba 
   aba 
    a 
*/
 

