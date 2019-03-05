package game_of_life;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class plateau_jeu {
	public static void main(String[] args){

		int tour = 0;	
		while (tour < 3) {
			int nb_tour = ++tour;
			String Newligne=System.getProperty("line.separator");
			System.out.print("tour : " + tour + Newligne);
			
			Random rand = new Random();
			int nombre1 = rand.nextInt(19);
			int nombre2 = rand.nextInt(19);
			int [][] grille = new int [20][20];
			int a = (grille .length);
			int b = (grille[0].length);
			
			for(int i = 0; i < a; i++) {
			    for(int j = 0; j < b; j++) {
			        int x = 0;
			        if(i % nombre1 == 0) {
			        	x = 1;
			        	if (j % nombre2 == 0){
			        		x = 0;
			        	}
			        }
			        
			        if ( tour >= 2) { 
			        	if (j == 0 && i == 1) {
			        		x = 0;
					    }
					}
			        
			        grille[i][j] = x;
			        if (x == x) {
			            System.out.print(" " + x + " ");
			        } 
			        else {
			        	x = 1;
			            System.out.print(x + " ");
			        }
			    }
			    	System.out.println();
			}
			
		}

	}

} 