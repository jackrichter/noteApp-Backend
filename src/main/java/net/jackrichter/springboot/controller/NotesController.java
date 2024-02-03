package net.jackrichter.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.jackrichter.springboot.model.Note;
import net.jackrichter.springboot.repository.NotesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@CrossOrigin("*")           // OBS!
public class NotesController {
    private NotesRepository nRepo;

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> readNotes() {
        return new ResponseEntity<List<Note>>(nRepo.findAll(), HttpStatus.OK);
    }
}
