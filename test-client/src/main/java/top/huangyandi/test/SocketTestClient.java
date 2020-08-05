package top.huangyandi.test;

import top.huangyandi.rpc.api.ByeService;
import top.huangyandi.rpc.api.HelloObject;
import top.huangyandi.rpc.api.HelloService;
import top.huangyandi.rpc.serializer.CommonSerializer;
import top.huangyandi.rpc.transport.RpcClientProxy;
import top.huangyandi.rpc.transport.socket.client.SocketClient;

/**
 * 测试用消费者（客户端）
 *
 * @author huangyandi
 */
public class SocketTestClient {

    public static void main(String[] args) {
        SocketClient client = new SocketClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = proxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
