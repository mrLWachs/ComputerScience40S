
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

    private static final String DEFAULT_BACKGROUND_COLOR = "white";
    private static final String DEFAULT_FONT_FAMILY      = "Consolas";
    private static final String DEFAULT_FONT_SIZE        = "16pt";
    private static final String DEFAULT_FONT_STYLE       = "DEFAULT_FONT_STYLE";
    private static final String DEFAULT_FONT_WEIGHT      = "normal";    
    private static final String DEFAULT_FONT_COLOR       = "black";
        
    private static final String H1_FONT_COLOR  = "green";
    private static final String H2_FONT_COLOR  = "gray";
    private static final String PRE_FONT_COLOR = "blue";
    
    private static final String H1_FONT_SIZE  = "18pt"; //DEFAULT_FONT_SIZE;
    private static final String H2_FONT_SIZE  = "17pt"; //DEFAULT_FONT_SIZE;
    private static final String PRE_FONT_SIZE = DEFAULT_FONT_SIZE;
    
    private static final String H1_FONT_FAMILY  = "Lucida Sans Typewriter"; //DEFAULT_FONT_FAMILY;
    private static final String H2_FONT_FAMILY  = "Courier New"; //DEFAULT_FONT_FAMILY;
    private static final String PRE_FONT_FAMILY = "Courier New"; //DEFAULT_FONT_FAMILY;
    
    private static final String H1_FONT_STYLE  = DEFAULT_FONT_STYLE;
    private static final String H2_FONT_STYLE  = "italic"; //DEFAULT_FONT_STYLE;
    private static final String PRE_FONT_STYLE = DEFAULT_FONT_STYLE;
    
    private static final String H1_FONT_WEIGHT  = "bold"; //DEFAULT_FONT_WEIGHT;
    private static final String H2_FONT_WEIGHT  = "600"; //DEFAULT_FONT_WEIGHT;
    private static final String PRE_FONT_WEIGHT = "lighter"; //DEFAULT_FONT_WEIGHT;
    
    
    
    private static final String BODY_STYLE = 
            "  body {"
                + "background  : " + DEFAULT_BACKGROUND_COLOR + ";"
                + "font-family : " + DEFAULT_FONT_FAMILY      + ";"
                + "font-size   : " + DEFAULT_FONT_SIZE        + ";"
                + "font-style  : " + DEFAULT_FONT_STYLE       + ";"
                + "font-weight : " + DEFAULT_FONT_WEIGHT      + ";"
                + "color       : " + DEFAULT_FONT_COLOR       + ";"
            + "}";
    
    private static final String H1_STYLE = 
            "  h1 {"
                + "font-family : " + H1_FONT_FAMILY + ";"
                + "font-size   : " + H1_FONT_SIZE   + ";"
                + "font-style  : " + H1_FONT_STYLE  + ";"
                + "font-weight : " + H1_FONT_WEIGHT + ";"
                + "color       : " + H1_FONT_COLOR  + ";"
            + "}";
    
    private static final String H2_STYLE = 
            "  h2 {"
                + "font-family : " + H2_FONT_FAMILY + ";"
                + "font-size   : " + H2_FONT_SIZE   + ";"
                + "font-style  : " + H2_FONT_STYLE  + ";"
                + "font-weight : " + H2_FONT_WEIGHT + ";"
                + "color       : " + H2_FONT_COLOR  + ";"
            + "}";
    
    private static final String PRE_STYLE =
            "  pre {"
                + "font-family : " + PRE_FONT_FAMILY + ";"
                + "font-size   : " + PRE_FONT_SIZE   + ";"
                + "font-style  : " + PRE_FONT_STYLE  + ";"
                + "font-weight : " + PRE_FONT_WEIGHT + ";"
                + "color       : " + PRE_FONT_COLOR  + ";"
            + "}";
    
            
    private static final String STYLE = 
            "<style>"  + 
            BODY_STYLE + 
            H1_STYLE   + 
            H2_STYLE   + 
            PRE_STYLE  + 
            "</style>";

    private static final String OPEN      = "<html><head>" + STYLE + 
                                            "</head><body>";
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
