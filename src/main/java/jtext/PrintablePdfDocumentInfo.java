package jtext;

import com.itextpdf.kernel.pdf.PdfDictionary;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfDocumentInfo;

/**
 * Extension of PdfDocumentInfo to make toString useful.
 */
public class PrintablePdfDocumentInfo extends PdfDocumentInfo {

    private static final long serialVersionUID = -21957940280527122L;

    public PrintablePdfDocumentInfo(PdfDictionary pdfObject, PdfDocument pdfDocument) {
        super(pdfObject, pdfDocument);
    }

    public PrintablePdfDocumentInfo(PdfDictionary pdfObject) {
        super(pdfObject);
    }

    public PrintablePdfDocumentInfo(PdfDocument pdfDocument) {
        super(pdfDocument);
    }

    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Title: ");
        builder.append(this.getTitle());
        builder.append("\n");
        builder.append("Subject: ");
        builder.append(this.getSubject());
        builder.append("\n");
        builder.append("Keywords: ");
        builder.append(this.getKeywords());
        builder.append("\n");
        builder.append("Creator: ");
        builder.append(this.getCreator());
        builder.append("\n");
        builder.append("Producer: ");
        builder.append(this.getProducer());
        builder.append("\n");
        return builder.toString();
    }
}
