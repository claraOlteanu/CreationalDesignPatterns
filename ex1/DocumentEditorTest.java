package Lab1.ex1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentEditorTest {

    @Test
    void testPDFDocumentCreation() {
        Document pdfDoc = DocumentFactory.createDocument("PDF");
        assertTrue(pdfDoc instanceof PDFDocument, "Should create a PDFDocument object");

        pdfDoc.show();
        pdfDoc.save();
    }

    @Test
    void testWordDocumentCreation() {
        Document wordDoc = DocumentFactory.createDocument("Word");
        assertTrue(wordDoc instanceof WordDocument, "Should create a WordDocument object");

        wordDoc.show();
        wordDoc.save();
    }

    @Test
    void testHTMLDocumentCreation() {
        Document htmlDoc = DocumentFactory.createDocument("HTML");
        assertTrue(htmlDoc instanceof HTMLDocument, "Should create an HTMLDocument object");

        htmlDoc.show();
        htmlDoc.save();
    }

    @Test
    void testUnsupportedDocumentType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DocumentFactory.createDocument("JPG");
        });
        assertEquals("Document type not supported: JPG", exception.getMessage());
    }
}

