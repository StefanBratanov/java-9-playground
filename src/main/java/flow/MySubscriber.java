package flow;

import java.util.concurrent.Flow;

class MySubscriber implements Flow.Subscriber<String> {

    @Override
    public void onNext(String item) {
        System.out.println("Item received: " + item);
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
