package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**  @Controller: 创建控制器（处理器）对象
 *  控制器：叫做后端控制器（back controller），自定义的类处理请求的。
 *  位置：在类的上面，表示创建此类的对象，对象放在springmvc的容器中
 *
 */
@Controller
public class MyController {
    /*
        Springmvc框架使用 ,使用控制器类中的方法，处理请求
        方法的特点： 1.方法的形参，表示请求中的参数   2.方法的返回值，表示本次请求的处理请求
     */

    /**
     * @RequestMapping ：请求映射
     *  属性：value 请求中的uri地址，唯一值，以"/"开头
     *  位置：1.在方法上面（必须） 2.在类定义的上面（可选）
     *  作用：指定的请求，交给指定的方法处理，等同于url-pattern（个人理解 相当于可以做doget相关的操作）
     *  返回值ModelAndView：表示本次请求的处理结果（数据和视图） model：表示数据   view：表示视图
     */
    //可以在一个类中定义多个方法使用多个@RequestMapping注解
    @RequestMapping(value = {"/some.do","/first.do"})  //value是一个数组，可以有多个值，相当于将该方法起一个名字
    public ModelAndView doSome(){  //doGet()
        //使用这个方法处理请求，能够处理请求的方法叫做控制器方法
        //调用service对象，处理请求，返回数据
        ModelAndView mv=new ModelAndView();
        //添加数据
        mv.addObject("msg","在ModelAddView中处理了some.do的请求");
        mv.addObject("fun","执行了dosome的方法");
        //指定视图，setviewName("视图路径")  相当于请求转发request.getRequestDis...("/show.jsp").forward(..)
//        mv.setViewName("/WEB-INF/view/show.jsp");
        //当配置了视图解析器，使用文件名称作为视图名使用，叫做视图逻辑名称
        //使用了逻辑名称，框架使用配置文件中视图解析器的前缀和后缀，拼接为完整地视图路径 ，例如/WEB-INF/view/ + show + .jsp
        mv.setViewName("show");


        /*
        当框架调用完dosome方法后，得到返回中modelandview  框架会在后续的处理逻辑值，处理mv对象里的数据和视图
        对数据执行requert，setAttribute(“msg”，“处理了some.do请求”)；把数据放到request作用域中
        对视图进行转发操作
         */
        return  mv;
    }
}
