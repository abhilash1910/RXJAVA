package com.example.user.rxjava;

import android.arch.lifecycle.Observer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Observable;

import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {
private TextView textv;
private io.reactivex.Observable<String> mobservable;
private io.reactivex.Observer<String> mobserver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textv=(TextView)findViewById(R.id.textview);
        mobservable = io.reactivex.Observable.just("Hello from RX android..");
        mobserver =new io.reactivex.Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                textv.setText(s);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }



    public void subscribebtn(View view)
    {

     mobservable.subscribe(mobserver);

    }
}
