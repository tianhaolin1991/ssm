package cn.itcast.exception;

public class SysException extends Exception {


    public SysException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
