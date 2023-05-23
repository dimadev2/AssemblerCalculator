package Calculator.Fabric;

import Calculator.Commands.ICommand;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Fabric {
    static Properties prop = new Properties();

    static public ICommand GetCommand(String commandName) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        InputStream fis = new FileInputStream("./src/Calculator/Fabric/config.properties");
        prop.load(fis);

        return (ICommand)Class.forName("Calculator.Commands." + prop.getProperty(commandName)).newInstance();
    }
}
