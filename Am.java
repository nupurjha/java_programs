class Am{
public static void main(String ar[])
{
int n=1; 
while(n<=100)
{
int i=n;
	int s=0;
while(i>0)
{
int r=i%10;
s=s+r*r*r;
i=i/10;

}
if(s==n)
{
	System.out.println(s);
}
else
{
	System.out.println("error");
}
n=n+1;

}

}
}
