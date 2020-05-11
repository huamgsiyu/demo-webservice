package cn.randy.chin.webservice.service.impl;

import cn.randy.chin.webservice.service.DemoService;

import javax.jws.WebService;

/**
 * @author HSY
 */
@WebService(
        /*  与接口中指定的name一致  */
        serviceName = "DemoService",
        /*  与接口中的命名空间一致,一般是接口的包名倒  */
        targetNamespace = "http://service.webservice.chin.randy.cn",
        /*  接口地址  */
        endpointInterface = "cn.randy.chin.webservice.service.DemoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String msg) {
        System.out.println("receive msg: " + msg);
        return msg;
    }
}