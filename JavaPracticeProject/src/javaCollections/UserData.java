package javaCollections;

public class UserData implements Comparable<UserData> {
	
	// Encapsulated POJO class
    // private and provide getters / setters
    private String userId;
    private String userName;
    private int age;

    // create constructor // parameterized
    public UserData(String id, String name, int userAge){
        this.userId = id;
        this.userName = name;
        this.age = userAge;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format(userId,userName,age);
    }

   @Override // Annotation == it selfless the purpose of your many
    public int compareTo(UserData user) {
        // we have overrided the implementation
        return this.userId.compareTo(user.userId);
    }
}


