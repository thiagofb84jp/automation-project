package supermercado;

public class ProgramaTeste {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setNome("Andreia D�bora Sophie Alves");
		c.setCPF("803.371.171-01");
		
		Produto p = new Produto();
		p.setDescricao("Computador Dell Core I7 7th Gen");
		p.setPreco(1823);
		p.setQtdEstoque(50);
		
		c.setQtdItens(1);
		c.setFormaPgto("Cart�o de Cr�dito");
	}
}