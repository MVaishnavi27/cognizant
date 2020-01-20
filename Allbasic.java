/*import java.util.*;
 class A
{
 	public static void main(String args[])
		{
		int c;
		Scanner s=new Scanner(System.in);
		c=s.nextInt();
		switch(c)
		{
		case 1:System.out.println("MONDAY");break;
		case 2:System.out.println("TUESDAY");break;
		case 3:System.out.println("WED");break;
		case 4:System.out.println("THURS");break;
		case 5:System.out.println("FRIDAY");break;
		case 6:System.out.println("SAT");break;
		case 7:System.out.println("SUNDAY");break;
		default:System.out.println("Enter a valid number");break;
		
		}
		}
} 
*/


/*
class A
{
 	public static void main(String args[])
		{
		int i;
		for(i=1;i<=10;i++)
		{
		if(i==4)
			continue;
		System.out.println(i);
		}
		}}

*/



/*

class A
{
 	public static void main(String args[])
		{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
	{
			System.out.print(j);
			}
System.out.println("");
		}
}}
*/



/*
class A
{
 	public static void main(String args[])
		{
		int i=1;
		while(i<=5)
		{
		int j=1;
		while(i>=j)
		{
		System.out.print(j);
		j++;
		}
		System.out.println("");		
		i++;
		}
		}
 }
*/


/*
class Student
{
int id;
String name;
String branch;
int fee;

void setStudent(int stuid,String stuname,String stubranch,int stufee)
{
	 id=stuid;
	name=stuname;
	branch=stubranch;
	fee=stufee;
}
void getStudent()
{
System.out.println("id"+id+"branch"+branch+"name"+name+"fee"+fee);
}
public static void main(String args[])
{
Student s=new Student();
s.setStudent(1,"a","cse",20);
s.getStudent();
}
}
*/



/*
class A
{
static int n;
int Fact(int n1)
{
n=1;
for(int i=1;i<=n1;i++)
{
n=n*i;
}
return n;
}

public static void main(String args[])
{
A f=new A();
f.Fact(5);
System.out.println(n);

}
}
*/


/*
class A
{
static int Fact(int n)
{
if(n==0)
return 1;
else
return n*Fact(n-1);
}
public static void main(String args[])
{
int i,f=1;
int num=5;
f=Fact(num);
System.out.println(f);
}
}
*/

/*
import java.util.*;
class A
{
static int r;
static int Calci(int n,int a,int  b)
{
switch(n)
{
case 1:
r=a+b;
System.out.println(r);
break;
case 2:
r=a-b;
System.out.println(r);
break;
case 3:
r=a*b;
System.out.println(r);
break;
case 4:
r=a/b;
System.out.println(r);
break;
default:System.out.println("Enter valid operation");
}
return r;
}
public static void main(String args[])
{
int c,c1,c2,n1;
Scanner s=new Scanner(System.in);
c=s.nextInt();
c1=s.nextInt();
n1=s.nextInt();
c2=Calci(n1,c,c1);
}
}
*/



/*
import java.util.*;
class A
{
static int r;
static int add(int a,int  b)
{
r=a+b;
return r;
}
static int sub(int a,int  b)
{
r=a-b;
return r;
}
static int mul(int a,int b)
{
r=a*b;
return r;
}
static int div(int a,int b)
{
r=a/b;
return r;
}
public static void main(String args[])
{
int c,c1,c2,n1;
Scanner s=new Scanner(System.in);
c=s.nextInt();
c1=s.nextInt();
c2=s.nextInt();
switch(c)
{
case 1:
add(c1,c2);
break;
case 2:
sub(c1,c2);
break;
case 3:
mul(c1,c2);
break;
case 4:
div(c1,c2);
break;
}
System.out.println(r);
}
}

*/


/*
import java.util.*;
class Volume
{
int len,wid,height;
static int v;
void setVolume(int blen,int bwid,int bheight)
{
	 len=blen;
	wid=bwid;
	height=bheight;
	int v1;
v1=Volume(len,wid,height);
System.out.println(v1);
} 
void  getVolume()
{

System.out.println("len"+len+"width"+wid+"height"+height);
}
int Volume(int a,int b,int c)
{
v=a*b*c;
return v;
}

public static void main(String args[])
{
Volume s=new Volume();
s.setVolume(1,2,4);
s.getVolume();
}
}

*/


/*

class ArrayExample
{
	public static void main(String args[])
	{
		int arr[]={12,28,45,60};
		int []arr1={34,49,58,90};
		//print array
		for (int i=0;i<=arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		// foreach loop
		for(int i:arr)
		{
		System.out.println(i);
		}
	}
}
*/


/*
//min and max in array


class A
{
	public static void main(String args[])
	{
	int arr[]={2,5,8,1,6};
	int min=arr[0];
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(min>arr[i])
		{
		 min=arr[i];
		}
		if(arr[i]>max)
		{
		max=arr[i];
		}
	}
System.out.println(min);
System.out.println(max);
}
}

*/



//ascending and descending order

/*
class A
{
	public static void main(String args[])
	{
	int arr[]={2,5,8,1,6};
	int temp=0;
	for(int i=0;i<arr.length;i++)
	{		 	
	for(int j=i+1;j<arr.length;j++)
	{
	if(arr[i]>arr[j])
	{
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}	}
System.out.println(arr[i]);
}
for(int i=0;i<arr.length;i++)
	{		 	
	for(int j=i+1;j<arr.length;j++)
	{
	if(arr[i]< arr[j])
	{
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}	}
System.out.println(arr[i]);
}
	
}}
*/

//sum and average
/*
class A
{
	public static void main(String args[])
	{
	int arr[]={2,5,8,1,6};
	int s=0;
	for(int i=0;i<arr.length;i++)
	{		 	
	s=s+arr[i];
	}
System.out.println(s);
int a=0;
a=s/arr.length;
System.out.println(a);
}}
*/


//multiplication of array 2d


class Array2d
{
	public static void main(String args[])
	{
	int a[][]={};
	int b[][]={};
	int c[][]={};
	Scanner s=new Scanner(System.in);	
	a[][]=s.new int[][];
	b[][]=s.new int[][];
	m=s.nextInt();
	n=s.nextInt();
	l=s.nextInt();
	for(int i=0;i<m;i++)				
	{
	for(int j=0;j<n;j++)
	{
	System.out.println(a[i][j]);
}}
for(int j=0;j<m;j++)
	{
	for(int k=0;k<l;k++)
	{
	System.out.println(b[j][k]);
}}
for(int i=0;i<m;i++)
	{
for(int j=0;i<n;i++)
{
	for(int k=0;k<l;k++)
	{
	c[][]=((a[i][j]*b[j][k])+(a[i][j+1]*b[j+1][k]));
	System.out.println(c[i][k]);
}}
}
}}




		