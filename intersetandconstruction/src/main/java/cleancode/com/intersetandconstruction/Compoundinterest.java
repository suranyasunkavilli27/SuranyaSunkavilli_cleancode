package cleancode.com.intersetandconstruction;
import java.io.*;
import java.lang.*;
import java.util.*;


class Compoundinterest{
	double principalamount;
	double years;
	double rateofinterestpyear;
	Compoundinterest(double p, double y, double r){
		this.principalamount = p;
		this.years = y;
		this.rateofinterestpyear = r;
		}	
	public double findcompoundinterest(){
		double result = principalamount * Math.pow((1 + rateofinterestpyear/100), years);
		return result;
	}
}
	