package javaapplication12;

public class patternA {
    public static void main(String[] args) {
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<8;j++)
            {
          if(i==1)
          {
              if(j==4)
              {
                  System.out.print("*"); 
              }
              else
                  System.out.print(" ");
          }
          if(i==2)
          {
              if((j==3) || (j==5))
              {
                  System.out.print("*"); 
              }
              else
                  System.out.print(" ");
          }
        
             if(i==3)
          {
              if((j>=2) && (j<=6))
              {
                  System.out.print("*"); 
              }
              else
                  System.out.print(" ");
          }
             
               if(i==4)
          {
              if((j==1) || (j==7))
              {
                  System.out.print("*"); 
              }
              else
                  System.out.print(" ");
          }
       
        }
            System.out.println();
        }
    }
    }

