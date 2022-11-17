package pessoa;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String email;
	private Date aniversario;
	
	public Pessoa(String nome, String email, Date aniversario) {
		super();
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getAniversario() {
		return aniversario;
	}
	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
	public int calcularIdade() {
		Date data = new Date();
		return data.getYear()-aniversario.getYear();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", aniversario=");
		builder.append(aniversario);
		builder.append("]");
		return builder.toString();
	}
}

