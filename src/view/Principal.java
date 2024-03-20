package view;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Principal {
	public static void main(String[] args) {
		Pedido p = new Pedido();
		ItemPedido item = new ItemPedido();
		Produto pr = new Produto();

		pr.setCodigo(1);
		pr.setDescricao("Batata");
		pr.setValor(2.84);

		item.setProduto(pr);
		item.setQuantidade(2);

		p.adicionarItem(item);
		p.setNumeroNota(1);
		System.out.println("Número da nota: " + p.getNumeroNota());
		System.out.println("Produto: " + pr.getDescricao());
		System.out.println("Valor unitário R$ " + pr.getValor());
		System.out.println("Quantidade: " + item.getQuantidade());
		System.out.println("Valor total R$ " + p.getValorTotal());
	}
}
