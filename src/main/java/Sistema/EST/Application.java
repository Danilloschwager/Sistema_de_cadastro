package Sistema.EST;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void init() {
        // Garante que as datas do agendamento sejam salvas no fuso correto
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }
}
