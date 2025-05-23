package programas;

//Tipos de dados
//Númericos Reais
public class programa12 {

	public static void main(String[] args) {
		//Tipos primários/primitivos
		//Por padrão os números reais em java são considerados double
		float preco1 = 23.4f;
		double preco2 = 23.4;
		
		//Tipos não primários/primitivos
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float -> preco1 = " + preco1);
		System.out.println("double -> preco2 = " + preco2);
		System.out.println("Float -> preco3 = " + preco3);
		System.out.println("Double -> preco4 = " + preco4);
		
		//Tamanho Ocupado em memória
		System.out.println("\nfloat/Float " + Float.SIZE + " bits");
		System.out.println("double/Double " + Double.SIZE + " bits");

		//Tamanho máximo e minímo de cada tipo
		System.out.println("\nValor Min float/Float " + Float.MIN_VALUE);
		System.out.println("Valor Max float/Float " + Float.MAX_VALUE);
		
		System.out.println("Valor Min double/Double " + Double.MIN_VALUE);
		System.out.println("Valor Max double/Double " + Double.MAX_VALUE);

	}

}
