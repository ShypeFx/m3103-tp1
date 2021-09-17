package m3103.tp1;

import java.util.Random;

/*
 * This file is licensed to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * SDD Seance TP 1 : squelette pour les tris de la séance
 *
 * @author <a href="mailto:Frederic.Guyomarch@univ-lille1.fr">Frédéric Guyomarch</a>
 * IUT-A, Universite de Lille, Sciences et TEchnologies
 */
public class Sort  {
	
	private static Random rand = new Random();
	static Counter c = new Counter();
	
    public static int [] generateRdmIntArray(int n, int min, int max){
    	
    	int [] tab = new int [n];
    	for(int i = 0; i < n; i++) {
    		tab[i] = rand.nextInt(max - min)+min;
    	}
    	return tab;
    	
    }

    public static void insertSort(int [] tab) {
    	c.reset();
    	
    	for(int ib = 1; ib < tab.length; ib++) {
    		int index = tab[ib];
    		int v = ib-1;
    		c.incComp();
    		while(v >= 0 && tab[v]> index) {
    			
    			tab[v+1] = tab[v];
    			c.incPerm();
    			v--;
    		}
    		tab[v+1] = index;
    		c.incPerm();
    	}
    	c.toString();
    	
    }

    public static void selectSort(int [] tab){
    	c.reset();
    	
   	 for (int i = 0; i < tab.length - 1; i++){
            int idx = i;
   	
            for (int j = i + 1; j < tab.length; j++) {
            	c.incComp();
                if (tab[j] < tab[idx]) {
                    idx = j;
                		}
            		} 
		           int min = tab[idx];
		           tab[idx] = tab[i]; 
		           tab[i] = min;
		           c.incPerm();
   	 			}
         	c.toString(); 
 }

    	
    

    public static void printArray(int [] tab){
    	
    	for(int i: tab) {
    		System.out.println(tab[i]);
    	}
    	
    }

    public static void swap(int [] tab, int idx, int idx2){
    	int n = tab[idx];
    	tab[idx] = tab[idx2];

    	tab[idx2] = n;
    	c.incPerm();
    }

    public static void bubbleSort(int [] tab){
    	c.reset();
       
        for(int i = 0; i < tab.length; ++i) {
        	
        	System.out.print( tab[i]+"|");
        	System.out.print("\n");
            for(int j = 0; j < tab.length-1; ++j) {
            	c.incComp();
                if(tab[j] > tab[j+1]) {
                	swap(tab, j, j+1);
                }
                System.out.print( tab[j]+"|");
            }
        }
        		System.out.print("\n");
        		c.toString();		
    	}
    
    
    
    public static void main(String [] args) {
    	int [] tab = generateRdmIntArray(10, 1, 100);
    	System.out.println(" ************* buble sort : *************");
    	Sort.bubbleSort(tab);
    	System.out.println(" ************* insert sort : *************");
    	Sort.insertSort(tab);
    	System.out.println(" ************* select sort : *************");
    	Sort.selectSort(tab);
    }
    
    
    
    
}

