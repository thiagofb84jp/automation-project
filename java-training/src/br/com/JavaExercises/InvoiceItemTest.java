package br.com.JavaExercises;

public class InvoiceItemTest {
	
	public static void main(String[] args) {
		InvoiceItem invoiceItem1 = new InvoiceItem("1", "Dell Computer", 3, 2000);
		InvoiceItem invoiceItem2 = new InvoiceItem("2", "Books for Informatio Technology", 6, 35);
		
		System.out.println(invoiceItem1.toString());
		System.out.println("Value total of items 1: " + invoiceItem1.getTotal());
		
		System.out.println(invoiceItem2.toString());
		System.out.println("Value total of items 2: " + invoiceItem2.getTotal());
	}
}