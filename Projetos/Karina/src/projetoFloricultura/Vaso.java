package projetoFloricultura;

public class Vaso {
	private String tamanho;
	private String cor;
	private String ambiente;
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	
	public void setAmbiente(String ocasiao) {
		this.ambiente = ocasiao;
	}
	
	//Os vasos serão considerados iguais se forem para o mesmo ambiente.
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ambiente == null) ? 0 : ambiente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vaso other = (Vaso) obj;
		if (ambiente == null) {
			if (other.ambiente != null)
				return false;
		} else if (!ambiente.equals(other.ambiente))
			return false;
		return true;
	}
	

}
