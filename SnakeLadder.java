

class SnakeLadder {

	public static int playerPos = 0;		//player starting position
	public static int winningPoints = 100;		//points to win the match
	public static int diceCount = 0;		//declared variable for dice count

	public static int rollDice() {			//method to get the roll value from the dice

		int roll = (int)Math.floor(Math.random()*10)%6+1;	//random method return the random value between 1 to 6
		return roll;
	}

	public static int checkOption() {		//method to choose options for no play, ladder and snake

		return (int) Math.floor(Math.random()*10)%3 +1;		//returns value 1 to 3
	}

	public static void main(String[] args) {

		while(playerPos<100){
			
			int value = rollDice();			//call to rollDice method
			int option = checkOption();		//call to checkOption method
			diceCount++;				//increment dice count

			switch(option) {			

				case 1:
					System.out.println("There are no play!!!");	//no play if choose 1
					break;
				case 2:
					System.out.println("You got a ladder");		//ladder if choose 2
					playerPos += value;				//add dice value to the player position
					
					if(playerPos > winningPoints) {			//checking winning condition

						playerPos -= value;
					}
					System.out.println("current position is:"+playerPos);
					break;
				case 3:
					System.out.println("You got a snake");		//snake if choose 3
					playerPos -= value;				//subtact dice value from player position
					if(playerPos<0){			//check condition if player gets lower that 0 restart

						playerPos = 0;
					}
					System.out.println("current position is:"+playerPos);
					break;
				default:
					System.out.println("Invalid!!!");

			}
			if(playerPos<100) {

				continue;
			}
			else{

				System.out.println(diceCount+" times dice rolled to win by player1");
				break;
			}
		}
	}
}
