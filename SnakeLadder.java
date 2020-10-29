class SnakeLadder {

	public static int startPos = 0;
	public static int player = 1;
	public static int winningPoints = 100;

	public static void main(String[] args) {

		int roll = (int)Math.floor(Math.random()*10)%6+1;

		System.out.println("Dies value is: "+roll);
	}
}
