package tp3;

public abstract class Pessoa {
	private String nome;
	private String email;
	
	public abstract void cadastrarLeitor();
	
	public abstract void editarLeitor();
	
	public abstract void excluirLeitor();
	
	public Pessoa(String nome_, String email_){
		nome  = nome_;
		email = email_;
	}

}
