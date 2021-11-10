import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import java.lang.IllegalStateException
import java.util.*

fun main(){

    Observable.just("Hello?", "RxJava")
        .map { it.dropLast(1) }
        .subscribe(::println)

    val observer = object : Observer<Int> {
        override fun onSubscribe(d: Disposable) {
            TODO("Not yet implemented")
        }

        override fun onNext(t: Int) {
            TODO("Not yet implemented")
        }

        override fun onError(e: Throwable) {
            TODO("Not yet implemented")
        }

        override fun onComplete() {
            TODO("Not yet implemented")
        }
    }

    val disposable : Disposable = Observable.just(1,2,3,4)
        .subscribe({ println("onNext $it") }, // onNext: Consumer
            { println("onError") }, // onError: Consumer
            { println("onComplete") })
        disposable.dispose()

    val observer2 = Observable.just(11,12,13)
        .map { if (it == 12) throw IllegalStateException()
        else it
        }
    observer2.subscribe({ println("onNext $it")},{ println("onError")}, {println("onComplete")})

}