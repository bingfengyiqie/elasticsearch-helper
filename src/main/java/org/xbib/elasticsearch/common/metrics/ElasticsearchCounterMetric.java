package org.xbib.elasticsearch.common.metrics;

import org.elasticsearch.common.util.concurrent.jsr166e.LongAdder;
import org.xbib.metrics.CounterMetric;

public class ElasticsearchCounterMetric implements CounterMetric {

    private final LongAdder counter = new LongAdder();

    public void inc() {
        counter.increment();
    }

    public void inc(long n) {
        counter.add(n);
    }

    public void dec() {
        counter.decrement();
    }

    public void dec(long n) {
        counter.add(-n);
    }

    public long count() {
        return counter.sum();
    }
}