import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MainXOR {

	protected Shell shlQuckmO;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainXOR window = new MainXOR();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlQuckmO.open();
		shlQuckmO.layout();
		while (!shlQuckmO.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	private static String hexToAscii(String hexStr) {
	    StringBuilder output = new StringBuilder("");
	     
	    for (int i = 0; i < hexStr.length(); i += 2) {
	        String str = hexStr.substring(i, i + 2);
	        output.append((char) Integer.parseInt(str, 16));
	    }
	     
	    return output.toString();
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlQuckmO = new Shell();
		shlQuckmO.setSize(557, 512);
		shlQuckmO.setText("QU4CKM3 \u00C9 O CARALHO");
		
		Button btnXorcalc = new Button(shlQuckmO, SWT.NONE);
		btnXorcalc.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				
				StringBuffer out = new StringBuffer();
				char st1[] = {0x59, 0x6f, 0x75, 0x20, 0x68, 0x61, 0x76, 0x65, 0x20, 0x6e, 0x6f, 0x77, 0x20, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x65, 0x64, 0x20, 0x74, 0x68, 0x65, 0x20};
				char st2[] = {0x29, 0x06, 0x16, 0x4f, 0x2b, 0x35, 0x30, 0x1e, 0x51, 0x1b, 0x5b, 0x14, 0x4b, 0x08, 0x5d, 0x2b, 0x5c, 0x10, 0x06, 0x06, 0x18, 0x45, 0x51, 0x00, 0x5d};
				int l =25;
				char x;
				
				for(int i=0; i < l; i++)
				{
					
					x = (char) ((st2[i]) ^ (st1[i]));
					out.append(x);
					
				}
				
				JOptionPane.showMessageDialog(null, out.toString());
				
			}
		});
		btnXorcalc.setBounds(10, 10, 519, 445);
		btnXorcalc.setText("XOR_CALC");

	}
}
