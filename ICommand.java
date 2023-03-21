import java.util.List;
import java.util.Map;

public interface ICommand {
    void Execute(Map<String, Var> varPool, List<String> context);
}
