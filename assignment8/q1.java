package assignment8;

/**
 * Given a graph and a source vertex in the graph, find shortest paths from
 * source to all vertices in the given graph.
 */

class ShortestPath {
	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 3, 0, 1, 0, 0, 1, 8, 0 }, { 3, 0, 4, 1, 5, 0, 0, 15, 0 },
				{ 2, 8, 0, 7, 0, 4, 2, 0, 2 }, { 0, 0, 7, 0, 9, 12, 5, 0, 2 }, { 0, 0, 0, 9, 0, 50, 0, 5, 0 },
				{ 2, 0, 4, 14, 10, 0, 2, 7, 0 }, { 1, 1, 2, 0, 0, 2, 0, 1, 6 }, { 5, 12, 1, 5, 5, 0, 1, 0, 7 },
				{ 8, 8, 8, 0, 8, 0, 6, 8, 8 } };
		ShortestPath s = new ShortestPath();
		s.algorithm(graph, 0);
	}
	static final int P = 9;

	int minDistance(int dist[], Boolean shortest[]) {
		// Initialize min value
		int min = Integer.MAX_VALUE, minNum = -1;

		for (int i = 0; i < P; i++)
			if (shortest[i] == false && dist[i] <= min) {
				min = dist[i];
				minNum = i;
			}

		return minNum;
	}

	// print the constructed distance array
	void printSolution(int dist[]) {
		System.out.println("Vertex \t\t Distance");
		for (int i = 0; i < P; i++)
			System.out.println(i + " \t\t " + dist[i]);
	}

	void algorithm(int graph[][], int src) {
		int dist[] = new int[P];

		Boolean shortest[] = new Boolean[P];

		for (int i = 0; i < P; i++) {
			dist[i] = Integer.MAX_VALUE;
			shortest[i] = false;
		}

		dist[src] = 0;// Distance always 0

		// Shortest path for all
		for (int count = 0; count < P - 1; count++) {

			int u = minDistance(dist, shortest);

			shortest[u] = true;

			for (int i = 0; i < P; i++)

				if (!shortest[i] && graph[u][i] != 0 && dist[u] != Integer.MAX_VALUE && 
				dist[u] + graph[u][i] < dist[i])dist[i] = dist[u] + graph[u][i];
		}

		printSolution(dist);
	}

	
}
