package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World a = new World();
		Bug b = new Bug();
		a.add(3, b);
		//turn bug to object
		a.show();
	}
}
