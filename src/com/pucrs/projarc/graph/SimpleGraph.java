package com.pucrs.projarc.graph;

import com.pucrs.projarc.node.CircleNode;
import com.pucrs.projarc.edge.LineEdge;
import com.pucrs.projarc.interfaces.Edge;
import com.pucrs.projarc.interfaces.Node;

import java.awt.*;

/**
   A simple graph with round nodes and straight edges.
*/
public class SimpleGraph extends Graph
{
   public Node[] getNodePrototypes()
   {
      Node[] nodeTypes =
         {
            new CircleNode(Color.BLACK),
            new CircleNode(Color.WHITE)
         };
      return nodeTypes;
   }

   public Edge[] getEdgePrototypes()
   {
      Edge[] edgeTypes = 
         {
            new LineEdge()
         };
      return edgeTypes;
   }
}





