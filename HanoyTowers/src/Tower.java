
public class Tower {
	public int number;
	public int height;
	public int[] disks;

	public Tower() {
	}

	public Tower(int maxHeight, int number) {
		height = 0;
		disks = new int[maxHeight];
		for (int i = 0; i < maxHeight; i++)
			disks[i] = 0;
		this.number = number;
	}

	public void addDisk(int weight) {
		if (height != 0) {
			if (weight > disks[height - 1]) {
				System.out.println("You cannot do this");
			} else {
				disks[height] = weight;
				height++;
			}
		} else {
			disks[height] = weight;
			height++;
		}
	}

	public void fillTower(int maxHeight) {
		this.height = maxHeight;
		for (int i = 0; i < height; i++) {
			disks[i] = height - i;
		}
	}

	public int getDisk() {
		int temp = disks[height - 1];
		disks[height - 1] = 0;
		height--;
		return temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < height; i++) {
			sb.append(disks[i] + "\t");
		}
		if (height == 0)
			sb.append(0);
		return sb.toString();
	}
}
