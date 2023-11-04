package fa.training.main;

import fa.training.customannotation.AnnotationMarker;
import fa.training.customannotation.MyMarker;

import java.lang.reflect.Method;

public class TestAnnotationReflection {
    public static void main(String[] args) {
        AnnotationMarker runner = new AnnotationMarker();
        Method[] methods = runner.getClass().getMethods();

        for (Method method : methods) {
            MyMarker myMarker = method.getAnnotation(MyMarker.class);
            if (myMarker != null) {
                try {
                    method.invoke(runner);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
