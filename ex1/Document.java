package Lab1.ex1;

interface Document {
    void save();
    void show();
}

class PDFDocument implements Document {
    @Override
    public void save() {
        System.out.println("Saving PDF document...");
    }
    @Override
    public void show() {
        System.out.println("Opening PDF document...");
    }
}

class WordDocument implements Document {
    @Override
    public void save() {
        System.out.println("Saving Word document..");
    }
    @Override
    public void show() {
        System.out.println("Opening Word document..");
    }
}

class HTMLDocument implements Document {
    @Override
    public void save() {
        System.out.println("Saving HTML document..");
    }
    @Override
    public void show() {
        System.out.println("Opening HTML document..");
    }
}

class DocumentFactory {
    public static Document createDocument(String docType) {
        switch (docType) {
            case "PDF":
                return new PDFDocument();
            case "Word":
                return new WordDocument();
            case "HTML":
                return new HTMLDocument();
            default:
                throw new IllegalArgumentException("Document type not supported: " + docType);
        }
    }
}

