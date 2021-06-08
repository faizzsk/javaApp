package Collection;

import java.util.Comparator;

public class ReverseOrder implements Comparator<Trainer>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Trainer o1, Trainer o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}


}
