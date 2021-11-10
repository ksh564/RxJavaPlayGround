import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.functions.Action;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {

        Movable movable = str -> System.out.println("go" + str);
        movable.move("move");


    }
}
