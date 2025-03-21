package questao1;

public class Aplicacao {
	public static void main(String[] args) {
		System.out.println("--------Cinema-------------");
		Cinema filme1 = new Cinema (null, 0, 0, false); 
		filme1.setClassificacao(18);
		filme1.setNomeFilme("O Poderoso Chefão"); 
		filme1.setValorIngresso(15); 
		filme1.setMeiaEntrada(false);
		
		filme1.mostraEstado();
		
		System.out.println("-------Cafeteria---------");
		Cafeteria cafe1 = new Cafeteria(); 
		cafe1.setTipoCafe("Preto"); 
		cafe1.setNomeCliente("Helena");
		cafe1.setTamanhoCafe("Medio"); 
		cafe1.setValorCafe(14f);
		
		cafe1.mostraPedido();
		
		System.out.println("------Academia----------");
		Academia aluno1 = new Academia(); 
		aluno1.setNomeCliente("Lucas");
		aluno1.setPlanoEscolhido("Anual");
		aluno1.setPlanoPromocional(true);
		aluno1.setValorPlano(1000f);
		
		aluno1.mostraPlano();
		
		
	}

}
