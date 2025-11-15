public class pattern8 {
   public static void main(String[] args){
    int n=5;
    for(int j=0; j<n; j++){
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
      /*
    a 
   aba 
  abcba 
 abcdcba 
abcdedcba 
      */
    
}

} 

