import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
@authors

Aditya Agarwal 
Syed Munawwar Quadri

@title
CCBD Project

@algorithm
Converting the given edge list format to Json Based Format for Graph Processing

@input
Takes the input from a file which is in the edge list format

@output
Json Format based output file and the count of vertices and edges
*/

public class EdgeListToJsonConversionFormatClass{

 static int edge_count = 0;
 /**
 Function used for converting the given input format to JSON
 */
 public static void convert(int[] a, int[] b, int n){
 
 	int vertex_count = 0;
 	
 	String str = null;
 	int val = 0;
 	int j;
 	for(int i=0;i<n;i++){
 	 	val = a[i];
 	 	System.out.print("["+a[i]+",0,[["+b[i]+",1]");
 	 	j=i+1;
 	 	vertex_count++;
 	 	while(j<n && a[j] == val){
 	 		System.out.print(",["+b[j]+",1]");
 	 		j++;
 	 	}
 	 	
 	 	System.out.println("]]");
 	 	i = j-1;
 	}
 	
 	//System.out.println("Number of vertices "+vertex_count);
 	//System.out.println("Number of edges "+edge_count);
 }
 
 public static void display(int[] a, int n)
 {
  for(int i=0;i<n;i++)
  	System.out.println(a[i]+" ");
 }

 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  int count = 0;
  
  for(String s : args){
   count++;
  }

  /**long startTime = System.nanoTime();
  long endtime = System.nanoTime();
  long duration = endtime-startTime;
  float time = (float)duration/1000000;
  */
  
  //@var edge_count : count the number of edges in the graph
  edge_count = count/2;
  
  int[] array = new int[count];
  int[] num1 = new int[count/2];
  int[] num2 = new int[count/2];
  int k=0, k1=0, k2=0;
  
  for(String s : args){
   array[k] = Integer.parseInt(s);
   
   if(k%2==0)
   	num1[k1++] = Integer.parseInt(s);
   	
   else
   	num2[k2++] = Integer.parseInt(s);
   
   k++;
  }
  
  //System.out.println(k1+" "+k2+" "+k);
  
  /**
  
  @job
  Converting intermediate num1, num2 arrays to arrays a and b
  
  */
  
  int[] a = new int[2*num1.length];
  int[] b = new int[2*num2.length];
  
  /**
  @job
  Looping through the array to generate all possible vertex-vertex pairs
  */
  
  int counter = 0;
  for(int i=0;i<num1.length;i++){
   a[counter] = num1[i];
   b[counter] = num2[i];
   counter++;
  }
  
  for(int i=0;i<num1.length;i++){
   a[counter] = num2[i];
   b[counter] = num1[i];
   counter++;
  }
  
  /**
  @job
  Sorting the arrays a and b based on the sort of a and maintaining the relative postitions in b
  */
  
  for(int i=0;i<a.length-1;i++){
   int key = i;
   for(int j=i+1;j<a.length;j++){
    if(a[j]<a[key])
    	key = j;
   }
   int temp1 = a[i];
   int temp2 = b[i];
   a[i] = a[key];
   b[i] = b[key];
   a[key] = temp1;
   b[key] = temp2;
  }
  
  /**
  Method call for conversion to the JSON Format
  */
  
  convert(a, b, a.length);
 }
}
