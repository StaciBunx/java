package Model;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class FileOperationsImpl implements FileOperation {
    private String fileName;

    public String setFileName(Record record) {
        String fileName = "";
        record.getFamilyName();
        return fileName;
    }


    public FileOperationsImpl() {
        this.fileName = setFileName(null)
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    // public FileOperationsImpl(String fileName) {
    //     this.fileName = fileName;
    //     try (FileWriter writer = new FileWriter(fileName, true)) {
    //         writer.flush();
    //     } catch (IOException ex) {
    //         System.out.println(ex.getMessage());
    //     }
    // }



    @Override
    public void saveAll(List<String> lines) {
        fileName =
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : lines) {
                // запись всей строки
                writer.write(line);
                // запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    // @Override
    // public void saveAll(List<String> lines) {
    // try (FileWriter writer = new FileWriter(fileName, false)) {
    // for (String line : lines) {
    // // запись всей строки
    // writer.write(line);
    // // запись по символам
    // writer.append('\n');
    // }
    // writer.flush();
    // } catch (IOException e) {
    // System.out.println(e.getMessage());
    // }

    // }

    @Override
    public List<String> readAll() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            // создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            // создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                // считываем остальные строки в цикле
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
