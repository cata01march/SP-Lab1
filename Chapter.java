import java.util.ArrayList;
import java.util.List;

public class Chapter {

	private String nume;
	
	private List<SubChapter> listSubChapter = new ArrayList<SubChapter>();
	
	public Chapter(String titluCapitol) {
		// TODO Auto-generated constructor stub
	}

	public int createSubChapter(String titluSubCapitol) {
		SubChapter sc = new SubChapter(titluSubCapitol);
		listSubChapter.add(sc);
		return listSubChapter.size() - 1;
	}

	public SubChapter getSubChapter(int indexSubChapterOneOne) {
		// TODO Auto-generated method stub
		
		return listSubChapter.get(indexSubChapterOneOne);
	}

	public void print() {
		// TODO Auto-generated method stub
		for (SubChapter c: listSubChapter) {
			c.print();
		}
	}

}
