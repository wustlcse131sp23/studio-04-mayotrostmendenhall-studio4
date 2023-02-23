package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String ham = in.next();
		int r = in.nextInt();
		int b = in.nextInt();
		int g = in.nextInt();

		boolean fill = in.nextBoolean();
		if(ham.equals("rectangle")) {
			StdDraw.setPenColor(r,b,g);
			if(fill) {
				double x = in.nextDouble();
				double y = in.nextDouble();
				double h = in.nextDouble();
				double l = in.nextDouble();
				StdDraw.filledRectangle(x, y, h, l);
			}
			else {
				double x = in.nextDouble();
				double y = in.nextDouble();
				double h = in.nextDouble();
				double l = in.nextDouble();
				StdDraw.rectangle(x, y, h, l);
			}
		}
		if(ham.equals("ellipse")) {
			StdDraw.setPenColor(r,b,g);
			if(fill) {
				double x = in.nextDouble();
				double y = in.nextDouble();
				double h = in.nextDouble();
				double l = in.nextDouble();
				StdDraw.filledEllipse(x, y, h, l);
			}
			else {
				double x = in.nextDouble();
				double y = in.nextDouble();
				double h = in.nextDouble();
				double l = in.nextDouble();
				StdDraw.ellipse(x, y, h, l);
			}
		}
		if(ham.equals("triangle")) {
			StdDraw.setPenColor(r,b,g);
			if(fill) {
				double[] x = [3];
				double[] y = [3];
			for(int i=0;i<5;i++) {
				if(i%2==0) 
					x[i]=in.nextDouble();
				else
					y[i]=in.nextDouble();
						
			}
			}StdDraw.filled(x, y, h,);
			}
			else {
				
				
				StdDraw.ellipse(x, y, h,);
			}
		}




	}
}
