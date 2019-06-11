package br.com.grupodimed.java11.readingwritingstringfiles;

public class Pessoa {

    private String name;
    private String club;
    private Integer age;

    public Pessoa(String name, String club, Integer age) {
        this.name = name;
        this.club = club;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", club='" + club + '\'' +
                ", age=" + age +
                '}';
    }
}
