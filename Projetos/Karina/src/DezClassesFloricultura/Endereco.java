package DezClassesFloricultura;

public abstract class Endereco {
	private String rua;
	private String bairro;
	private Integer numero;
	private Integer numApartamento;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getNumApartamento() {
		return numApartamento;
	}
	public void setNumApartamento(Integer numApartamento) {
		this.numApartamento = numApartamento;
	}
	

}
