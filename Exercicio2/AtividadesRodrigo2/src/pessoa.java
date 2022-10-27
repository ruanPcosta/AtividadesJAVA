
public class pessoa{
    int idade, cpf;
    String nome;
    
    
    public pessoa() {
    	String nome = "";
    	int cpf = 0;
    	int idade = 0;
    	
    }
	
	
	
	
	public pessoa(String nome, int idade,int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
