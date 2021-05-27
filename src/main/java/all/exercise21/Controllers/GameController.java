package all.exercise21.Controllers;

import all.exercise21.Classes.Game;
import all.exercise21.EmailService;
import all.exercise21.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class GameController {
    @Autowired
    private GameService test;
    @Autowired
    private EmailService mail;
    @GetMapping("/games")
    public List<Game> getAll() {
        mail.SendEmail();
        return test.getGames();
    }

    @DeleteMapping("/game/{id}")
    public void delete(@PathVariable UUID id) {
        test.deleteGame(id);
    }

    @GetMapping("/getGameByName/{name}")
    public List<Game> getByName(@PathVariable String name){
        return test.getByName(name);
    }

    @GetMapping("/getByCreationYear/{year}")
    public List<Game> getByCreationYear(@PathVariable int year){ return test.getByYear(year); }
}

