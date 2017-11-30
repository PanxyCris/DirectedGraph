

public class Operation {

   public static void main(String[] args){

	   int[][] graph = {{0,1,0,1,0,0},
                        {0,0,1,0,1,0},
                        {0,0,0,0,0,1},
                        {0,1,0,0,1,0},
                        {0,0,1,0,0,1},
                        {1,0,0,0,0,0}};
	  /* int[][] graph = {{0,1,0,1,0,0},
                        {0,0,1,0,1,0},
                        {0,0,0,0,0,1},
                        {0,1,0,0,1,0},
                        {0,0,1,0,0,1},
                        {0,0,0,0,0,0}};*/
	   DirectedGraph directedGraph = new DirectedGraph(graph);
	   directedGraph.findCircle(0);
		if(!directedGraph.hasCircle())
			System.out.println("No circle");
   }

}
