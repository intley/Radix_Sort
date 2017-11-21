import java.io.*;
import java.util.*;

public class Radix_Sort {
	
	public static void main(String args[]) {
		
		char[][] S = new char[1000][21];
		int i = 0;
		int j = 0;
	
	// The default name of the file to open
	String inputfile = "/Users/Intley/Desktop/Radix_Sort/f.txt";
	
	// This will reference one line at a time
    String line = null;
    
    try {
        // FileReader reads text files in the default encoding.
        FileReader inputreader = 
            new FileReader(inputfile);

        // Wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = 
            new BufferedReader(inputreader);

        while((line = bufferedReader.readLine()) != null) {
        		//Matrix enclosing text
        		line = String.format("%-21s", line).toUpperCase(); 
        		S[i] = line.toCharArray();
        		i++;
        }   
        
        /* Printing out Matrix Array
        for(int k = 0; k < 1000; k++) {
        	for(int l = 0; l < 21; l++) {
        		System.out.println(S[k][l]);
        	}
        }
        */

        // Always close files.
        bufferedReader.close();         
    }
    catch(FileNotFoundException ex) {
        System.out.println(
            "Unable to open file '" + 
            inputfile + "'");                
    }
    catch(IOException ex) {
        System.out.println(
            "Error reading file '" 
            + inputfile + "'");                  

    }
    
    //Least Significant Bit Radix Sort Algorithm 
    List <Integer> P = new ArrayList<Integer>(); 
    for(i = 0; i < 1000; i++) {
    		P.add(i);
    }
    
    int[][] BucketList = new int[27][1000];
    int z = 0;
    
    
    for(i=0;i<27;i++) {
    	for(j=0;j<1000;j++) {
    		BucketList[i][j] = -1;
    	}
    }
    System.out.println("*****");
    for(int k = 0; k < 1000; k++) {
    	for(int l = 20; l >= 0; l--) {
    		int temp = P.get(k);
    		switch(S[temp][l]) {
    			case ' ':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[0][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[0][z] = temp;
    				break;
    				
    			case 'A': 
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[1][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[1][z] = temp;
    				break;
    				
    			case 'B':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[2][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[2][z] = temp;
    				break;
    				
    			case 'C':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[3][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[3][z] = temp;
    				break;
    				
    			case 'D':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[4][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[4][z] = temp;
    				break;
    				
    			case 'E':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[5][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[5][z] = temp;
    				break;
    				
    			case 'F':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[6][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[6][z] = temp;
    				break;
    				
    			case 'G':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[7][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[7][z] = temp;
    				break;
    				
    			case 'H':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[8][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[8][z] = temp;
    				break;
    				
    			case 'I':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[9][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[9][z] = temp;
    				break;
    				
    			case 'J':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[10][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[10][z] = temp;
    				break;
    				
    			case 'K':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[11][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[11][z] = temp;
    				break;
    				
    			case 'L':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[12][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[12][z] = temp;
    				break;
    				
    			case 'M':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[13][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[13][z] = temp;
    				break;
    				
    			case 'N':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[14][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[14][z] = temp;
    				break;
    				
    			case 'O':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[15][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[15][z] = temp;
    				break;
    				
    			case 'P':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[16][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[16][z] = temp;
    				break;
    				
    			case 'Q':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[17][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[17][z] = temp;
    				break;
    				
    			case 'R':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[18][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[18][z] = temp;
    				break;
    				
    			case 'S':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[19][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[19][z] = temp;
    				break;
    				
    			case 'T':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[20][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[20][z] = temp;
    				break;
    				
    			case 'U':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[21][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[21][z] = temp;
    				break;
    				
    			case 'V':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[22][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[22][z] = temp;
    				break;
    				
    			case 'W':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[23][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[23][z] = temp;
    				break;
    				
    			case 'X':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[24][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[24][z] = temp;
    				break;
    				
    			case 'Y':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[25][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[25][z] = temp;
    				break;
    				
    			case 'Z':
    				z = 0;
    				while(z < 1000) {
    					if(BucketList[26][z]>=0)
    						z++;
    					else
    						break;
    				}
    				BucketList[26][z] = temp;
    				break;
    				
    				
    		}
    		
    	}
    }
    
    System.out.println("*****");
    for(i = 0; i < 27; i++) {
    	for(j = 0; j < BucketList[i].length; j++) {
    		P.add(BucketList[i][j]);
    	}
    }
    System.out.println("*****");
    
    for(i = 0; i < P.size(); i++) {
    	int temp = P.get(i);
    	System.out.println(S[temp]);
    }
}
}
