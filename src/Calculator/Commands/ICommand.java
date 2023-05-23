package Calculator.Commands;

import java.util.List;
import java.util.Map;

public interface ICommand {
    public void Execute(Map<String, Var> varPool, List<String> context);
}
