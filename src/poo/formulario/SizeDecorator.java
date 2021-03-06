package poo.formulario;

public class SizeDecorator extends ValidadorDecorator{

	private int min = 0;
	private int max = 200;
	
	public SizeDecorator(ValidadorDeCampo validador){
		super(validador);
	}
	
	public SizeDecorator(ValidadorDeCampo validador, int min, int max){
		this(validador);
		this.max = max;
		this.min = min;
	}
	
	public boolean validar(String valor){
		if(!super.validar(valor)) return false;
		return (valor.length() >= min) && (valor.length() <= max);
	}
}
