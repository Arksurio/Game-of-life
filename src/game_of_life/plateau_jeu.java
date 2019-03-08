package game_of_life;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class plateau_jeu {
	
	public static <function> void main(String[] args){
		
		int [][] grille = new int [15][15];
		
		// EXEMPLE DU CLIGNOTANT
		grille[7][9] = 1;
		grille[7][10] = 1;
		grille[7][11] = 1;
		
		int tour = 0;
		
		display(grille);
		
		while (tour < 100){
			
				
			int nb_tour = ++tour;
			String ligne = System.getProperty("line.separator");
			System.out.print("tour : " + tour + ligne);
			
			grille = vivant(grille);
			display(grille);
		
		}

	}
	
	private static void display(int[][] table) {
		
		for (int[] rangee: table) {
			
			for (int cellule: rangee) {
				
				if (cellule == 0) {
					
					System.out.print(" " + " " + " ");
				
				}
				else {
					
					System.out.print(" " + " x " + " ");
					
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	private static int[][] vivant(int[][] grille2) {
		int [][] grille3 = new int [15][15];
		
		for(int i = 0; i < grille2.length; i++){
			
			for(int j = 0; j <grille2[0].length; j++) {
				
		        int cellViv = 0;
		        
		        for (int i2 = i-1; i2 <= i+1; i2++) {
		        	
		        	for (int j2 = j-1; j2 <= j+1; j2++) {
		        		
		        		if (i2 >= 0 && j2 >= 0 && i2 < 15 && j2 < 15) {
		        			
		        			if (grille2[i2][j2] == 1) {
		        				
		        				cellViv++;
		        				
		        			}
		        			
		        		}
		        		
		        	}
		        	
		        }
		        
		        if (cellViv < 3 || cellViv > 4) {
		        	
		        	grille3[i][j] = 0;
		        	
		        } 
		        
		        else {
		        	
		        	grille3[i][j] = 1;
		        	
		        }
		        
			}
			
		}
		
		return grille3;	        
	}
	
}