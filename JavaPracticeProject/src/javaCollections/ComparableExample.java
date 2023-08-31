package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	//Api which returns all USER data ordered by name / userid/ and in ascending order.
    public static void main(String[] args){

        // create user data/ more than one data
        List<UserData> userList = new ArrayList<>();

        userList.add(new UserData("5","Deepali",20));
        userList.add(new UserData("2","Shweta",21));
        userList.add(new UserData("1","Poonam",22));
        userList.add(new UserData("3","Rupali",21));
        userList.add(new UserData("4","Radhika",19));

        // API create fetch data
        Collections.sort(userList);
        // lambda expressions
        userList.forEach(user -> System.out.println(user.toString()));
    }
	
}
