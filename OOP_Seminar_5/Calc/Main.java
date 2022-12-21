import Controllers.UserController;
import Model.Calc;
import Model.CalcImpl;
import Model.Log;
import Views.View;

public class Main {
    public static void main(String[] args) {
        Calc calc = new CalcImpl();
        UserController userController = new UserController(calc);
        Log log = new Log("logger.txt");
        View view = new View(userController, log);
        view.run();
    }
}