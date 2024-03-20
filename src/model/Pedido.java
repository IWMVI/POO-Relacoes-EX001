package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private int numeroNota;
	private double valorTotal;
	private List<ItemPedido> itensPedido;

	public Pedido() {
		this.itensPedido = new ArrayList<>();
	}

	public int getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}

	public double getValorTotal() {
		for (ItemPedido item : itensPedido) {
			try {
				valorTotal += item.getQuantidade() * item.getProduto().getValor();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return valorTotal;
	}

	public void adicionarItem(ItemPedido item) {
		itensPedido.add(item);
	}
}
