import java.util.ArrayList;
import java.util.List;

public class Section {
private String titlu ;
	
	private String author;
	
	private List<Chapter> listChapter = new ArrayList<Chapter>();
	
	
	public Section(String t) {
		// TODO Auto-generated constructor stub
		titlu = t;
	}

	public int createChapter(String titluCapitol) {
		Chapter c = new Chapter(titluCapitol);
		listChapter.add(c);
		return listChapter.size() - 1;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(titlu);
		System.out.println(author);
		System.out.println(listChapter);
	}

	public void addAuthor(Author a) {
		// TODO Auto-generated method stub
		
	}

	public Chapter getChapter(int indexChapterOne) {
		// TODO Auto-generated method stub
		
		return listChapter.get(indexChapterOne);
	}
}
