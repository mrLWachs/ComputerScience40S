
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
    public final static int    POWER_TIMER_DELAY            = 10000;
    
    public final static int    PACMAN_ANIMATION_DELAY       = 350;
    public final static int    PACMAN_DEATH_ANIMATION_DELAY = 1000;    
    public final static int    GHOST_ANIMATION_DELAY        = 1000;  
    public final static int    GHOST_DEATH_ANIMATION_DELAY  = 1000;  
    public final static int    DOT_ANIMATION_DELAY          = 250; 
    public final static int    POWER_DOT_ANIMATION_DELAY    = 250; 
    public final static int    PRIZE_ANIMATION_DELAY        = 30000; 
    
    public final static int    DOT_POINT                    = 1; 
    public final static int    POWER_DOT_POINT              = 5; 
    public final static int    PRIZE_POINT                  = 10; 
    
    public final static String PLAYER_DATA_FILE             = "/game/Media/data.txt";
    public final static String SETTINGS_DATA_FILE           = "/game/Media/settings.txt";
        
    public final static String GAME_OVER_LOSE_SOUND         = "/game/media/pacman_death.wav";
    public final static String GAME_OVER_WIN_SOUND          = "/game/media/pacman_eatghost.wav";
    public final static String EAT_DOT_SOUND                = "/game/media/pacman_chomp.wav";
    public final static String SPRITE_SHEET                 = "/game/media/pacmanSpriteSheet.png";
    
    public final static String GHOST_UP_TAG                 = "ghostUp";
    public final static String GHOST_DOWN_TAG               = "ghostDown";
    public final static String GHOST_LEFT_TAG               = "ghostLeft";
    public final static String GHOST_RIGHT_TAG              = "ghostRight";
    public final static String GHOST_DANGER_UP_TAG          = "ghostDangerUp";
    public final static String GHOST_DANGER_DOWN_TAG        = "ghostDangerDown";
    public final static String GHOST_DANGER_LEFT_TAG        = "ghostDangerLeft";
    public final static String GHOST_DANGER_RIGHT_TAG       = "ghostDangerRight";
    public final static String GHOST_DEAD_UP_TAG            = "ghostDeadUp";
    public final static String GHOST_DEAD_DOWN_TAG          = "ghostDeadDown";
    public final static String GHOST_DEAD_LEFT_TAG          = "ghostDeadLeft";
    public final static String GHOST_DEAD_RIGHT_TAG         = "ghostDeadRight";    
    public final static String PACMAN_UP_TAG                = "pacmanUp";
    public final static String PACMAN_DOWN_TAG              = "pacmanDown";
    public final static String PACMAN_LEFT_TAG              = "pacmanLeft";
    public final static String PACMAN_RIGHT_TAG             = "pacmanRight";
    public final static String PACMAN_DEATH_TAG             = "pacmanDeath";    
    public final static String DOT_TAG                      = "dot";
    public final static String POWER_DOT_TAG                = "powerDot";
    public final static String PRIZE_TAG                    = "prize";
    
}
