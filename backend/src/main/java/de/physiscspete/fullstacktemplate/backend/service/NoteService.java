package de.physiscspete.fullstacktemplate.backend.service;

import de.physiscspete.fullstacktemplate.model.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {

    public List<Note> findAll() {
        return new ArrayList<>();
    }
}
