import java.util.ArrayList;

public class Paragraph {
	
	private ArrayList<String> paragraph;
	
	private String text;
	
	public Paragraph(String string) {
		
		paragraph = new ArrayList<>();
	}
	
	public void createNewParagraph(String string) {
		
		paragraph.add(string);
	}
}
