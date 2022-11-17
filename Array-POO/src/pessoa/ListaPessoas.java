package pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {
	
	private List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	public boolean add(Pessoa pessoa) {

		if (pessoa.getNome().length() < 3 || pesquisaNome(pessoa)) {
			return false;
		}else {
			lista.add(pessoa);
			return true;
		}

	}
	
	public boolean pesquisaNome(Pessoa pessoat){
		
		for (Pessoa p : lista)
		{
		   if (pessoat.getNome() == p.getNome())
		      return true;
		}
		return false;
		
	}
	
	public List<Pessoa> pesquisaIdade(int idade){
		List<Pessoa> listaIdade = new ArrayList<Pessoa>();
		
		for (Pessoa p : lista){
		   if (p.calcularIdade()>idade) {
			   listaIdade.add(p);
		   }
		}
		
		return listaIdade;	
	}
	
	public List<Pessoa> pesquisaMes(int mes){
		List<Pessoa> listaMes = new ArrayList<Pessoa>();
		
		for (Pessoa p : lista){
		   if (p.getAniversario().getMonth()==(mes-1)) {
			   listaMes.add(p);
		   }
		}
		
		return listaMes;
	}
	
	public void removeNome(String nome) {		
		this.lista.removeIf(pessoa -> pessoa.getNome().equals(nome));
	}
	
	public void alteraPessoa(int id, String nome, java.util.Date aniversario, String email) {		
		lista.get(id).setNome(nome);
		lista.get(id).setAniversario(aniversario);
		lista.get(id).setEmail(email);
	}
	
	public ArrayList<String> pesquisaDominios() {

		ArrayList<String> dominios = new ArrayList<String>();
		
		for (Pessoa p : lista){
			
			  String split[] = p.getEmail().split("@");
			  
			  if (!dominios.contains(split[1])){
				  dominios.add(split[1]);
			  }
	
		}
		return dominios;
	}
	//fazer busca usando "like" inicial do nome
}
