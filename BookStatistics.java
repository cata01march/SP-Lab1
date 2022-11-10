
public class BookStatistics implements Visitor{
	
	private int imageCount = 0;
	
	private int paragraphCount = 0;
	
	private int tableCount = 0;
	

	public void printStatistics() {
		// TODO Auto-generated method stub
		System.out.println("Book Statistics:");
		System.out.println("* * * Number of images: " + imageCount);
		System.out.println("* * * Number of tables: " + tableCount);
		System.out.println("* * * Number of paragraphs: " + paragraphCount);
	}

	@Override
	public void visitBook(Book b) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitSection(Section s) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitParagraph(Paragraph p) {
		// TODO Auto-generated method stub
		paragraphCount++;
	}

	@Override
	public void visitImageProxy(ImageProxy ip) {
		// TODO Auto-generated method stub
		imageCount++;
	}

	@Override
	public void visitImage(Image i) {
		// TODO Auto-generated method stub
		imageCount++;
	}

	@Override
	public void visitTable(Table t) {
		// TODO Auto-generated method stub
		tableCount++;
	}

}
