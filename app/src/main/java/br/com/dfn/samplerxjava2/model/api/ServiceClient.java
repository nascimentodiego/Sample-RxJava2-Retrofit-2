package br.com.dfn.samplerxjava2.model.api;


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Domdi on 20/06/2017.
 */

public class ServiceClient {

    private static final String URL_STAR_WARS = "http://swapi.co/api/";


    private static Retrofit builderStarWars =
            new Retrofit.Builder()
                    .baseUrl(URL_STAR_WARS)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();

    public static Retrofit getBuilderRetrofit(){
        return builderStarWars;
    }
}
