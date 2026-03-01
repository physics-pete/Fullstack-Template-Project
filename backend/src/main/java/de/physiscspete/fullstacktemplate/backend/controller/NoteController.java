package de.physiscspete.fullstacktemplate.backend.controller;


import de.physiscspete.fullstacktemplate.api.NotesApi;
import de.physiscspete.fullstacktemplate.backend.service.NoteService;
import de.physiscspete.fullstacktemplate.model.Note;
import de.physiscspete.fullstacktemplate.model.NoteCreated;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class NoteController implements NotesApi {

    private final NoteService noteService;

    @Override
    public ResponseEntity<NoteCreated> addNewNote(Note note) {
        NoteCreated noteCreated = noteService.addNewNote(note);

        URI location = URI.create(noteCreated.getUri());

        return ResponseEntity.created(location).body(noteCreated);
    }

    @Override
    public ResponseEntity<Void> deleteNote(UUID id) {

        noteService.deleteNote(id);

        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<Note>> getNotes() {
        List<Note> notes = noteService.findAll();
        return ResponseEntity.ok(notes);
    }
}
