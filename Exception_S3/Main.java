import Controllers.*;
import Model.*;
import Views.View;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationsImpl();
        Repository repository = new RepositoryFile(fileOperation);
        RecordController controller = new RecordController(repository);
        View view = new View(controller);
        view.run();

    }
}
