package all.exercise14.controller;

import all.exercise14.Level;
import all.exercise14.LevelTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LevelController {
    @Autowired
    private LevelTest test;

    @PostMapping("/postLevels")
    public void post(@RequestBody Level level) {
        test.add(level);
    }

    @GetMapping("/getLevels")
    public List<Level> getAll() {
        return test.getAll();
    }

    @DeleteMapping("/deleteLevel")
    public void delete(@RequestBody Level level) {
        test.delete(level);
    }
}
