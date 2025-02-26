package com.blogApp.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name="userName")
  private String userName;

  @Column(name = "interest")
    private List<String> interest;

  public User(){}

  public User(Long id,String name,String userName,List<String> interest){
    this.name=name;
    this.id=id;
    this.userName=userName;
    this.interest=interest;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<String> getInterest() {
    return interest;
  }

  public void setInterest(List<String> interest) {
    this.interest = interest;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
