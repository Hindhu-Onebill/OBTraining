/*Final variable example - assigning a constant value
 * also called as named constant*/

package com.onebill.corejava.d6handson;

class ErrorMsg{
	final int OUTERR = 0; //Name constants in upper case only
	final int INERR = 1;
	final int DISKERR = 2;
	
	String[] msgs = {"Output error","Input error","Disk error"};
	
	String getErrorMsg(int i) {
		//OUTERR=100;   //final cannot be reassigned or changed
		if (i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Invalid";
	}
}

public class FinalVariable {

	public static void main(String[] args) {
		ErrorMsg obj = new ErrorMsg();
		System.out.println(obj.getErrorMsg(obj.DISKERR));

	}

}
