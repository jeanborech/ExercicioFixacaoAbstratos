package Abstratos_entidades;


public class PessoaJuridica extends Pessoa {

	private Integer Nfuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer nfuncionarios) {
		super(nome, rendaAnual);
		Nfuncionarios = nfuncionarios;
	}

	public Integer getNfuncionarios() {
		return Nfuncionarios;
	}

	public void setNfuncionarios(Integer nfuncionarios) {
		Nfuncionarios = nfuncionarios;
	}

	@Override
	public double imposto() {
		if (Nfuncionarios < 10) {
			setRendaAnual(getRendaAnual() * 0.16);;
		}
		else {
			setRendaAnual(getRendaAnual() * 0.14);
		}
		return getRendaAnual();
	}

}
