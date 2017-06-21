package br.com.dfn.samplerxjava2.model.api.observable;


import br.com.dfn.samplerxjava2.model.api.ServiceClient;
import br.com.dfn.samplerxjava2.model.api.StartWarsApi;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/**
 * Created by Domdi on 20/06/2017.
 */

public abstract class GenericObservable<T> {
    protected StartWarsApi api;
    protected Observable<T> observable;
    protected Flowable<T> flowable;

    public GenericObservable() {
        this.api = ServiceClient.getBuilderRetrofit().create(StartWarsApi.class);
    }

    public Observable<T> getObservable() {
        return this.observable;
    }

    public Flowable<T> getFlowable() {
        return this.flowable;
    }

    public void setObservable(Observable<T> observable) {
        this.observable = observable;
    }

    public void setFlowable(Flowable<T> flowable) {
        this.flowable = flowable;
    }
}
