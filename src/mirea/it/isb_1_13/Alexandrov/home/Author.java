package mirea.it.isb_1_13.Alexandrov.home;

/**
 * Created by Степан on 11.03.2015.
 */
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        String s="";
        if (gender == 'U') {
            s = " (unknown) ";
        } else if (gender == 'M') {
            s = " (m) ";
        }else if (gender == 'F') {
            s = " (ms) ";
        }
        return name + s + "at " + email;
    }
}
