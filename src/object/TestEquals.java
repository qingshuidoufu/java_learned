package object;

import java.util.Objects;

public class TestEquals {
    public static void main (String[] args){
        Object obj;
        String str;

    User u1=new User(1000,"marry","123456");
    User u2=new User (1000,"jack","123456");
    System.out.println(u1==u2);
    System.out.println(u1.equals(u2));
    String str1=new String("sxt");
    String str2=new String("sxt");
    System.out.println(str1==str2);
    System.out.println(str1.equals(str2));

    }

}
class User {
    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    int id;
    String name;
    String pwd;

}