package others;

import java.util.*;

public class CityDistancesCodingChallenge {
	
	private static List<Integer> EMPTY = new ArrayList<Integer>(0);

	public void updateDistances(int start, int idx, Map<Integer, ArrayList<Integer>> graph, int[] distances) {
		List<Integer> vertices = graph.getOrDefault(start, (ArrayList<Integer>) EMPTY);
		for (Integer v : vertices) {
			updateDistances(v, idx + 1, graph, distances);
			distances[idx] += 1; 
		}
	}

	public int[] solution(int[] T) {
		// write your code in Java SE 8
		int M = T.length;

		// final result
		int[] distances = new int[M - 1];

		//GRAPH: represents the cities and its connections
		Map<Integer, ArrayList<Integer>> graph = new HashMap<Integer, ArrayList<Integer>>();

		// build the graph
		int capital = 0;
		for (int P = 0; P < M; P++) {
			int Q = T[P];
			graph.putIfAbsent(Q, new ArrayList<Integer>(1));
			if (P == Q) {
				capital = P;
			} else {
				graph.get(Q).add(P);
			}
		}

		// calc distances
		int start = capital;
		int idx = 0;

		updateDistances(start, idx, graph, distances);

		return distances;

	}

	public static void main(String[] args) {
		int[] input = {9, 1, 4, 9, 0, 4, 8, 9, 0, 1};
		int[] result = new CityDistancesCodingChallenge().solution(input);
		System.out.println(Arrays.toString(result));
	}
}
