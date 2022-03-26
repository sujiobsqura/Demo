class Armstrong
{
public static void main(String args[])
{
int r,num =0,i,temp;
int n=Integer.parseInt(args[0]);
//for(i=1;i<=500;i++)
{
temp=n;
while(temp!=0)
{
r=temp%10;
num=num+(r*r*r);
temp=temp/10;
}
if(n==num)
System.out.println("Armstrong");
else
	System.out.println("Not Armstrong    ");
}
}
}