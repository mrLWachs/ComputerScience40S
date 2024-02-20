
/** Required package class namespace */
package tools;

import collections.LinkedList;
import io.FileHandler;

 
/**
 * WebPageGenerator.java - description
 *
 * @author Mr. Wachs
 * @since Feb 20, 2024, 2:37:58 p.m.
 */
public class WebPageGenerator 
{

    private static final String STYLE = 
        "<style>" +
            "  body "
            + "{"
                + "background  : DarkGray;"
                + "font-family : Consolas;"
                + "font-size   : 14pt;"
            + "}" +
            "  h1 "
            + "{"
                + "font-family : Consolas;"
                + "font-size   : 14pt;"
                + "color : blue;"
            + "}" +
            "  h2 "
            + "{"
                + "font-family : Consolas;"
                + "font-size   : 14pt;"
                + "color : green;"
            + "}" +
            "  pre "
            + "{"
                + "font-family : Courier New;"
                + "font-size   : 14pt;"
                + "color : yellow;"
            + "}" +
        "</style>";

    private static final String OPEN      = "<html><head>" + STYLE + "</head><body>";
    private static final String CLOSE     = "</body>";
    private static final String BREAK     = "</br />";
    private static final String H1_OPEN   = "<h1>";
    private static final String H1_CLOSE  = "</h1>";
    private static final String H2_OPEN   = "<h2>";
    private static final String H2_CLOSE  = "</h2>";
    private static final String PRE_OPEN  = "<pre>";
    private static final String PRE_CLOSE = "</pre>";
    
    
    private static String text;
    private static String filename;
    
    
    /**
     * Default constructor, set class properties
     */
    public static void initialize(String filename) {
        WebPageGenerator.filename = filename;
        text = OPEN + "\n";
    }
    
    public static void addLine(String line) {
        text += line;
    }
    
    public static void addNewLine(String line) {
        text += line + "\n" + BREAK + "\n";
    }
    
    public static void addH1(String line) {
        text += H1_OPEN + line + H1_CLOSE + "\n";
    }
    
    public static void addH2(String line) {
        text += H2_OPEN + line + H2_CLOSE + "\n";
    }
    
    public static void addPreformatted(String line) {
        text += PRE_OPEN + line + PRE_CLOSE + "\n";
    }
    
    public static void generate() {
        text += "\n" + CLOSE;
        FileHandler<LinkedList> handler = new FileHandler<>();
        handler.save(text, filename);
    }  
    
}
