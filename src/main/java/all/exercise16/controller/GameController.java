package all.exercise16.controller;

import all.exercise16.Game;
import all.exercise16.GameTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class GameController {
    @Autowired
    private GameTest test;

    @PostMapping("/game")
    public void post(@RequestBody Game game) {
        test.addGame(game);
    }

    @GetMapping("/games")
    public List<Game> getAll() {
        return test.getGames();
    }

    @DeleteMapping("/game/{id}")
    public void delete(@PathVariable UUID id) {
        test.deleteGame(id);
    }


}