

class SnakeLadder {

	public static int playerPos = 0;
	public static int winningPoints = 100;

	public static int rollDice() {

		int roll = (int)Math.floor(Math.random()*10)%6+1;
		return roll;
	}

	public static int checkOption() {

		return (int) Math.floor(Math.random()*10)%3 +1;
	}

	public static void main(String[] args) {

		int value = rollDice();
		int option = checkOption();

		switch(option) {

			case 1:
				System.out.println("There are no play!!!");
				break;
			case 2:
				System.out.println("You got a ladder");
				playerPos += value;
				System.out.println("current position is:"+playerPos);
				break;
			case 3:
				System.out.println("You got a snake");
				playerPos -= value;
				if(playerPos<0){

					playerPos = 0;
				}
				System.out.println("current position is:"+playerPos);
				break;

		}
	}
}
