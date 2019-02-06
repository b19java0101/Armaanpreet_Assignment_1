import java.util.Scanner;
public class primenum {
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int flag=0;
      for(int i=2;i<=n/2;i++)
      {
          if(n%i==0)
          {
              flag=1;
          }
      }
          if (flag==1)
          {
                System.out.println("number is not prime");
          }
          else
             System.out.println("number is  prime");

      
      
        
    }
    
}
