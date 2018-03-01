import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class Tile {

	private int value;
	
	public Tile(){
		value = -1;
	}
	/**
	 * 
	 * @param value 
	 * 			value is the value that the tile holds (2-2048)
	 */
	public Tile(int value){
		this.value = value;
	}
	/**
	 * 
	 * @param t
	 * 		t is the UI text element whose color is being updated
	 * 
	 */
	public void setColor(Text t){
		if (value > 8)
			t.setForeground(SWTResourceManager.getColor(255,255,255));
		else
			t.setForeground(SWTResourceManager.getColor(0,0,0));
		switch (value) {
			case 0:    t.setBackground(SWTResourceManager.getColor(211,211,211));  t.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.BOLD)); break;
	        case 2:    t.setBackground(SWTResourceManager.getColor(255,250,250));  t.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.BOLD)); break;
	        case 4:    t.setBackground(SWTResourceManager.getColor(250,240,230));  t.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.BOLD));break;
	        case 8:    t.setBackground(SWTResourceManager.getColor(255,228,181));  t.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.BOLD));break;
	        case 16:   t.setBackground(SWTResourceManager.getColor(244,164,96));   t.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.BOLD));break;
	        case 32:   t.setBackground(SWTResourceManager.getColor(255,192,203));  t.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.BOLD));break;
	        case 64:   t.setBackground(SWTResourceManager.getColor(200,20,60));    t.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.BOLD));break;
	        case 128:  t.setBackground(SWTResourceManager.getColor(255,248,0));    t.setFont(SWTResourceManager.getFont("Segoe UI", 19, SWT.BOLD));break;
	        case 256:  t.setBackground(SWTResourceManager.getColor(255,240,0));    t.setFont(SWTResourceManager.getFont("Segoe UI", 19, SWT.BOLD));break;
	        case 512:  t.setBackground(SWTResourceManager.getColor(255,230,0));    t.setFont(SWTResourceManager.getFont("Segoe UI", 19, SWT.BOLD));break;
	        case 1024: t.setBackground(SWTResourceManager.getColor(255,223,0));    t.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));break;
	        case 2048: t.setBackground(SWTResourceManager.getColor(255,215,0));    t.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));break;
	    }
	}
}
