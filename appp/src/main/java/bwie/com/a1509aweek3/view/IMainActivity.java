package bwie.com.a1509aweek3.view;

import java.util.List;

import bwie.com.a1509aweek3.bean.OrderBean;


public interface IMainActivity {
    public void showData(boolean isRefresh, List<OrderBean.DataBean> list);
}
