package calculator;

public class Operand extends Element{

	private double value;
	
	public Operand(double value) {
		this.value = value;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
	public double getValue() {
		return value;
	}
	
	

}
