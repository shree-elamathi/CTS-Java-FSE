package com.elamathi.cts.module1.designPatterns.factory;

class wordDocument implements Document {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening Word Document");
	}

}

class pdfDocument implements Document{
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening PDF");
	}
}

class excelDocument implements Document{
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening Excel");
	}
}
