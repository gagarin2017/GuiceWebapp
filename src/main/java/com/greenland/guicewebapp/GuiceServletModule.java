package com.greenland.guicewebapp;

import com.google.inject.servlet.ServletModule;

class GuiceServletModule extends ServletModule {

  @Override
  protected void configureServlets() {
    serve("/").with(HelloServlet.class);

    bind(HelloService.class).to(HelloServiceImpl.class);
  }

}
