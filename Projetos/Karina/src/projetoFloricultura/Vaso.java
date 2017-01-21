package projetoFloricultura;

public class Vaso {
	private String tamanho;
	private String cor;
	private String ocasiao;
	
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
	
	public String getOcasiao() {
		return ocasiao;
	}
	
	public void setOcasiao(String ocasiao) {
		this.ocasiao = ocasiao;
	}
	
	//Os vasos serão considerados iguais se forem para a mesma ocasiao.
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ocasiao == null) ? 0 : ocasiao.hashCode());
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
		if (ocasiao == null) {
			if (other.ocasiao != null)
				return false;
		} else if (!ocasiao.equals(other.ocasiao))
			return false;
		return true;
	}
	

}
