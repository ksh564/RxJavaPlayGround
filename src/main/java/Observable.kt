import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

fun main(){
    Single.just(1)
        .subscribe({ println("onSuccess $it")},{ println("onError")})
    Completable.complete()
        .subscribe({ println("onError")},{ println("oncomplete")})

    Observable.range(1,10000)
        .doOnNext { println("Emit Data: $it") }
        .observeOn(Schedulers.io())
        .subscribe{println("Consume Data : $it")
            Thread.sleep(100)}
    Thread.sleep((100*10000).toLong())

}