
public class Pessoa {
//Atributos
	String nome;
	String identidade;
	Data dtNascimento;
	
// Construtor
	public Pessoa() {
	}
	public Pessoa(String nome, String identidade, Data dtNascimento) {
		super();
		this.nome = nome;
		this.identidade = identidade;
		this.dtNascimento = dtNascimento;
	}
	
// Getters e Stters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public Data getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Data dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Override
	public String toString() {
		return " Pessoa [nome=" + nome + ", identidade=" + identidade + 
				", dtNascimento=" + dtNascimento + "] ";
	}
	
	
}
