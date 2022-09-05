package entities;

public class Cliente {
	private Integer idCliente;
	private String nome;
	private String email;
	private String cpf;

	public void setIdCliente(Integer idCliente) {

		if(idCliente > 0)
			this.idCliente=idCliente;
		else
			throw new IllegalArgumentException("O ID tem que ser maior que zero");
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && nome.trim().length()>0)
			this.nome=nome;
		else
			throw new IllegalArgumentException("O campo nome é obrigatório");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null && email.trim().length() > 0)
			this.email = email;
		else
			throw new IllegalArgumentException("O email do cliente é obrigatório");
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf != null && cpf.trim().length()>0)
		this.cpf = cpf;
		else
			throw new IllegalArgumentException("O CPF do cliente é obrigatório");
	}
}
