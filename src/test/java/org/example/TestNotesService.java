package org.example;

import org.example.MockNotesStorage;
import org.example.Note;
import org.example.NotesStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestNotesService {
    NotesStorage notesService;
    Note note1 = new Note("name1", 3.44f);

    Note note2 = new Note("name1", 3.78f);
    MockNotesStorage storage = new MockNotesStorage();

    @BeforeEach
    public void setUp() {

        storage.add(note1);
        storage.add(note2);

    }

    @Test
    public void testStorageStringContent_1() {
        boolean noteExists = storage.getAllNotesOf("name1").isEmpty();
        assertFalse(noteExists);
    }


    @Test
    public void testStorageFloatContent() {

        float avg = storage.averageOf("name1");
        assertEquals(3.61f, 3.609999895095825);
    }

    @Test
    public void testStorageClearContent() {
        storage.clear();
        assertTrue(storage.list.isEmpty());
    }

}
