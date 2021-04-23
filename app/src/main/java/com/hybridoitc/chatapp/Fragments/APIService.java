package com.hybridoitc.chatapp.Fragments;

import com.hybridoitc.chatapp.Notifications.MyResponse;
import com.hybridoitc.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAoe5xAMI:APA91bHAAudRUgYX08oA7hLYDFxILKmj_Pt57tIT6J6CwjWMYHXDYcpGGgJKwhletLxJF5S1l7YEzcwrZGc3FdpApvfDAbw8utLLO18GGyleEabPSJ-f7TeCcHZ2N4MxaypV3aaBKRWT"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
