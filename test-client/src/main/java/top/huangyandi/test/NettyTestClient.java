package top.huangyandi.test;

import top.huangyandi.rpc.api.ByeService;
import top.huangyandi.rpc.api.HelloObject;
import top.huangyandi.rpc.api.HelloService;
import top.huangyandi.rpc.serializer.CommonSerializer;
import top.huangyandi.rpc.transport.RpcClient;
import top.huangyandi.rpc.transport.RpcClientProxy;
import top.huangyandi.rpc.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 *
 * @author huangyandi
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
