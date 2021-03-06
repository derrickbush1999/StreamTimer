package gui;

//Imports
//Awt
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//Swing
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
//eclipse
import org.eclipse.wb.swing.FocusTraversalOnArray;
//classes
import classes.FileClass;
import classes.StyleClass;
import classes.TimeClass;
import classes.debug;

//Io
import java.io.IOException;
//Net
import java.net.URI;
//Util
import java.util.ArrayList;

public class SetupWindow {
	// Instance Variables
	//JFrame
	private JFrame frmSetupWindow;
	//JButton
	private JButton btnResetDefault;
	private JButton btnDone;
	private JButton btnGetOauthKey;
	//JTextField
	private JTextField BotNameTF;
	private JTextField OAuthKeyTF;
	private JTextField ChannelTF;
	private JTextField AddTimeFormatTF;
	private JTextField SubtractTimeFormatTF;
	private JTextField AddTimeCommandTF;
	private JTextField SubtractTimeCommandTF;
	private JTextField SubTimeTF;
	private JTextField ResubTimeTF;
	private JTextField GiftedSubTimeTF;
	private JTextField BitsTimeTF;
	private JTextField HostTimeTF;
	private JTextField HourTF;
	private JTextField MinuteTF;
	private JTextField SecondTF;
	//JLabel
	private JLabel lblTwitchChannel;
	private JLabel lblUserInfo;
	private JLabel lblCommandInfo;
	private JLabel lblAddTimeFormat;
	private JLabel lblSubtractTimeFormat;
	private JLabel lblFormatInfo;
	private JLabel lblAddTimeCommand;
	private JLabel lblSubtractTimeCommand;
	private JLabel lblTimeSettings;
	private JLabel lblStyles;
	private JLabel lblTwitchUsername;
	private JLabel lblTwitchOauthKey;
	private JLabel lblInstructions;
	private JLabel lblUiSettings;
	private JLabel lblRestartToTake;
	private JLabel lblStartTime;
	private JLabel label;
	private JLabel label_1;
	//RadioButton
	private JRadioButton rdbtnSubTime;
	private JRadioButton rdbtnResubTime;
	private JRadioButton rdbtnGiftedSubTime;
	private JRadioButton rdbtnHostraidTime;
	private JRadioButton rdbtnBitsTime;
	//JComboBox
	@SuppressWarnings("rawtypes")
	private JComboBox StylesCB;
	//String
	private String currentSelection;
	//StyleClass
	private StyleClass styles;
	//ArrayList
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	ArrayList<JLabel> labels = new ArrayList<JLabel>();
	ArrayList<JTextField> textFields = new ArrayList<JTextField>();
	ArrayList<JRadioButton> radioButtons = new ArrayList<JRadioButton>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					/*SetupWindow window = new SetupWindow();
					window.frmSetupWindow.setVisible(true);*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SetupWindow() {
		//initialize();
	}

	/**
	 * Activates the window.
	 */
	public void activate() {
		initialize();
		frmSetupWindow.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	private void initialize() {
		//Initializes Colors
		styles = new StyleClass();
		
		//Initializes Setup Window
		frmSetupWindow = new JFrame();
		frmSetupWindow.getContentPane().setBackground(SystemColor.menu);
		frmSetupWindow.setResizable(false);
		frmSetupWindow.setTitle("Setup Window");
		frmSetupWindow.setBounds(100, 100, 400, 530);
		frmSetupWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		//Button Initialization
		//Initializes Reset Default Button
		btnResetDefault = new JButton("Reset Default");
		btnResetDefault.setBounds(199, 464, 110, 26);
		buttons.add(btnResetDefault);
		frmSetupWindow.getContentPane().setLayout(null);
		frmSetupWindow.getContentPane().add(btnResetDefault);
		
		//Initializes Done Button
		btnDone = new JButton("Done");
		btnDone.setBounds(321, 464, 63, 26);
		buttons.add(btnDone);
		frmSetupWindow.getContentPane().add(btnDone);
		
		//Initializes OAuth Button
		btnGetOauthKey = new JButton("Get OAuth Key");
		btnGetOauthKey.setBounds(120, 69, 136, 26);
		buttons.add(btnGetOauthKey);
		frmSetupWindow.getContentPane().add(btnGetOauthKey);
		
		//Label Initilization
		//Initializes Twitch Username Label
		lblTwitchUsername = new JLabel("Twitch Bot name:");
		lblTwitchUsername.setBounds(20, 22, 98, 16);
		labels.add(lblTwitchUsername);
		frmSetupWindow.getContentPane().add(lblTwitchUsername);
		
		//Initializes OAuth label
		lblTwitchOauthKey = new JLabel("Bot OAuth key:");
		lblTwitchOauthKey.setBounds(33, 48, 83, 16);
		labels.add(lblTwitchOauthKey);
		frmSetupWindow.getContentPane().add(lblTwitchOauthKey);
		
		//Initializes Channel Label
		lblTwitchChannel = new JLabel("Twitch Channel:");
		lblTwitchChannel.setBounds(27, 101, 90, 16);
		labels.add(lblTwitchChannel);
		frmSetupWindow.getContentPane().add(lblTwitchChannel);
		
		//User Info Label
		lblUserInfo = new JLabel("-----------------------------------------USER INFO-----------------------------------------");
		lblUserInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserInfo.setBounds(0, 0, 397, 16);
		labels.add(lblUserInfo);
		frmSetupWindow.getContentPane().add(lblUserInfo);
		
		//Command Info Label
		lblCommandInfo = new JLabel("-------------------------------------COMMAND INFO-------------------------------------");
		lblCommandInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommandInfo.setBounds(0, 118, 397, 16);
		labels.add(lblCommandInfo);
		frmSetupWindow.getContentPane().add(lblCommandInfo);
		
		//Time Settings Label
		lblTimeSettings = new JLabel("-------------------------------------TIME SETTINGS-------------------------------------");
		lblTimeSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimeSettings.setBounds(0, 254, 397, 16);
		labels.add(lblTimeSettings);
		frmSetupWindow.getContentPane().add(lblTimeSettings);
		
		//Ui Settings Label
		lblUiSettings = new JLabel("---------------------------------------UI SETTINGS---------------------------------------");
		lblUiSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblUiSettings.setBounds(0, 389, 397, 16);
		labels.add(lblUiSettings);
		frmSetupWindow.getContentPane().add(lblUiSettings);
		
		//Add Time Format Label
		lblAddTimeFormat = new JLabel("Add Time Format:");
		lblAddTimeFormat.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddTimeFormat.setBounds(19, 193, 99, 16);
		labels.add(lblAddTimeFormat);
		frmSetupWindow.getContentPane().add(lblAddTimeFormat);
		
		//Subtract Time Format Label
		lblSubtractTimeFormat = new JLabel("Subtract Time Format:");
		lblSubtractTimeFormat.setHorizontalAlignment(SwingConstants.LEFT);
		lblSubtractTimeFormat.setBounds(3, 219, 126, 16);
		labels.add(lblSubtractTimeFormat);
		frmSetupWindow.getContentPane().add(lblSubtractTimeFormat);
		
		//Format Info Label
		lblFormatInfo = new JLabel();
		lblFormatInfo.setText("$TT%-Time Type, \r\n$TA%-Time Ammount");
		lblFormatInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormatInfo.setFont(UIManager.getFont("Label.font"));
		lblFormatInfo.setBounds(20, 236, 359, 16);
		labels.add(lblFormatInfo);
		frmSetupWindow.getContentPane().add(lblFormatInfo);
		
		//Add Time Command Label
		lblAddTimeCommand = new JLabel("Add Time Command:");
		lblAddTimeCommand.setBounds(2, 143, 117, 16);
		labels.add(lblAddTimeCommand);
		frmSetupWindow.getContentPane().add(lblAddTimeCommand);
		
		//Subtract Time Command Label
		lblSubtractTimeCommand = new JLabel("Subtract Time Command:");
		lblSubtractTimeCommand.setBounds(0, 169, 151, 16);
		labels.add(lblSubtractTimeCommand);
		frmSetupWindow.getContentPane().add(lblSubtractTimeCommand);
		
		//Instructions Label
		lblInstructions = new JLabel();
		lblInstructions.setText("Put ammount of time to add in minutes");
		lblInstructions.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstructions.setFont(UIManager.getFont("Label.font"));
		lblInstructions.setBounds(20, 371, 359, 16);
		labels.add(lblInstructions);
		frmSetupWindow.getContentPane().add(lblInstructions);
		
		//Styles Label
		lblStyles = new JLabel("Styles");
		lblStyles.setBounds(10, 417, 55, 16);
		labels.add(lblStyles);
		frmSetupWindow.getContentPane().add(lblStyles);
		frmSetupWindow.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnResetDefault, btnDone}));
		
		//Restart Label
		lblRestartToTake = new JLabel();
		lblRestartToTake.setText("Restart to take effect on this screen");
		lblRestartToTake.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestartToTake.setForeground((Color) null);
		lblRestartToTake.setFont(UIManager.getFont("Label.font"));
		lblRestartToTake.setBounds(20, 439, 359, 16);
		labels.add(lblRestartToTake);
		frmSetupWindow.getContentPane().add(lblRestartToTake);
		
		//Start Time Label
		lblStartTime = new JLabel("Start Time");
		lblStartTime.setBounds(282, 330, 59, 16);
		labels.add(lblStartTime);
		frmSetupWindow.getContentPane().add(lblStartTime);
		
		//HourMinuteSecond Seperator lables
		label = new JLabel(":");
		label.setBounds(300, 351, 55, 16);
		labels.add(label);
		frmSetupWindow.getContentPane().add(label);
		
		label_1 = new JLabel(":");
		label_1.setBounds(328, 351, 55, 16);
		labels.add(label_1);
		frmSetupWindow.getContentPane().add(label_1);
		
		//Text Field Initilization
		//Initializes Bot Name Textfield
		BotNameTF = new JTextField();
		BotNameTF.setBounds(120, 20, 265, 20);
		textFields.add(BotNameTF);
		frmSetupWindow.getContentPane().add(BotNameTF);
		BotNameTF.setColumns(10);
		
		//Initializes OAuth Testfield
		OAuthKeyTF = new JTextField();
		OAuthKeyTF.setBounds(120, 46, 265, 20);
		textFields.add(OAuthKeyTF);
		frmSetupWindow.getContentPane().add(OAuthKeyTF);
		OAuthKeyTF.setColumns(10);
		
		//Ititializes Channel Textfield
		ChannelTF = new JTextField();
		ChannelTF.setBounds(120, 99, 265, 20);
		textFields.add(ChannelTF);
		frmSetupWindow.getContentPane().add(ChannelTF);
		ChannelTF.setColumns(10);
		
		//Add Time Format Text Field
		AddTimeFormatTF = new JTextField();
		AddTimeFormatTF.setText("$TA% $TT%");
		AddTimeFormatTF.setToolTipText("Default: $DF%-$CN%-$TN%");
		AddTimeFormatTF.setColumns(25);
		AddTimeFormatTF.setBounds(120, 192, 265, 20);
		textFields.add(AddTimeFormatTF);
		frmSetupWindow.getContentPane().add(AddTimeFormatTF);
		
		//Subtract Time Format Text Field
		SubtractTimeFormatTF = new JTextField();
		SubtractTimeFormatTF.setText("$TA% $TT%");
		SubtractTimeFormatTF.setToolTipText("Default: $DF%-$CN%-$TN%");
		SubtractTimeFormatTF.setColumns(25);
		SubtractTimeFormatTF.setBounds(134, 216, 251, 20);
		textFields.add(SubtractTimeFormatTF);
		frmSetupWindow.getContentPane().add(SubtractTimeFormatTF);
		
		//Add Time Command Text Field
		AddTimeCommandTF = new JTextField();
		AddTimeCommandTF.setText("addtime");
		AddTimeCommandTF.setBounds(120, 141, 265, 20);
		textFields.add(AddTimeCommandTF);
		frmSetupWindow.getContentPane().add(AddTimeCommandTF);
		AddTimeCommandTF.setColumns(10);
		
		//Subtract Time Command Text Field
		SubtractTimeCommandTF = new JTextField();
		SubtractTimeCommandTF.setText("subtracttime");
		SubtractTimeCommandTF.setColumns(10);
		SubtractTimeCommandTF.setBounds(148, 167, 237, 20);
		textFields.add(SubtractTimeCommandTF);
		frmSetupWindow.getContentPane().add(SubtractTimeCommandTF);
		
		//Sub Time Text Field
		SubTimeTF = new JTextField();
		SubTimeTF.setText("0");
		SubTimeTF.setBounds(33, 302, 76, 20);
		textFields.add(SubTimeTF);
		frmSetupWindow.getContentPane().add(SubTimeTF);
		SubTimeTF.setColumns(10);
		
		//Resub Time Text Field
		ResubTimeTF = new JTextField();
		ResubTimeTF.setText("0");
		ResubTimeTF.setColumns(10);
		ResubTimeTF.setBounds(155, 302, 76, 20);
		textFields.add(ResubTimeTF);
		frmSetupWindow.getContentPane().add(ResubTimeTF);
		
		//Gifted Sub Time Text Field
		GiftedSubTimeTF = new JTextField();
		GiftedSubTimeTF.setText("0");
		GiftedSubTimeTF.setColumns(10);
		GiftedSubTimeTF.setBounds(272, 302, 76, 20);
		textFields.add(GiftedSubTimeTF);
		frmSetupWindow.getContentPane().add(GiftedSubTimeTF);
		
		//Bits Time Text Field
		BitsTimeTF = new JTextField();
		BitsTimeTF.setText("0");
		BitsTimeTF.setColumns(10);
		BitsTimeTF.setBounds(34, 350, 76, 20);
		textFields.add(BitsTimeTF);
		frmSetupWindow.getContentPane().add(BitsTimeTF);
		
		//Host Time Text Field
		HostTimeTF = new JTextField();
		HostTimeTF.setText("0");
		HostTimeTF.setColumns(10);
		HostTimeTF.setBounds(153, 350, 76, 20);
		textFields.add(HostTimeTF);
		frmSetupWindow.getContentPane().add(HostTimeTF);
		
		//Hour Time Text Field
		HourTF = new JTextField();
		HourTF.setHorizontalAlignment(SwingConstants.RIGHT);
		HourTF.setText("0");
		HourTF.setBounds(278, 349, 20, 20);
		textFields.add(HourTF);
		frmSetupWindow.getContentPane().add(HourTF);
		HourTF.setColumns(10);
		
		//Minute Time Text Field
		MinuteTF = new JTextField();
		MinuteTF.setHorizontalAlignment(SwingConstants.RIGHT);
		MinuteTF.setText("0");
		MinuteTF.setColumns(10);
		MinuteTF.setBounds(305, 349, 20, 20);
		textFields.add(MinuteTF);
		frmSetupWindow.getContentPane().add(MinuteTF);
		
		//Second Time Text Field
		SecondTF = new JTextField();
		SecondTF.setHorizontalAlignment(SwingConstants.RIGHT);
		SecondTF.setText("0");
		SecondTF.setColumns(10);
		SecondTF.setBounds(334, 349, 20, 20);
		textFields.add(SecondTF);
		frmSetupWindow.getContentPane().add(SecondTF);
		
		//RadioButtons
		//Sub Time Radio Button
		rdbtnSubTime = new JRadioButton("Sub time");
		rdbtnSubTime.setBounds(33, 278, 76, 24);
		radioButtons.add(rdbtnSubTime);
		frmSetupWindow.getContentPane().add(rdbtnSubTime);
		
		//Resub Time Radio Button
		rdbtnResubTime = new JRadioButton("Resub time");
		rdbtnResubTime.setBounds(145, 278, 89, 24);
		radioButtons.add(rdbtnResubTime);
		frmSetupWindow.getContentPane().add(rdbtnResubTime);
		
		//Gifted Sub Time Radio Button
		rdbtnGiftedSubTime = new JRadioButton("Gifted Sub time");
		rdbtnGiftedSubTime.setBounds(257, 278, 114, 24);
		radioButtons.add(rdbtnGiftedSubTime);
		frmSetupWindow.getContentPane().add(rdbtnGiftedSubTime);
		
		// Host/Raid Time Radio Button
		rdbtnHostraidTime = new JRadioButton("Host/Raid time");
		rdbtnHostraidTime.setBounds(138, 326, 107, 24);
		radioButtons.add(rdbtnHostraidTime);
		frmSetupWindow.getContentPane().add(rdbtnHostraidTime);
		
		//Bits Time Radio Button
		rdbtnBitsTime = new JRadioButton("Bits time");
		rdbtnBitsTime.setBounds(34, 326, 75, 24);
		radioButtons.add(rdbtnBitsTime);
		frmSetupWindow.getContentPane().add(rdbtnBitsTime);
		
		//Combo Box Initilization
		//Styles Combo Box
		StylesCB = new JComboBox();
		StylesCB.setModel(new DefaultComboBoxModel(getStyles()));
		StylesCB.setSelectedItem(styles.getStyle().split("=")[1].substring(0, styles.getStyle().split("=")[1].indexOf(".")));
		StylesCB.setBounds(48, 412, 337, 25);
		frmSetupWindow.getContentPane().add(StylesCB);		
		
		updateStyles();
		//Methods
		//Listeners
		StylesCB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String hold = String.valueOf(StylesCB.getSelectedItem());
				if(!hold.equals(currentSelection)) {
					currentSelection = hold;
					try {
						styles.changeStyle(String.valueOf(StylesCB.getSelectedItem()) + ".style");
					} catch (IOException e1) {
						debug.debug("SetupWindowStylesActionListener:" + "There was an error getting styles");
						debug.debug(e1.getStackTrace());
					}
					updateStyles();
				}
			}
		});
		/**
		 * If the window is closed, will ask if the person wants to cancel setup and if so closes the program
		 */
		frmSetupWindow.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				int confirmation = JOptionPane.showConfirmDialog(null, "This is a required part of setup, closing now can cause many problems and even make the program not work at all. Are you sure you want to close? Doing so will stop the program.");
				if(confirmation == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		/**
		 * Resets values to default or clears them
		 */
		btnResetDefault.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AddTimeCommandTF.setText("addtime");
				SubtractTimeCommandTF.setText("subtracttime");
				AddTimeFormatTF.setText("$TA% $TT%");
				SubtractTimeFormatTF.setText("$TA% $TT%");
			}
		});
		
		/**
		 * Checks to make sure everything if formated correctly and filled out and if so sends the user to the application
		 */
		btnDone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileClass save = new FileClass();
				if(save.checkTimeFormat(SubtractTimeFormatTF.getText()).equals("clear") && save.checkTimeFormat(AddTimeFormatTF.getText()).equals("clear")) {
					save.saveSettings(BotNameTF.getText(), OAuthKeyTF.getText(), ChannelTF.getText(), AddTimeCommandTF.getText(), SubtractTimeCommandTF.getText(), AddTimeFormatTF.getText(), SubtractTimeFormatTF.getText());
				}
				TimeClass timeSave = new TimeClass();
				if(rdbtnSubTime.isSelected())
					timeSave.setSubTime(Integer.parseInt(SubTimeTF.getText()));
				if(rdbtnResubTime.isSelected())
					timeSave.setResubTime(Integer.parseInt(ResubTimeTF.getText()));
				if(rdbtnGiftedSubTime.isSelected())
					timeSave.setGiftedsubTime(Integer.parseInt(GiftedSubTimeTF.getText()));
				if(rdbtnBitsTime.isSelected())
					timeSave.setBitsTime(Integer.parseInt(BitsTimeTF.getText()));
				if(rdbtnHostraidTime.isSelected())
					timeSave.setRaidTime(Integer.parseInt(HostTimeTF.getText()));
				int[] hours = {Integer.parseInt(HourTF.getText()),Integer.parseInt(MinuteTF.getText()),Integer.parseInt(SecondTF.getText())};
				timeSave.setStartTime(hours);
				timeSave.save();
				frmSetupWindow.dispose();
			}
		});
		
		btnGetOauthKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					  Desktop desktop = java.awt.Desktop.getDesktop();
					  URI oURL = new URI("https://twitchapps.com/tmi/");
					  desktop.browse(oURL);
					} catch (Exception e) {
						debug.debug("SetupWindowGetOAuthActionLister:" + "There was an error getting window");
						debug.debug(e.getStackTrace());
					}
			}
		});
		

		SecondTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if(Integer.parseInt(SecondTF.getText()) > 60) {
					SecondTF.setText("60");
				}
			}
		});
		
		MinuteTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if(Integer.parseInt(MinuteTF.getText()) > 60) {
					MinuteTF.setText("60");
				}
			}
		});
	}
	
	/**
	 * Returns an array of strings containing all the styles
	 */
	@SuppressWarnings("static-access")
	private String[] getStyles() {
		StyleClass styles = new StyleClass();
		return styles.getStyles();
	}
	
	/**
	 * Sets the styles for all ui elements
	 */
	@SuppressWarnings("static-access")
	private void updateStyles() {
		//Updates styles
		styles.updateStyles();
		
		//Updates frame
		frmSetupWindow.getContentPane().setBackground(styles.getWindow_background());
		
		//Updates buttons
		for(int b = 0; b < buttons.size(); b++) {
			buttons.get(b).setBackground(styles.getButton_background());
			buttons.get(b).setForeground(styles.getButton_text());
		}
		
		//Updates labels
		for(int l = 0; l < labels.size(); l++)
			labels.get(l).setForeground(styles.getText());
		
		//Updates Text Fields
		for(int tf = 0; tf < textFields.size(); tf++) {
			textFields.get(tf).setBackground(styles.getTextbox_background());
			textFields.get(tf).setForeground(styles.getTextbox_text());
		}
		
		//Updates Radio Buttons
		for(int rb = 0; rb < radioButtons.size(); rb++) {
			radioButtons.get(rb).setBackground(styles.getWindow_background());
			radioButtons.get(rb).setForeground(styles.getText());
		}
		
		//Updates combo boxes
		StylesCB.setBackground(styles.getDropdown_background());
		StylesCB.setForeground(styles.getDropdown_text());
	}
}
