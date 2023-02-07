package org.example.model;
import java.util.*;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    void UpdateUser(User user, Fields field, String param);
    void deleteUser(List users);
    void saveFirst();
    void saveNew();

}
