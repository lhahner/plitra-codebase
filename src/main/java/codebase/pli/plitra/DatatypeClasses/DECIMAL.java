package codebase.pli.plitra.DatatypeClasses;

import java.math.BigDecimal;

public class DECIMAL extends Number{
	BigDecimal content;

	public DECIMAL() {

	}

	public DECIMAL(int integer, int factorial) {
		String length = Integer.valueOf(factorial) == null ? integer + "" : integer + "." + factorial;
		this.content = new BigDecimal(length);
	}

	public DECIMAL(int integer) {
		String length = integer + "";
		this.content = new BigDecimal(length);
	}

	public DECIMAL(int integer, int factorial, int value) {
		// TODO
	}

	public DECIMAL init(int value) {
		this.content.valueOf((double) value);
		return this;
	}

	public DECIMAL calc(String value) {
		// TODO
		return this;
	}

	private double toNumeric() {
		return this.content.doubleValue();
	}
	

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
}
