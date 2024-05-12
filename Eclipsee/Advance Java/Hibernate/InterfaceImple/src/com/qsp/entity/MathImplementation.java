package com.qsp.entity;

public class MathImplementation implements Maths {

	@Override
	public double add(double num1, double num2) {
		double num3=num1+num2;
		return num3;
	}
	public static void main(String[] args) {
		MathImplementation mathImplementation = new MathImplementation();
		double addnum = mathImplementation.add(1.12, 1.18);
		System.out.println(addnum);
	}

}
