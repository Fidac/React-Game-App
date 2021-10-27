package react.presentation.controller;

import react.presentation.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import react.presentation.service.GameService;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping(path="/games", produces="application/json")
    public ResponseEntity<List<Game>> getGames(){
        List<Game> games =  gameService.getGames();
        return ResponseEntity.ok().body(games);
    }

    @GetMapping(path="/games/{id:[0-9][0-9]*}", produces="application/json")
    public ResponseEntity<Game> getGame(@PathVariable Long id) {
        Game game = gameService.getGame(id);
        return ResponseEntity.ok().body(game);
    }

    @PostMapping(path="/games/",consumes = "application/json", produces="application/json")
    @ResponseBody
    public ResponseEntity<Game> createGame(@RequestBody Game game) {
        Game createdGame = gameService.createGame(game);
        return ResponseEntity.ok().body(createdGame);
    }

    @PutMapping(path="/games/", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Game> updateGame(@RequestBody Game game) {
        gameService.updateGame(game);
        return ResponseEntity.ok().body(game);
    }

    @DeleteMapping(path="/games/delete/{id:[0-9][0-9]*}", produces="application/json")
    public ResponseEntity<Boolean> deleteGame(@PathVariable Long id) {
            gameService.deleteGame(id);
            return ResponseEntity.ok().body(true);
    }

}
