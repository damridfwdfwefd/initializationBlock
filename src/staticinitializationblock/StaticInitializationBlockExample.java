package staticinitializationblock;

import java.util.Date;

public class StaticInitializationBlockExample {
    private static String stringField;
    private static Date dateField;

    static int field = 30;
    private static final String A_STRING_CONSTANT;

    static {
        field = 50;
        stringField = getEmptyString();
        dateField = new Date();
        A_STRING_CONSTANT = "unknown";
    }


    private static String getEmptyString() {
        return "empty";
    }



}
