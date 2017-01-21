package projetoFloricultura;

public class Flor {
	private String tipo;
	private String cor;
	private String luzSolar;
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getLuzSolar() {
		return luzSolar;
	}
	
	public void setLuzSolar(String luzSolar) {
		this.luzSolar = luzSolar;
	}
	
	//Flores do mesmo tipo e mesma necessidade de luz solar serão consideradas iguais.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((luzSolar == null) ? 0 : luzSolar.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Flor other = (Flor) obj;
		if (luzSolar == null) {
			if (other.luzSolar != null)
				return false;
		} else if (!luzSolar.equals(other.luzSolar))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
	

}
