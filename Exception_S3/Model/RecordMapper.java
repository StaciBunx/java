package Model;

public class RecordMapper {
    public String map(Record record) {
        return String.format("%s,%s,%s,%s,%d,%c", record.getFamilyName(), record.getName(), record.getFatherName(),
                record.getBirthday(), record.getPhone(), record.getSex());
    }

    public Record map(String line) throws Exception {
        String[] lines = line.split(",");
        try {
            Integer.parseInt(lines[4].trim());
            lines[5].charAt(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new Record(lines[0], lines[1], lines[2], lines[3], Integer.parseInt(lines[4].trim()),
                lines[5].charAt(0));
    }
}
