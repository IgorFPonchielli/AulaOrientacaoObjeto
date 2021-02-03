package arrayList;

public class Main {

	public static void main(String[] args) {
		
		
		Contato c1 = new Contato(0, "igor", "3333-4444");
		Contato c2 = new Contato(0, "felipe", "3333-4444");
		Agenda agenda = new Agenda();
		
		
		agenda.cadastrar(c1);
		agenda.cadastrar(c2);
		
		agenda.listar();
		
		agenda.excluir(c1);		
		
		System.out.println("-------");
		
		agenda.listar();
		
		agenda.atualizar(c2, "igor felipe", "333-4445");
		
		System.out.println("-------");
		
		agenda.listar();
		
	}

}
