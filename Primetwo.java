import java.util.*;
import java.io.*;
public class Primetwo
{
    static int N=200000;
            public static int prime[ ]=new int[N];
            public static int arr[ ]=new int[N];
            public static void sieve( )
            {
                for(int i=0;i<N;i++)
                {
                   prime[i]=1;
                }
                 prime[0]=0;
                 prime[1]=0;
                 for(int i=2;i*i<N;i++)
                {
                      if(prime[i]==1)
                      {
                         for(int j=i*i;j<N;j+=i)
                         {
                             prime[j]=0;
                         }
                      }
                }
           }
   
    public static void main(String args[]) throws IOException
    {
                sieve( );
                int s,n,c=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Range ");
                s=sc.nextInt( );  
                n=sc.nextInt( );
                System.out.println("Number of Twin primes in given range are");
                for(int i=s;i<=n;i++)
                {
                      if(prime[i]==1&&prime[i+2]==1)
                      {
                             c=c+1;
                             //System.out.println(i+" "+(i+2));
                      }
                }
                System.out.println(c);   
    }
}

Output_____________________________________________________________________________________
Enter Range
5
30
Number of Twin primes in given range are
4