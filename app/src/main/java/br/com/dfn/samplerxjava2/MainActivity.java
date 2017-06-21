package br.com.dfn.samplerxjava2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import br.com.dfn.samplerxjava2.model.PeopleResult;
import br.com.dfn.samplerxjava2.model.api.observable.GetPeople;
import io.reactivex.disposables.CompositeDisposable;

public class MainActivity extends AppCompatActivity {

    private CompositeDisposable mCompositeDisposable;
    private GetPeople getPeople;

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPeople = new GetPeople();
        mCompositeDisposable = new CompositeDisposable();

        mCompositeDisposable.add(getPeople.getObservable()
                .subscribe(this::handleResponse, this::handleError, this::handleComplete));
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        mCompositeDisposable.clear();
    }

    public void handleError(Throwable t) {
        Log.d(TAG, "error: " + t.getMessage());
    }

    private void handleResponse(PeopleResult peopleResult) {
        Log.d(TAG, "handleResponse: " + peopleResult.results.toString());
    }

    private void handleComplete() {
        Log.d(TAG, "handleComplete");
    }
}
