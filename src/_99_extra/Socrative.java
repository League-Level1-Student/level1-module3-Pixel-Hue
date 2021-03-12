package _99_extra;

public class Socrative{



    static int nextId;



    static String School="Carmel Valley ";



    int id;



    String name;



    int currentLevel;



    Socrative (String name, int currentLevel){



        this.name = name; 

        this.currentLevel = currentLevel; 
    }



    public static void main(String[] args){ 

Socrative student = new Socrative("James", nextId++);
System.out.println("This student is named " + student.name + " and their id is " + student.nextId + ", they go to " + student.School + " Middle School");
Socrative student2 = new Socrative("Jam", nextId++);
System.out.println("This student is named " + student2.name + " and their id is " + student2.nextId + ", they go to " + student2.School + " Middle School");
    //create 2 students. 



    //print their names, ids and school. 

    }}
