package org.mozilla.javascript;

import java.lang.reflect.Array;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeJavaClass extends NativeJavaObject implements Function {
    static final String javaClassPropertyName = "__javaObject__";
    private static final long serialVersionUID = -6460763940409461664L;
    private Map<String, FieldAndMethods> staticFieldAndMethods;

    public NativeJavaClass(Scriptable scriptable, Class<?> cls) {
        this(scriptable, cls, false);
    }

    public static Object constructInternal(Object[] objArr, MemberBox memberBox) {
        Object[] objArr2;
        Object obj;
        Class<?>[] clsArr = memberBox.argTypes;
        int i = 0;
        if (memberBox.vararg) {
            objArr2 = new Object[clsArr.length];
            for (int i2 = 0; i2 < clsArr.length - 1; i2++) {
                objArr2[i2] = Context.jsToJava(objArr[i2], clsArr[i2]);
            }
            if (objArr.length == clsArr.length && (objArr[objArr.length - 1] == null || (objArr[objArr.length - 1] instanceof NativeArray) || (objArr[objArr.length - 1] instanceof NativeJavaArray))) {
                obj = Context.jsToJava(objArr[objArr.length - 1], clsArr[clsArr.length - 1]);
            } else {
                Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
                Object newInstance = Array.newInstance(componentType, (objArr.length - clsArr.length) + 1);
                while (i < Array.getLength(newInstance)) {
                    Array.set(newInstance, i, Context.jsToJava(objArr[(clsArr.length - 1) + i], componentType));
                    i++;
                }
                obj = newInstance;
            }
            objArr2[clsArr.length - 1] = obj;
        } else {
            objArr2 = objArr;
            while (i < objArr2.length) {
                Object obj2 = objArr2[i];
                Object jsToJava = Context.jsToJava(obj2, clsArr[i]);
                if (jsToJava != obj2) {
                    if (objArr2 == objArr) {
                        objArr2 = (Object[]) objArr.clone();
                    }
                    objArr2[i] = jsToJava;
                }
                i++;
            }
        }
        return memberBox.newInstance(objArr2);
    }

    public static Scriptable constructSpecific(Context context, Scriptable scriptable, Object[] objArr, MemberBox memberBox) {
        Object constructInternal = constructInternal(objArr, memberBox);
        return context.getWrapFactory().wrapNewObject(context, ScriptableObject.getTopLevelScope(scriptable), constructInternal);
    }

    private static Class<?> findNestedClass(Class<?> cls, String str) {
        String o = eub.o(cls.getName(), "$", str);
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            return Kit.classOrNull(o);
        }
        return Kit.classOrNull(classLoader, o);
    }

    @Override // org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (objArr.length == 1 && (objArr[0] instanceof Scriptable)) {
            Class<?> classObject = getClassObject();
            Scriptable scriptable3 = (Scriptable) objArr[0];
            do {
                if ((scriptable3 instanceof Wrapper) && classObject.isInstance(((Wrapper) scriptable3).unwrap())) {
                    return scriptable3;
                }
                scriptable3 = scriptable3.getPrototype();
            } while (scriptable3 != null);
            return construct(context, scriptable, objArr);
        }
        return construct(context, scriptable, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (r5 == null) goto L26;
     */
    @Override // org.mozilla.javascript.Function, org.mozilla.javascript.Constructable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.mozilla.javascript.Scriptable construct(org.mozilla.javascript.Context r6, org.mozilla.javascript.Scriptable r7, java.lang.Object[] r8) {
        /*
            r5 = this;
            java.lang.Class r0 = r5.getClassObject()
            int r1 = r0.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isInterface(r1)
            if (r2 != 0) goto L3a
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L3a
            org.mozilla.javascript.JavaMembers r5 = r5.members
            org.mozilla.javascript.NativeJavaMethod r5 = r5.ctors
            int r1 = r5.findCachedFunction(r6, r8)
            if (r1 < 0) goto L27
            org.mozilla.javascript.MemberBox[] r5 = r5.methods
            r5 = r5[r1]
            org.mozilla.javascript.Scriptable r5 = constructSpecific(r6, r7, r8, r5)
            return r5
        L27:
            java.lang.String r5 = org.mozilla.javascript.NativeJavaMethod.scriptSignature(r8)
            java.lang.String r6 = r0.getName()
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5}
            java.lang.String r6 = "msg.no.java.ctor"
            org.mozilla.javascript.EvaluatorException r5 = org.mozilla.javascript.Context.reportRuntimeErrorById(r6, r5)
            throw r5
        L3a:
            int r1 = r8.length
            r2 = 0
            if (r1 == 0) goto L9b
            org.mozilla.javascript.Scriptable r1 = org.mozilla.javascript.ScriptableObject.getTopLevelScope(r5)
            java.lang.String r3 = "Dalvik"
            java.lang.String r4 = "java.vm.name"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch: java.lang.Exception -> L6a
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto L6c
            boolean r3 = r0.isInterface()     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto L6c
            r5 = r8[r2]     // Catch: java.lang.Exception -> L6a
            org.mozilla.javascript.ScriptableObject r5 = org.mozilla.javascript.ScriptableObject.ensureScriptableObject(r5)     // Catch: java.lang.Exception -> L6a
            java.lang.Object r5 = org.mozilla.javascript.NativeJavaObject.createInterfaceAdapter(r0, r5)     // Catch: java.lang.Exception -> L6a
            org.mozilla.javascript.WrapFactory r8 = r6.getWrapFactory()     // Catch: java.lang.Exception -> L6a
            r1 = 0
            org.mozilla.javascript.Scriptable r5 = r8.wrapAsJavaObject(r6, r7, r5, r1)     // Catch: java.lang.Exception -> L6a
            return r5
        L6a:
            r5 = move-exception
            goto L83
        L6c:
            java.lang.String r7 = "JavaAdapter"
            java.lang.Object r7 = r1.get(r7, r1)     // Catch: java.lang.Exception -> L6a
            java.lang.Object r3 = org.mozilla.javascript.Scriptable.NOT_FOUND     // Catch: java.lang.Exception -> L6a
            if (r7 == r3) goto L8a
            r8 = r8[r2]     // Catch: java.lang.Exception -> L6a
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r8}     // Catch: java.lang.Exception -> L6a
            org.mozilla.javascript.Constructable r7 = (org.mozilla.javascript.Constructable) r7     // Catch: java.lang.Exception -> L6a
            org.mozilla.javascript.Scriptable r5 = r7.construct(r6, r1, r5)     // Catch: java.lang.Exception -> L6a
            return r5
        L83:
            java.lang.String r5 = r5.getMessage()
            if (r5 == 0) goto L8a
            goto L8c
        L8a:
            java.lang.String r5 = ""
        L8c:
            java.lang.String r6 = r0.getName()
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            java.lang.String r6 = "msg.cant.instantiate"
            org.mozilla.javascript.EvaluatorException r5 = org.mozilla.javascript.Context.reportRuntimeErrorById(r6, r5)
            throw r5
        L9b:
            java.lang.String r5 = "msg.adapter.zero.args"
            java.lang.Object[] r6 = new java.lang.Object[r2]
            org.mozilla.javascript.EvaluatorException r5 = org.mozilla.javascript.Context.reportRuntimeErrorById(r5, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeJavaClass.construct(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, java.lang.Object[]):org.mozilla.javascript.Scriptable");
    }

    @Override // org.mozilla.javascript.NativeJavaObject
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        FieldAndMethods fieldAndMethods;
        if (str.equals("prototype")) {
            return null;
        }
        Map<String, FieldAndMethods> map = this.staticFieldAndMethods;
        if (map != null && (fieldAndMethods = map.get(str)) != null) {
            return fieldAndMethods;
        }
        if (this.members.has(str, true)) {
            return this.members.get(this, str, this.javaObject, true);
        }
        Context context = Context.getContext();
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        WrapFactory wrapFactory = context.getWrapFactory();
        if (javaClassPropertyName.equals(str)) {
            return wrapFactory.wrap(context, topLevelScope, this.javaObject, ScriptRuntime.ClassClass);
        }
        Class<?> findNestedClass = findNestedClass(getClassObject(), str);
        if (findNestedClass != null) {
            Scriptable wrapJavaClass = wrapFactory.wrapJavaClass(context, topLevelScope, findNestedClass);
            wrapJavaClass.setParentScope(this);
            return wrapJavaClass;
        }
        throw this.members.reportMemberNotFound(str);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "JavaClass";
    }

    public Class<?> getClassObject() {
        return (Class) super.unwrap();
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        if (cls != null && cls != ScriptRuntime.StringClass) {
            if (cls == ScriptRuntime.BooleanClass) {
                return Boolean.TRUE;
            }
            if (cls == ScriptRuntime.NumberClass) {
                return ScriptRuntime.NaNobj;
            }
            return this;
        }
        return toString();
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        return this.members.getIds(true);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        if (this.members.has(str, true) || javaClassPropertyName.equals(str)) {
            return true;
        }
        return false;
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public boolean hasInstance(Scriptable scriptable) {
        if ((scriptable instanceof Wrapper) && !(scriptable instanceof NativeJavaClass)) {
            return getClassObject().isInstance(((Wrapper) scriptable).unwrap());
        }
        return false;
    }

    @Override // org.mozilla.javascript.NativeJavaObject
    public int hashCode() {
        return super.hashCode();
    }

    @Override // org.mozilla.javascript.NativeJavaObject
    public void initMembers() {
        Class cls = (Class) this.javaObject;
        JavaMembers lookupClass = JavaMembers.lookupClass(this.parent, cls, cls, this.isAdapter);
        this.members = lookupClass;
        this.staticFieldAndMethods = lookupClass.getFieldAndMethodsObjects(this, cls, true);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        this.members.put(this, str, this.javaObject, obj, true);
    }

    public String toString() {
        return hl5.n("[JavaClass ", getClassObject().getName(), "]");
    }

    public NativeJavaClass() {
    }

    public NativeJavaClass(Scriptable scriptable, Class<?> cls, boolean z) {
        super(scriptable, cls, null, z);
    }
}
