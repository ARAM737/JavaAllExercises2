package all.exercise12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main12 {
    private final MakeHash makeHash;

    @Autowired
    public Main12(MakeHash makeHash) {
        this.makeHash = makeHash;
    }

    public static void main(String[] args) throws Exception {
        String[] l;
        l = new String[2];
        l[1]="second";
        l[0]="first";
        SpringApplication.run(Main12.class,l);
    }
}
