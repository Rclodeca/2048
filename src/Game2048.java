import java.util.concurrent.ThreadLocalRandom;
public class Game2048 {
	
	private int[][] board;
	private int randomNum;
	private int[][] check;
	private int score;
	private Tile tile;
	
	
	public Game2048(){
		score = 0;
		setBoard();
		sync();
	}
	
	public void setBoard(){
		board = new int[4][4];
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				board[i][j] = 0;
			}
		}
		setRandomTwoOrFour();
		setRandomTwoOrFour();
	}
	
	public void setRandomTwoOrFour(){
		if (isBoardFull())
			return;
		int x = randomNum = ThreadLocalRandom.current().nextInt(0, 3 + 1);
		int y = randomNum = ThreadLocalRandom.current().nextInt(0, 3 + 1);
		if (board[x][y] == 0)
			board[x][y] = (((randomNum % 2) + 1) * 2);
		else
			setRandomTwoOrFour();
	}
	
	
	public boolean isBoardFull(){
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				if (board[i][j] == 0)
					return false;
			}
		}
		return true;
	}
	
	public void loseCheck(){
		if(!isBoardFull())
			return;
		for(int i=0; i<=3; i++){
			if(board[i][3] == board[i][2] || board[i][2] == board[i][1] || board[i][1] == board[i][0]){
				return;
			}
			if(board[3][i] == board[2][i] || board[2][i] == board[1][i] || board[1][i] == board[0][i]){
				return;
			}
		}
		MainWindow.textPopUp.setText("GAME OVER");
		MainWindow.textPopUp.setLocation(20, 243);
		MainWindow.textPopUp.setSize(530, 92);
	   
		
	}
	
	public void up(){
		check = new int[4][4];
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				check[i][j] = board[i][j];
			}
		}
		for(int i=0; i<=3; i++){
			for (int j=3; j>=0; j--){
				if (board[i][3] == 0){
					board[i][3] = board[i][2];
					board[i][2] = board[i][1];
					board[i][1] = board[i][0];
					board[i][0] = 0;
				}
				//special case
				if(board[i][2] == 0){  
					board[i][2] = board[i][1];
					board[i][1] = board[i][0];
					board[i][0] = 0;
				}
				if(board[i][1] == 0){
					board[i][1] = board[i][0];
					board[i][0] = 0;
				}
			}
			if (board[i][3] != 0 && board[i][3] == board[i][2]){
				board[i][3] *= 2;
				board[i][2] = board[i][1];
				board[i][1] = board[i][0];
				board[i][0] = 0;
				score += board[i][3];
			}
			if (board[i][2] != 0 && board[i][2] == board[i][1]){
				board[i][2] *= 2;
				board[i][1] = board[i][0];
				board[i][0] = 0;
				score += board[i][2];
			}
			if (board[i][1] != 0 && board[i][1] == board[i][0]){
				board[i][1] *= 2;
				board[i][0] = 0;
				score += board[i][1];
			}
		
		}
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				if (board[i][j] != check[i][j]){
					setRandomTwoOrFour();
					loseCheck();
					sync();
					return;
				}
			}
		}
		loseCheck();
		sync();
	}
	
	
	public void down(){
		check = new int[4][4];
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				check[i][j] = board[i][j];
			}
		}
		for(int i=0; i<=3; i++){
			for (int j=0; j<=3; j++){
				if (board[i][0] == 0){
					board[i][0] = board[i][1];
					board[i][1] = board[i][2];
					board[i][2] = board[i][3];
					board[i][3] = 0;
				}
				//special case
				if(board[i][1] == 0){  
					board[i][1] = board[i][2];
					board[i][2] = board[i][3];
					board[i][3] = 0;
				}
				if(board[i][2] == 0){
					board[i][2] = board[i][3];
					board[i][3] = 0;
				}
			}
			if (board[i][0] != 0 && board[i][0] == board[i][1]){
				board[i][0] *= 2;
				board[i][1] = board[i][2];
				board[i][2] = board[i][3];
				board[i][3] = 0;
				score += board[i][0];
			}
			if (board[i][1] != 0 && board[i][1] == board[i][2]){
				board[i][1] *= 2;
				board[i][2] = board[i][3];
				board[i][3] = 0;
				score += board[i][1];
			}
			if (board[i][2] != 0 && board[i][2] == board[i][3]){
				board[i][2] *= 2;
				board[i][3] = 0;
				score += board[i][2];
			}
		
		}
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				if (board[i][j] != check[i][j]){
					setRandomTwoOrFour();
					loseCheck();
					sync();
					return;
				}
			}
		}
		loseCheck();
		sync();
	}
	
	
	public void left(){
		check = new int[4][4];
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				check[i][j] = board[i][j];
			}
		}
		for(int i=0; i<=3; i++){
			for (int j=0; j<=3; j++){
				if (board[0][i] == 0){
					board[0][i] = board[1][i];
					board[1][i] = board[2][i];
					board[2][i] = board[3][i];
					board[3][i] = 0;
				}
				//special case
				if(board[1][i] == 0){  
					board[1][i] = board[2][i];
					board[2][i] = board[3][i];
					board[3][i] = 0;
				}
				if(board[2][i] == 0){
					board[2][i] = board[3][i];
					board[3][i] = 0;
				}
			}
			if (board[0][i] != 0 && board[0][i] == board[1][i]){
				board[0][i] *= 2;
				board[1][i] = board[2][i];
				board[2][i] = board[3][i];
				board[3][i] = 0;
				score += board[0][i];
			}
			if (board[1][i] != 0 && board[1][i] == board[2][i]){
				board[1][i] *= 2;
				board[2][i] = board[3][i];
				board[3][i] = 0;
				score += board[1][i];
			}
			if (board[2][i] != 0 && board[2][i] == board[3][i]){
				board[2][i] *= 2;
				board[3][i] = 0;
				score += board[2][i];
			}
		
		}
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				if (board[i][j] != check[i][j]){
					setRandomTwoOrFour();
					loseCheck();
					sync();
					return;
				}
			}
		}
		loseCheck();
		sync();
	}
	
	
	public void right(){
		check = new int[4][4];
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				check[i][j] = board[i][j];
			}
		}
		for(int i=0; i<=3; i++){
			for (int j=3; j>=0; j--){
				if (board[3][i] == 0){
					board[3][i] = board[2][i];
					board[2][i] = board[1][i];
					board[1][i] = board[0][i];
					board[0][i] = 0;
				}
				//special case
				if(board[2][i] == 0){  
					board[2][i] = board[1][i];
					board[1][i] = board[0][i];
					board[0][i] = 0;
				}
				if(board[1][i] == 0){
					board[1][i] = board[0][i];
					board[0][i] = 0;
				}
			}
			if (board[3][i] != 0 && board[3][i] == board[2][i]){
				board[3][i] *= 2;
				board[2][i] = board[1][i];
				board[1][i] = board[0][i];
				board[0][i] = 0;
				score += board[3][i];
			}
			if (board[2][i] != 0 && board[2][i] == board[1][i]){
				board[2][i] *= 2;
				board[1][i] = board[0][i];
				board[0][i] = 0;
				score += board[2][i];
			}
			if (board[1][i] != 0 && board[1][i] == board[0][i]){
				board[1][i] *= 2;
				board[0][i] = 0;
				score += board[1][i];
			}
		
		}
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				if (board[i][j] != check[i][j]){
					setRandomTwoOrFour();
					loseCheck();
					sync();
					return;
				}
			}
		}
		loseCheck();
		sync();
	}
	
	public void sync(){
		MainWindow.text33.setText(textConv(board[3][3]));
		tile = new Tile(board[3][3]);
		tile.setColor(MainWindow.text33);
		MainWindow.text03.setText(textConv(board[0][3]));
		tile = new Tile(board[0][3]);
		tile.setColor(MainWindow.text03);
		MainWindow.text13.setText(textConv(board[1][3]));
		tile = new Tile(board[1][3]);
		tile.setColor(MainWindow.text13);
		MainWindow.text23.setText(textConv(board[2][3]));
		tile = new Tile(board[2][3]);
		tile.setColor(MainWindow.text23);
		MainWindow.text02.setText(textConv(board[0][2]));
		tile = new Tile(board[0][2]);
		tile.setColor(MainWindow.text02);
		MainWindow.text12.setText(textConv(board[1][2]));
		tile = new Tile(board[1][2]);
		tile.setColor(MainWindow.text12);
		MainWindow.text22.setText(textConv(board[2][2]));
		tile = new Tile(board[2][2]);
		tile.setColor(MainWindow.text22);
		MainWindow.text32.setText(textConv(board[3][2]));
		tile = new Tile(board[3][2]);
		tile.setColor(MainWindow.text32);
		MainWindow.text01.setText(textConv(board[0][1]));
		tile = new Tile(board[0][1]);
		tile.setColor(MainWindow.text01);
		MainWindow.text11.setText(textConv(board[1][1]));
		tile = new Tile(board[1][1]);
		tile.setColor(MainWindow.text11);
		MainWindow.text21.setText(textConv(board[2][1]));
		tile = new Tile(board[2][1]);
		tile.setColor(MainWindow.text21);
		MainWindow.text31.setText(textConv(board[3][1]));
		tile = new Tile(board[3][1]);
		tile.setColor(MainWindow.text31);
		MainWindow.text00.setText(textConv(board[0][0]));
		tile = new Tile(board[0][0]);
		tile.setColor(MainWindow.text00);
		MainWindow.text10.setText(textConv(board[1][0]));
		tile = new Tile(board[1][0]);
		tile.setColor(MainWindow.text10);
		MainWindow.text20.setText(textConv(board[2][0]));
		tile = new Tile(board[2][0]);
		tile.setColor(MainWindow.text20);
		MainWindow.text30.setText(textConv(board[3][0]));
		tile = new Tile(board[3][0]);
		tile.setColor(MainWindow.text30);
		MainWindow.txtScore.setText("Score: " + Integer.toString(score));
	}
	
	public String textConv(int x){
		if (x == 0)
			return " ";
		else
			return Integer.toString(x);
	}
	
	public void printBoard(){
		for(int i=3; i>=0; i--){
			System.out.printf("%-5d%-5d%-5d%-5d\n",board[0][i] , board[1][i] , board[2][i] , board[3][i]);
		}
		System.out.println("");
	}
	
	

}
