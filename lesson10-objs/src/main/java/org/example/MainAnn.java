package org.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MainAnn {

    public static void main(String[] args) throws Exception {

        PrintService service = new PrintService();

        NewService newService = new NewService();

        var aClass = newService.getClass();

        Method[] declaredMethods = aClass.getDeclaredMethods();

        for (var method : declaredMethods) {

            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();

            if (declaredAnnotations.length > 0) {

                for (var annotation : declaredAnnotations) {

                    if (annotation instanceof RunMe runMeAnn) {

                        int count = runMeAnn.count();

                        for (int i = 0; i < count; i++) {
                            method.invoke(newService);
                        }

                    }

                }

            }


        }


    }

}
