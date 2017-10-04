import java.lang.Math;
public class Equazione2G{
	private double a;
	private double b;
	private double c;
	private double soluzione1;
	private double soluzione2;
	private double delta;
Equazione2G (double varA, double varB, double varC){
	a=varA;
	b=varB;
	c=varC;
}
//set variabili
	public void setA(double val){
	a=val;
	}
	public void setB(double val){
	b=val;
	}
	public void setC(double val){
	c=val;
	}
//get variabili
	public double getA(){
	return a;
	}
	public double getB(){
	return b;
	}
	public double getC(){
	return c;
	}
//delta
	public double getDelta(){
		delta=(b*b)-(4*a*c);
		return delta;
	}
//soluzione1
	public double getSoluzione1(){
		soluzione1=(-b+(Math.sqrt (delta)))/(2*a);
		return soluzione1;
	}
// soluzione2
	public double getSoluzione2(){
		soluzione2=(-b-(Math.sqrt (delta)))/(2*a);
		return soluzione2;
	}
}