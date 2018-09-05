class Armstrong{
public static void main(String ar[])
{
int n=153; int s=0;
int i=n;
while(i>0)
{
int r=i%10;
s=s+r*r*r;
i=i/10;
}
if(s==n)
{
System.out.println("armstrong");
}
else
{
System.out.println("no");
}
 

}
}
