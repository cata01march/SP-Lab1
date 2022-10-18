import java.util.ArrayList;

public class Image {

	private ArrayList<String> image;
	
	private String imageName;
	
	public Image (String string) {
		
		image = new ArrayList<>();
	}
	
	public void createNewImage(String string) {
		// TODO Auto-generated method stub
		image.add(string);
		
	}
}
