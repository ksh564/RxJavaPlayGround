import io.reactivex.Single
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.MaybeOnSubscribe

fun main(){

    Maybe.empty<Unit>()
        .subscribe({ println("onsuccess $it")}, {"onError"},{"onComplete"})


}