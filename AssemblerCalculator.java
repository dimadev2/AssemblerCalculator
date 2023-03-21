import java.util.*;

public class AssemblerCalculator {
    private Map<String, Var> VarPool;
    private Map<String, ICommand> CommandPool;
    public AssemblerCalculator() {
        VarPool = new HashMap<>();
        CommandPool = new HashMap<>();

        CommandPool.put("add", new AddCommand());
        CommandPool.put("sub", new SubCommand());
        CommandPool.put("del", new DeleteCommand());
        CommandPool.put("show", new ShowCommand());
    }

    public void Run() {
        Scanner in = new Scanner(System.in);
        System.out.print(">>> ");
        String line = in.nextLine();
        while (!line.equals("quit")) {
            ArrayList<String> args = new ArrayList<>(Arrays.asList(line.split(" ")));
            String command = args.get(0);
            args.remove(0);

            try {
                CommandPool.get(command).Execute(VarPool, args);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("WARNING: bad command");
            }

            System.out.print(">>> ");
            line = in.nextLine();
        }
    }
}
