package genericDemo;

import java.util.HashMap;
import java.util.Map;

public class Injector {

    private Map<Class<?>, Object> objectGraph = new HashMap<>();

    public Injector with(Object value){
        objectGraph.put(value.getClass(), value);
        return this;
    }
    public <T> T newInstance(final Class<T> type){
        return (T) objectGraph.computeIfAbsent(type, this ::instantiate);
    }

    public Object instantiate(Class<?> type){


    }
    public Object newInstance(final Class<?> className){return null; }
}
