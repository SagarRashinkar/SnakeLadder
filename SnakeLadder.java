

class SnakeLadder {

	public static int player1Pos = 0;		//player starting position
	public static int player2Pos = 0;
	public static int winningPoints = 100;		//points to win the match
	public static int diceCount = 0;		//declared variable for dice count
	public static int playerShuffle = 0;

	public static int rollDice() {			//method to get the roll value from the dice

		int roll = (int)Math.floor(Math.random()*10)%6+1;	//random method return the random value between 1 to 6
		return roll;
	}

	public static int checkOption() {		//method to choose options for no play, ladder and snake

		return (int) Math.floor(Math.random()*10)%3 +1;		//returns value 1 to 3
	}

	public static String whichPlayer(){

		playerShuffle++;
		if(playerShuffle%2==0){

			return "player1";
		}
		else{

			return "player2";
		}
	}

	public static void main(String[] args) {

		while(player1Pos<100 || player2Pos<100){
			
			String player = whichPlayer();
			int value = rollDice();			//call to rollDice method
			int option = checkOption();		//call to checkOption method
			diceCount++;				//increment dice count

			switch(option) {			
	
				case 1:
					System.out.println("There are no play!!!");	//no play if choose 1
					break;
				case 2:
					System.out.println("You got a ladder");		//ladder if choose 2
					if(player == "player1") {
						
						player1Pos += value;				//add dice value to the player position
					
					}else if(player == "player2") {

						player2Pos += value;
					}
					
					if(player1Pos > winningPoints) {			//checking winning condition

						player1Pos -= value;
					}
					else if(player2Pos > winningPoints) {

						player2Pos -= value;
					}
					else{
					}
					System.out.println("current position of player1 is:"+player1Pos);
					System.out.println("current position of player2 is:"+player2Pos);
					break;
				case 3:
					System.out.println("You got a snake");		//snake if choose 3
					if(player == "player1") {
					
						player1Pos -= value;			//subtact dice value from player position
					}
					else if(player == "player2") {

						player2Pos -= value;
					}
					else{
					}
					if(player1Pos < 0){			//check condition if player gets lower that 0 restart

						player1Pos = 0;
					}
					else if(player2Pos < 0){

						player2Pos = 0;
					}
					System.out.println("current position of player1 is:"+player1Pos);
					System.out.println("current position of player2 is:"+player2Pos);
					break;
				default:
					System.out.println("Invalid!!!");

			}

			if(player1Pos == 100){				//checking who is winner here

				System.out.println(diceCount+" times dice rolled to win by player1");
				break;
			}
			else if(player2Pos == 100){
				
				System.out.println(diceCount+" times dice rolled to win by player2");
				break;
			}
		}
	}
}
