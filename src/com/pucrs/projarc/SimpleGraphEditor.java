package com.pucrs.projarc;

import com.pucrs.projarc.graph.GraphFrame;
import com.pucrs.projarc.graph.SimpleGraph;

import javax.swing.*;

/**
   A program for editing UML diagrams.
*/
public class SimpleGraphEditor
{  
   public static void main(String[] args)
   {  
      JFrame frame = new GraphFrame(new SimpleGraph());
      frame.show();
   }
}

