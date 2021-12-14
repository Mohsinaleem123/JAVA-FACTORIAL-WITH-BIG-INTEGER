import java.util.Scanner ;
import java.math.BigInteger ;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main  (String[] args) {
       Scanner input =new Scanner(System.in);
       
       BigInteger a;
       BigInteger b,c=BigInteger.TEN ;
               int n=1,su=0;
       BigInteger sum =new BigInteger("0") ;       
        a=input.nextBigInteger();
           System.out.println(factorial(a));
           a=factorial(a);  
    while(  n>0){
          b=a.remainder(c);
          n=b.intValue();
          su=su+n;
          sum=sum.add(b);
          a=a.divide(c);
    }     
       System.out.println(su);
       
     
    }
public static BigInteger factorial (BigInteger factorial){
    long n =1;
    if (factorial.intValue()<=1)
        return BigInteger.valueOf(n) ;
    else 
        return  factorial.multiply(factorial(factorial.subtract(BigInteger.valueOf(n))));
      
}
}
        
