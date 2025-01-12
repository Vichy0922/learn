package edu.hubu.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import edu.hubu.learn.entity.Music;
import edu.hubu.learn.service.MusicService;

@Controller
@RequestMapping("/")
public class IndexController {

   

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

   
    @Autowired
    private MusicService musicService;

    @RequestMapping("/music")
    public ModelAndView music() {
        ModelAndView mav = new ModelAndView();
        Music music = musicService.getMusic(1l);
        mav.addObject("music", music);
        mav.setViewName("user");
        return mav;
    }
}