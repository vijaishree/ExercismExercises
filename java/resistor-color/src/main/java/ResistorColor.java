import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class ResistorColor {


    String[] colors() {
        String[] colorsList = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colorsList;

    }

    int colorCode(String color) {
        String[] colorsList = colors();
        for(int colorCode =0 ;colorCode<10;colorCode++){
            if(color.equalsIgnoreCase(colorsList[colorCode])) return colorCode;
        }
        return 0;
    }
}
