import java.io.*;
import java.util.*;
 
public class Tester2 {
	
    public static void main(String[] args) throws IOException{
    	
    	Scanner reader = new Scanner (new File("E:\\MatrixStuff\\src\\MatrixData.txt"));
   
    	int maxIndx = -1;
	    String text[] = new String[1000];
	    int a[][] = new int[3][4];
	    int b[][] = new int[4][2];
	   
	    int rowA = a.length;
	    int colA = a[0].length;
	    int rowB = b.length;
	    int colB = b[0].length;
	   
	    while(reader.hasNext()){
            for(int i = 0; i < rowA; i++){
	        	for(int j = 0; j < colA; j++){
	        		a[i][j] = reader.nextInt();
	                System.out.print(a[i][j] + "\t");                   
	        		}
	        	System.out.println("");
	        }
	                   
	   
	        for(int i = 0; i < rowB; i++){
	        	for(int j = 0; j < colB; j++){
	        		b[i][j] = reader.nextInt();
                	System.out.print(b[i][j] + "\t");
            		}				
        		System.out.println("");
        	}       
	    }
	    reader.close();
    }
}