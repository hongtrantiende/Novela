package org.mozilla.javascript;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.AccessControlContext;
import java.security.AllPermission;
import java.security.Permission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.mozilla.javascript.ClassCache;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class JavaMembers {
    private static final boolean STRICT_REFLECTIVE_ACCESS = isModularJava();
    private static final Permission allPermission = new AllPermission();
    private Class<?> cl;
    NativeJavaMethod ctors;
    private Map<String, FieldAndMethods> fieldAndMethods;
    private Map<String, Object> members;
    private Map<String, FieldAndMethods> staticFieldAndMethods;
    private Map<String, Object> staticMembers;

    public JavaMembers(Scriptable scriptable, Class<?> cls, boolean z) {
        Context enterContext = ContextFactory.getGlobal().enterContext();
        try {
            ClassShutter classShutter = enterContext.getClassShutter();
            if (classShutter != null && !classShutter.visibleToScripts(cls.getName())) {
                throw Context.reportRuntimeErrorById("msg.access.prohibited", cls.getName());
            }
            this.members = new HashMap();
            this.staticMembers = new HashMap();
            this.cl = cls;
            reflect(enterContext, scriptable, z, enterContext.hasFeature(13));
            enterContext.close();
        } catch (Throwable th) {
            if (enterContext != null) {
                try {
                    enterContext.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static JavaMembers createJavaMembers(Scriptable scriptable, Class<?> cls, boolean z) {
        if (STRICT_REFLECTIVE_ACCESS) {
            return new JavaMembers_jdk11(scriptable, cls, z);
        }
        return new JavaMembers(scriptable, cls, z);
    }

    private void discoverAccessibleMethods(Class<?> cls, Map<MethodSignature, Method> map, boolean z, boolean z2) {
        Method[] declaredMethods;
        if (Modifier.isPublic(cls.getModifiers()) || z2) {
            try {
                if (!z && !z2) {
                    discoverPublicMethods(cls, map);
                    return;
                }
                while (cls != null) {
                    try {
                        for (Method method : cls.getDeclaredMethods()) {
                            int modifiers = method.getModifiers();
                            if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || z2) {
                                Method registerMethod = registerMethod(map, method);
                                if (z2 && !registerMethod.isAccessible()) {
                                    registerMethod.setAccessible(true);
                                }
                            }
                        }
                        for (Class<?> cls2 : cls.getInterfaces()) {
                            discoverAccessibleMethods(cls2, map, z, z2);
                        }
                        cls = cls.getSuperclass();
                    } catch (SecurityException unused) {
                        discoverPublicMethods(cls, map);
                        return;
                    }
                }
                return;
            } catch (SecurityException unused2) {
                Context.reportWarning("Could not discover accessible methods of class " + cls.getName() + " due to lack of privileges, attemping superclasses/interfaces.");
            }
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            discoverAccessibleMethods(cls3, map, z, z2);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            discoverAccessibleMethods(superclass, map, z, z2);
        }
    }

    private static MemberBox extractGetMethod(MemberBox[] memberBoxArr, boolean z) {
        for (MemberBox memberBox : memberBoxArr) {
            if (memberBox.argTypes.length == 0 && (!z || memberBox.isStatic())) {
                if (memberBox.method().getReturnType() != Void.TYPE) {
                    return memberBox;
                }
                return null;
            }
        }
        return null;
    }

    private static MemberBox extractSetMethod(Class<?> cls, MemberBox[] memberBoxArr, boolean z) {
        for (int i = 1; i <= 2; i++) {
            for (MemberBox memberBox : memberBoxArr) {
                if (!z || memberBox.isStatic()) {
                    Class<?>[] clsArr = memberBox.argTypes;
                    if (clsArr.length != 1) {
                        continue;
                    } else if (i == 1) {
                        if (clsArr[0] == cls) {
                            return memberBox;
                        }
                    } else {
                        if (i != 2) {
                            Kit.codeBug();
                        }
                        if (clsArr[0].isAssignableFrom(cls)) {
                            return memberBox;
                        }
                    }
                }
            }
        }
        return null;
    }

    private MemberBox findExplicitFunction(String str, boolean z) {
        Map<String, Object> map;
        MemberBox[] memberBoxArr;
        int indexOf = str.indexOf(40);
        if (indexOf < 0) {
            return null;
        }
        if (z) {
            map = this.staticMembers;
        } else {
            map = this.members;
        }
        if (z && indexOf == 0) {
            memberBoxArr = this.ctors.methods;
        } else {
            String substring = str.substring(0, indexOf);
            Object obj = map.get(substring);
            if (!z && obj == null) {
                obj = this.staticMembers.get(substring);
            }
            if (obj instanceof NativeJavaMethod) {
                memberBoxArr = ((NativeJavaMethod) obj).methods;
            } else {
                memberBoxArr = null;
            }
        }
        if (memberBoxArr != null) {
            for (MemberBox memberBox : memberBoxArr) {
                String liveConnectSignature = liveConnectSignature(memberBox.argTypes);
                if (liveConnectSignature.length() + indexOf == str.length() && str.regionMatches(indexOf, liveConnectSignature, 0, liveConnectSignature.length())) {
                    return memberBox;
                }
            }
        }
        return null;
    }

    private static MemberBox findGetter(boolean z, Map<String, Object> map, String str, String str2) {
        Object obj = map.get(str.concat(str2));
        if (obj instanceof NativeJavaMethod) {
            return extractGetMethod(((NativeJavaMethod) obj).methods, z);
        }
        return null;
    }

    private Constructor<?>[] getAccessibleConstructors(boolean z) {
        Class<?> cls;
        if (z && (cls = this.cl) != ScriptRuntime.ClassClass) {
            try {
                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                AccessibleObject.setAccessible(declaredConstructors, true);
                return declaredConstructors;
            } catch (SecurityException unused) {
                String name = this.cl.getName();
                Context.reportWarning("Could not access constructor  of class " + name + " due to lack of privileges.");
            }
        }
        return this.cl.getConstructors();
    }

    private Field[] getAccessibleFields(boolean z, boolean z2) {
        Field[] declaredFields;
        if (z2 || z) {
            try {
                ArrayList arrayList = new ArrayList();
                Class<?> cls = this.cl;
                while (true) {
                    if (cls != null) {
                        for (Field field : cls.getDeclaredFields()) {
                            int modifiers = field.getModifiers();
                            if (z2 || Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers)) {
                                if (!field.isAccessible()) {
                                    field.setAccessible(true);
                                }
                                arrayList.add(field);
                            }
                        }
                        cls = cls.getSuperclass();
                    } else {
                        return (Field[]) arrayList.toArray(new Field[0]);
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        return this.cl.getFields();
    }

    private Object getExplicitFunction(Scriptable scriptable, String str, Object obj, boolean z) {
        Map<String, Object> map;
        if (z) {
            map = this.staticMembers;
        } else {
            map = this.members;
        }
        MemberBox findExplicitFunction = findExplicitFunction(str, z);
        if (findExplicitFunction != null) {
            Scriptable functionPrototype = ScriptableObject.getFunctionPrototype(scriptable);
            if (findExplicitFunction.isCtor()) {
                NativeJavaConstructor nativeJavaConstructor = new NativeJavaConstructor(findExplicitFunction);
                nativeJavaConstructor.setPrototype(functionPrototype);
                map.put(str, nativeJavaConstructor);
                return nativeJavaConstructor;
            }
            Object obj2 = map.get(findExplicitFunction.getName());
            if ((obj2 instanceof NativeJavaMethod) && ((NativeJavaMethod) obj2).methods.length > 1) {
                NativeJavaMethod nativeJavaMethod = new NativeJavaMethod(findExplicitFunction, str);
                nativeJavaMethod.setPrototype(functionPrototype);
                map.put(str, nativeJavaMethod);
                return nativeJavaMethod;
            }
            return obj2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method getMoreConcreteMethod(Method method, Method method2) {
        if (!method.getReturnType().equals(method2.getReturnType()) && method.getReturnType().isAssignableFrom(method2.getReturnType())) {
            return method2;
        }
        return method;
    }

    private static Object getSecurityContext() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            return null;
        }
        Object securityContext = securityManager.getSecurityContext();
        if (securityContext instanceof AccessControlContext) {
            try {
                ((AccessControlContext) securityContext).checkPermission(allPermission);
                return null;
            } catch (SecurityException unused) {
            }
        }
        return securityContext;
    }

    private static boolean isModularJava() {
        try {
            Class.class.getMethod("getModule", null);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    public static String javaSignature(Class<?> cls) {
        if (!cls.isArray()) {
            return cls.getName();
        }
        int i = 0;
        do {
            i++;
            cls = cls.getComponentType();
        } while (cls.isArray());
        String name = cls.getName();
        if (i == 1) {
            return name.concat("[]");
        }
        StringBuilder sb = new StringBuilder((i * 2) + name.length());
        sb.append(name);
        while (i != 0) {
            i--;
            sb.append("[]");
        }
        return sb.toString();
    }

    public static String liveConnectSignature(Class<?>[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return "()";
        }
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i != length; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(javaSignature(clsArr[i]));
        }
        sb.append(')');
        return sb.toString();
    }

    public static JavaMembers lookupClass(Scriptable scriptable, Class<?> cls, Class<?> cls2, boolean z) {
        ClassCache classCache = ClassCache.get(scriptable);
        Map<ClassCache.CacheKey, JavaMembers> classCacheMap = classCache.getClassCacheMap();
        Object securityContext = getSecurityContext();
        Class<?> cls3 = cls;
        while (true) {
            JavaMembers javaMembers = classCacheMap.get(new ClassCache.CacheKey(cls3, securityContext));
            if (javaMembers != null) {
                if (cls3 != cls) {
                    classCacheMap.put(new ClassCache.CacheKey(cls, securityContext), javaMembers);
                }
                return javaMembers;
            }
            try {
                JavaMembers createJavaMembers = createJavaMembers(classCache.getAssociatedScope(), cls3, z);
                if (classCache.isCachingEnabled()) {
                    classCacheMap.put(new ClassCache.CacheKey(cls3, securityContext), createJavaMembers);
                    if (cls3 != cls) {
                        classCacheMap.put(new ClassCache.CacheKey(cls, securityContext), createJavaMembers);
                    }
                }
                return createJavaMembers;
            } catch (SecurityException e) {
                if (cls2 != null && cls2.isInterface()) {
                    cls3 = cls2;
                    cls2 = null;
                } else {
                    Class<?> superclass = cls3.getSuperclass();
                    if (superclass == null) {
                        if (cls3.isInterface()) {
                            superclass = ScriptRuntime.ObjectClass;
                        } else {
                            throw e;
                        }
                    }
                    cls3 = superclass;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void reflect(org.mozilla.javascript.Context r18, org.mozilla.javascript.Scriptable r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.JavaMembers.reflect(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Method registerMethod(Map<MethodSignature, Method> map, Method method) {
        return (Method) map.merge(new MethodSignature(method), method, new Object());
    }

    public void discoverPublicMethods(Class<?> cls, Map<MethodSignature, Method> map) {
        for (Method method : cls.getMethods()) {
            registerMethod(map, method);
        }
    }

    public Object get(Scriptable scriptable, String str, Object obj, boolean z) {
        Map<String, Object> map;
        Object obj2;
        Class<?> type;
        if (z) {
            map = this.staticMembers;
        } else {
            map = this.members;
        }
        Object obj3 = map.get(str);
        if (!z && obj3 == null) {
            obj3 = this.staticMembers.get(str);
        }
        if (obj3 == null && (obj3 = getExplicitFunction(scriptable, str, obj, z)) == null) {
            return Scriptable.NOT_FOUND;
        }
        if (obj3 instanceof Scriptable) {
            return obj3;
        }
        Context context = Context.getContext();
        try {
            if (obj3 instanceof BeanProperty) {
                BeanProperty beanProperty = (BeanProperty) obj3;
                MemberBox memberBox = beanProperty.getter;
                if (memberBox == null) {
                    return Scriptable.NOT_FOUND;
                }
                obj2 = memberBox.invoke(obj, Context.emptyArgs);
                type = beanProperty.getter.method().getReturnType();
            } else {
                Field field = (Field) obj3;
                if (z) {
                    obj = null;
                }
                obj2 = field.get(obj);
                type = field.getType();
            }
            return context.getWrapFactory().wrap(context, ScriptableObject.getTopLevelScope(scriptable), obj2, type);
        } catch (Exception e) {
            throw Context.throwAsScriptRuntimeEx(e);
        }
    }

    public Map<String, FieldAndMethods> getFieldAndMethodsObjects(Scriptable scriptable, Object obj, boolean z) {
        Map<String, FieldAndMethods> map;
        if (z) {
            map = this.staticFieldAndMethods;
        } else {
            map = this.fieldAndMethods;
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap(map.size());
        for (FieldAndMethods fieldAndMethods : map.values()) {
            FieldAndMethods fieldAndMethods2 = new FieldAndMethods(scriptable, fieldAndMethods.methods, fieldAndMethods.field);
            fieldAndMethods2.javaObject = obj;
            hashMap.put(fieldAndMethods.field.getName(), fieldAndMethods2);
        }
        return hashMap;
    }

    public Object[] getIds(boolean z) {
        Map<String, Object> map;
        if (z) {
            map = this.staticMembers;
        } else {
            map = this.members;
        }
        return map.keySet().toArray(new Object[0]);
    }

    public boolean has(String str, boolean z) {
        Map<String, Object> map;
        if (z) {
            map = this.staticMembers;
        } else {
            map = this.members;
        }
        if (map.get(str) != null || findExplicitFunction(str, z) != null) {
            return true;
        }
        return false;
    }

    public void put(Scriptable scriptable, String str, Object obj, Object obj2, boolean z) {
        Map<String, Object> map;
        String str2;
        if (z) {
            map = this.staticMembers;
        } else {
            map = this.members;
        }
        Object obj3 = map.get(str);
        if (!z && obj3 == null) {
            obj3 = this.staticMembers.get(str);
        }
        if (obj3 != null) {
            if (obj3 instanceof FieldAndMethods) {
                obj3 = ((FieldAndMethods) map.get(str)).field;
            }
            if (obj3 instanceof BeanProperty) {
                BeanProperty beanProperty = (BeanProperty) obj3;
                MemberBox memberBox = beanProperty.setter;
                if (memberBox != null) {
                    NativeJavaMethod nativeJavaMethod = beanProperty.setters;
                    if (nativeJavaMethod != null && obj2 != null) {
                        nativeJavaMethod.call(Context.getContext(), ScriptableObject.getTopLevelScope(scriptable), scriptable, new Object[]{obj2});
                        return;
                    }
                    try {
                        beanProperty.setter.invoke(obj, new Object[]{Context.jsToJava(obj2, memberBox.argTypes[0])});
                        return;
                    } catch (Exception e) {
                        throw Context.throwAsScriptRuntimeEx(e);
                    }
                }
                throw reportMemberNotFound(str);
            } else if (!(obj3 instanceof Field)) {
                if (obj3 == null) {
                    str2 = "msg.java.internal.private";
                } else {
                    str2 = "msg.java.method.assign";
                }
                throw Context.reportRuntimeErrorById(str2, str);
            } else {
                Field field = (Field) obj3;
                try {
                    field.set(obj, Context.jsToJava(obj2, field.getType()));
                    return;
                } catch (IllegalAccessException e2) {
                    if ((field.getModifiers() & 16) != 0) {
                        return;
                    }
                    throw Context.throwAsScriptRuntimeEx(e2);
                } catch (IllegalArgumentException unused) {
                    throw Context.reportRuntimeErrorById("msg.java.internal.field.type", obj2.getClass().getName(), field, obj.getClass().getName());
                }
            }
        }
        throw reportMemberNotFound(str);
    }

    public RuntimeException reportMemberNotFound(String str) {
        return Context.reportRuntimeErrorById("msg.java.member.not.found", this.cl.getName(), str);
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class MethodSignature {
        private final Class<?>[] args;
        private final String name;

        public MethodSignature(Method method) {
            this(method.getName(), method.getParameterTypes());
        }

        public boolean equals(Object obj) {
            if (obj instanceof MethodSignature) {
                MethodSignature methodSignature = (MethodSignature) obj;
                if (methodSignature.name.equals(this.name) && Arrays.equals(this.args, methodSignature.args)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.args.length ^ this.name.hashCode();
        }

        private MethodSignature(String str, Class<?>[] clsArr) {
            this.name = str;
            this.args = clsArr;
        }
    }

    private static MemberBox extractSetMethod(MemberBox[] memberBoxArr, boolean z) {
        for (MemberBox memberBox : memberBoxArr) {
            if ((!z || memberBox.isStatic()) && memberBox.method().getReturnType() == Void.TYPE && memberBox.argTypes.length == 1) {
                return memberBox;
            }
        }
        return null;
    }

    public JavaMembers(Scriptable scriptable, Class<?> cls) {
        this(scriptable, cls, false);
    }

    private Method[] discoverAccessibleMethods(Class<?> cls, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        discoverAccessibleMethods(cls, hashMap, z, z2);
        return (Method[]) hashMap.values().toArray(new Method[0]);
    }
}
