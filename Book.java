import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
	
	private String titlu ;
	
	private Author author;
	
	private List<Chapter> listChapter = new ArrayList<Chapter>();
	
	
	public Book(String t) {
		// TODO Auto-generated constructor stub
		super(t);
	}

	public int createChapter(String titluCapitol) {
		Chapter c = new Chapter(titluCapitol);
		listChapter.add(c);
		return listChapter.size() - 1;
	}

	public void print() {
		// TODO Auto-generated method stub
		author.print();
		super.print();
		
		
	}

	public void addAuthor(Author a) {
		// TODO Auto-generated method stub
		this.author = a;
	}

	public Chapter getChapter(int indexChapterOne) {
		// TODO Auto-generated method stub
		
		return listChapter.get(indexChapterOne);
	}

	public void addContent(Element element) {
		// TODO Auto-generated method stub
		super.add(element);
	}

}
