public class pattern7 {
   public static void main(String[] args){
    int n=5;
    char ch='a';
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
         
            System.out.print(" ");
}
        
        for(int k=1; k<=i; k++){
  
           System.out.print(ch+" "); 
           ch++;
           
        } 
        
        for(int l=1; l<=i; l++){
  
           System.out.print(" "); 
           --ch;
        } 
        
        System.out.println(" ");
    } 
    
}

}
 
