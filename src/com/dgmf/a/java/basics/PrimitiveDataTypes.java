package com.dgmf.a.java.basics;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		byte myByteVar = 1; // 1 Bit => -128 to 127
		// Error => Type mismatch: cannot convert from int to byte
		// byte myByteVar2 = 1000;
		System.out.println("myByteVar = " + myByteVar);
		
		short myShortVar = 10; // 2 Bits => -32768 to 32767
		// Error => Type mismatch: cannot convert from int to short
		// short myShortVa2 = 100000;
		System.out.println("myShortVar = " + myShortVar);
		
		int myIntVar = 1_000_000_000; // 4 Bits => -2_147_483_648 to 2_147_483_647
		// Error => The literal 10_000_000_000 of type int is out of range
		// int myIntVar2 = 10_000_000_000;
		System.out.println("myIntVar = " + myIntVar);
		
		// Error => The literal 10_000_000_000 of type int is out of range
		// long myLongVar = 10_000_000_000; Eclipse Compiler Considered This 
		// as a "int" without the "L"
		long myLongVar = 10_000_000_000L; // 8 Bits => 
		System.out.println("myLongVar = " + myLongVar);
		// Error => The literal 1_000_000_000_000_000_000_000L of type long is out of range 
		// long myLongVar2 = 1_000_000_000_000_000_000_000L;

		// Error => The literal 10_000_000_000 of type int is out of range
		// float myFloatVar = 10_000_000_000; Eclipse Compiler Considered This 
		// as a "int" without the "F"
		float myFloatVar = 10_000_000_000F;
		System.out.println("myFloatVar = " + myFloatVar);
		
		// Error => The literal 10_000_000_000 of type int is out of range 
		// float myFloatVar = 10_000_000_000; Eclipse Compiler Considered This 
		// as a "int" without the "F"
		double myDouble = 10_000_000_000D;
		System.out.println("myDoubleVar = " + myDouble);
		
		boolean myBoolVar = true; // or "false"
		System.out.println("myBoolVar = " + myBoolVar);
		
		char myCharVar1 = 'A';
		char myCharVar2 = '9';
		System.out.println("myCharVar1 = " + myCharVar1);
		System.out.println("myCharVar2 = " + myCharVar2);
	}

}
