
public class Main {
	
	public static void main(String[] args) throws Exception{
		Firma a = new Firma("Nokia");
		Departament d = new Departament("5G");
		d.add(new Manager("Sefu", 10000));
		d.add(new Programator("Cel bun", 15000));
		d.add(new Programator("Incepator", 4500));
		a.addDepartament(d);
		a.print();
		//Visitor calculSalariu = new VisitorSalariu();
		//accept(calculSalariu);
		//calculSalariu.print();
	}
	
}
