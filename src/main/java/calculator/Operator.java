package calculator;

public class Operator extends Element {

	private String value;
	
	public Operator(String value) {
		this.value = value;
	}
	
	@Override
	public void accept(IVisitor visitor) throws Exception {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	public String getValue() {
		return value;
	}
}
