package com.vignesh.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class HomeController {
  @RequestMapping("/")
  public String home() {
    System.out.println("Home method called");
    return "index.jsp";
  }

  @RequestMapping("add")
  public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b, ModelAndView mv) {
    int result = a + b;
    mv.addObject("result", result);
    mv.setViewName("result.jsp");
    return mv;
  }

  // @RequestMapping("addAlien")
  // public ModelAndView add(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {
  //   Alien alien = new Alien();
  //   mv.addObject(alien);
  //   mv.setViewName("result.jsp");
  //   return mv;
  // }
  
  @RequestMapping("addAlien")
  public ModelAndView add(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {
    Alien alien = new Alien();
    mv.addObject(alien);
    mv.setViewName("result.jsp");
    return mv;
  }
}
