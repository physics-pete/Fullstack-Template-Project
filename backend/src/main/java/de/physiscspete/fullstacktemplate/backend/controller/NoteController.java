package de.physiscspete.fullstacktemplate.backend.controller;


import de.physiscspete.fullstacktemplate.api.NotesApi;
import de.physiscspete.fullstacktemplate.backend.service.NoteService;
import de.physiscspete.fullstacktemplate.model.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoteController implements NotesApi {

    private final NoteService noteService;

    @Override
    public ResponseEntity<List<Note>> getNotes() {
        List<Note> notes = noteService.findAll();
        return ResponseEntity.ok(notes);
    }
}
