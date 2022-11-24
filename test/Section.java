import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
	private String nume ;
	
	private List<Element> listElement = new ArrayList<Element>();
	
	
	public Section(String n) {
		// TODO Auto-generated constructor stub
		nume = n;
	}

	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println(nume);

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

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		for (Element element : listElement) {
			element.accept(v);
		}
		
	}
}
