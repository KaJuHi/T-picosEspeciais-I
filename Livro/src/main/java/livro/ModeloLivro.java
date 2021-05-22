package livro;

public class ModeloLivro {
	private String titulo;
	private String autor;
	private Integer ano;
	
	public ModeloLivro() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + " | Autor: " + autor + " | Ano: " + ano;
	}
}
