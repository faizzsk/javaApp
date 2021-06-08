package Collection;

import java.util.Comparator;

class SortByID implements Comparator<Trainer>
{

	
	public int compare(Trainer o1, Trainer o2) {
		return o1.getId()-o2.getId();
	}

	
}

class SortByIDAndName implements Comparator<Trainer>
{ // Ascending

	public int compare(Trainer o1, Trainer o2) {
		if(o1.getId() == o2.getId())
		{
			return o1.getName().compareToIgnoreCase(o2.getName());
		}else
		return o1.getId()-o2.getId();
	}
	
}




class SortByIDAndNameD implements Comparator<Trainer>{

	@Override
	public int compare(Trainer o1, Trainer o2) {
		
		if(o1.getId() == o2.getId())
		{
			return o2.getName().compareToIgnoreCase(o1.getName());
		}else
		return o1.getId()-o2.getId();
	}// id same go with name but in des. order else sort by id ascending
	
}

public class DemoComparator {

}
