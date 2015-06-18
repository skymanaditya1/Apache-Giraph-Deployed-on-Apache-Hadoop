#Precondition : Apache Giraph Graph Database deployed on Apache Hadoop
Apache Giraph version 1.2 Graph Database deployed on Apache Hadoop version 1.2.1

#Aim : Run Single Source Shortest Paths and Page Rank Algorithms on graphs
Download facebook graph from Stanford Network Analysis Platform (SNAP) and run Single Source Shortest Paths and Simple Page Rank
Algorithm on the graphs and also print the Edge Count and Vertex Count for the same.

#Problem : Input Format accpeted by Apache Giraph
The Input format that is accpeted by Apache Giraph is JavaScriptObjectNotation(JSON) LongDoubleFloatDoubleVertexInputFormat, the 
graph files downloaded from SNAP were in the Simple Edge List Format.

#Solution : Wrote an algorithm that converts the input file in the simple edge list format to the JSON LongDoubleFloatDoubleVertexInputFormat.

#Result : Ran the Single Source Shortest Path and Page Rank Algorithsm (inbuilt with Apache Giraph) and also wrote Vertex Count and 
Edge Count (wrote our own algorithm) on the same. 
