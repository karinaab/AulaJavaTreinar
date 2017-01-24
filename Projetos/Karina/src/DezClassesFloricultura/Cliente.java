package DezClassesFloricultura;

import java.util.List;

public class Cliente extends Pessoa{
	private Integer desconto;
	private List<Compra> ultimaCompra;

	public Integer getDesconto() {
		return desconto;
	}

	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}

	public List<Compra> getUltimaCompra() {
		return ultimaCompra;
	}

	public void setUltimaCompra(List<Compra> ultimaCompra) {
		this.ultimaCompra = ultimaCompra;
	}
	
	

}
