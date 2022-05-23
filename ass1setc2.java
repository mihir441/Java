import java.util.*;

public class practice  
{  
    public static void main(String args[])  
    {  
        Scanner sc=new Scanner(System.in);
        LinkedList L=new LinkedList();
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
		{
			L.add(sc.next());
		}
        System.out.println("The elements are: "+L);
        System.out.println("Enter the element to be added first: ");
        L.addFirst(sc.nextInt());
        System.out.println("The elements are: "+L);
        L.removeLast();
        System.out.println("The last element is removed: ");
        System.out.println("The elements are: "+L);
        int size=L.size();
        System.out.println("The size is: "+size);
    }  
}  
