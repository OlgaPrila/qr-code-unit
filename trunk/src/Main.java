import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import qrcode.QrCode;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws COSVisitorException
	 */
	public static void main(String[] args) throws IOException,
			COSVisitorException {

		try {
			System.out.println(QrCode.decode(QrCode.PDFToImage("D:/code.pdf")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			QrCode.saveBufferedImageToPDF(QrCode.createQrCodeWhithImage(
					"hello world 123456789qwertyuioasdfghjklzxcvbnm", QrCode
							.loadImage("D:/z.jpg", "jpg")),
					new FileOutputStream(new File("D:/code.pdf")));

		} catch (COSVisitorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}


}