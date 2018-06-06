/*
 * Copyright (c) 2017. André Mion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.asepsulaeman.asulefab.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioGroup;

import com.asepsulaeman.asulefab.AsuleFab;

public class MainActivity extends AppCompatActivity {

    private AsuleFab mCounterFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mCounterFab = findViewById(R.id.fab);
        mCounterFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AsuleFab fab_ = (AsuleFab)view;

                if( fab_.getNotification().isEmpty() ){
                    fab_.setNotification("*");
                }
                else{
                    fab_.setNotification("");
                }
            }
        });
    }

}
