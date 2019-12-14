static public int getGdxKeyCode(int lwjglKeyCode) {
    switch(lwjglKeyCode) {
        case GLFW_KEY_SPACE:
            return Input.Keys.SPACE;
        case GLFW_KEY_APOSTROPHE:
            return Input.Keys.APOSTROPHE;
        case GLFW_KEY_COMMA:
            return Input.Keys.COMMA;
        case GLFW_KEY_MINUS:
            return Input.Keys.MINUS;
        case GLFW_KEY_PERIOD:
            return Input.Keys.PERIOD;
        case GLFW_KEY_SLASH:
            return Input.Keys.SLASH;
        case GLFW_KEY_0:
            return Input.Keys.NUM_0;
        case GLFW_KEY_1:
            return Input.Keys.NUM_1;
        case GLFW_KEY_2:
            return Input.Keys.NUM_2;
        case GLFW_KEY_3:
            return Input.Keys.NUM_3;
        case GLFW_KEY_4:
            return Input.Keys.NUM_4;
        case GLFW_KEY_5:
            return Input.Keys.NUM_5;
        case GLFW_KEY_6:
            return Input.Keys.NUM_6;
        case GLFW_KEY_7:
            return Input.Keys.NUM_7;
        case GLFW_KEY_8:
            return Input.Keys.NUM_8;
        case GLFW_KEY_9:
            return Input.Keys.NUM_9;
        case GLFW_KEY_SEMICOLON:
            return Input.Keys.SEMICOLON;
        case GLFW_KEY_EQUAL:
            return Input.Keys.EQUALS;
        case GLFW_KEY_A:
            return Input.Keys.A;
        case GLFW_KEY_B:
            return Input.Keys.B;
        case GLFW_KEY_C:
            return Input.Keys.C;
        case GLFW_KEY_D:
            return Input.Keys.D;
        case GLFW_KEY_E:
            return Input.Keys.E;
        case GLFW_KEY_F:
            return Input.Keys.F;
        case GLFW_KEY_G:
            return Input.Keys.G;
        case GLFW_KEY_H:
            return Input.Keys.H;
        case GLFW_KEY_I:
            return Input.Keys.I;
        case GLFW_KEY_J:
            return Input.Keys.J;
        case GLFW_KEY_K:
            return Input.Keys.K;
        case GLFW_KEY_L:
            return Input.Keys.L;
        case GLFW_KEY_M:
            return Input.Keys.M;
        case GLFW_KEY_N:
            return Input.Keys.N;
        case GLFW_KEY_O:
            return Input.Keys.O;
        case GLFW_KEY_P:
            return Input.Keys.P;
        case GLFW_KEY_Q:
            return Input.Keys.Q;
        case GLFW_KEY_R:
            return Input.Keys.R;
        case GLFW_KEY_S:
            return Input.Keys.S;
        case GLFW_KEY_T:
            return Input.Keys.T;
        case GLFW_KEY_U:
            return Input.Keys.U;
        case GLFW_KEY_V:
            return Input.Keys.V;
        case GLFW_KEY_W:
            return Input.Keys.W;
        case GLFW_KEY_X:
            return Input.Keys.X;
        case GLFW_KEY_Y:
            return Input.Keys.Y;
        case GLFW_KEY_Z:
            return Input.Keys.Z;
        case GLFW_KEY_LEFT_BRACKET:
            return Input.Keys.LEFT_BRACKET;
        case GLFW_KEY_BACKSLASH:
            return Input.Keys.BACKSLASH;
        case GLFW_KEY_RIGHT_BRACKET:
            return Input.Keys.RIGHT_BRACKET;
        case GLFW_KEY_GRAVE_ACCENT:
            return Input.Keys.GRAVE;
        case GLFW_KEY_WORLD_1:
        case GLFW_KEY_WORLD_2:
            return Input.Keys.UNKNOWN;
        case GLFW_KEY_ESCAPE:
            return Input.Keys.ESCAPE;
        case GLFW_KEY_ENTER:
            return Input.Keys.ENTER;
        case GLFW_KEY_TAB:
            return Input.Keys.TAB;
        case GLFW_KEY_BACKSPACE:
            return Input.Keys.BACKSPACE;
        case GLFW_KEY_INSERT:
            return Input.Keys.INSERT;
        case GLFW_KEY_DELETE:
            return Input.Keys.FORWARD_DEL;
        case GLFW_KEY_RIGHT:
            return Input.Keys.RIGHT;
        case GLFW_KEY_LEFT:
            return Input.Keys.LEFT;
        case GLFW_KEY_DOWN:
            return Input.Keys.DOWN;
        case GLFW_KEY_UP:
            return Input.Keys.UP;
        case GLFW_KEY_PAGE_UP:
            return Input.Keys.PAGE_UP;
        case GLFW_KEY_PAGE_DOWN:
            return Input.Keys.PAGE_DOWN;
        case GLFW_KEY_HOME:
            return Input.Keys.HOME;
        case GLFW_KEY_END:
            return Input.Keys.END;
        case GLFW_KEY_CAPS_LOCK:
        case GLFW_KEY_SCROLL_LOCK:
        case GLFW_KEY_NUM_LOCK:
        case GLFW_KEY_PRINT_SCREEN:
        case GLFW_KEY_PAUSE:
            return Input.Keys.UNKNOWN;
        case GLFW_KEY_F1:
            return Input.Keys.F1;
        case GLFW_KEY_F2:
            return Input.Keys.F2;
        case GLFW_KEY_F3:
            return Input.Keys.F3;
        case GLFW_KEY_F4:
            return Input.Keys.F4;
        case GLFW_KEY_F5:
            return Input.Keys.F5;
        case GLFW_KEY_F6:
            return Input.Keys.F6;
        case GLFW_KEY_F7:
            return Input.Keys.F7;
        case GLFW_KEY_F8:
            return Input.Keys.F8;
        case GLFW_KEY_F9:
            return Input.Keys.F9;
        case GLFW_KEY_F10:
            return Input.Keys.F10;
        case GLFW_KEY_F11:
            return Input.Keys.F11;
        case GLFW_KEY_F12:
            return Input.Keys.F12;
        case GLFW_KEY_F13:
        case GLFW_KEY_F14:
        case GLFW_KEY_F15:
        case GLFW_KEY_F16:
        case GLFW_KEY_F17:
        case GLFW_KEY_F18:
        case GLFW_KEY_F19:
        case GLFW_KEY_F20:
        case GLFW_KEY_F21:
        case GLFW_KEY_F22:
        case GLFW_KEY_F23:
        case GLFW_KEY_F24:
        case GLFW_KEY_F25:
            return Input.Keys.UNKNOWN;
        case GLFW_KEY_KP_0:
            return Input.Keys.NUMPAD_0;
        case GLFW_KEY_KP_1:
            return Input.Keys.NUMPAD_1;
        case GLFW_KEY_KP_2:
            return Input.Keys.NUMPAD_2;
        case GLFW_KEY_KP_3:
            return Input.Keys.NUMPAD_3;
        case GLFW_KEY_KP_4:
            return Input.Keys.NUMPAD_4;
        case GLFW_KEY_KP_5:
            return Input.Keys.NUMPAD_5;
        case GLFW_KEY_KP_6:
            return Input.Keys.NUMPAD_6;
        case GLFW_KEY_KP_7:
            return Input.Keys.NUMPAD_7;
        case GLFW_KEY_KP_8:
            return Input.Keys.NUMPAD_8;
        case GLFW_KEY_KP_9:
            return Input.Keys.NUMPAD_9;
        case GLFW_KEY_KP_DECIMAL:
            return Input.Keys.PERIOD;
        case GLFW_KEY_KP_DIVIDE:
            return Input.Keys.SLASH;
        case GLFW_KEY_KP_MULTIPLY:
            return Input.Keys.STAR;
        case GLFW_KEY_KP_SUBTRACT:
            return Input.Keys.MINUS;
        case GLFW_KEY_KP_ADD:
            return Input.Keys.PLUS;
        case GLFW_KEY_KP_ENTER:
            return Input.Keys.ENTER;
        case GLFW_KEY_KP_EQUAL:
            return Input.Keys.EQUALS;
        case GLFW_KEY_LEFT_SHIFT:
            return Input.Keys.SHIFT_LEFT;
        case GLFW_KEY_LEFT_CONTROL:
            return Input.Keys.CONTROL_LEFT;
        case GLFW_KEY_LEFT_ALT:
            return Input.Keys.ALT_LEFT;
        case GLFW_KEY_LEFT_SUPER:
            return Input.Keys.SYM;
        case GLFW_KEY_RIGHT_SHIFT:
            return Input.Keys.SHIFT_RIGHT;
        case GLFW_KEY_RIGHT_CONTROL:
            return Input.Keys.CONTROL_RIGHT;
        case GLFW_KEY_RIGHT_ALT:
            return Input.Keys.ALT_RIGHT;
        case GLFW_KEY_RIGHT_SUPER:
            return Input.Keys.SYM;
        case GLFW_KEY_MENU:
            return Input.Keys.MENU;
        default:
            return Input.Keys.UNKNOWN;
    }
}