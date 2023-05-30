public class Main {     
    public static void printStars(int n)    
    {        
        int i, j;         
    for(i=n-1; i<=0; i--){          
        for(j=1; j<=i; j++){ 
                    System.out.print("  "); 
                             }                      
                             for(j=1; j<=i; j++){           
                                 System.out.print("* ");           
                                 }                      
                                 System.out.println();   
                                 }    }    
                                public static void main(String args[])    
                                {         
                                    int n = 5;    
                                    printStars(n);    
                                    } }