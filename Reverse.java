class Reverse{
public static void main(String ar[])
{
int i=76866; int s=0;
while(i>0)
{
int r=i%10;
s=s*10+r;
i=i/10;
}
System.out.println(s);
 

}
}
