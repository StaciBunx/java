package Model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private RecordMapper mapper = new RecordMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public void createRecord(Record record) throws Exception {
        List<Record> records = getAllRecords();
        records.add(record);
        saveRecords(records);
    }

    @Override
    public List<Record> getAllRecords() {
        List<String> lines = fileOperation.readAll();
        List<Record> records = new ArrayList<>();
        for (String line : lines) {
            records.add(mapper.map(line));
        }
        return records;
    }

    private void saveRecords(List<Record> records) {
        List<String> lines = new ArrayList<>();
        for (Record item : records) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAll(lines);
    }

}
