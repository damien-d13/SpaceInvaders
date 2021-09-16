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
    public static final int SHIP_DELTAX = 5;

    public static final int SHIP_LEFT_WINDOW_LIMIT = 30;
    public static final int SHIP_RIGHT_WINDOW_LIMIT = 530;

    /********************************  SHIP SHOOT  *********************************/
    public static final int SHIP_SHOOT_WIDTH = 10;
    public static final int SHIP_SHOOT_HEIGHT = 10;
    public static final int SHIP_SHOOT_DELTAY = 5;

    /***********************************  BRICK  ***************************************/
    public static final int BRICK_WIDTH = 10;
    public static final int BRICK_HEIGHT = 10;

    /***********************************  ALIEN  ***************************************/
    public static final int ALIEN_WIDTH = 33;
    public static final int ALIEN_HEIGHT = 25;

    public static final int X_POS_INIT_ALIEN = 40 + WINDOW_MARGIN;
    public static final int Y_POS_INIT_ALIEN = 50;
    public static final int GAP_LINES_ALIEN = 10;
    public static final int GAP_COLUMNS_ALIEN = 10;

    public static final int ALIEN_DELTAX = 10;
    public static final int ALIEN_DELTAY = 20;
    public static final int ALIEN_SPEED = 1;
}
