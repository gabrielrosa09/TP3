package tp3;

public class FichaTecnica extends Livro{
	
	FichaTecnica(String nomeLivro, String nomeAutor, String tipoGenero, String textinho, double valor, boolean status) {
		super(nomeLivro, nomeAutor, tipoGenero, textinho, valor, status);
		
	}

	private String editora;
	private String idioma;
	private int paginas;
	private int ano;
	private double ISBN;
	
	public void cadastrarFichaTecnica() {
		
	}
	
	public void editarFichaTecnica() {
			
	}

	public void deletarFichaTecnica() {
		
	}
	
}
