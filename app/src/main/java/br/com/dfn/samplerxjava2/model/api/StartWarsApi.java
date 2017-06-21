package br.com.dfn.samplerxjava2.model.api;

import br.com.dfn.samplerxjava2.model.Movie;
import br.com.dfn.samplerxjava2.model.PeopleResult;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Domdi on 20/06/2017.
 */

public interface StartWarsApi {

    @GET("people")
    Observable<PeopleResult> getPeople();

    @GET("films/{pathId}")
    Observable<Movie> getMovie(@Path("pathId") String idMovie);
}
