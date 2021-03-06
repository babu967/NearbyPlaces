package com.babu.nearbyplaces;

import com.babu.nearbyplaces.Model.Results;
import com.babu.nearbyplaces.Remote.IGoogleAPIService;
import com.babu.nearbyplaces.Remote.RetrofitClient;

public class Common {
    private static  final String GOOGLE_API_URL="https://maps.googleapis.com/";
    public static Results currentResult;


    public static IGoogleAPIService getGoogleAPIService(){

        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
