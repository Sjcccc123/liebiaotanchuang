package bwie.com.a1509aweek3.net;

/**
 * 网络请求回调接口
 */

public interface OnNetListener<T> {
    //成功回调
    public void onSuccess(T t);

    //失败回调
    public void onFailure(Exception e);
}
