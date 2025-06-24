package com.elamathi.cts.module1.designPatterns.builder;

public class Main {
	public static void main(String[] args) {
		Computer computer = new Computer.Builder(85).setRAM(8).setStorage(62.0).build();
		
		System.out.println("Computer specs");
		System.out.println("CPU: " + computer.getCPU());
		System.out.println("RAM: " + computer.getRAM());
		System.out.println("Storage: "+ computer.getStorage());
	}

}
