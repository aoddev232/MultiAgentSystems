package graph.algorithm;

import graph.core.AbstractGraphAlgorithm;
import graph.core.Edge;
import graph.core.Graph;
import graph.core.Parameter;
import graph.core.Vertex;
import graph.gui.GraphOverlay;
import graph.util.Heap;
import graph.util.Position;
import graph.util.PriorityQueue;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class DijkstraShortestPathTreeAlgorithm<V,E> extends AbstractGraphAlgorithm<V, E> {
	@SuppressWarnings("rawtypes")
	private class DijkstraOverlay implements GraphOverlay {
		@Override
		public Color edgeColor(Edge edge) {
			for (Edge<E> e : parentMap.values()) {
				if (edge.equals(e)) return Color.RED;
			}
			return Color.BLACK;
		}

		@Override
		public Color vertexColor(Vertex vertex) {
			return Color.RED;
		}
	}
	
	private Graph<V,E> G;
	private Map<Vertex<V>, Integer> distanceMap;
	private Map<Vertex<V>, Position<Vertex<V>>> positionMap;
	private Map<Vertex<V>, Edge<E>> parentMap;
	
	public DijkstraShortestPathTreeAlgorithm() {
		super();
		distanceMap = new HashMap<Vertex<V>, Integer>();
		positionMap = new HashMap<Vertex<V>, Position<Vertex<V>>>();
		parentMap = new HashMap<Vertex<V>, Edge<E>>();
		addParameter(new Parameter("s","Give the start parameter for the algorithm"));
	}
	
	public graph.util.List<Vertex<V>> getRouteTo(Vertex<V> target) {
		graph.util.List<Vertex<V>> list = new graph.util.LinkedList<Vertex<V>>();

		Vertex<V> current = target;
		list.insertFirst(target);
		while (parentMap.get(current) != null) {
			Edge<E> edge = parentMap.get(current);
			Vertex<V>[] ends = G.endVertices(edge);
			
			if (ends[0].equals(current)) {
				list.insertFirst(ends[1]);
				current = ends[1];
			} else {
				list.insertFirst(ends[0]);
				current = ends[0];
			}
		}
		return list;
	}
	public DijkstraShortestPathTreeAlgorithm(Graph<V,E> graph) {
		this();
		G = graph;
	}
	
	public void setGraph(Graph<V,E> graph) {
		G = graph;
	}
	
	public void search(Map<String, Vertex<V>> parameters) {
		Vertex<V> s = parameters.get("s");
		
		PriorityQueue<Integer, Vertex<V>> Q = new Heap<Integer, Vertex<V>>();
		
		distanceMap.clear();
		parentMap.clear();
		for (Vertex<V> vertex: G.vertices()) {
			int value = Integer.MAX_VALUE;
			if (vertex.equals(s)) value = 0;
			distanceMap.put(vertex, value);
			Position<Vertex<V>> p = Q.insert(value, vertex);
			positionMap.put(vertex, p);
		}
		
		while (!Q.isEmpty()) {
			Vertex<V> u = Q.remove();
			for (Edge<E> e : G.incidentEdges(u)) {
				Vertex<V> z = G.opposite(u, e);
				int weight = Integer.parseInt((String) e.element());
				if (weight != -1) {
					int r = distanceMap.get(u) + weight;
					if (r < distanceMap.get(z)) {
						distanceMap.put(z, r);
						Q.replaceKey(positionMap.get(z), r);
						parentMap.put(z, e);
					}
				}
			}
			
		}
	}
	
	@Override
	public GraphOverlay getOverlay() {
		return new DijkstraOverlay();
	}
}
