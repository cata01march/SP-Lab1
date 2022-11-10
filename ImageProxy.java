
public class ImageProxy implements Element{
	Image realImage = null;
	String url;
	Image loadImage() {
		
		if(realImage == null) {
			
			realImage = new Image(url);
		}
		
		return realImage;
	}
	public ImageProxy(String string) {
		url = string;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		loadImage().print();
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
		v.visitImageProxy(this);
	}
}
