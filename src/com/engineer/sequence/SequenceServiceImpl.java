package com.engineer.sequence;

public class SequenceServiceImpl implements SequenceService {

	@Override
	public String calcArithmetic(SequenceBean seq) {
		String result = "";
		String t = "";
		int r = 0;
		for(int i = 1; i <= 100; i++) {
			if( i == 100) {
				t += i + "=";
			}else {
				t += i + "+";
			}
			r += i;
		}
		return result;
	}

	@Override
	public String calrSwitch(SequenceBean seq) {

		return null;
	}

	@Override
	public String calcGeometric(SequenceBean seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcDiffarence(SequenceBean seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcFactorial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcFibonacci() {
		// TODO Auto-generated method stub
		return null;
	}

}
