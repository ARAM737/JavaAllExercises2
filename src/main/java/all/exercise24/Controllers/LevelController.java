package all.exercise24.Controllers;


import all.exercise24.Classes.Game;
import all.exercise24.Classes.Level;
import all.exercise24.Services.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class LevelController {
    @Autowired
    private LevelService test;


    @GetMapping("/levels")
    public List<Level> getAll() {
        return test.getLevels();
    }

    @DeleteMapping("/level/{id}")
    public void delete(@PathVariable UUID id) {
        test.deleteLevel(id);
    }


    @GetMapping("/getLevelsByName/{name}")
    public List<Level> getFilteredBytName(@PathVariable String name){ return test.getByName(name); }

    @GetMapping("/getByComplexity/{complexity}")
    public List<Level> getFilteredByComplexity(@PathVariable String complexity){ return test.getByCmp(complexity); }

    @GetMapping(value = "/level/{Id}/game")
    public @ResponseBody
    Game getGame(@PathVariable("Id") UUID id){
        return test.getGameByLevel(id);
    }

}
