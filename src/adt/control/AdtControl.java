package adt.control;

import adt.capitalize.Capitalize;
import adt.filter.NoiseFilter;
import adt.input.Input;
import adt.memory.MovieTitleMemory;
import adt.memory.NoiseWordMemory;
import adt.output.Output;
import adt.shift.CircularShift;
import adt.sort.AlphabetSort;

public class AdtControl {

    static Input input = new Input();
    static Output output = new Output();
    static CircularShift circularShift = new CircularShift();
    static NoiseFilter noiseFilter = new NoiseFilter();
    static AlphabetSort alphabetSort = new AlphabetSort();
    static Capitalize capitalize = new Capitalize();
    static MovieTitleMemory movieTitleArray = MovieTitleMemory.getInstance();
    static NoiseWordMemory noiseWordArray = NoiseWordMemory.getInstance();

    /**
     * To start running KWIC
     */
    public static void setup() {
        input.inputMethod();

        circularShift.circularize(movieTitleArray.getMovieTitles());
        noiseFilter.noiseWordFilter(circularShift.getShiftedList());
        alphabetSort.alphabetize(noiseFilter.getFilterList());
        capitalize.capitalize(alphabetSort.getSortedList());

        output.print(capitalize.getCapitalList());
        output.print(noiseWordArray.getNoiseWords());
    }
}
