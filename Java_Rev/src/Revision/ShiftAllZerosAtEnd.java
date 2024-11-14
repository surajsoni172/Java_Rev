package Revision;
import java.util.*;
public class ShiftAllZerosAtEnd {
	

	
	    
	  public static void main (String[] args)
	    {
	        int [] A1 ={21,0,23,0,24,26,22,0};
	        int counter = 0;
	        
	        for (int i = 0; i<=A1.length-1 ; i++)
	        {
	            if (A1[i] != 0)
	            {
	              A1[counter] = A1[i];
	              
	              counter++;
	            }
	            
	        }
	        while (counter < A1.length)
	        {
	        A1[counter] =0;
	        counter++;
	            
	        }
	        
	        for (int j: A1)
	        {
	            
	            System.out.println (j);
	        }
	            
	        }
	        
	        
	        
	        
	    



	    

}
