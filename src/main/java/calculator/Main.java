package calculator;

public class Main {

	public static void main(String[] args) throws Exception {
		IVisitor visitor = new Visitor();
		
		visitor.visit(new Operand(4));
		visitor.visit(new Operand(7));
		visitor.visit(new Operand(2));
		System.out.println(visitor.visit(new Operator("+")));
		System.out.println(visitor.visit(new Operator("*")));


	}
}
