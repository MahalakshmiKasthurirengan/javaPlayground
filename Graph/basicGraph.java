package Graph;
import java.util.*;

class MyGraph{
	ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	public MyGraph(int value) {
		for(int i = 0; i < value; i++) {
			list.add(new ArrayList<Integer>());
		}
	}
	public void addEdge(int u, int v) {
		list.get(u).add(v);
		list.get(v).add(u);
		
	}
	
	public void display() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Element of the vertex : " + i);
			for(int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}

public class basicGraph {
	public static void main(String[] args) {
		MyGraph graph = new MyGraph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		
		graph.display();

	}

}
