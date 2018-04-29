/**
 * 
 */
package lsg.graphics;

/**
 * @author antoinelemarie
 *
 */
public class CSSFactory {

	private final static String CSS_DIR = "css/";
	/**
	 * 
	 */
	public CSSFactory() {
		// TODO Auto-generated constructor stub
		
	}
	public static String getStyleSheet(String filename) {
		return CSSFactory.class.getResource(CSS_DIR+filename).toExternalForm();
	}

}
