package EC_VubirVantajnogoTransportu;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_logo;

	int i_kimnata = 0;

	public Menu(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_logo = new JLabel("");
		l_logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Pidbir("Підбірка");
				setVisible(false);
			}
		});
		l_logo.setHorizontalAlignment(SwingConstants.CENTER);
		l_logo.setFont(new Font("Sitka Text", Font.PLAIN, 55));
		l_logo.setBounds(0, 0, 238, 282);
		l_logo.setIcon(new ImageIcon("res/putanna.png"));
		getContentPane().add(l_logo);

		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new GPS("GPS");
				setVisible(false);
			}
		});
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Sitka Text", Font.PLAIN, 55));
		label.setIcon(new ImageIcon("res/gps.png"));
		label.setBounds(784, 25, 187, 174);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Strahuvanna("Страхування");
				setVisible(false);
			}
		});
		label_1.setFont(new Font("Sitka Text", Font.PLAIN, 55));
		label_1.setIcon(new ImageIcon("res/strahuvanna.png"));
		label_1.setBounds(734, 283, 260, 282);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Kredit("Кредитування");
				setVisible(false);
			}
		});
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Sitka Text", Font.PLAIN, 55));
		label_2.setIcon(new ImageIcon("res/credit.png"));
		label_2.setBounds(0, 311, 339, 174);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Підбір");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Pidbir("Підбірка");
				setVisible(false);
			}
		});
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Sitka Text", Font.ITALIC, 55));
		label_3.setBounds(196, 200, 301, 70);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Відстеження");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new GPS("GPS");
				setVisible(false);
			}
		});
		label_4.setFont(new Font("Sitka Text", Font.ITALIC, 55));
		label_4.setBounds(497, 191, 452, 91);
		getContentPane().add(label_4);

		JLabel label_6 = new JLabel("Кредитування");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Kredit("Кредитування");
				setVisible(false);
			}
		});

		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Sitka Text", Font.ITALIC, 55));
		label_6.setBounds(0, 485, 497, 80);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("Страхування");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Strahuvanna("Страхування");
				setVisible(false);
			}
		});
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Sitka Text", Font.ITALIC, 55));
		label_7.setBounds(497, 485, 497, 80);
		getContentPane().add(label_7);

		setVisible(true);

	}
}
