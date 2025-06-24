package com.elamathi.cts.module1.designPatterns.factory;

class WordDocumentFactory implements DocumentFactory{
	
	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new wordDocument();
	}

}
class PdfDocumentFactory implements DocumentFactory{
	
	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new pdfDocument();
	}

}

class ExcelDocumentFactory implements DocumentFactory{
	
	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new excelDocument();
	}

}