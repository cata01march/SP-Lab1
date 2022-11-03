import java.util.ArrayList;

public class Paragraph implements Element{
		
	private String text;
	private AlignStrategy textAlignment;
	
	public Paragraph(String string) {
		text = string;
	}
	
	public void print() {
		if(textAlignment != null) {
			textAlignment.render(text);
		}
		else {
		System.out.println("Paragraph: " + text + " ");
		}
	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int get() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setAlignStrategy(AlignStrategy alignStrategy) {
		textAlignment = alignStrategy;
		// TODO Auto-generated method stub
		
	}
}
