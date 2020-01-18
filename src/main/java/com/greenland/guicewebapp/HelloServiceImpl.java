package com.greenland.guicewebapp;

public class HelloServiceImpl implements HelloService{

  @Override
  public String echo() {
    return "Hello World!";
  }

}
