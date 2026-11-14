package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameEngine engine = new GameEngine();
        Parser parser = new Parser();

        ConsoleLog logger = new ConsoleLog();
        engine.getCondition().getEventManager().subscribe(logger);

        while (true) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("exit")) {
                System.out.println("Выход из игры");
                break;
            }

            try {
                Command command = parser.parse(line);
                engine.exec(command);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();

        //    GameEngine engine = new GameEngine();
        //    Executer executer = new Executer(engine);
        //
        //    Command[] commands = {
        //            new Command("initMap", new String[]{"10", "10"}),
        //            new Command("addUnit", new String[]{"unit1", "warrior", "1", "1"}),
        //            new Command("addUnit", new String[]{"unit2", "archer", "2", "2"}),
        //            new Command("startGame", new String[]{}),
        //            new Command("move", new String[]{"unit1", "3", "3"}),
        //            new Command("attack", new String[]{"unit1", "unit2"}),
        //            new Command("print", new String[]{})
        //    };
        //
        //    executer.run(commands);
    }
}
