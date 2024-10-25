package Lab1.ex1;

import Lab1.ex1.Document;
import Lab1.ex1.DocumentFactory;

public class DocumentEditor {
    public static void main(String[] args) {
        Document pdfDocument = DocumentFactory.createDocument("PDF");
        pdfDocument.show();
        pdfDocument.save();

        Document wordDocument = DocumentFactory.createDocument("Word");
        wordDocument.show();
        wordDocument.save();

        Document htmlDocument = DocumentFactory.createDocument("HTML");
        htmlDocument.show();
        htmlDocument.save();
    }
}
