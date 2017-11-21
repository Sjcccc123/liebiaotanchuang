package bwie.com.a1509aweek3.model;

import bwie.com.a1509aweek3.bean.OrderBean;
import bwie.com.a1509aweek3.net.OnNetListener;


public interface IOrderModel {
    public void getOrder(String status, String page, OnNetListener<OrderBean> onNetListener);
}
