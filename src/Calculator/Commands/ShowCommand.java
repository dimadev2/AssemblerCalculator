package Calculator.Commands;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShowCommand implements ICommand {
    @Override
    public void Execute(Map<String, Var> varPool, List<String> context) {
        Set<String> varKeys = varPool.keySet();
        for (String key: varKeys) {
            System.out.println(key + ": " + varPool.get(key).Value);
        }
    }
}
