package com.babu.nearbyplaces.Remote;

import com.babu.nearbyplaces.Model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleAPIService {
    @GET
    Call<MyPlaces> getNearByPlaces (@Url String Url);
}
