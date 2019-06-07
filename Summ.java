import java.util.*;
import java.lang.*;
 public class Summ
 {
  public static void main(String[] args) {
    int p,i,sum=0;
    Scanner sc=new Scanner(System.in);
    p=sc.nextInt();
    int a[]  = new int[p];
    for(i=0;i<p;i++)
    {
      a[i]=sc.nextInt();
      sum=sum+a[i];
      }
    System.out.println(sum);
    }
  }
