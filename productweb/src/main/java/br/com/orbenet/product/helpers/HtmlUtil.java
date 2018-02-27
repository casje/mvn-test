package br.com.orbenet.product.helpers;

public class HtmlUtil {
	
	public static String getStartHTML() {
		String html = "";
		
		html += "<!DOCTYPE html>";
		html += "<html lang=\"pt-BR\">";
		html += "<head>";
		html += "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />";
		html += "  <meta charset=\"ISO-8859-1\">";
		html += "  <title>Details Product</title>";
		html += "  <link rel=stylesheet href=\"style/main.css\">";
		html += "</head>";
		html += "<body>";		    			
		
		return html;
	}
	
	public static String getTitle(String title) {
		String html = "";
		
		html += "<h3>";
		html += (title==null ? "Title" : title);
		html += "</h3>";
		
		return html;
	}
	
	public static String getEndHTML() {
		String html = "";
		
		html += "</body>";
		html += "</html>";
		
		return html;
	}

}
