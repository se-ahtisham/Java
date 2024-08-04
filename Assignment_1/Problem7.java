public class Problem7
{
public static void main(String [] args)
{

int number=12345;
int sum=0;
int reminder=0;
while(number!=0)
{
reminder=number%10;
sum+=reminder;
number/=10;
}
System.out.println("The Sum is: "+ sum);
}
}