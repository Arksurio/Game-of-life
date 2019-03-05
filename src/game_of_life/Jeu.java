package game_of_life;

public class Jeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] grille = new int [20][20];

		int a = (grille.length);
		int b = (grille[0].length);

		for(int i = 0; i < a; i++){
		    for(int j = 0; j <b; j++) {
		        int x = 0;
		        grille[i][j] = x;
		        if (x<10) {
		            System.out.print(" " + x + " ");
		        } else {
		            System.out.print(x + " ");
		        }
		    }//end of for J
		    System.out.println();
		}//end of for i
	}
}
