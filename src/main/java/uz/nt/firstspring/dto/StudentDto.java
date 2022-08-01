package uz.nt.firstspring.dto;

import ch.qos.logback.core.util.InvocationGate;

public class StudentDto {
    private Integer id;
    private Integer age;
    private String name;
    private String birthDate;
    private String course;

    public Integer getId (){
        return id;
    }
    public Integer getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public String getCourse(){
        return course;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setId(){
        this.id = id;
    }

}