package com.fmi.store.Services;

import com.fmi.store.model.User;

import javax.jws.soap.SOAPBinding;

public class UserService {

    private static final User listOfUsers[]=new User[4];

    private UserService(){
        listOfUsers[0] = new User(1, "Ioana", "password");
        listOfUsers[1] = new User(2, "Adelin", "password");
        listOfUsers[2] = new User(3, "Marcu", "password");
        listOfUsers[3] = new User(4, "Doru", "password");
    }

    private static final UserService instance = new UserService();

    public static UserService getInstance() {
        return instance;
    }

    public static User getOne(String username){
        for (User user : listOfUsers) {
            if (user.getUsername().equals(username))
                return user;    //nu merge cu == la obiecte, ci doar la primitive!!!
            //deci folosim equals, iar daca ne facem noi un obiect implementam equals
        }
        return null;

    }

    public static User getOne(Integer userId) {
        for(User user:listOfUsers){
            if(user.getId().equals(userId))
                return user;
        }
        return null;
    }


}
