
public class Cliente {
	private String nome;
	private String cpf;
	private String email;
	
	private boolean validaCpf(String cpf) {
		return(cpf.length()==11);
	}
	public String getNome(String nome) {
		return this.nome = nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		if(this.validaCpf(cpf))
			this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void mostraDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF"+this.cpf);
		System.out.println("E-mail: "+this.email);
	}
	
	
}
