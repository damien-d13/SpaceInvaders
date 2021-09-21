package fr.damien.spaceinvaders.utils;

public class Constants {

    /********************************  WINDOW  *********************************/
    public static final int WINDOW_WIDTH = 600;
    public static final int WINDOW_HEIGHT = 600;
    public static final int WINDOW_MARGIN = 50;


    /******************************** SHIP   *********************************/
    public static final int SHIP_WIDTH = 39;
    public static final int SHIP_HEIGHT = 24;
    public static final int X_POS_INIT_SHIP = (WINDOW_WIDTH - SHIP_WIDTH) / 2;
    public static final int Y_POS_INIT_ShIP = 500;
    public static final int SHIP_DELTA_X = 2;

    public static final int SHIP_LEFT_WINDOW_LIMIT = 30;
    public static final int SHIP_RIGHT_WINDOW_LIMIT = 530;

    /********************************  SHIP SHOOT  *********************************/
    public static final int SHIP_SHOOT_WIDTH = 10;
    public static final int SHIP_SHOOT_HEIGHT = 10;
    public static final int SHIP_SHOOT_DELTA_Y = 5;

    /***********************************  BRICK  ***************************************/
    public static final int BRICK_WIDTH = 10;
    public static final int BRICK_HEIGHT = 10;
    public static final int BRICK_POINT = 5;

    /***********************************  ALIEN  ***************************************/
    public static final int ALIEN_WIDTH = 32;
    public static final int ALIEN_HEIGHT = 24;

    public static final int X_POS_INIT_ALIEN = 40 + WINDOW_MARGIN;
    public static final int Y_POS_INIT_ALIEN = 50;
    public static final int GAP_LINES_ALIEN = 10;
    public static final int GAP_COLUMNS_ALIEN = 10;

    public static final int ALIEN_DELTA_X = 5;
    public static final int ALIEN_DELTA_Y = 20;
    public static final int ALIEN_SPEED = 1;
    public static final int ALIEN_POINT = 10;

    /***********************************  AUDIO  ***************************************/
    public static final double AUDIO_VOLULME = 0.03;

    /***********************************   ALIEN SHOOT   *****************************************/
    public static final int ALIEN_SHOOT_WIDTH = 10;
    public static final int ALIEN_SHOOT_HEIGHT = 10;
    public static final int ALIEN_SHOOT_DELTA_Y = 4;
    public static final int ALIEN_SHOOT_PROBABILITY = 2000;

    /***********************************  SAUCER  ***********************************************/
    public static final int X_POS_INIT_SAUCER = WINDOW_WIDTH;
    public static final int Y_POS_INIT_SAUCER = 458;
    public static final int SAUCER_WIDTH = 42;
    public static final int SAUCER_HEIGHT = 22;
    public static final int SAUCER_DELTA_X = 2;

}
