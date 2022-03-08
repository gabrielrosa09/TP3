package tp3;

public class Livro {
	
	Livro (String nomeLivro, String nomeAutor, String tipoGenero, String textinho, double valor, boolean status)
	{
    	titulo = nomeLivro;
    	autor = nomeAutor;
    	genero = tipoGenero;
		descricao = textinho;
		preco = valor;
		lido = status;
  	}
	
	private String titulo;
	private String autor;
	private String genero;
	private String descricao;
	private double preco;
	private boolean lido;

	public void cadastrarLivro() {
		
	}
	
	public void editarLivro() {
			
	}

	public void deletarLivro() {
		
	}
	
}
