
public class Main {

	public static void main(String[] args) {

			Pessoa pessoa1 = new Pessoa("Matheus", 16, 180);
			
			pessoa1.setIdade(80);
			
			System.out.println("A pessoa" + pessoa1.getNome() + "foi cadastrada com sucesso");
	}

}
