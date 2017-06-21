package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGenerator {
	private static String path = "src\\main\\resources\\static\\PDF\\";
	private String fileName;
	
	public PdfGenerator(String fileName) {
		super();
		this.fileName = fileName;
		try {
			generate();
		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void generate() throws FileNotFoundException, DocumentException{
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(path+this.fileName));
		document.open();
		Paragraph p1 = new Paragraph("Lets try if it works well");
		document.add(p1);
		document.close();
	}
}
