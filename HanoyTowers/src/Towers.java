
public class Towers {
	public int steps = 0;

	public Tower[] towers = new Tower[3];

	public Towers(int height) {
		towers[0] = new Tower(height, 0);
		towers[0].fillTower(height);
		towers[1] = new Tower(height, 1);
		towers[2] = new Tower(height, 2);
		System.out.println("Beginning:");
		for (Tower t : towers) {
			System.out.println(t.toString());
		}
	}

	public void moveTower(int height, int fromTower, int toTower, int withTower) {
		if (height >= 1) {
			moveTower(height - 1, fromTower, withTower, toTower);
			moveDisk(fromTower, toTower);
			moveTower(height - 1, withTower, toTower, fromTower);
		}
	}

	public void moveDisk(int fromTower, int toTower) {
		steps++;
		System.out.println("Step # " + steps + ":");
		towers[toTower].addDisk(towers[fromTower].getDisk());
		for (Tower t : towers) {
			System.out.println(t.toString());
		}
	}

}
