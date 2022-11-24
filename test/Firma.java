import java.util.ArrayList;
import java.util.List;

public class Firma extends Section{

	private String nume;
	
	
	private List<Departament> listDep = new ArrayList<Departament>();
	
	
	public Firma(String f) {
		// TODO Auto-generated constructor stub
		
		super(f);
	}
	
	public void addDepartament(Departament d){
		this.listDep.add(d);
	}

	public void print() {
		// TODO Auto-generated method stub
		super.print();
		for (Departament d: listDep) {
			d.print();
		}
		
	}


}
