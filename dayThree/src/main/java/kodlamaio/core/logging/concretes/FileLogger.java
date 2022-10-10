package kodlamaio.core.logging.concretes;

import kodlamaio.core.logging.abstracts.Logger;

public class FileLogger implements Logger {
    @Override
       public void log(String data) {
           System.out.println("Dosyaya loglandi :"+data);
       }
}
