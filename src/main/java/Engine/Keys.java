package Engine;

import Engine.Values.*;

import static org.lwjgl.glfw.GLFW.*;
import static Engine.Values.Window.gameState;
import static Engine.Values.Window.chatState;

/**
 * Klasa przechowujaca oraz obslugujaca klawisze w calym programie
 */
public class Keys
{
    /**
     * Obsluga klawiszy w grze
     * @param text - do obslugi czatu
     */
    public static void inGameKeys(Text text)
    {
        releases();

        if(chatState == ChatState.MOVEMENT)
        {
            if(KeyInput.hold[GLFW_KEY_W] || KeyInput.hold[GLFW_KEY_UP])
            {
                if(Player.getWantedY().compareTo(Player.getPosY()) == 0)
                    PlayerMovement.up();
            }
            if(KeyInput.hold[GLFW_KEY_A] || KeyInput.hold[GLFW_KEY_LEFT])
            {
                if(Player.getWantedX().compareTo(Player.getPosX()) == 0)
                    PlayerMovement.left();
            }
            if(KeyInput.hold[GLFW_KEY_D] || KeyInput.hold[GLFW_KEY_RIGHT])
            {
                if(Player.getWantedX().compareTo(Player.getPosX()) == 0)
                    PlayerMovement.right();
            }
            if(KeyInput.hold[GLFW_KEY_S] || KeyInput.hold[GLFW_KEY_DOWN])
            {
                if(Player.getWantedY().compareTo(Player.getPosY()) == 0)
                    PlayerMovement.down();
            }
        }else if(chatState == ChatState.CHATTING)
        {
            // Brak
        }else
        {
            System.out.println("Problem with inGameKeys!!!");
        }
    }

    /**
     * Funkcja do wpisywania textu (login i haslo)
     * @param text - text ktory bedzie edytowany
     */
    public static void textInput(Text text)
    {
        releases();

        if(KeyInput.press[GLFW_KEY_ENTER])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_ENTER))
            {
                if(gameState == GameState.LOGIN_SCREEN)
                {
                    gameState = GameState.CONNECTING;
                }
            }
        }

        if(KeyInput.hold[GLFW_KEY_BACKSPACE])
        {
            if(KeyCooldowns.checkKeyCooldown(GLFW_KEY_BACKSPACE))
            {
                text.backspace();
                KeyCooldowns.setCooldown(GLFW_KEY_BACKSPACE, 7);
            }
        }

        if(KeyInput.press[GLFW_KEY_TAB])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_TAB))
            {
                if(text.equals(textFromKeyboard.getLogin()))
                    textFromKeyboard.textIsPassword();
                if(text.equals(textFromKeyboard.getPassword()))
                    textFromKeyboard.textIsLogin();
                KeyCooldowns.pressed(GLFW_KEY_TAB);
            }
        }

        if(KeyInput.press[GLFW_KEY_0])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_0))
            {
                text.add('0');
                KeyCooldowns.pressed(GLFW_KEY_0);
            }
        }
        if(KeyInput.press[GLFW_KEY_1])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_1))
            {
                text.add('1');
                KeyCooldowns.pressed(GLFW_KEY_1);
            }
        }
        if(KeyInput.press[GLFW_KEY_2])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_2))
            {
                text.add('2');
                KeyCooldowns.pressed(GLFW_KEY_2);
            }
        }
        if(KeyInput.press[GLFW_KEY_3])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_3))
            {
                text.add('3');
                KeyCooldowns.pressed(GLFW_KEY_3);
            }
        }
        if(KeyInput.press[GLFW_KEY_4])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_4))
            {
                text.add('4');
                KeyCooldowns.pressed(GLFW_KEY_4);
            }
        }
        if(KeyInput.press[GLFW_KEY_5])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_5))
            {
                text.add('5');
                KeyCooldowns.pressed(GLFW_KEY_5);
            }
        }
        if(KeyInput.press[GLFW_KEY_6])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_6))
            {
                text.add('6');
                KeyCooldowns.pressed(GLFW_KEY_6);
            }
        }
        if(KeyInput.press[GLFW_KEY_7])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_7))
            {
                text.add('7');
                KeyCooldowns.pressed(GLFW_KEY_7);
            }
        }
        if(KeyInput.press[GLFW_KEY_8])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_8))
            {
                text.add('8');
                KeyCooldowns.pressed(GLFW_KEY_8);
            }
        }
        if(KeyInput.press[GLFW_KEY_9])
        {
            if (!KeyCooldowns.isKeyPressed(GLFW_KEY_9))
            {
                text.add('9');
                KeyCooldowns.pressed(GLFW_KEY_9);
            }
        }


        /*
          Capital keys
          -------------------------------------------------------
         */

        if(KeyInput.hold[GLFW_KEY_LEFT_SHIFT] || KeyInput.hold[GLFW_KEY_RIGHT_SHIFT])
        {
            if(KeyInput.press[GLFW_KEY_A])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_A))
                {
                    text.add('A');
                    KeyCooldowns.pressed(GLFW_KEY_A);
                }
            }
            if(KeyInput.press[GLFW_KEY_B])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_B))
                {
                    text.add('B');
                    KeyCooldowns.pressed(GLFW_KEY_B);
                }
            }
            if(KeyInput.press[GLFW_KEY_C])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_C))
                {
                    text.add('C');
                    KeyCooldowns.pressed(GLFW_KEY_C);
                }
            }
            if(KeyInput.press[GLFW_KEY_D])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_D))
                {
                    text.add('D');
                    KeyCooldowns.pressed(GLFW_KEY_D);
                }
            }
            if(KeyInput.press[GLFW_KEY_E])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_E))
                {
                    text.add('E');
                    KeyCooldowns.pressed(GLFW_KEY_E);
                }
            }
            if(KeyInput.press[GLFW_KEY_F])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_F))
                {
                    text.add('F');
                    KeyCooldowns.pressed(GLFW_KEY_F);
                }
            }
            if(KeyInput.press[GLFW_KEY_G])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_G))
                {
                    text.add('G');
                    KeyCooldowns.pressed(GLFW_KEY_G);
                }
            }
            if(KeyInput.press[GLFW_KEY_H])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_H))
                {
                    text.add('H');
                    KeyCooldowns.pressed(GLFW_KEY_H);
                }
            }
            if(KeyInput.press[GLFW_KEY_I])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_I))
                {
                    text.add('I');
                    KeyCooldowns.pressed(GLFW_KEY_I);
                }
            }
            if(KeyInput.press[GLFW_KEY_J])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_J))
                {
                    text.add('J');
                    KeyCooldowns.pressed(GLFW_KEY_J);
                }
            }
            if(KeyInput.press[GLFW_KEY_K])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_K))
                {
                    text.add('K');
                    KeyCooldowns.pressed(GLFW_KEY_K);
                }
            }
            if(KeyInput.press[GLFW_KEY_L])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_L))
                {
                    text.add('L');
                    KeyCooldowns.pressed(GLFW_KEY_L);
                }
            }
            if(KeyInput.press[GLFW_KEY_M])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_M))
                {
                    text.add('M');
                    KeyCooldowns.pressed(GLFW_KEY_M);
                }
            }
            if(KeyInput.press[GLFW_KEY_N])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_N))
                {
                    text.add('N');
                    KeyCooldowns.pressed(GLFW_KEY_N);
                }
            }
            if(KeyInput.press[GLFW_KEY_O])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_O))
                {
                    text.add('O');
                    KeyCooldowns.pressed(GLFW_KEY_O);
                }
            }
            if(KeyInput.press[GLFW_KEY_P])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_P))
                {
                    text.add('P');
                    KeyCooldowns.pressed(GLFW_KEY_P);
                }
            }
            if(KeyInput.press[GLFW_KEY_Q])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_Q))
                {
                    text.add('Q');
                    KeyCooldowns.pressed(GLFW_KEY_Q);
                }
            }
            if(KeyInput.press[GLFW_KEY_R])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_R))
                {
                    text.add('R');
                    KeyCooldowns.pressed(GLFW_KEY_R);
                }
            }
            if(KeyInput.press[GLFW_KEY_S])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_S))
                {
                    text.add('S');
                    KeyCooldowns.pressed(GLFW_KEY_S);
                }
            }
            if(KeyInput.press[GLFW_KEY_T])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_T))
                {
                    text.add('T');
                    KeyCooldowns.pressed(GLFW_KEY_T);
                }
            }
            if(KeyInput.press[GLFW_KEY_U])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_U))
                {
                    text.add('U');
                    KeyCooldowns.pressed(GLFW_KEY_U);
                }
            }
            if(KeyInput.press[GLFW_KEY_V])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_V))
                {
                    text.add('V');
                    KeyCooldowns.pressed(GLFW_KEY_V);
                }
            }
            if(KeyInput.press[GLFW_KEY_W])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_W))
                {
                    text.add('W');
                    KeyCooldowns.pressed(GLFW_KEY_W);
                }
            }
            if(KeyInput.press[GLFW_KEY_X])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_X))
                {
                    text.add('X');
                    KeyCooldowns.pressed(GLFW_KEY_X);
                }
            }
            if(KeyInput.press[GLFW_KEY_Y])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_Y))
                {
                    text.add('Y');
                    KeyCooldowns.pressed(GLFW_KEY_Y);
                }
            }
            if(KeyInput.press[GLFW_KEY_Z])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_Z))
                {
                    text.add('Z');
                    KeyCooldowns.pressed(GLFW_KEY_Z);
                }
            }
        }else
        {


            /*
               Small keys.
               -------------------------------------------------------
             */


            if(KeyInput.press[GLFW_KEY_A])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_A))
                {
                    text.add('a');
                    KeyCooldowns.pressed(GLFW_KEY_A);
                }
            }
            if(KeyInput.press[GLFW_KEY_B])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_B))
                {
                    text.add('b');
                    KeyCooldowns.pressed(GLFW_KEY_B);
                }
            }
            if(KeyInput.press[GLFW_KEY_C])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_C))
                {
                    text.add('c');
                    KeyCooldowns.pressed(GLFW_KEY_C);
                }
            }
            if(KeyInput.press[GLFW_KEY_D])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_D))
                {
                    text.add('d');
                    KeyCooldowns.pressed(GLFW_KEY_D);
                }
            }
            if(KeyInput.press[GLFW_KEY_E])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_E))
                {
                    text.add('e');
                    KeyCooldowns.pressed(GLFW_KEY_E);
                }
            }
            if(KeyInput.press[GLFW_KEY_F])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_F))
                {
                    text.add('f');
                    KeyCooldowns.pressed(GLFW_KEY_F);
                }
            }
            if(KeyInput.press[GLFW_KEY_G])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_G))
                {
                    text.add('g');
                    KeyCooldowns.pressed(GLFW_KEY_G);
                }
            }
            if(KeyInput.press[GLFW_KEY_H])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_H))
                {
                    text.add('h');
                    KeyCooldowns.pressed(GLFW_KEY_H);
                }
            }
            if(KeyInput.press[GLFW_KEY_I])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_I))
                {
                    text.add('i');
                    KeyCooldowns.pressed(GLFW_KEY_I);
                }
            }
            if(KeyInput.press[GLFW_KEY_J])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_J))
                {
                    text.add('j');
                    KeyCooldowns.pressed(GLFW_KEY_J);
                }
            }
            if(KeyInput.press[GLFW_KEY_K])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_K))
                {
                    text.add('k');
                    KeyCooldowns.pressed(GLFW_KEY_K);
                }
            }
            if(KeyInput.press[GLFW_KEY_L])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_L))
                {
                    text.add('l');
                    KeyCooldowns.pressed(GLFW_KEY_L);
                }
            }
            if(KeyInput.press[GLFW_KEY_M])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_M))
                {
                    text.add('m');
                    KeyCooldowns.pressed(GLFW_KEY_M);
                }
            }
            if(KeyInput.press[GLFW_KEY_N])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_N))
                {
                    text.add('n');
                    KeyCooldowns.pressed(GLFW_KEY_N);
                }
            }
            if(KeyInput.press[GLFW_KEY_O])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_O))
                {
                    text.add('o');
                    KeyCooldowns.pressed(GLFW_KEY_O);
                }
            }
            if(KeyInput.press[GLFW_KEY_P])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_P))
                {
                    text.add('p');
                    KeyCooldowns.pressed(GLFW_KEY_P);
                }
            }
            if(KeyInput.press[GLFW_KEY_Q])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_Q))
                {
                    text.add('q');
                    KeyCooldowns.pressed(GLFW_KEY_Q);
                }
            }
            if(KeyInput.press[GLFW_KEY_R])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_R))
                {
                    text.add('r');
                    KeyCooldowns.pressed(GLFW_KEY_R);
                }
            }
            if(KeyInput.press[GLFW_KEY_S])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_S))
                {
                    text.add('s');
                    KeyCooldowns.pressed(GLFW_KEY_S);
                }
            }
            if(KeyInput.press[GLFW_KEY_T])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_T))
                {
                    text.add('t');
                    KeyCooldowns.pressed(GLFW_KEY_T);
                }
            }
            if(KeyInput.press[GLFW_KEY_U])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_U))
                {
                    text.add('u');
                    KeyCooldowns.pressed(GLFW_KEY_U);
                }
            }
            if(KeyInput.press[GLFW_KEY_V])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_V))
                {
                    text.add('v');
                    KeyCooldowns.pressed(GLFW_KEY_V);
                }
            }
            if(KeyInput.press[GLFW_KEY_W])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_W))
                {
                    text.add('w');
                    KeyCooldowns.pressed(GLFW_KEY_W);
                }
            }
            if(KeyInput.press[GLFW_KEY_X])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_X))
                {
                    text.add('x');
                    KeyCooldowns.pressed(GLFW_KEY_X);
                }
            }
            if(KeyInput.press[GLFW_KEY_Y])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_Y))
                {
                    text.add('y');
                    KeyCooldowns.pressed(GLFW_KEY_Y);
                }
            }
            if(KeyInput.press[GLFW_KEY_Z])
            {
                if(!KeyCooldowns.isKeyPressed(GLFW_KEY_Z))
                {
                    text.add('z');
                    KeyCooldowns.pressed(GLFW_KEY_Z);
                }
            }
        }
    }


    /**
     * Funkcja ktora wczesniej edytowala text, teraz zastapiona lepsza wersja
     * zapisana aby w razie czego moc do niej wrocic
     * @param window_from_main - okno programu
     * @param text - text modyfikowany
     */
    public static void loginScreenKeys(long window_from_main, Text text)
    {
        glfwSetKeyCallback(window_from_main, (window, key, scancode, action, mods) ->
        {

            if(key == GLFW_KEY_BACKSPACE && action == GLFW_PRESS)
                text.backspace();
            if(key == GLFW_KEY_TAB && action == GLFW_PRESS)
            {
                if(text.equals(textFromKeyboard.getLogin()))
                    loginScreenKeys(window, textFromKeyboard.getPassword());
                if(text.equals(textFromKeyboard.getPassword()))
                    loginScreenKeys(window, textFromKeyboard.getLogin());
            }
            if((key == GLFW_KEY_0 || key == GLFW_KEY_KP_0) && action == GLFW_PRESS)
                text.add('0');
            if((key == GLFW_KEY_1 || key == GLFW_KEY_KP_1) && action == GLFW_PRESS)
                text.add('1');
            if((key == GLFW_KEY_2 || key == GLFW_KEY_KP_2) && action == GLFW_PRESS)
                text.add('2');
            if((key == GLFW_KEY_3 || key == GLFW_KEY_KP_3) && action == GLFW_PRESS)
                text.add('3');
            if((key == GLFW_KEY_4 || key == GLFW_KEY_KP_4) && action == GLFW_PRESS)
                text.add('4');
            if((key == GLFW_KEY_5 || key == GLFW_KEY_KP_5) && action == GLFW_PRESS)
                text.add('5');
            if((key == GLFW_KEY_6 || key == GLFW_KEY_KP_6) && action == GLFW_PRESS)
                text.add('6');
            if((key == GLFW_KEY_7 || key == GLFW_KEY_KP_7) && action == GLFW_PRESS)
                text.add('7');
            if((key == GLFW_KEY_8 || key == GLFW_KEY_KP_8) && action == GLFW_PRESS)
                text.add('8');
            if((key == GLFW_KEY_9 || key == GLFW_KEY_KP_9) && action == GLFW_PRESS)
                text.add('9');

            if(key == GLFW_KEY_LEFT_SHIFT && action != GLFW_RELEASE)
            {
                if(key == GLFW_KEY_A && action == GLFW_PRESS)
                    text.add('A');
            }
            //if(key == GLFW_KEY_A && action == GLFW_PRESS)
            //    text.add('a');
        });
    }

    /**
     * Zwolnienia nacisniecia klawiszy
     */
    private static void releases()
    {
        /*
           KEY RELEASES
         */
        if(KeyInput.release[GLFW_KEY_LEFT])
            KeyCooldowns.released(GLFW_KEY_LEFT);
        if(KeyInput.release[GLFW_KEY_RIGHT])
            KeyCooldowns.released(GLFW_KEY_RIGHT);
        if(KeyInput.release[GLFW_KEY_UP])
            KeyCooldowns.released(GLFW_KEY_UP);
        if(KeyInput.release[GLFW_KEY_DOWN])
            KeyCooldowns.released(GLFW_KEY_DOWN);

        if(KeyInput.release[GLFW_KEY_0])
            KeyCooldowns.released(GLFW_KEY_0);
        if(KeyInput.release[GLFW_KEY_1])
            KeyCooldowns.released(GLFW_KEY_1);
        if(KeyInput.release[GLFW_KEY_2])
            KeyCooldowns.released(GLFW_KEY_2);
        if(KeyInput.release[GLFW_KEY_3])
            KeyCooldowns.released(GLFW_KEY_3);
        if(KeyInput.release[GLFW_KEY_4])
            KeyCooldowns.released(GLFW_KEY_4);
        if(KeyInput.release[GLFW_KEY_5])
            KeyCooldowns.released(GLFW_KEY_5);
        if(KeyInput.release[GLFW_KEY_6])
            KeyCooldowns.released(GLFW_KEY_6);
        if(KeyInput.release[GLFW_KEY_7])
            KeyCooldowns.released(GLFW_KEY_7);
        if(KeyInput.release[GLFW_KEY_8])
            KeyCooldowns.released(GLFW_KEY_8);
        if(KeyInput.release[GLFW_KEY_9])
            KeyCooldowns.released(GLFW_KEY_9);

        if(KeyInput.release[GLFW_KEY_A])
            KeyCooldowns.released(GLFW_KEY_A);
        if(KeyInput.release[GLFW_KEY_B])
            KeyCooldowns.released(GLFW_KEY_B);
        if(KeyInput.release[GLFW_KEY_C])
            KeyCooldowns.released(GLFW_KEY_C);
        if(KeyInput.release[GLFW_KEY_D])
            KeyCooldowns.released(GLFW_KEY_D);
        if(KeyInput.release[GLFW_KEY_E])
            KeyCooldowns.released(GLFW_KEY_E);
        if(KeyInput.release[GLFW_KEY_F])
            KeyCooldowns.released(GLFW_KEY_F);
        if(KeyInput.release[GLFW_KEY_G])
            KeyCooldowns.released(GLFW_KEY_G);
        if(KeyInput.release[GLFW_KEY_H])
            KeyCooldowns.released(GLFW_KEY_H);
        if(KeyInput.release[GLFW_KEY_I])
            KeyCooldowns.released(GLFW_KEY_I);
        if(KeyInput.release[GLFW_KEY_J])
            KeyCooldowns.released(GLFW_KEY_J);
        if(KeyInput.release[GLFW_KEY_K])
            KeyCooldowns.released(GLFW_KEY_K);
        if(KeyInput.release[GLFW_KEY_L])
            KeyCooldowns.released(GLFW_KEY_L);
        if(KeyInput.release[GLFW_KEY_M])
            KeyCooldowns.released(GLFW_KEY_M);
        if(KeyInput.release[GLFW_KEY_N])
            KeyCooldowns.released(GLFW_KEY_N);
        if(KeyInput.release[GLFW_KEY_O])
            KeyCooldowns.released(GLFW_KEY_O);
        if(KeyInput.release[GLFW_KEY_P])
            KeyCooldowns.released(GLFW_KEY_P);
        if(KeyInput.release[GLFW_KEY_Q])
            KeyCooldowns.released(GLFW_KEY_Q);
        if(KeyInput.release[GLFW_KEY_R])
            KeyCooldowns.released(GLFW_KEY_R);
        if(KeyInput.release[GLFW_KEY_S])
            KeyCooldowns.released(GLFW_KEY_S);
        if(KeyInput.release[GLFW_KEY_T])
            KeyCooldowns.released(GLFW_KEY_T);
        if(KeyInput.release[GLFW_KEY_U])
            KeyCooldowns.released(GLFW_KEY_U);
        if(KeyInput.release[GLFW_KEY_V])
            KeyCooldowns.released(GLFW_KEY_V);
        if(KeyInput.release[GLFW_KEY_W])
            KeyCooldowns.released(GLFW_KEY_W);
        if(KeyInput.release[GLFW_KEY_X])
            KeyCooldowns.released(GLFW_KEY_X);
        if(KeyInput.release[GLFW_KEY_Z])
            KeyCooldowns.released(GLFW_KEY_Z);

        if(KeyInput.release[GLFW_KEY_PERIOD])
            KeyCooldowns.released(GLFW_KEY_PERIOD);
        if(KeyInput.release[GLFW_KEY_SPACE])
            KeyCooldowns.released(GLFW_KEY_SPACE);
        if(KeyInput.release[GLFW_KEY_APOSTROPHE])
            KeyCooldowns.released(GLFW_KEY_APOSTROPHE);
        if(KeyInput.release[GLFW_KEY_COMMA])
            KeyCooldowns.released(GLFW_KEY_COMMA);
        if(KeyInput.release[GLFW_KEY_MINUS])
            KeyCooldowns.released(GLFW_KEY_MINUS);
        if(KeyInput.release[GLFW_KEY_SLASH])
            KeyCooldowns.released(GLFW_KEY_SLASH);
        if(KeyInput.release[GLFW_KEY_SEMICOLON])
            KeyCooldowns.released(GLFW_KEY_SEMICOLON);
        if(KeyInput.release[GLFW_KEY_EQUAL])
            KeyCooldowns.released(GLFW_KEY_EQUAL);
        if(KeyInput.release[GLFW_KEY_LEFT_BRACKET])
            KeyCooldowns.released(GLFW_KEY_LEFT_BRACKET);
        if(KeyInput.release[GLFW_KEY_RIGHT_BRACKET])
            KeyCooldowns.released(GLFW_KEY_RIGHT_BRACKET);
        if(KeyInput.release[GLFW_KEY_BACKSLASH])
            KeyCooldowns.released(GLFW_KEY_BACKSLASH);
        if(KeyInput.release[GLFW_KEY_GRAVE_ACCENT])
            KeyCooldowns.released(GLFW_KEY_GRAVE_ACCENT);
        if(KeyInput.release[GLFW_KEY_ESCAPE])
            KeyCooldowns.released(GLFW_KEY_ESCAPE);
        if(KeyInput.release[GLFW_KEY_ENTER])
            KeyCooldowns.released(GLFW_KEY_ENTER);
        if(KeyInput.release[GLFW_KEY_TAB])
            KeyCooldowns.released(GLFW_KEY_TAB);
        if(KeyInput.release[GLFW_KEY_INSERT])
            KeyCooldowns.released(GLFW_KEY_INSERT);
        if(KeyInput.release[GLFW_KEY_DELETE])
            KeyCooldowns.released(GLFW_KEY_DELETE);
        if(KeyInput.release[GLFW_KEY_HOME])
            KeyCooldowns.released(GLFW_KEY_HOME);
        if(KeyInput.release[GLFW_KEY_END])
            KeyCooldowns.released(GLFW_KEY_END);
        if(KeyInput.release[GLFW_KEY_KP_DECIMAL])
            KeyCooldowns.released(GLFW_KEY_KP_DECIMAL);
        if(KeyInput.release[GLFW_KEY_KP_DIVIDE])
            KeyCooldowns.released(GLFW_KEY_KP_DIVIDE);
        if(KeyInput.release[GLFW_KEY_KP_MULTIPLY])
            KeyCooldowns.released(GLFW_KEY_KP_MULTIPLY);
        if(KeyInput.release[GLFW_KEY_KP_SUBTRACT])
            KeyCooldowns.released(GLFW_KEY_KP_SUBTRACT);
        if(KeyInput.release[GLFW_KEY_KP_ADD])
            KeyCooldowns.released(GLFW_KEY_KP_ADD);
        if(KeyInput.release[GLFW_KEY_KP_ENTER])
            KeyCooldowns.released(GLFW_KEY_KP_ENTER);
        if(KeyInput.release[GLFW_KEY_KP_EQUAL])
            KeyCooldowns.released(GLFW_KEY_KP_EQUAL);

        if(KeyInput.release[GLFW_KEY_LEFT_SHIFT])
            KeyCooldowns.released(GLFW_KEY_LEFT_SHIFT);
        if(KeyInput.release[GLFW_KEY_LEFT_CONTROL])
            KeyCooldowns.released(GLFW_KEY_LEFT_CONTROL);
        if(KeyInput.release[GLFW_KEY_LEFT_ALT])
            KeyCooldowns.released(GLFW_KEY_LEFT_ALT);
        if(KeyInput.release[GLFW_KEY_RIGHT_CONTROL])
            KeyCooldowns.released(GLFW_KEY_RIGHT_CONTROL);
        if(KeyInput.release[GLFW_KEY_RIGHT_SHIFT])
            KeyCooldowns.released(GLFW_KEY_RIGHT_SHIFT);
        if(KeyInput.release[GLFW_KEY_RIGHT_ALT])
            KeyCooldowns.released(GLFW_KEY_RIGHT_ALT);
    }
}

