package arvore_binaria_EduardoVinicusArsand;

public class Main {

	public static void main(String[] args) {
		 ArvoreBin arvore = new ArvoreBin();
	        arvore.inserir(10);
	        arvore.inserir(5);
	        arvore.inserir(20);
	        arvore.inserir(3);
	        arvore.inserir(7);

	        arvore.remover(5);
	        
	        arvore.inserir(8);
	        arvore.inserir(12);
	        
	        arvore.remover(20);
	        arvore.remover(7);
	        
	        arvore.inserir(5);
	        arvore.inserir(13);
	        arvore.inserir(21);
	        
	        System.out.println("Caminhamento pré-ordem:");
	        arvore.preOrdem();

	        System.out.println("\nCaminhamento em ordem:");
	        arvore.central();

	        System.out.println("\nCaminhamento pós-ordem:");
	        arvore.posOrdem();
			
			//Salvar no arquivo dot pra visualização 
			arvore.gerarArqDot("arvoreBin.dot");
			
			System.out.println(arvore.buscarMin().info);
	}

}
