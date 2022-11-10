import java.util.ArrayList;

public class Table implements Element{

private String text;
	
	public Table(String string) {
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
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visitTable(this);
	}
}
