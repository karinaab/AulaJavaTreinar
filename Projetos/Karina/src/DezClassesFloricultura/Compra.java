package DezClassesFloricultura;

import java.util.List;

public class Compra {
	private Cliente cliente;
	private Funcionario vendedor;
	private Double valor;
	private Pagamento formaPagamento;
	private List<Vaso> vasos;
	private List<Flor> flores;
	private Utensilio untensilio;
	private Delivery delivery;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getVendedor() {
		return vendedor;
	}
	public void setVendedor(Funcionario vendedor) {
		this.vendedor = vendedor;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Pagamento getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(Pagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public List<Vaso> getVasos() {
		return vasos;
	}
	public void setVasos(List<Vaso> vasos) {
		this.vasos = vasos;
	}
	public List<Flor> getFlores() {
		return flores;
	}
	public void setFlores(List<Flor> flores) {
		this.flores = flores;
	}
	public Utensilio getUntensilio() {
		return untensilio;
	}
	public void setUntensilio(Utensilio untensilio) {
		this.untensilio = untensilio;
	}
	public Delivery getDelivery() {
		return delivery;
	}
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

}
