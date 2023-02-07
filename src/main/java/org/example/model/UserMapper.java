package org.example.model;

import java.util.*;
public class UserMapper {
    public String map(User user) {
        return String.format("%s; %s; %s; %s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public String mapFirst(User user) {
        return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());

    }

    public User map(String line) {
        if (line.contains("; ")) {
            String[] lines = line.split("; ");
            return new User(lines[0], lines[1], lines[2], lines[3]);
        }
        else{
            String[] lines = line.split(",");
            return new User(lines[0], lines[1], lines[2], lines[3]);
        }
    }

    public String mapNew(User user) {
        return String.format("%s!,%s!,%s!,%s!", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }
}
