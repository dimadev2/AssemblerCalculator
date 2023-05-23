package Calculator;

import Calculator.Commands.Var;
import Calculator.Fabric.Fabric;

import java.io.IOException;
import java.util.*;

public class AssemblerCalculator {
    private Map<String, Var> VarPool = new HashMap<>();

    public void Run() {
        Scanner in = new Scanner(System.in);
        System.out.print(">>> ");
        String line = in.nextLine();
        while (!line.equals("quit")) {
            ArrayList<String> args = new ArrayList<>(Arrays.asList(line.split(" ")));
            String command = args.get(0);
            args.remove(0);

            try {
                Fabric.GetCommand(command).Execute(VarPool, args);
            } catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                System.out.println("ERROR: Bad command");
            }

            System.out.print(">>> ");
            line = in.nextLine();
        }
    }
}
