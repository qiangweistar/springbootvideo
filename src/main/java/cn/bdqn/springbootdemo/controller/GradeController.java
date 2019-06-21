package cn.bdqn.springbootdemo.controller;


import cn.bdqn.springbootdemo.entity.Grade;
import cn.bdqn.springbootdemo.entity.Video;
import cn.bdqn.springbootdemo.service.GradeService;
import cn.bdqn.springbootdemo.service.VideoService;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/index")
public class GradeController extends SpringBootServletInitializer {

    @Resource
    private GradeService gradeService;
    @Resource
    private VideoService videoService;


    @RequestMapping("/grade")
   // @ResponseBody
    public ModelAndView  list(ModelAndView modelAndView){
        List<Grade> list = gradeService.findGrade();
        modelAndView.setViewName("gradelist");
        modelAndView.addObject("list",list);
        return  modelAndView;
    }

    @RequestMapping("main")
    public String index(){

        return "information";


    }
    @RequestMapping("reg")
    public  String  register(){
        return "register";
    }

    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("course")
    public  String course(){
        return "course";
    }

    @RequestMapping("info")
    public ModelAndView information(ModelAndView modelAndView){
        List<Video> list  = videoService.getList();
        modelAndView.setViewName("information");
        modelAndView.addObject("list",list);

        return modelAndView;
    }
    @RequestMapping("play")
    public  String play(){
        return "play";
    }
    //课程分类展示页  视频播放页   tc/admin上传视频页
    @RequestMapping("upload")
    public  String upload(){
        return "upload";
    }
}
