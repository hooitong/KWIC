package adt.capitalize;

import java.util.ArrayList;

public class Capitalize {

    private ArrayList<String> capitalizeList = new ArrayList<String>();

    public void capitalize(ArrayList<String> inputArray,
        ArrayList<String> noiseArray) {
        for (int i = 0; i < inputArray.size(); i++) {
            String string = inputArray.get(i);
            String[] stringArray = string.split("\\s");
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < stringArray.length; j++) {
                stringArray[j] =
                    stringArray[j].substring(0, 1).toUpperCase() + stringArray[j].substring(1);

                for (int k = 0; k < noiseArray.size(); k++) {
                    if (stringArray[j].equalsIgnoreCase(noiseArray.get(k))) {
                        stringArray[j] = stringArray[j].toLowerCase();
                    }
                }
                sb.append(stringArray[j]);
                sb.append(" ");
            }

            capitalizeList.add(sb.toString().trim());
        }
    }

	public ArrayList<String> getCapitalList() {
		return capitalizeList;
	}
}
