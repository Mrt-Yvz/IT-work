package assignments.Ass12;

import java.util.Arrays;

public class Question55 {

	public static void main(String[] args) {
		String[][] chessboard = new String[8][8];
		String letters = "a b c d e f g h";
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				chessboard[i][j] = (i+1) + letters.split(" ")[j];
			}
		}
		System.out.println(Arrays.deepToString(chessboard));
	}

}
