package com.example.unicornpestcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import zendesk.core.AnonymousIdentity;
import zendesk.core.Identity;
import zendesk.core.Zendesk;
import zendesk.support.Support;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Zendesk.INSTANCE.init(this, "https://corla.zendesk.com",
                "84f5cb261bdcc56e01b251347f417226ca5185b3899293ce",
                "mobile_sdk_client_d0e8daf84ca791ce36c3");

        Identity identity = new AnonymousIdentity();
        Zendesk.INSTANCE.setIdentity(identity);

        Support.INSTANCE.init(Zendesk.INSTANCE);

    }
}
