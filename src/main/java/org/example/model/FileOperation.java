package org.example.model;

import java.util.*;

public interface FileOperation {
    List<String> readAllLines();
    void saveAllLines(List<String> lines);
}
