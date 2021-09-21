import java.util.Scanner;
class MyThirdClass{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter basic salary");
int salary=sc.nextInt();
float tax=0;
float hra=0.15f;
float da=0.60f;
float totalsalary=0;
if(salary<=500000){
tax=0.0f;
}
else if(salary>500000 && salary<1000000)
{
tax=0.20f;
}
else{
tax=0.30f;
}
tax=salary*tax;
totalsalary=salary+(salary*hra)+(salary*da)-tax;
System.out.println(totalsalary);
}

}
