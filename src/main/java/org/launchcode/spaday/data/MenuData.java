package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MenuData {
    // need a place to put events
    private final static Map<Integer, User>users=new HashMap<>();
    // get all events
    public static Collection<User> getAll(){
        return users.values();
    }
    // get a single event
    public static  User getById(int id){
        return users.get(id);
    }
    // add an event
    public  static void add(User user){
        users.put(user.getId(), user);

    }

    // remove an event
    public static void remove(int id){
        users.remove(id);
    }

}
