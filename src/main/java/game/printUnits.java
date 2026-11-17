package game;

public class printUnits implements IHandlerCommand {
    @Override
    public void execute(Command command, GameCond condition) {
        Unit[] units = condition.getUnits();

        if (units.length == 0) {
            System.out.println("Юнитов нет");
        } else {
            for (Unit unit : units) {
                if (unit instanceof Warrior)
                    System.out.println("Warrior, " + unit.getId());
                else if (unit instanceof Archer)
                    System.out.println("Archer, " + unit.getId());
            }
        }
    }
}
