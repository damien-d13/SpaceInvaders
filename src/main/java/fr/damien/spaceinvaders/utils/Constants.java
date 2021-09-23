package fr.damien.spaceinvaders.utils;

public interface Constants {

    /********************************  WINDOW  *********************************/
     int WINDOW_WIDTH = 600;
     int WINDOW_HEIGHT = 600;
     int WINDOW_MARGIN = 50;
     int FPS = 2_000_000;


    /******************************** SHIP   *********************************/
     int SHIP_WIDTH = 39;
     int SHIP_HEIGHT = 24;
     int X_POS_INIT_SHIP = (WINDOW_WIDTH - SHIP_WIDTH) / 2;
     int Y_POS_INIT_ShIP = 500;
     int SHIP_DELTA_X = 2;

     int SHIP_LEFT_WINDOW_LIMIT = 30;
     int SHIP_RIGHT_WINDOW_LIMIT = 530;

    /********************************  SHIP SHOOT  *********************************/
     int SHIP_SHOOT_WIDTH = 10;
     int SHIP_SHOOT_HEIGHT = 10;
     int SHIP_SHOOT_DELTA_Y = 5;

    /***********************************  BRICK  ***************************************/
     int BRICK_WIDTH = 10;
     int BRICK_HEIGHT = 10;
     int BRICK_POINT = 5;

    /***********************************  ALIEN  ***************************************/
     int ALIEN_WIDTH = 32;
     int ALIEN_HEIGHT = 24;

     int X_POS_INIT_ALIEN = 40 + WINDOW_MARGIN;
     int Y_POS_INIT_ALIEN = 50;
     int GAP_LINES_ALIEN = 10;
     int GAP_COLUMNS_ALIEN = 10;

     int ALIEN_DELTA_X = 5;
     int ALIEN_DELTA_Y = 20;
     int ALIEN_SPEED = 1;
     int ALIEN_POINT = 10;

    /***********************************  AUDIO  ***************************************/
     double AUDIO_VOLULME = 0.03;

    /***********************************   ALIEN SHOOT   *****************************************/
     int ALIEN_SHOOT_WIDTH = 10;
     int ALIEN_SHOOT_HEIGHT = 10;
     int ALIEN_SHOOT_DELTA_Y = 4;
     int ALIEN_SHOOT_PROBABILITY = 6000;

    /***********************************  SAUCER  ***********************************************/
     int X_POS_INIT_SAUCER = WINDOW_WIDTH;
     int Y_POS_INIT_SAUCER = 458;
     int SAUCER_WIDTH = 42;
     int SAUCER_HEIGHT = 22;
     int SAUCER_DELTA_X = 2;

}
