
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.*;
import org.eclipse.wb.swt.SWTResourceManager;



public class MainWindow {

	private static Game2048 game;
	private static Text text;
	public static Text textPopUp;
	public static Text text33;
	public static Text text03;
	public static Text text13;
	public static Text text23;
	public static Text text02;
	public static Text text12;
	public static Text text22;
	public static Text text32;
	public static Text text01;
	public static Text text11;
	public static Text text21;
	public static Text text31;
	public static Text text00;
	public static Text text10;
	public static Text text20;
	public static Text text30;
	public static Text txtScore;
	private static Button btnNewGame;
	private static Text text_1;
	/**
	 * Launch the application.
	 * 
	 */
	public static void main (String [] args) {
		Display display = new Display ();	 
		Shell shell = new Shell (display);
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		shell.setSize(600, 600);
		final Composite contentPanel = new Composite (shell, SWT.BORDER);
		contentPanel.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		contentPanel.setBounds (0, 0, 582, 528);
		StackLayout layout = new StackLayout ();
		contentPanel.setLayout (layout);
		// create the first page's content
		Composite page0 = new Composite (contentPanel, SWT.NONE);
		page0.setBackground(SWTResourceManager.getColor(255, 245, 238));
		layout.topControl = page0;
		contentPanel.layout();
		
		
		text = new Text(page0, SWT.READ_ONLY | SWT.CENTER);
		text.setBackground(SWTResourceManager.getColor(255, 245, 238));
		text.setForeground(SWTResourceManager.getColor(0, 0, 0));
		text.setFont(SWTResourceManager.getFont("Segoe UI", 32, SWT.NORMAL));
		text.setText("2048");
		text.setBounds(180, 10, 217, 67);
	    text.setCursor(Display.getCurrent().getSystemCursor(SWT.CURSOR_ARROW));
	    
	    textPopUp = new Text(page0, SWT.READ_ONLY | SWT.CENTER);
	    textPopUp.setBackground(SWTResourceManager.getColor(255, 245, 238));
	    textPopUp.setBounds(273, 283, 28, -3);
	    textPopUp.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.NORMAL));
	    textPopUp.setEnabled(false);
	    
	    /**
	     * UI elements for game board.
	     */
	    text03 = new Text(page0, SWT.BORDER | SWT.READ_ONLY | SWT.CENTER);
	    text03.setEnabled(false);
	    text03.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text03.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text03.setBounds(124, 121, 78, 78);
	    text03.setCursor(Display.getCurrent().getSystemCursor(SWT.CURSOR_ARROW));
	    
	    text13 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text13.setEnabled(false);
	    text13.setEditable(false);
	    text13.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text13.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text13.setBounds(208, 121, 78, 78);
	    text13.setCursor(Display.getCurrent().getSystemCursor(SWT.CURSOR_ARROW));
	    
	    text23 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text23.setEnabled(false);
	    text23.setEditable(false);
	    text23.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text23.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text23.setBounds(292, 121, 78, 78);
	    
	    text33 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text33.setEnabled(false);
	    text33.setEditable(false);
	    text33.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text33.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text33.setBounds(376, 121, 78, 78);
	    
	    text02 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text02.setEnabled(false);
	    text02.setEditable(false);
	    text02.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text02.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text02.setBounds(124, 205, 78, 78);
	    
	    text12 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text12.setEnabled(false);
	    text12.setEditable(false);
	    text12.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text12.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text12.setBounds(208, 205, 78, 78);
	    
	    text22 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text22.setEnabled(false);
	    text22.setEditable(false);
	    text22.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text22.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text22.setBounds(292, 205, 78, 78);
	    
	    text32 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text32.setEnabled(false);
	    text32.setEditable(false);
	    text32.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text32.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text32.setBounds(376, 205, 78, 78);
	    
	    text01 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text01.setEnabled(false);
	    text01.setEditable(false);
	    text01.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text01.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text01.setBounds(124, 289, 78, 78);
	    
	    text11 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text11.setEnabled(false);
	    text11.setEditable(false);
	    text11.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text11.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text11.setBounds(208, 289, 78, 78);
	    
	    text21 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text21.setEnabled(false);
	    text21.setEditable(false);
	    text21.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text21.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text21.setBounds(292, 289, 78, 78);
	    
	    text31 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text31.setEnabled(false);
	    text31.setEditable(false);
	    text31.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text31.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text31.setBounds(376, 289, 78, 78);
	    
	    text00 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text00.setEnabled(false);
	    text00.setEditable(false);
	    text00.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text00.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text00.setBounds(124, 373, 78, 78);
	    
	    text10 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text10.setEnabled(false);
	    text10.setEditable(false);
	    text10.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text10.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text10.setBounds(208, 373, 78, 78);
	    
	    text20 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text20.setEnabled(false);
	    text20.setEditable(false);
	    text20.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text20.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text20.setBounds(292, 373, 78, 78);
	    
	    text30 = new Text(page0, SWT.BORDER | SWT.CENTER);
	    text30.setEnabled(false);
	    text30.setEditable(false);
	    text30.setBackground(SWTResourceManager.getColor(211, 211, 211));
	    text30.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
	    text30.setBounds(376, 373, 78, 78);
	    
	    txtScore = new Text(page0, SWT.NONE);
	    txtScore.setBackground(SWTResourceManager.getColor(255, 245, 238));
	    txtScore.setEnabled(false);
	    txtScore.setEditable(false);
	    txtScore.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
	    txtScore.setText("Score: ");
	    txtScore.setBounds(36, 34, 138, 49);
	    
	    btnNewGame = new Button(page0, SWT.NONE);
	    btnNewGame.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
	    btnNewGame.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    		textPopUp.setText("");
				textPopUp.setBounds(273, 283, 28, -3);
				game = new Game2048();
	    	}
	    });
	    btnNewGame.setBounds(415, 25, 125, 49);
	    btnNewGame.setText("New Game");
	    
	    text_1 = new Text(page0, SWT.BORDER);
	    text_1.setEnabled(false);
	    text_1.setEditable(false);
	    text_1.setBackground(SWTResourceManager.getColor(169, 169, 169));
	    text_1.setBounds(113, 108, 354, 354);
	    
	    /**
	     * UI elements 'Rules' window.
	     */
		final Composite page1 = new Composite (contentPanel, SWT.NONE);
	    Text txtHow;
	    page1.setLayout(null);
	    txtHow = new Text(page1, SWT.READ_ONLY | SWT.CENTER);
	    txtHow.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
	    txtHow.setBounds(28, 31, 522, 396);
	    txtHow.setText("\r\nHOW TO PLAY 2048?\r\n\r\n\r\nThe objective of the game is to get the number 2048 using additions of the number two and its multiples.\r\n\r\n\r\nUse the arrow keys to move up or down, left or right trying to join two equal numbers.  When two equal numbers are in touch, they will add up. Each time you make a move, a new 2 or 4 will appear on the board.\r\n\r\n\r\nTry to get 2048!");
	    txtHow.setBounds(29, 31, 522, 412);
	    txtHow.setEditable(false);
	    txtHow.setEnabled(false);
	    txtHow.setCursor(Display.getCurrent().getSystemCursor(SWT.CURSOR_ARROW));
	    
	    Button btnBack = new Button(page1, SWT.NONE);
	    btnBack.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    		layout.topControl = page0;
	    		contentPanel.layout();
	    	}
	    });
	    btnBack.setBounds(244, 446, 90, 30);
	    btnBack.setText("Back");
	    
	    /**
	     * UI elements menu bar.
	     */
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");
		
		Menu menu_1 = new Menu(mntmFile);
		mntmFile.setMenu(menu_1);
		
		MenuItem mntmNewGame = new MenuItem(menu_1, SWT.NONE);
		mntmNewGame.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				textPopUp.setText("");
				textPopUp.setBounds(273, 283, 28, -3);
				game = new Game2048();
			}
		});
		mntmNewGame.setText("New Game");
		
		MenuItem mntmRules = new MenuItem(menu_1, SWT.NONE);
		mntmRules.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				layout.topControl = page1;
				contentPanel.layout();
			}
		});
		mntmRules.setText("Rules");
		
		MenuItem mntmRules_1 = new MenuItem(menu, SWT.NONE);
		mntmRules_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				layout.topControl = page1;
				contentPanel.layout();
			}
		});
		mntmRules_1.setText("Rules");
		
		/**
	     * Set up keyboard interaction.
	     */
		shell.getDisplay().addFilter(SWT.KeyDown, new Listener(){
			  public void handleEvent(Event e)
			  {
				  if (e.keyCode == SWT.ARROW_UP) {
				       game.up();
				  }
				  if (e.keyCode == SWT.ARROW_DOWN) {
					  game.down();
				  }
				  if (e.keyCode == SWT.ARROW_LEFT) {
					  game.left();
				  }
				  if (e.keyCode == SWT.ARROW_RIGHT) {
					  game.right();
				  }
			  }
			});

		game = new Game2048();
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();
	
	}
	}
