package windowevent;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame; // using AWT containers and components
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // using AWT events and listener interfaces
import java.awt.event.WindowListener;

// An AWT GUI program inherits the top-level container java.awt.Frame
public class WindowEvent extends Frame implements ActionListener,
		WindowListener {
	// This class acts as listener for ActionEvent and WindowEvent
	// Java support only single inheritance, where a class can extend
	// one superclass, but can implement multiple interfaces.

	private TextField tfCount;
	private int count = 0; // Counter's value

	/** Constructor to setup the GUI */
	public WindowEvent() {
		setLayout(new FlowLayout()); // "this" Frame sets to FlowLayout

		add(new Label("Counter")); // "this" Frame adds an anonymous Label

		tfCount = new TextField("0", 10); // allocate TextField
		tfCount.setEditable(false); // read-only
		add(tfCount); // "this" Frame adds tfCount

		Button btnCount = new Button("Count"); // declare and allocate a Button
		add(btnCount); // "this" Frame adds btnCount

		Button btnClose = new Button("Close");
		add(btnClose);

		btnClose.setActionCommand("CLOSE");
		btnClose.addActionListener(this);

		btnCount.addActionListener(this);
		// btnCount fires ActionEvent to its registered ActionEvent listener
		// btnCount adds "this" object as an ActionEvent listener

		addWindowListener(this);
		// "this" Fra e fires WindowEvent its registered WindowEvent listener
		// "this" Frame adds "this" object as a WindowEvent listener

		setTitle("WindowEvent Demo"); // "this" Frame sets title
		setSize(250, 100); // "this" Frame sets initial size
		setVisible(true); // "this" Frame shows
	}

	/** The entry main() method */
	public static void main(String[] args) {
		new WindowEvent(); // Let the construct do the job
	}

	/** ActionEvent handler */
	@Override
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();
		if (command.equals("CLOSE")) {
			System.exit(0);
		}
		++count;
		tfCount.setText(count + "");
	}

	/** WindowEvent handlers */

	@Override
	public void windowActivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub

	}
}