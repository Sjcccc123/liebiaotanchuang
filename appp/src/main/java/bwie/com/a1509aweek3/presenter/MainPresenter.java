package bwie.com.a1509aweek3.presenter;

import bwie.com.a1509aweek3.bean.OrderBean;
import bwie.com.a1509aweek3.model.OrderModel;
import bwie.com.a1509aweek3.net.OnNetListener;
import bwie.com.a1509aweek3.view.IMainActivity;


public class MainPresenter {
    private OrderModel orderModel;
    private IMainActivity iMainActivity;

    public MainPresenter(IMainActivity iMainActivity) {
        orderModel = new OrderModel ();
        this.iMainActivity = iMainActivity;
    }

    public void getOrder(final boolean isRefresh, String status, String page) {
        orderModel.getOrder ( status, page, new OnNetListener<OrderBean> () {
            @Override
            public void onSuccess(OrderBean orderBean) {
                iMainActivity.showData ( isRefresh, orderBean.getData () );
            }

            @Override
            public void onFailure(Exception e) {

            }
        } );
    }

    public void dettach() {
        if (iMainActivity != null) {
            iMainActivity = null;
        }
    }
}
