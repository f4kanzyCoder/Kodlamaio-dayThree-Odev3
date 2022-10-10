package kodlamaio.core.logging.concretes;

import kodlamaio.core.logging.abstracts.Logger;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandi :" + data);
    }
}
