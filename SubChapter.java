import java.util.ArrayList;

public class SubChapter {

	private ArrayList<Paragraph> paragraphList = new ArrayList<Paragraph>();
	private ArrayList<Image> imageList = new ArrayList<Image>();
	private ArrayList<Table> tableList = new ArrayList<Table>();
	
	public SubChapter(String titluSubCapitol) {
		// TODO Auto-generate
	}

	
	public void createNewParagraph(String text) {
		Paragraph paragraph = new Paragraph(text);
		// TODO Auto-generated method stub
		paragraphList.add(paragraph);
		
	}

	public void createNewImage(String text) {
		Image image = new Image(text);
		// TODO Auto-generated method stub
		imageList.add(image);
	}

	public void createNewTable(String text) {
		Table table = new Table(text);
		// TODO Auto-generated method stub
		tableList.add(table);
	}

	public void print() {
		// TODO Auto-generated method stub
		for (Paragraph p: paragraphList) {
			p.print();
		}
		for (Image i: imageList) {
			i.print();
		}
		for (Table t: tableList) {
			t.print();
		}
	}
	
}
