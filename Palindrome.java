class Palindrome{
public static void main(String ar[])
{
int n=121; int s=0;
int i=n;
while(i>0)
{
int r=i%10;
s=s*10+r;
i=i/10;
}
if(s==n)
{
System.out.println("palindrome");
}
else
{
System.out.println("no");
}
 

}
}
