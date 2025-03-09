package GenericLibrary;

import java.util.Random;

public class Java_Utility {
	public int getRandomnumber() {
		Random r = new Random();
		int result = r.nextInt();
		return result;
	}
}
