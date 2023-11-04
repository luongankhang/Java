package fa.training.main;

import fa.training.customannotation.MyAnnotation;
import fa.training.customannotation.MyAnnotationApply;

import java.lang.reflect.Method;

public class TestMyAnnotation {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        MyAnnotationApply myAnnotationApply = new MyAnnotationApply();
        Method method = myAnnotationApply.getClass().getMethod("greeting");
        MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
        System.out.println("value:::" + myAnnotation.value());
    }
}
