import java.util.Scanner;
public class AdjMatrix {
	static int[][] arr;
	static String[] keys;
	public static void addEdge(int src, int des)
	{
		arr[src][des]=1;
		arr[des][src]=1;
	}
	
	public static void printList()
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine();
		int ver=Integer.parseInt(sc.nextLine());
		int edg=Integer.parseInt(sc.nextLine());
		arr=new int[edg][edg];
		keys =sc.nextLine().split(",");
		int i=0;
		while(i<ver)
		{
			String[] links=sc.nextLine().split(" ");
			int v1=Integer.parseInt(links[0]);
			int v2=Integer.parseInt(links[1]);
			addEdge(v1,v2);
			i++;
		}
		printList();
	}
}
