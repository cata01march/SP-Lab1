import java.util.ArrayList;

public class SubChapter {

	private ArrayList<Paragraph> paragraph = new ArrayList<Paragraph>();
	private ArrayList<Image> image = new ArrayList<Image>();
	private ArrayList<Table> table = new ArrayList<Table>();
	
	public SubChapter(String titluSubCapitol) {
		// TODO Auto-generated constructor stub
		paragraph = new ArrayList<>();
		image = new ArrayList<>();
		table = new ArrayList<>();
	}

	
	public void createNewParagraph(String p) {
		// TODO Auto-generated method stub
		paragraph.add(Paragraph);
		
	}

	public void createNewImage(String i) {
		// TODO Auto-generated method stub
		i.add(i);
	}

	public void createNewTable(String t) {
		// TODO Auto-generated method stub
		t.add(t);
	}


	public void print() {
		// TODO Auto-generated method stub
		System.out.println(p);
		System.out.println(t);
		System.out.println(i);
	}
	
}
