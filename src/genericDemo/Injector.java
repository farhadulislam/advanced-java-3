package genericDemo;

import java.lang.reflect.Constructor;
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

        try {
            Constructor<?>[] constructors = type.getConstructors();
            if (constructors.length !=1){

            }
        } catch (Exception e) {

        }


    }
    public Object newInstance(final Class<?> className){return null; }
}
