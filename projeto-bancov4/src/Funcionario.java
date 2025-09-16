
public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private boolean ativo = true;
	
	
	public void aumentaSalario(double percentualAumento) {
		this.salario += ((this.salario * percentualAumento)/100);
	}
	public void demite() {
		this.ativo = false;
	}
	
	public void readimite() {
		this.ativo = true;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
