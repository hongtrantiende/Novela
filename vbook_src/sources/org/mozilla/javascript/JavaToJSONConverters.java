package org.mozilla.javascript;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.function.UnaryOperator;
import org.mozilla.javascript.JavaToJSONConverters;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class JavaToJSONConverters {
    public static final UnaryOperator<Object> STRING = new UnaryOperator() { // from class: o26
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Object obj2;
            Object lambda$static$1;
            Object lambda$static$2;
            Object lambda$static$3;
            Object lambda$static$4;
            switch (r1) {
                case 0:
                    obj2 = obj.toString();
                    return obj2;
                case 1:
                    lambda$static$1 = JavaToJSONConverters.lambda$static$1(obj);
                    return lambda$static$1;
                case 2:
                    lambda$static$2 = JavaToJSONConverters.lambda$static$2(obj);
                    return lambda$static$2;
                case 3:
                    lambda$static$3 = JavaToJSONConverters.lambda$static$3(obj);
                    return lambda$static$3;
                default:
                    lambda$static$4 = JavaToJSONConverters.lambda$static$4(obj);
                    return lambda$static$4;
            }
        }
    };
    public static final UnaryOperator<Object> UNDEFINED = new UnaryOperator() { // from class: o26
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Object obj2;
            Object lambda$static$1;
            Object lambda$static$2;
            Object lambda$static$3;
            Object lambda$static$4;
            switch (r1) {
                case 0:
                    obj2 = obj.toString();
                    return obj2;
                case 1:
                    lambda$static$1 = JavaToJSONConverters.lambda$static$1(obj);
                    return lambda$static$1;
                case 2:
                    lambda$static$2 = JavaToJSONConverters.lambda$static$2(obj);
                    return lambda$static$2;
                case 3:
                    lambda$static$3 = JavaToJSONConverters.lambda$static$3(obj);
                    return lambda$static$3;
                default:
                    lambda$static$4 = JavaToJSONConverters.lambda$static$4(obj);
                    return lambda$static$4;
            }
        }
    };
    public static final UnaryOperator<Object> EMPTY_OBJECT = new UnaryOperator() { // from class: o26
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Object obj2;
            Object lambda$static$1;
            Object lambda$static$2;
            Object lambda$static$3;
            Object lambda$static$4;
            switch (r1) {
                case 0:
                    obj2 = obj.toString();
                    return obj2;
                case 1:
                    lambda$static$1 = JavaToJSONConverters.lambda$static$1(obj);
                    return lambda$static$1;
                case 2:
                    lambda$static$2 = JavaToJSONConverters.lambda$static$2(obj);
                    return lambda$static$2;
                case 3:
                    lambda$static$3 = JavaToJSONConverters.lambda$static$3(obj);
                    return lambda$static$3;
                default:
                    lambda$static$4 = JavaToJSONConverters.lambda$static$4(obj);
                    return lambda$static$4;
            }
        }
    };
    public static final UnaryOperator<Object> THROW_TYPE_ERROR = new UnaryOperator() { // from class: o26
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Object obj2;
            Object lambda$static$1;
            Object lambda$static$2;
            Object lambda$static$3;
            Object lambda$static$4;
            switch (r1) {
                case 0:
                    obj2 = obj.toString();
                    return obj2;
                case 1:
                    lambda$static$1 = JavaToJSONConverters.lambda$static$1(obj);
                    return lambda$static$1;
                case 2:
                    lambda$static$2 = JavaToJSONConverters.lambda$static$2(obj);
                    return lambda$static$2;
                case 3:
                    lambda$static$3 = JavaToJSONConverters.lambda$static$3(obj);
                    return lambda$static$3;
                default:
                    lambda$static$4 = JavaToJSONConverters.lambda$static$4(obj);
                    return lambda$static$4;
            }
        }
    };
    public static final UnaryOperator<Object> BEAN = new UnaryOperator() { // from class: o26
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Object obj2;
            Object lambda$static$1;
            Object lambda$static$2;
            Object lambda$static$3;
            Object lambda$static$4;
            switch (r1) {
                case 0:
                    obj2 = obj.toString();
                    return obj2;
                case 1:
                    lambda$static$1 = JavaToJSONConverters.lambda$static$1(obj);
                    return lambda$static$1;
                case 2:
                    lambda$static$2 = JavaToJSONConverters.lambda$static$2(obj);
                    return lambda$static$2;
                case 3:
                    lambda$static$3 = JavaToJSONConverters.lambda$static$3(obj);
                    return lambda$static$3;
                default:
                    lambda$static$4 = JavaToJSONConverters.lambda$static$4(obj);
                    return lambda$static$4;
            }
        }
    };

    private JavaToJSONConverters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$1(Object obj) {
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$2(Object obj) {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$3(Object obj) {
        throw ScriptRuntime.typeErrorById("msg.json.cant.serialize", obj.getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$4(Object obj) {
        PropertyDescriptor[] propertyDescriptors;
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass(), Object.class);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
                if (propertyDescriptor.getReadMethod() != null) {
                    try {
                        linkedHashMap.put(propertyDescriptor.getName(), propertyDescriptor.getReadMethod().invoke(obj, null));
                    } catch (Exception unused) {
                    }
                }
            }
            if (linkedHashMap.size() == 0) {
                return null;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("beanClass", beanInfo.getBeanDescriptor().getBeanClass().getName());
            linkedHashMap2.put("properties", linkedHashMap);
            return linkedHashMap2;
        } catch (IntrospectionException unused2) {
            return null;
        }
    }
}
