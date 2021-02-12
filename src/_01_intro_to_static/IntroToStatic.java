package _01_intro_to_static;

public class IntroToStatic {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    static int bibNumber;

    IntroToStatic (String name, int speed){
        this.name = name;
        this.speed = speed;
    }
private static void nextBibNumber() {
		bibNumber +=1;
		
	}
    public static void main(String[] args) {
       IntroToStatic Athlete = new IntroToStatic("Jim", 7);
       IntroToStatic Athlete2 = new IntroToStatic("Immy", 9);
       IntroToStatic.nextBibNumber();
       System.out.println("His name is " + Athlete.name + " and his bib number is " + Athlete.bibNumber + ", Their race is being held at " + raceLocation + " and will start at " + raceStartTime);
       IntroToStatic.nextBibNumber();
       System.out.println("His name is " + Athlete2.name + " and his bib number is " + Athlete2.bibNumber + ", Their race is being held at " + raceLocation + " and will start at " + raceStartTime);
     
        //print their names, bibNumbers, and the location of their race. 
    }

	
}
