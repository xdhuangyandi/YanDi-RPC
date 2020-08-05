package top.huangyandi.rpc.exception;

/**
 * 序列化异常
 *
 * @author huangyandi
 */
public class SerializeException extends RuntimeException {
    public SerializeException(String msg) {
        super(msg);
    }
}
