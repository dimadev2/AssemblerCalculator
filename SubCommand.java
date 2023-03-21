import java.util.List;
import java.util.Map;

public class SubCommand implements ICommand{
    @Override
    public void Execute(Map<String, Var> varPool, List<String> context) {
        try {
            if (varPool.containsKey(context.get(0))) {
                varPool.get(context.get(0)).Value -= Integer.parseInt(context.get(1));
            } else {
                varPool.put(context.get(0), new Var(-Integer.parseInt(context.get(1))));
            }
        }
        catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("WARNING: bad arguments");
        }
    }
}
