package seedu.duke.storage;

import seedu.duke.AssignmentMap;
import seedu.duke.Room;
import seedu.duke.Satisfaction;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SatisfactionListFileManager extends FileManager {
    private static final String FILE_PATH = "data/satisfaction_list.txt";

    public void save(ArrayList<Satisfaction> satisfactions) throws IOException {
        File file = getFile(FILE_PATH);
        FileWriter fileWriter = new FileWriter(FILE_PATH);

    }
}
