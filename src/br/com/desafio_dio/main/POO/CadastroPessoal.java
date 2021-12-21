package br.com.desafio_dio.main.POO;

public class CadastroPessoal extends Cadastro  {
	private String cadastroNome ;
	private String cadastroCpf ;

	public String getCadastroNome() {
		return cadastroNome;
	}

	public void setCadastroNome(String nomeCadastro) {
		this.cadastroNome = nomeCadastro;
	}

	public String getCadastroCpf() {
		return cadastroCpf;
	}

	public void setCadastroCpf(String nomeCpf) {
		this.cadastroCpf = nomeCpf;
	}

	@Override
	public String verificaCadastro(String nome, String cpf) {
		/* nome = null; */  //testa a codição de null
		/* cpf = null; */ // testa a codição de null
       if((nome != null) & (cpf != null)) {
		this.setCadastroNome(nome);        
		this.setCadastroCpf(cpf);
        return "Nome " + getCadastroNome() + " " + "*** número do cpf " + getCadastroCpf();
       }
	return null;	 
	}

}
