package br.com.dfn.samplerxjava2.model.api.observable;


import br.com.dfn.samplerxjava2.model.api.ServiceClient;
import br.com.dfn.samplerxjava2.model.api.StartWarsApi;
import io.reactivex.Observable;

/**
 * Created by Domdi on 20/06/2017.
 */

public abstract class GenericObservable<T> {
    protected StartWarsApi api;
    protected Observable<T> observable;

    public GenericObservable() {
        this.api = ServiceClient.getBuilderRetrofit().create(StartWarsApi.class);
    }

    public Observable<T> getObservable() {
        return this.observable;
    }
}
