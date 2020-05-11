package cn.randy.chin.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author HSY
 */
@WebService(
        /*  暴露服务名称，可省略，默认为接口类名   */
        name = "DemoService",
        /*  命名空间，不可省略，一般是接口的包名倒序 */
        targetNamespace = "http://service.webservice.chin.randy.cn")
public interface DemoService {
    /**
     * 发送hello，@WebMethod可省略
     * @param msg   消息
     * @return  String
     */
    @WebMethod
    String sayHello(String msg);
}
