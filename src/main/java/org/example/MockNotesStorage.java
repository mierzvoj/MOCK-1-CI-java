package org.example;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class MockNotesStorage implements NotesService, NotesStorage {

    List<Note> list = new ArrayList<>();

//    public MockNotesStorage(NotesStorage storageService) {
//    }

//    public static MockNotesStorage createWith(final NotesStorage storageService) {
//        return new MockNotesStorage(storageService);
//    }
//
//    Note note;

    @Override
    public void add(Note note) {

        list.add(note);

    }

    @Override
    public List<Note> getAllNotesOf(String name) {
        return list;
    }

    @Override
    public float averageOf(String name) {
        float sum = 0.0f;
        final Collection<Note> notes = list;
        for (final Note note : notes) {
            if (list.contains(name)) {
                sum += note.getNote();
            }

        }
        return sum / notes.size();
    }


    @Override
    public void clear() {

        list.clear();


    }


}
