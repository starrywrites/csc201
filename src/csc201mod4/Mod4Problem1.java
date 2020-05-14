//@author Peyton Starr
//@unit Module 4
//@assignment Programming Problems
//@problem PROBLEM 1 - SPORTS STATISTICS
//@ description
//Design and implement a set of classes that keeps track of various sports statistics. 
//Have each low-level class represent a specific sport. Tailor the services of the classes 
//to the sport in question, and move common attributes to the higher-level classes as appropriate. 
//Create a main driver class to instantiate and exercise several of the classes.

package csc201mod4;

public class Mod4Problem1 {

	public static void main(String[] args) {
		// Create Baseball object
		Baseball nationalsGame = new Baseball(10, 117, 12, 23, 23);

		// Get baseball game stats
		System.out.println("STATS FROM THE NATIONALS GAME!");
		System.out.println(nationalsGame.toString());
		System.out.println("The average number of points per player in this game: " + nationalsGame.getAverageGamePointsPerPlayer());
		System.out.println("The average number of strikes per player in this game: " + nationalsGame.getAverageStrikesPerPlayer());
		System.out.println("The strikeout ratio of this game: " + nationalsGame.getStrikeoutRatio());
		System.out.println("The average number of points per inning in this game: " + nationalsGame.getAveragePointsPerInning());

		// Create Basketball object
		Basketball clippersGame = new Basketball(96, 102, 15);

		// Get baseball game stats
		System.out.println("HERE ARE SOME STATS FROM THE MOST RECENT CLIPPERS GAME!");
		System.out.println(clippersGame.toString());
		System.out.println("The average number of points per player in this game: " + clippersGame.getAverageGamePointsPerPlayer());
		System.out.println("The average number of passes per player in this game: " + clippersGame.getAveragePassesPerPlayer());
	}
}

class Sport {
	// Define variables
	private int gamePoints;
	private int teamSize;

	// Define default constructor
	Sport() {
	}
	
	// Define constructor
	Sport(int gamePoints, int teamSize) {
		this.gamePoints = gamePoints;
		this.teamSize = teamSize;
		
	}

	// Set points
	public void setGamePoints(int gamePoints) {
		this.gamePoints = gamePoints;
	}
	
	// Set Team Size
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	// Return points
	public int getGamePoints() {
		return gamePoints;
	}
	
	// Return Team Size
	public int getTeamSize() {
		return teamSize;
	}
	
	// Return average points per player
	public double getAverageGamePointsPerPlayer() {
		return (double) gamePoints / teamSize;
	}	
	
	// Return a string representation of this object
	public String toString() {
		return "Game Points: " + gamePoints + "\nTeam Size: " + teamSize;
	}
}


class Baseball extends Sport {
	// Define variables
	private int numberOfInnings;
	private int numberOfPitches;
	private int numberOfStrikes;
	
	// Define default constructor
	public Baseball() {
		this.numberOfInnings = 9;
	}
	
	// Define constructor with this class's parms
	public Baseball(int numberOfInnings, int numberOfPitches, int numberOfStrikes) {
		this.numberOfInnings = numberOfInnings;
		this.numberOfPitches = numberOfPitches;
		this.numberOfStrikes = numberOfStrikes;
	}
	
	// Define constructor with all parms
	public Baseball(int numberOfInnings, int numberOfPitches, int numberOfStrikes, int gamePoints, int teamSize) {
		this.numberOfInnings = numberOfInnings;
		this.numberOfPitches = numberOfPitches;
		this.numberOfStrikes = numberOfStrikes;
		setGamePoints(gamePoints);
		setTeamSize(teamSize);
	}
	
	// Set number of innings in the game
	public void setNumberOfInnings(int numberOfInnings) {
		this.numberOfInnings = numberOfInnings;
	}
	
	// Set number of pitches in the game
	public void setNumberOfPitches(int numberOfPitches) {
		this.numberOfPitches = numberOfPitches;
	}	
	
	// Set number of pitches in the game
	public void setNumberOfStrikes(int numberOfStrikes) {
		this.numberOfStrikes = numberOfStrikes;
	}
	
	// Return average number of strikes per player for this game
	public double getAverageStrikesPerPlayer() {
		return (double) numberOfStrikes / getTeamSize();
	}
	
	// Return strikeout ratio
	public double getStrikeoutRatio() {
		return (double) numberOfStrikes / numberOfPitches;
	}	

	// Return average points per inning
	public double getAveragePointsPerInning() {
		return (double) getGamePoints() / numberOfInnings;
	}
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nNumber of Innings: " + numberOfInnings + "\nNumber of Pitches: " + numberOfPitches + "\nNumber of Strikes: " + numberOfStrikes;
	}	
}

class Basketball extends Sport {
	// Create variables
	private int numberOfPasses;
	
	// Define default constructor
	public Basketball() {
	}
	
	// Define constructor with this class's parms
	public Basketball(int numberOfPasses) {
		this.numberOfPasses = numberOfPasses;
	}
	
	// Define constructor with all parms
	public Basketball(int numberOfPasses, int gamePoints, int teamSize) {
		this.numberOfPasses = numberOfPasses;
		super.setGamePoints(gamePoints);
		super.setTeamSize(teamSize);
	}
	
	// Set number of passes
	public void setNumberOfPasses(int numberOfPasses) {
		this.numberOfPasses = numberOfPasses;
	}
	
	// Return average number of passes per player
	public double getAveragePassesPerPlayer() {
		return (double) numberOfPasses / getTeamSize();
	}
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nNumber of Passes: " + numberOfPasses;
	}	
}

