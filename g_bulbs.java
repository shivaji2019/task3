import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
public class g_bulbs {
static long total = 0;
public static void main(String[] args)
{
g_bulbs sol=new g_bulbs();

sol.glowing();
}
public void glowing()
{
    Scanner sc = new Scanner(System.in);
int test_cases = sc.nextInt();
for(int n=0;n<test_cases;n++)
{
String on = sc.next();
long input = sc.nextLong();
char swt[]=new char[100];
swt=on.toCharArray();
List<Integer> list = new LinkedList<Integer>();
for(int i=0;i<on.length();i++)
{
if(swt[i] == '1')
{
list.add(i+1);
}
}
if(list.size() == 1)
{
System.out.println(list.get(0)*input);
}
else
{
long low = list.get(0);
long high = list.get(0)*input;
long bulbsOn= 0;

while(low <= high)
{
long count = 0;
long mid = (low + high)/2;
for(int i=0;i<list.size();i++)
{
long d = mid/list.get(i);
count = count + d;
}

for(int i=2;i<=list.size();i++)
{
total = 0;
first(list,list.size(),i,mid);
if(i%2==0)
{
count = count - total;
}
else
{
    count = count + total;

}
}
if(count < input)
{
     low = mid + 1;

}
else
{
   
    bulbsOn = mid;
high = mid - 1 ;
}
}
System.out.println( bulbsOn);
}
}
sc.close();

}


public static void second(List<Integer> list3,int[] arr,int start_element,int last_element,int val,int i,long mid)
{
if(val == i)
{
long t = 1;
for(int j=0;j<i;j++)
{
t = t*arr[j];
}
long t1 = mid/t;
total = total + t1;
return;
}
for(int j=start_element;j<=last_element && last_element-j+1>=i-val;j++)
{
arr[val] = list3.get(j);
second(list3,arr,j+1,last_element,val+1,i,mid);
}
}

public static void first(List<Integer> list2,int size,int i,long mid)
{
int[] arr = new int[i];
second(list2,arr,0,size-1,0,i,mid);
}
}
