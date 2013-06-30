package core.syntax;
/*
 * @author Mohamed Adam Chaieb
 * 
 * This enumerable class represents the valid binary operators in mathematical expressions supported by scientrix.
 * */
public enum UnaryOperator 
{
	//ordered by increasing priority
	OG("log"), LN("ln"), COSINE("cos"), SINE("sin"), TANGENT("tan"), FACTORIAL("!"), SQROOT("sqrt"), NEGATE("-"), ARCCOS("arccos"), ARCSIN("arcsin"), ARCTAN("arctan"), ABSOLUTE("abs");
	public String operator;
	
	private UnaryOperator(String operator)
	{
		this.operator = operator;
	}
	
	public boolean equals(UnaryOperator other)
	{
		return this.operator.equals(other.operator);
	}
}
