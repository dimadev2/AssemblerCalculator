package Calculator.Commands;

import java.util.List;
import java.util.Map;

public class DeleteCommand implements ICommand {
    @Override
    public void Execute(Map<String, Var> varPool, List<String> context) {
        varPool.remove(context.get(0));
    }
}
