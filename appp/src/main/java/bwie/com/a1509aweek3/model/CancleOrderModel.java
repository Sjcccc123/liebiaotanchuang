package bwie.com.a1509aweek3.model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import bwie.com.a1509aweek3.net.Api;
import bwie.com.a1509aweek3.net.HttpUtils;
import bwie.com.a1509aweek3.net.OnNetListener;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


public class CancleOrderModel {

    public void cancleOrder(String status, String orderId, OnNetListener onNetListener) {
        Map<String, String> params = new HashMap<> ();
        params.put ( "uid", "71" );
        params.put ( "orderId", orderId );
        params.put ( "status", status );
        HttpUtils.getHttpUtils ().doPost ( Api.CANCLE_ORDER, params, new Callback () {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

            }
        } );
    }
}
