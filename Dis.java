class Dis{ 
public static void main(String ar[])
{
int amt(int x)
{
if(x>5000)
{
int dis=x*0.5;
 int total=x-dis;
}
else if(x>1000)
{
int dis=x*0.2;
int total=x-dis;
}
else if(x>500)
{
int dis=x*0.1;
int total=x-dis;
}

 return total;

}
int y = amt(750);
System.out.println( y+'\n');
int bill(int z)
{
	int n= z/500;
	int f=z%500;
	if(n>0)
	{
		System.out.println( "500 *"+n+'\n');
	}
	
}
	bill(int y);
}
}