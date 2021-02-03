package arrayList;
import java.util.ArrayList;

public class Agenda{

	ArrayList<Contato> lista = new ArrayList<Contato>();
	
	public void cadastrar(Contato contato) {
		lista.add(contato);		
	}
	
	public void listar() {
		for (Contato contato : lista) {
			System.out.println("nome: " + contato.getNome());
			System.out.println("telefone: " + contato.getTelefone());
		}
	}
	
	public void excluir(Contato contato) {
		lista.remove(contato);
	}
	
	public void atualizar(Contato contato, String nome, String telefone) {
		if (lista.contains(contato)) {
			
			System.out.println("\n---DADOS ANTIGOS---");
			System.out.println("nome: " + contato.getNome());
			System.out.println("telefone: " + contato.getTelefone());
			
			contato.setNome(nome);
			contato.setTelefone(telefone);
			
			System.out.println("\n---DADOS ATUALIZADOS---");
			System.out.println("nome: " + contato.getNome());
			System.out.println("telefone: " + contato.getTelefone());						
		}
	}
	
}
