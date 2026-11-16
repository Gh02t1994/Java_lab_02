package game;

public class Executer {
    private IGameEngine engine;

    public Executer(IGameEngine engine) {
        this.engine = engine;
    }

    public void run(Command[] commands) {
        for (Command command : commands) {
            try {
                engine.exec(command);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
