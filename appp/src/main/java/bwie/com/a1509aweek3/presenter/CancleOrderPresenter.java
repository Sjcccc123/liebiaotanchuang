package bwie.com.a1509aweek3.presenter;

import bwie.com.a1509aweek3.model.CancleOrderModel;
import bwie.com.a1509aweek3.net.OnNetListener;


public class CancleOrderPresenter {
    private CancleOrderModel cancleOrderModel;

    public CancleOrderPresenter() {
        this.cancleOrderModel = new CancleOrderModel ();
    }


    public void cancleOrder(String status, String orderId) {
        cancleOrderModel.cancleOrder ( status, orderId, new OnNetListener () {
            @Override
            public void onSuccess(Object o) {

            }

            @Override
            public void onFailure(Exception e) {

            }
        } );
    }
}
