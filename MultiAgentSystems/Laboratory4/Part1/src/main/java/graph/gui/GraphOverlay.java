package graph.gui;

import graph.core.Edge;
import graph.core.Vertex;

import java.awt.Color;


@SuppressWarnings("rawtypes")
public interface GraphOverlay {
	public Color edgeColor(Edge edge);
	public Color vertexColor(Vertex vertex);
}
