package example.designpatterns;

public class Cha  extends Bebida {

	@Override
	public void adicionarAgua() {
		System.out.println("adicionando água no chá");
		
	}

	@Override
	public void adicionarSubstancia() {
		System.out.println("adicionando chá");
		
	}

	@Override
	public boolean colocarAcucar() {
		return false;
	}

	@Override
	public void adicionarAcucar() {
		
	}

	@Override
	public void mexer() {
		System.out.println("mexendo o chá");
		
	}
	

}
