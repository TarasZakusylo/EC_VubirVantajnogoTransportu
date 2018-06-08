package EC_VubirVantajnogoTransportu;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Pidbir extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_logo;

	private Choice choice1;
	private Choice choice2;
	private Choice choice3;
	private Choice choice4;
	private Choice choice5;
	private Choice choice6;
	private Choice choice7;
	private Choice choice8;
	
	private JLabel label_8;

	public Pidbir(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton b_Menu = new JButton("Меню");
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "Перейти до меню", "Продовжити опитування" };
				int i_menu = JOptionPane.showOptionDialog(null, "Якщо Ви перейдете в меню, то введені дані знищаться.",
						"Попередження", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
						null);
				if (i_menu == 0) {
					new Menu("ФенШуй");
					setVisible(false);
				}
			}
		});
		b_Menu.setForeground(new Color(0, 128, 0));
		b_Menu.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		b_Menu.setBounds(0, 0, 150, 118);
		getContentPane().add(b_Menu);

		JButton b_Dali = new JButton("Далі");
		b_Dali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s_choice1 = choice1.getSelectedItem();
				String s_choice2 = choice2.getSelectedItem();
				String s_choice3 = choice3.getSelectedItem();
				String s_choice4 = choice4.getSelectedItem();
				String s_choice5 = choice5.getSelectedItem();
				String s_choice6 = choice6.getSelectedItem();
				String s_choice7 = choice7.getSelectedItem();
				String s_choice8 = choice8.getSelectedItem();
				
				// System.out.println(i_Gua1+" "+i_Gua2+" "+i_Gua3+" "+i_Gua4+"
				// "+i_Gua5+" "+i_Gua6+" "+
				// s_choice1+" "+s_choice2+" "+s_choice3+" "+s_choice4+"
				// "+s_choice5+" "+s_choice6+" "+s_choice7);

				new Rezaltaty(s_choice1, s_choice2, s_choice3, s_choice4, s_choice5, s_choice6, s_choice7, s_choice8);
				setVisible(false);

			}
		});
		b_Dali.setForeground(new Color(0, 128, 0));
		b_Dali.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		b_Dali.setBounds(844, 0, 150, 118);
		getContentPane().add(b_Dali);

		JLabel label = new JLabel("Який розмір вантажу ?");
		label.setForeground(new Color(0, 100, 0));
		label.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 151, 664, 35);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Який бажаний час доставки вантажу ?");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 100, 0));
		label_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_1.setBounds(12, 199, 664, 35);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Який регіон перевезення ?");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(0, 100, 0));
		label_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_2.setBounds(12, 247, 664, 35);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Вантаж потребує холодильного устаткування ?");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(0, 100, 0));
		label_3.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_3.setBounds(12, 391, 664, 35);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Яка важливість, цінність вантажу ?");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(0, 100, 0));
		label_4.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_4.setBounds(12, 343, 664, 35);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Вантаж несе небезпеку ?");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(0, 100, 0));
		label_5.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_5.setBounds(12, 295, 664, 35);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("Вантажем є газ, або нафта ?");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(0, 100, 0));
		label_6.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_6.setBounds(12, 439, 664, 35);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("res/opros1.png"));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(0, 255, 255));
		label_7.setFont(new Font("Sitka Text", Font.BOLD, 33));
		label_7.setBounds(150, 0, 695, 138);
		getContentPane().add(label_7);

		choice1 = new Choice();
		choice1.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		choice1.setBounds(682, 157, 294, 22);
		getContentPane().add(choice1);
		choice1.add("До 20 кг.");
		choice1.add("Від 20 кг. до 100 кг.");
		choice1.add("Від 100 кг. до 1 т.");
		choice1.add("Від 1 т. до 25 т.");
		choice1.add("Від 25 т. до 100 т.");
		choice1.add("Понад 100 т.");

		choice2 = new Choice();
		choice2.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		choice2.setBounds(682, 205, 294, 22);
		getContentPane().add(choice2);
		choice2.add("На протязі доби");
		choice2.add("На протязі 3 днів");
		choice2.add("На протязі тижня");
		choice2.add("На протязі місяця");
		choice2.add("На протязі 3 місяців");

		choice3 = new Choice();
		choice3.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		choice3.setBounds(682, 250, 294, 22);
		getContentPane().add(choice3);
		choice3.add("У межах міста");
		choice3.add("У межах країни");
		choice3.add("Доставка за кордон");

		choice4 = new Choice();
		choice4.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		choice4.setBounds(682, 301, 294, 22);
		getContentPane().add(choice4);
		choice4.add("Безпечно");
		choice4.add("Обережно");
		choice4.add("Критично");

		choice5 = new Choice();
		choice5.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		choice5.setBounds(682, 346, 294, 22);
		getContentPane().add(choice5);
		choice5.add("Мінімальна");
		choice5.add("Середня");
		choice5.add("Велика");

		choice6 = new Choice();
		choice6.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		choice6.setBounds(682, 397, 294, 22);
		getContentPane().add(choice6);
		choice6.add("Не потребує");
		choice6.add("Залежно від умов");
		choice6.add("Потребує");

		choice7 = new Choice();
		choice7.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		choice7.setBounds(682, 445, 294, 22);
		getContentPane().add(choice7);
		choice7.add("Ні, інший вантаж");
		choice7.add("Так");
		
		label_8 = new JLabel("Поряд є водне сполучення ?");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(new Color(0, 100, 0));
		label_8.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_8.setBounds(12, 493, 664, 35);
		getContentPane().add(label_8);
		
		choice8 = new Choice();
		choice8.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		choice8.setBounds(682, 499, 294, 22);
		getContentPane().add(choice8);
		choice8.add("Ні, поряд немає");
		choice8.add("Є озеро");
		choice8.add("Річка із виходом до моря");
		choice8.add("Море / океан");
		
				l_logo = new JLabel("");
				l_logo.setBounds(0, 0, 994, 565);
				l_logo.setIcon(new ImageIcon("res/Oputyvanna.jpg"));
				getContentPane().add(l_logo);

		setVisible(true);
	}
}
