package cn.randy.chin.webservice.result;

import cn.randy.chin.webservice.enums.ResultStatus;

import java.io.Serializable;

/**
 * ResultResponseInfo
 *
 * @author HSY
 * @since 2020/05/08 10:35
 */
public class ResultResponseInfo<T> extends AbstractResult implements Serializable {
    private T data;
    private Long count;
    public ResultResponseInfo() {    }
    private ResultResponseInfo(ResultStatus status, String message) {
        super(status, message);
    }
    private ResultResponseInfo(ResultStatus status) {
        super(status);
    }
    public static <T> ResultResponseInfo<T> build() {
        return new ResultResponseInfo(ResultStatus.SUCCESS, (String)null);
    }

    public static <T> ResultResponseInfo<T> build(String message) {
        return new ResultResponseInfo(ResultStatus.SUCCESS, message);
    }

    public static <T> ResultResponseInfo<T> error(ResultStatus status) {
        return new ResultResponseInfo<T>(status);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void success(T value) {
        this.success();
        this.data = value;
        this.count = 0L;
    }
}
