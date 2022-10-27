import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
	
	private String titlu ;
		
	private List<Element> listElement = new ArrayList<Element>();
	
	
	public Section(String t) {
		// TODO Auto-generated constructor stub
		titlu = t;
	}

	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println(titlu);

		for (Element c: listElement) {
			c.print();
		}
	}


	public void add(Element e) {
		// TODO Auto-generated method stub
		listElement.add(e);
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
