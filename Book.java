import java.util.ArrayList;

public class Book {
	
	private ArrayList<String> paragraph;
	
	private ArrayList<String> table;
	
	private ArrayList<String> image;
	
	private String titlu ;
	public Book(String string) {
		// TODO Auto-generated constructor stub
		titlu = string;
		paragraph = new ArrayList<>();
		table = new ArrayList<>();
		image = new ArrayList<>();
	}

	public void createNewParagraph(String string) {
		paragraph.add(string);
		
	}

	public void createNewImage(String string) {
		// TODO Auto-generated method stub
		image.add(string);
		
	}

	public void createNewTable(String string) {
		// TODO Auto-generated method stub
		table.add(string);
		
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(titlu);
		System.out.println(paragraph);
		System.out.println(image);
		System.out.println(table);
	}

}
