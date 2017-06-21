package br.com.dfn.samplerxjava2.model.api.observable;


import br.com.dfn.samplerxjava2.model.PeopleResult;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Domdi on 20/06/2017.
 */

public class GetPeople extends GenericObservable<PeopleResult> {
    public GetPeople() {
        setFlowable(api.getPeople()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()));
    }
}
