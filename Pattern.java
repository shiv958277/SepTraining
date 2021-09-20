import java.util.Scanner;
class MySecondClass{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter row limit");
   int n=sc.nextInt();
   int temp=1;
   int tem=n;
   for(int i=1;i<=n;i++){
   for(int k=tem;k>=1;k--){
   System.out.print(" ");
}
   tem=tem-1;
   for(int j=1;j<=temp;j++){
  System.out.print("*");
}
temp=temp+2;
System.out.println();
}

}}
