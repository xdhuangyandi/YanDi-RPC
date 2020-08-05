package top.huangyandi.rpc.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author huangyandi
 */
@AllArgsConstructor
@Getter
public enum PackageType {

    REQUEST_PACK(0),
    RESPONSE_PACK(1);

    private final int code;

}
