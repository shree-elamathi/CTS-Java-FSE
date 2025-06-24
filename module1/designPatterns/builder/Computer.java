package com.elamathi.cts.module1.designPatterns.builder;

public class Computer {
	
	private int CPU;
	private int RAM;
	private double storage;
	
	public static class Builder{
		
		private int CPU;
		private int RAM;
		private double storage;
		
		public Builder(int CPU) {
			this.CPU = CPU;
		}
		
		public Builder setRAM(int RAM) {
			this.RAM = RAM;
			return this;
			
		}
		
		public Builder setStorage(double storage) {
			this.storage = storage;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
		
	}
	
	
	
	private Computer(Builder builder) {
		
		this.CPU = builder.CPU;
		this.RAM = builder.RAM;
		this.storage = builder.storage;
		
	}
	
	public int getCPU() {
		return CPU;
	}
	
	public int getRAM() {
		return RAM;
	}
	
	public double getStorage() {
		return storage;
	}

}
