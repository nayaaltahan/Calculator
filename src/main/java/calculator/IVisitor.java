package calculator;

public interface IVisitor {
	public double visit(Operator operator) throws Exception;
	public void visit(Operand operand);

}
