package com.practice1.demo1.user;

import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDAOService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;
    static {
        users.add(new User(1, "Kenneth", new Date(), "test1", "990929-11111111"));
        users.add(new User(2, "Alice", new Date(), "test2", "891011-11111111"));
        users.add(new User(3, "Bob", new Date(), "test3", "770120-2222222"));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId()==null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for(User user: users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getId()==id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }


}
