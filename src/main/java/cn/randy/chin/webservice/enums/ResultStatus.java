package cn.randy.chin.webservice.enums;

/**
 * ResultStatus
 *
 * @author HSY
 * @since 2020/05/08 10:35
 */
public enum ResultStatus {

    /**
     *  成功
     */
    SUCCESS(0, "成功"),
    /**
     *  请求信息不存在
     */
    FAILD(-2, "请求信息不存在"),
    /**
     *  系统异常
     */
    EXCEPTION(-1, "系统异常"),
    /**
     *  deleted
     */
    DEL_SUCCESS(1, "deleted"),
    /**
     *  not_found
     */
    NOT_FOUND(-3, "not_found"),
    /**
     *  系统错误
     */
    SYSTEM_ERROR(10001, "系统错误");


    private int code;
    private String message;

    private ResultStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return this.name();
    }

    public String getOutputName() {
        return this.name();
    }

    @Override
    public String toString() {
        return this.getName();
    }

    private ResultStatus(Object... args) {
        this.message = String.format(this.message, args);
    }
}
