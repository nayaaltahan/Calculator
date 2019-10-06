package calculator;

import java.util.Stack;

public class Visitor implements IVisitor {

	public Stack<Double> stack;

	public Visitor() {
		stack = new Stack<Double>();
	}

	@Override
	public double visit(Operator operator) throws Exception {
		double op1 = stack.pop();
		double op2 = stack.pop();
		String operatorValue = operator.getValue();
		double res = 0;
		switch (operatorValue) {
		
		case "+":
			res = op1 + op2;
			stack.push(res);
			return res;
		case "-":
			res = op1 - op2;
			stack.push(res);
			return res;
			
		case "/":
			res = op1 / op2;
			stack.push(res);
			return res;

		case "*":
			res = op1 * op2;
			stack.push(res);
			return res;

		case "%":
			res = op1 % op2;
			stack.push(res);
			return res;
		
		default:
			
			throw new Exception();
		}
		
	}

	@Override
	public void visit(Operand operand) {
		stack.push(operand.getValue());
	}

}
