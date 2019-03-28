mport java.util.*;
import java.io.*;
class Descending_Weights{
    public static void main(String args[] ) throws Exception {
    Solutionclass object=new Solutionclass();
    object.mymethod();
}}
class Solutionclass{
    public void mymethod(){
      Scanner sc=new Scanner(System.in);
      int no=sc.nextInt();
      int k=sc.nextInt();
      List<Integer> inputlist=new ArrayLinkedList<Integer>();

      for(int i=0;i<n;i++)
        {
            inputlist.add(sc.nextInt());               
        }
      Collections.sort(arr);
      List<Integer> modlist=new ArrayLinkedList<Integer>();
      for(int i=0;i<n;i++)
      {
          modlist.add((inputlist.get(i)%k));
      }
      StringBuffer solution=new StringBuffer();
      for(int i=k-1;i>=0;i--)
      {
          for(int j=0;j<n;j++)
          {
             if(modlist.get(j)==i)
             solution.append(arr[j]+" ");
          }
      }
    System.out.println(solution);
    sd.delete(0,solution.length());
    }
}