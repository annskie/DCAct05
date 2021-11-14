package com.example.inventory_dcmidterm.api;

import com.example.inventory_dcmidterm.pojos.Login;

import  retrofit2.Call;
import retrofit2.http.Body;
import  retrofit2.http.POST;

public interface RequestPlaceholder {

    @POST("Login")
    Call<Login> login(@Body Login Login);
    }


