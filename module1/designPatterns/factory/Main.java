package com.elamathi.cts.module1.designPatterns.factory;

public class Main {
	public static void main(String[] args) {
		DocumentFactory wordFactory = new WordDocumentFactory();
		Document wordoc = wordFactory.createDocument();
		wordoc.open();
		
		DocumentFactory pdfFactory = new PdfDocumentFactory();
		Document pdfdoc = pdfFactory.createDocument();
		pdfdoc.open();
		
		DocumentFactory excelFactory = new ExcelDocumentFactory();
		Document exceldoc = excelFactory.createDocument();
		exceldoc.open();
		
	}

}
