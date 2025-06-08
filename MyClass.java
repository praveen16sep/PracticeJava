package com.java8.test;
public class MyClass implements InterfaceA, InterfaceB {

    @Override
    public void execute() {
        System.out.println("Executing common method");
    }

	@Override
	public void execute(String s) {
		// TODO Auto-generated method stub
		System.out.println("Executing String method");
		
	}
}



@FunctionalInterface
interface InterfaceA {
    void execute();
}

@FunctionalInterface
interface InterfaceB {
    void execute( String s);
}