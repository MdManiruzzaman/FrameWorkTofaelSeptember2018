package homePage;

import base.BaseUtil;

import java.util.ArrayList;
import java.util.List;

public class SearchNew extends BaseUtil {

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("pencils");
        itemsList.add("pens");
        itemsList.add("highlighters");
        itemsList.add("Ruled Index cards");
        itemsList.add("Candy");
        itemsList.add("Coffee");
        itemsList.add("scissors");
        itemsList.add("Tape");
        return itemsList;
    }
    public List<String> listOfText() {
        List<String> elements = new ArrayList<>();
        List<String> text = new ArrayList<>();
        for (String web : elements) {
            text.add(web);
        }
        return text;
    }
}