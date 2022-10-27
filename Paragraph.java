import java.util.ArrayList;

public class Paragraph implements Element{
		
	private String text;
	
	public Paragraph(String string) {
		text = string;
	}
	
	public void print() {
		System.out.println(text);
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
}
