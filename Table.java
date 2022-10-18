import java.util.ArrayList;

public class Table {

	private ArrayList<String> table;
	
	private String title;
	
	public Table(String string) {

		table = new ArrayList<>();
	}

	public void createNewTable(String string) {
		// TODO Auto-generated method stub
		table.add(string);
		
	}
}
