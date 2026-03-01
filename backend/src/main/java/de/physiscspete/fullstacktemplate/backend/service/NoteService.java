package de.physiscspete.fullstacktemplate.backend.service;

import de.physiscspete.fullstacktemplate.model.Note;
import de.physiscspete.fullstacktemplate.model.NoteCreated;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NoteService {

    public List<Note> findAll() {
        return new ArrayList<>();
    }

    public NoteCreated addNewNote(Note note) {
        return new NoteCreated("http://localhost:8080/notes/a-b-c-d");
    }

    public void deleteNote(UUID id) {
    }
}
