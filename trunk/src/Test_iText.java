import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author olga@localhost
 * */
public class Test_iText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_iText app = new Test_iText();
		try {
			app.test();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void test() throws IOException {
		Document document = new Document();

		try {
			PdfWriter.getInstance(document, new FileOutputStream(
					"HelloWorld3.pdf"));
			document.open();
			
			BaseFont bf = BaseFont.createFont("D:\\arialuni.ttf",
					BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
			Font font = new Font(bf);
			document.add(new Paragraph("Привет‚ Hello", font));

			document.close(); // no need to close PDFwriter?

		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

}
