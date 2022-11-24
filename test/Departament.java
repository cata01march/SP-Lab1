import java.util.ArrayList;
import java.util.List;

public class Departament {

	private String nume;

	private List<Angajati> listAngajati = new ArrayList<Angajati>();
	private List<Departament> listDep = new ArrayList<Departament>();
	
	public Departament(String numeDepartament) {
		// TODO Auto-generated constructor stub
		nume = numeDepartament;
	}

	public int createDepartament(String numeDepartament) {
		Departament d = new Departament(numeDepartament);
		listDep.add(d);
		return listDep.size() - 1;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(nume);
		for (Departament d: listDep) {
			d.print();
		}
		for (Angajati a: listAngajati) {
			a.print();
		}
	}

	public void add(Angajati a) {
		// TODO Auto-generated method stub
		this.listAngajati.add(a);
	}

}
