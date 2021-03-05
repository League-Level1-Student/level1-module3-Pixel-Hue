package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		Random ran = new Random();
		int d = ran.nextInt(10);
		int e = ran.nextInt(10);

		World a = new World();
		Bug b = new Bug();
		Bug b2 = new Bug();
		Flower fl = new Flower();
		Flower f2 = new Flower();
		Color green = new Color(3, 14, 255);
		b2.setColor(green);
		b2.turn();
		b2.turn();
		
		Location l = new Location(3, 3);
		Location l2 = new Location(d, e);
		Location l3 = new Location(d -= 1, e);
		Location l4 = new Location(d += 2, e);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Location l1 = new Location(j, i);
				Flower o = new Flower();
				a.add(l1, o);
				System.out.println(l1);
			}
			
		}
		
		a.add(l, b);
		a.add(l2, b2);
		fl.setColor(green);
		f2.setColor(green);
		a.add(l3, fl);
		a.add(l4, f2);
		
		a.show();
	}
}
