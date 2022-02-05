package example.designpatterns;

public class Suco extends Bebida{

	@Override
	public void adicionarAgua() {
		System.out.println("adicionando água no suco");
		
	}

	@Override
	public void adicionarSubstancia() {
		System.out.println("adicionando suco");
		
	}

	@Override
	public boolean colocarAcucar() {
		return true;
	}

	@Override
	public void adicionarAcucar() {
		System.out.println("adicionando açucar ao suco");
		
	}

	@Override
	public void mexer() {
		System.out.println("mexendo o suco");
		
	}

}
