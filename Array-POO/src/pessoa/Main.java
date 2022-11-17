package pessoa;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ListaPessoas l = new ListaPessoas();
		
		GregorianCalendar cal = new GregorianCalendar(1999,Calendar.DECEMBER,12);
		Date aniversario = cal.getTime();
		
		//adicionar novas pessoas a lista
		
		System.out.println("Retorno das adições");
		
		//adiciona
		Pessoa p = new Pessoa("Cleber", "cleber@gmail.com", aniversario);
		
		System.out.println(l.add(p));
		l.add(p);
		
		cal = new GregorianCalendar(2013,Calendar.NOVEMBER,12);
		aniversario = cal.getTime();
		
		p = new Pessoa("Claudio", "Claudio@hotmail.com", aniversario);
		l.add(p);
		
		p = new Pessoa("Alice", "Alice@gmail.com", aniversario);
		l.add(p);
		
		p = new Pessoa("Joao", "Joao@gmail.com", aniversario);
		l.add(p);
		
		//não adiciona (mesmo nome)
		p = new Pessoa("Cleber", "cleberNOVO@gmail.com", aniversario);
		
		System.out.println(l.add(p));
		l.add(p);
		
		
		//não adiciona (nome < 3 letras)
		p = new Pessoa("A", "nome<3@gmail.com", aniversario);
		
		System.out.println(l.add(p));
		l.add(p);
		
		System.out.println();
		
		//gera idade
		System.out.println("---Idade da Ultima pessoa criada---");
		System.out.println(p.calcularIdade());
		System.out.println();
		
		//pesquisa por idade
		System.out.println("---Lista Pessoas com 20 anos---");
		System.out.println(l.pesquisaIdade(20));
		System.out.println();
		
		//pesquisa por mes de aniversario
		System.out.println("---Lista Aniversario em Dezembro---");
		System.out.println(l.pesquisaMes(12));
		System.out.println();
		
		//Lista com pessoas
		System.out.println("---Lista Antes---");
		System.out.println(l.getLista());
		System.out.println();
		
		//removendo uma pessoa da lista por nome
		l.removeNome("Cleber");
		System.out.println("---Lista Depois---");
		System.out.println(l.getLista());
		System.out.println();
		
		//editar pessoa
		cal = new GregorianCalendar(2000,Calendar.JANUARY,2);
		aniversario = cal.getTime();
		l.alteraPessoa(1, "AliceNovo", aniversario, "Alicenovo@gmail.com");
		
		//buscar dominios
		System.out.println(l.pesquisaDominios());
		
		List<Pessoa> lista = l.getLista();
		System.out.println();
		
		for (Pessoa item : lista) {
			System.out.println(item.toString());
		}
		
	}

}

