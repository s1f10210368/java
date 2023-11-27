package sample9.shop5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private File file;
    public FileLogger(File file) {
        this.file = file;
    }

    public void purchase(Customer customer, Item item) {
        write(String.format("[Purchase] %s: %s(%d yen).\n", customer.getName(), item.getName(), item.getPrice()));
    }

    public void balance(User user) {
        write(String.format("[Balance] %s: %d yen.\n", user.getName(), user.getBalance()));
    }

    public void error(User user, String error) {
        write(String.format("[Error] %s: %s.\n", user.getName(), error));
    }

    private void write(String str) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(str);
            writer.close();
        } catch (IOException e) {
    	    e.printStackTrace();
    	}
    }
}