import java.util.Scanner;
class MyThirdClass{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter basic salary");
int salary=sc.nextInt();
int hra=(15/100)*salary;
int da=(6/100)*salary;
int tax=0,gs,ns;
gs=salary+hra+da;
System.out.println(gs);
if(gs<=500000){
gs=gs+tax;
} 

else if(gs>=500001&&gs<=1000000){
tax=gs*(20/100); 
}
else if(salary>=1000001){
tax=gs*(30/100);
}
System.out.println(gs);
ns=gs-tax;
System.out.println(ns);
}}
