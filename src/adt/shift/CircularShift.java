package adt.shift;

import java.util.ArrayList;
import java.util.List;

public class CircularShift {

    private List<String> shiftedList = new ArrayList<String>();

    /**
     * Circularizes every sentence in the given list and store in class object.
     *
     * @param list the list to circularize
     */
    public void circularize(List<String> list) {
        List<String> arrayShifting = new ArrayList<String>();
        List<String> tempList = new ArrayList<String>(list);

        for (int i = 0; i < tempList.size(); i++) {
            String string = tempList.get(i);
            String[] stringArray = string.split("\\s+");

            for (int firstWord = 0; firstWord < stringArray.length; firstWord++) {
                StringBuilder sb = new StringBuilder();
                for (int j = firstWord; j < firstWord + stringArray.length; j++) {
                    sb.append(stringArray[j % stringArray.length]);
                    sb.append(" ");
                }
                arrayShifting.add(sb.toString());
            }
        }

        shiftedList = arrayShifting;
    }

    /**
     * Returns the shifted / circularlized list of titles in the current object.
     *
     * @return the list stored in the current class object
     */
    public List<String> getShiftedList() {
        return shiftedList;
    }

}
