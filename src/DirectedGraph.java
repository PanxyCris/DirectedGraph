import java.util.ArrayList;

public class DirectedGraph {

	private int[][] graph ;
	private ArrayList<Integer> trace= new ArrayList<>();//”√”⁄¥Êª∑
	private boolean hasCircle;

	public DirectedGraph(int[][] graph){
		this.graph = graph;
		hasCircle = false;
		trace = new ArrayList<>();
	}

	public boolean hasCircle(){
		return hasCircle;
	}

	public void findCircle(int n){
		int index = trace.indexOf(n);
		if(index!=-1){
			hasCircle = true;
			System.out.print("Circle:");
			while(index<trace.size()){
				char value = (char)(65+trace.get(index));
				System.out.print(value+" ");
				index++;
			}
			System.out.println();
			return;
		}
		trace.add(n);
		for(int i=0;i<graph[n].length;i++){
			if(graph[n][i]==1)
				findCircle(i);
		}
		trace.remove(trace.size()-1);
	}

}
