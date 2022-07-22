package com.xxxx.seckill.controller;


import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.rabbitmq.MQSender;
import com.xxxx.seckill.vo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 */


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private MQSender mqSender;

    @RequestMapping("/info")
    @ResponseBody
    public RespBean info(User user){
        return RespBean.success(user);
    }

    //test sending rabbit mq message
    @RequestMapping("/mq")
    @ResponseBody
    public void mq(){
        mqSender.send("Hello");
    }

    @RequestMapping("/mq/fanout")
    @ResponseBody
    public void mq01(){
        mqSender.send("Hello fanout");
    }

    @RequestMapping(value = "/mq/direct01", method = RequestMethod.GET)
    @ResponseBody
    public void mqDirect01() {
        mqSender.send01("Hello Red");
    }

    @RequestMapping(value = "/mq/direct02", method = RequestMethod.GET)
    @ResponseBody
    public void mqDirect02() {
        mqSender.send02("Hello Green");
    }

    @RequestMapping(value = "/mq/topic01", method = RequestMethod.GET)
    @ResponseBody
    public void mqtopic01() {
        mqSender.send03("Hello Red");
    }

    @RequestMapping(value = "/mq/topic02", method = RequestMethod.GET)
    @ResponseBody
    public void mqtopic02() {
        mqSender.send04("Hello Green");
    }

    @RequestMapping(value = "/mq/header01", method = RequestMethod.GET)
    @ResponseBody
    public void header01() {
        mqSender.send05("Hello 01");
    }

    @RequestMapping(value = "/mq/header02", method = RequestMethod.GET)
    @ResponseBody
    public void header02() {
        mqSender.send06("Hello 02");
    }

}
