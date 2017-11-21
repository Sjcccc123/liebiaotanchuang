package bwie.com.a1509aweek3.model;

import android.os.Handler;
import android.os.Looper;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import bwie.com.a1509aweek3.bean.OrderBean;
import bwie.com.a1509aweek3.net.Api;
import bwie.com.a1509aweek3.net.HttpUtils;
import bwie.com.a1509aweek3.net.OnNetListener;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


public class OrderModel implements IOrderModel {
    private Handler handler = new Handler ( Looper.getMainLooper () );

    @Override
    public void getOrder(final String status, String page, final OnNetListener<OrderBean> onNetListener) {
        Map<String, String> params = new HashMap<> ();
        params.put ( "uid", "71" );
        params.put ( "status", status );
        params.put ( "page", page );
        HttpUtils.getHttpUtils ().doPost ( Api.ORDER, params, new Callback () {
            @Override
            public void onFailure(Call call, final IOException e) {
                handler.post ( new Runnable () {
                    @Override
                    public void run() {
                        onNetListener.onFailure ( e );
                    }
                } );
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body ().string ();
                final OrderBean orderBean = new Gson ().fromJson ( string, OrderBean.class );
                handler.post ( new Runnable () {
                    @Override
                    public void run() {
                        onNetListener.onSuccess ( orderBean );
                    }
                } );
            }
        } );
    }
}
