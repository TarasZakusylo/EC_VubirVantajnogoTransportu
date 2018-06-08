package EC_VubirVantajnogoTransportu;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class Rezaltaty extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_Rezult = "";

	private JLabel l_logo;

	Desktop desktop = Desktop.getDesktop();

	String s_rezultatNazva = "Автомобільні перевезення";
	String s_rezultatOpys = "";
	
	public Rezaltaty(String s_choice1, String s_choice2, String s_choice3, String s_choice4, String s_choice5,
			String s_choice6, String s_choice7, String s_choice8) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		JButton b_Menu = new JButton("Меню");
		b_Menu.setBounds(33, 410, 433, 50);
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
		getContentPane().setLayout(null);
		b_Menu.setForeground(new Color(0, 128, 0));
		b_Menu.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		getContentPane().add(b_Menu);

		s_rezultatOpys = "Автомобільні перевезення вантажів - це найбільш поширений вид послуг практично будь-якої транспортної компанії. Також подібні вантажні перевезення вважаються найменш витратними в плані бюджету. Все тому що стандартні перевезення вантажів виконуються за допомогою звичайного транспорту без застосування спеціальної техніки. Стандартні вантажі не вимагають використання захисної амуніції і устаткування при навантаженні в кузов вантажного автомобіля або залізничний вагон."
				+ "\r\n\n"
				+ "У перевезеннях на невелику відстань поза конкуренцією перебуває автомобільний транспорт. Його великою перевагою є те, що він майже не залежить від природних умов і може доставляти вантажі від “дверей до дверей”. За густотою автодоріг (280 км на тис. км.2 ) з твердим покриттям Україна займає перше місце серед країн СНД. \r\n" + 
				"\r\n"+ "Автомобільний транспорт утримує перше місце за перевезенням пасажирів та друге – за вантажообігом. Протяжність автошляхів – майже 170 тис. км (155 тис. км доріг має тверде покриття), якість їх за європейськими стандартами – незадовільна. Недосконалий автопарк, відсутність необхідного сервісу на дорогах, високі ціни на бензин роблять автотранспорт одним з найдорожчих видів транспорту.";
		
		
		if (s_choice3.equals("Доставка за кордон")) {
			s_rezultatNazva = "Авіаперевезення";
			s_rezultatOpys = "За статистикою, вірогідність потрапити в авіакатастрофу в тисячі разів менше, ніж потрапити у неприємності на трасі або під час руху потягу. З вантажоперевезеннями ситуація аналогічна. Доставка вантажів авіа - безпечний і найшвидший з існуючих спосіб транспортування на великі відстані. Іноді іншого виходу просто немає."
					+ "\n\n"
					+ "Доставка літаком часто використовується для вантажів з нетиповими параметрами, небезпечних вантажів, медикаментів, дорогих швидкопсувних продуктів. Але не всякий негабарит вийде розмістити усередині фюзеляжу літака. Потрібно провести точні розрахунки, попрацювати над разваговкою, виготовити спеціальні кріплення.\r\n" + 
					"\r\n" + 
					"Зі стандартними і збірними вантажами справа йде простіше. З ними не виникає проблем за винятком вартості операції. Доставка вантажів авіа рентабельна, коли необхідно переправити їх якомога швидше, для товарів що швидко втрачають властивості, гуманітарної допомоги і т.д. Літаком часто перевозять тварин. Вони в рази легше сприймають переліт, ніж поїздку в кузові вантажівки, залізничному вагоні.";
		}
		if (s_choice7.equals("Так")&&s_choice1.equals("Понад 100 т.")) {
			s_rezultatNazva = "Трубопровід";
			s_rezultatOpys = "Трубопровідний транспорт в Україні є одним з найрозвинутіших і складається з двох частин – газопроводу та нафтопроводу. За обсягом транзиту трубопровідний транспорт є першим. На сьогодні Україна є найбільшим у світі транзитером природного газу. Системами магістральних газопроводів, які перебувають у користуванні НАК \"Нафтогаз України\", російський природний газ надходить до країн Західної, Центральної та Східної Європи. Пропускна спроможність вітчизняної газотранспортної системи на вході становить 290 млрд. м куб., а на виході (до країн Західної, Центральної та Східної Європи, а також до Молдови і на південь Росії) – майже 170 млрд. м куб. на рік.";
		}
		if (s_choice1.equals("До 20 кг.")&&s_choice3.equals("У межах міста")) {
			s_rezultatNazva = "Громадський транспорт";
			s_rezultatOpys = "Міський пасажирський транспорт включає метрополітени, трамваї, тролейбуси, автобуси, таксі. Метро є у Києві, Харкові, Дніпропетровську. У 24 місцях України загальна протяжність трамвайних копій складає 2,2 тис. км. Протяжність тролейбусних ліній складає 4,2 тис. км. Понад 400 міст і сіл України мають автобуси загального користування для внутрішньо міських перевезень. У 164 містах працюють легкові таксі.";
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(500, 82, 482, 406);
		getContentPane().add(scrollPane);

		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setForeground(new Color(186, 85, 211));
		textPane.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textPane.setText(s_rezultatOpys);

		JLabel l_komentar = new JLabel("Вам найкраще підходять:");
		l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar.setForeground(new Color(0, 128, 0));
		l_komentar.setFont(new Font("Sitka Text", Font.BOLD, 33));
		l_komentar.setBounds(12, 164, 476, 50);
		getContentPane().add(l_komentar);

		JLabel label_3 = new JLabel("Короткий опис:");
		label_3.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(500, 63, 482, 16);
		getContentPane().add(label_3);
		
		JLabel l_rezultat = new JLabel(s_rezultatNazva);
		l_rezultat.setHorizontalAlignment(SwingConstants.CENTER);
		l_rezultat.setForeground(new Color(138, 43, 226));
		l_rezultat.setFont(new Font("Sitka Text", Font.BOLD, 33));
		l_rezultat.setBounds(12, 240, 476, 50);
		getContentPane().add(l_rezultat);
		
				l_logo = new JLabel("");
				l_logo.setBounds(0, 0, 994, 565);
				l_logo.setIcon(new ImageIcon("res/Rezult.jpg"));
				// l_logo.setIcon(new
				// ImageIcon("C:\\Users\\Zakkk\\Desktop\\Rezult.jpg"));
				getContentPane().add(l_logo);

		setVisible(true);
	}
}
