package example.designpatterns;

public class Cha  extends Bebida {

	@Override
	public void adicionarAgua() {
		System.out.println("adicionando �gua no ch�");
		
	}

	@Override
	public void adicionarSubstancia() {
		System.out.println("adicionando ch�");
		
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
		System.out.println("mexendo o ch�");
		
	}
	

}
