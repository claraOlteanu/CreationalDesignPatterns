package Lab1.BonusEx;

interface Document {
    void save(String content);
    void show();
}

class PDFDocument implements Document {
    @Override
    public void save(String content) {
        System.out.println("Saving PDF document with content:\n" + content);
    }

    @Override
    public void show() {
        System.out.println("Displaying PDF document...");
    }
}

class WordDocument implements Document {
    @Override
    public void save(String content) {
        System.out.println("Saving Word document with content:\n" + content);
    }

    @Override
    public void show() {
        System.out.println("Displaying Word document...");
    }
}

class HTMLDocument implements Document {
    @Override
    public void save(String content) {
        System.out.println("Saving HTML document with content:\n" + content);
    }

    @Override
    public void show() {
        System.out.println("Displaying HTML document...");
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

