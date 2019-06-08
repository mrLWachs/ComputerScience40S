
/** required package class namespace */
package game;


/**
 * Constants.java - the various game constants
 *
 * @author Mr. Wachs 
 * @since 6-Jun-2019 
 */
public class Constants 
{

    public final static int    PACMAN_MOVE_AMOUNT           = 4;
    public final static int    GHOST_MOVE_AMOUNT            = 4;
    
    public final static int    PACMAN_TIMER_DELAY           = 50;
    public final static int    GHOST_TIMER_DELAY            = 100;
    
    public final static int    PACMAN_ANIMATION_DELAY       = 350;
    public final static int    GHOST_ANIMATION_DELAY        = 1000;  
    public final static int    GHOST_DEATH_ANIMATION_DELAY  = 1000;  
    public final static int    DOT_ANIMATION_DELAY          = 250; 
    public final static int    PRIZE_ANIMATION_DELAY        = 30000; 
    
    public final static String GAME_OVER_LOSE_SOUND         = "/game/media/pacman_death.wav";
    public final static String GAME_OVER_WIN_SOUND          = "/game/media/pacman_eatghost.wav";
    public final static String EAT_DOT_SOUND                = "/game/media/pacman_chomp.wav";
    public final static String SPRITE_SHEET                 = "/game/media/pacmanSpriteSheet.png";
    
}
