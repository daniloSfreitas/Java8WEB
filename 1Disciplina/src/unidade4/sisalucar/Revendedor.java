package unidade4.sisalucar;

public enum Revendedor {
	
	ABCVEICULOS("10101010/0001","Rua das Perdizas, 1500","Volkswagen"),
	SIMAOVEICULOS("010101/10001","Av.Morumbi 2500","Honda"),
    EMANUELVAICULOS("11111/0001","Av. das Nações 100","Toyota");
	
	String cnpj;
	String endereco;
	String Fabricante;
	
	private Revendedor(String cnpj, String endereco, String fabricante) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		Fabricante = fabricante;
	}
	
	

}
