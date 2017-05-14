import java.util.ArrayList;
public class LastManStanding {
	private static ArrayList<Integer> men = new ArrayList<Integer>();

	private static void initMen(int numberOfMen) {
		for (int i = 0; i < numberOfMen; ++i) {
			men.add(new Integer(i+1));
		}
	}

	private static boolean isLastMan() { return men.size() == 1; }

	private static int lastManStanding(int numberOfMen) {
		initMen(numberOfMen);

		while (!isLastMan()) {
			for (int i = 0; i < men.size(); ++i) {
				men.remove((i+1) % men.size());
				if (isLastMan()) return men.get(0);
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println(lastManStanding(100000000));
	}
}