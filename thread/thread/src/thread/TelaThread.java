package thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaThread extends JDialog {
	
	private JPanel jp = new JPanel(new GridBagLayout());
	private JLabel jl = new JLabel("Time Thread #1");
	private JTextField tempo = new JTextField();
	
	private JLabel jl2 = new JLabel("Time Thread #2");
	private JTextField tempo2 = new JTextField();

	public TelaThread() {
		
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints grid = new GridBagConstraints();
		grid.gridx = 0;
		grid.gridy = 0;
		
		jl.setPreferredSize(new Dimension(200, 25));
		jp.add(jl, grid);
		
		tempo.setPreferredSize(new Dimension(200, 25));
		grid.gridy ++;
		jp.add(tempo, grid);
		
		jl2.setPreferredSize(new Dimension(200, 25));
		grid.gridy ++;
		jp.add(jl2, grid);
		
		tempo2.setPreferredSize(new Dimension(200, 25));
		grid.gridy ++;
		jp.add(tempo2, grid);
		
		add(jp, BorderLayout.WEST);
		setVisible(true);
	}
}
