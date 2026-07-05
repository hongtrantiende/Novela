package org.mozilla.javascript;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class MemberBox implements Serializable {
    private static final Class<?>[] primitives = {Boolean.TYPE, Byte.TYPE, Character.TYPE, Double.TYPE, Float.TYPE, Integer.TYPE, Long.TYPE, Short.TYPE, Void.TYPE};
    private static final long serialVersionUID = 6358550398665688245L;
    transient Class<?>[] argTypes;
    transient Function asGetterFunction;
    transient Function asSetterFunction;
    transient Object delegateTo;
    private transient Member memberObject;
    transient boolean vararg;

    public MemberBox(Method method) {
        init(method);
    }

    private void init(Method method) {
        this.memberObject = method;
        this.argTypes = method.getParameterTypes();
        this.vararg = method.isVarArgs();
    }

    private static Member readMember(ObjectInputStream objectInputStream) {
        if (!objectInputStream.readBoolean()) {
            return null;
        }
        boolean readBoolean = objectInputStream.readBoolean();
        String str = (String) objectInputStream.readObject();
        Class cls = (Class) objectInputStream.readObject();
        Class<?>[] readParameters = readParameters(objectInputStream);
        try {
            if (readBoolean) {
                return cls.getMethod(str, readParameters);
            }
            return cls.getConstructor(readParameters);
        } catch (NoSuchMethodException e) {
            fb4.k("Cannot find member: ".concat(String.valueOf(e)));
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Member readMember = readMember(objectInputStream);
        if (readMember instanceof Method) {
            init((Method) readMember);
        } else {
            init((Constructor) readMember);
        }
    }

    private static Class<?>[] readParameters(ObjectInputStream objectInputStream) {
        int readShort = objectInputStream.readShort();
        Class<?>[] clsArr = new Class[readShort];
        for (int i = 0; i < readShort; i++) {
            if (!objectInputStream.readBoolean()) {
                clsArr[i] = (Class) objectInputStream.readObject();
            } else {
                clsArr[i] = primitives[objectInputStream.readByte()];
            }
        }
        return clsArr;
    }

    private static Method searchAccessibleMethod(Method method, Class<?>[] clsArr) {
        int modifiers = method.getModifiers();
        if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers)) {
            Class<?> declaringClass = method.getDeclaringClass();
            if (!Modifier.isPublic(declaringClass.getModifiers())) {
                String name = method.getName();
                Class<?>[] interfaces = declaringClass.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i != length; i++) {
                    Class<?> cls = interfaces[i];
                    if (Modifier.isPublic(cls.getModifiers())) {
                        try {
                            return cls.getMethod(name, clsArr);
                        } catch (NoSuchMethodException | SecurityException unused) {
                            continue;
                        }
                    }
                }
                while (true) {
                    declaringClass = declaringClass.getSuperclass();
                    if (declaringClass != null) {
                        if (Modifier.isPublic(declaringClass.getModifiers())) {
                            try {
                                Method method2 = declaringClass.getMethod(name, clsArr);
                                int modifiers2 = method2.getModifiers();
                                if (Modifier.isPublic(modifiers2) && !Modifier.isStatic(modifiers2)) {
                                    return method2;
                                }
                            } catch (NoSuchMethodException | SecurityException unused2) {
                                continue;
                            }
                        }
                    } else {
                        return null;
                    }
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private static void writeMember(ObjectOutputStream objectOutputStream, Member member) {
        if (member == null) {
            objectOutputStream.writeBoolean(false);
            return;
        }
        objectOutputStream.writeBoolean(true);
        boolean z = member instanceof Method;
        if (!z && !(member instanceof Constructor)) {
            vs.m("not Method or Constructor");
            return;
        }
        objectOutputStream.writeBoolean(z);
        objectOutputStream.writeObject(member.getName());
        objectOutputStream.writeObject(member.getDeclaringClass());
        if (z) {
            writeParameters(objectOutputStream, ((Method) member).getParameterTypes());
        } else {
            writeParameters(objectOutputStream, ((Constructor) member).getParameterTypes());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        writeMember(objectOutputStream, this.memberObject);
    }

    private static void writeParameters(ObjectOutputStream objectOutputStream, Class<?>[] clsArr) {
        objectOutputStream.writeShort(clsArr.length);
        for (Class<?> cls : clsArr) {
            boolean isPrimitive = cls.isPrimitive();
            objectOutputStream.writeBoolean(isPrimitive);
            if (!isPrimitive) {
                objectOutputStream.writeObject(cls);
            } else {
                int i = 0;
                while (true) {
                    Class<?>[] clsArr2 = primitives;
                    if (i < clsArr2.length) {
                        if (cls.equals(clsArr2[i])) {
                            objectOutputStream.writeByte(i);
                            break;
                        }
                        i++;
                    } else {
                        vs.m(hl5.n("Primitive ", String.valueOf(cls), " not found"));
                        return;
                    }
                }
            }
        }
    }

    public Function asGetterFunction(final String str, Scriptable scriptable) {
        if (this.asGetterFunction == null) {
            this.asGetterFunction = new BaseFunction(scriptable, ScriptableObject.getFunctionPrototype(scriptable)) { // from class: org.mozilla.javascript.MemberBox.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
                public Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                    Object[] objArr2;
                    MemberBox memberBox = MemberBox.this;
                    Object obj = memberBox.delegateTo;
                    if (obj == 0) {
                        objArr2 = ScriptRuntime.emptyArgs;
                    } else {
                        Object[] objArr3 = {scriptable3};
                        scriptable3 = obj;
                        objArr2 = objArr3;
                    }
                    return memberBox.invoke(scriptable3, objArr2);
                }

                @Override // org.mozilla.javascript.BaseFunction
                public String getFunctionName() {
                    return str;
                }
            };
        }
        return this.asGetterFunction;
    }

    public Function asSetterFunction(final String str, Scriptable scriptable) {
        if (this.asSetterFunction == null) {
            this.asSetterFunction = new BaseFunction(scriptable, ScriptableObject.getFunctionPrototype(scriptable)) { // from class: org.mozilla.javascript.MemberBox.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
                public Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                    Object obj;
                    Object[] objArr2;
                    MemberBox memberBox = MemberBox.this;
                    if (objArr.length > 0) {
                        obj = FunctionObject.convertArg(context, scriptable3, objArr[0], FunctionObject.getTypeTag(memberBox.argTypes[0]));
                    } else {
                        obj = Undefined.instance;
                    }
                    Object obj2 = memberBox.delegateTo;
                    if (obj2 == 0) {
                        objArr2 = new Object[]{obj};
                    } else {
                        Object[] objArr3 = {scriptable3, obj};
                        scriptable3 = obj2;
                        objArr2 = objArr3;
                    }
                    return memberBox.invoke(scriptable3, objArr2);
                }

                @Override // org.mozilla.javascript.BaseFunction
                public String getFunctionName() {
                    return str;
                }
            };
        }
        return this.asSetterFunction;
    }

    public Constructor<?> ctor() {
        return (Constructor) this.memberObject;
    }

    public Class<?> getDeclaringClass() {
        return this.memberObject.getDeclaringClass();
    }

    public String getName() {
        return this.memberObject.getName();
    }

    public Object invoke(Object obj, Object[] objArr) {
        Method method = method();
        if (obj instanceof Delegator) {
            obj = ((Delegator) obj).getDelegee();
        }
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj2 = objArr[i];
                if (obj2 instanceof Delegator) {
                    objArr[i] = ((Delegator) obj2).getDelegee();
                }
            }
        }
        try {
            try {
                return method.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                Method searchAccessibleMethod = searchAccessibleMethod(method, this.argTypes);
                if (searchAccessibleMethod != null) {
                    this.memberObject = searchAccessibleMethod;
                    method = searchAccessibleMethod;
                } else if (!VMBridge.instance.tryToMakeAccessible(method)) {
                    throw Context.throwAsScriptRuntimeEx(e);
                }
                return method.invoke(obj, objArr);
            }
        } catch (InvocationTargetException e2) {
            e = e2;
            do {
                e = ((InvocationTargetException) e).getTargetException();
            } while (e instanceof InvocationTargetException);
            if (e instanceof ContinuationPending) {
                throw ((ContinuationPending) e);
            }
            throw Context.throwAsScriptRuntimeEx(e);
        } catch (Exception e3) {
            throw Context.throwAsScriptRuntimeEx(e3);
        }
    }

    public boolean isCtor() {
        return this.memberObject instanceof Constructor;
    }

    public boolean isMethod() {
        return this.memberObject instanceof Method;
    }

    public boolean isPublic() {
        return Modifier.isPublic(this.memberObject.getModifiers());
    }

    public boolean isSameGetterFunction(Object obj) {
        Object obj2 = this.asGetterFunction;
        if (obj2 == null) {
            obj2 = Undefined.instance;
        }
        return ScriptRuntime.shallowEq(obj, obj2);
    }

    public boolean isSameSetterFunction(Object obj) {
        Object obj2 = this.asSetterFunction;
        if (obj2 == null) {
            obj2 = Undefined.instance;
        }
        return ScriptRuntime.shallowEq(obj, obj2);
    }

    public boolean isStatic() {
        return Modifier.isStatic(this.memberObject.getModifiers());
    }

    public Member member() {
        return this.memberObject;
    }

    public Method method() {
        return (Method) this.memberObject;
    }

    public Object newInstance(Object[] objArr) {
        Constructor<?> ctor = ctor();
        try {
            try {
                return ctor.newInstance(objArr);
            } catch (IllegalAccessException e) {
                if (VMBridge.instance.tryToMakeAccessible(ctor)) {
                    return ctor.newInstance(objArr);
                }
                throw Context.throwAsScriptRuntimeEx(e);
            }
        } catch (Exception e2) {
            throw Context.throwAsScriptRuntimeEx(e2);
        }
    }

    public String toJavaDeclaration() {
        StringBuilder sb = new StringBuilder();
        if (isMethod()) {
            Method method = method();
            sb.append(method.getReturnType());
            sb.append(' ');
            sb.append(method.getName());
        } else {
            String name = ctor().getDeclaringClass().getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                name = name.substring(lastIndexOf + 1);
            }
            sb.append(name);
        }
        sb.append(JavaMembers.liveConnectSignature(this.argTypes));
        return sb.toString();
    }

    public String toString() {
        return this.memberObject.toString();
    }

    public MemberBox(Constructor<?> constructor) {
        init(constructor);
    }

    private void init(Constructor<?> constructor) {
        this.memberObject = constructor;
        this.argTypes = constructor.getParameterTypes();
        this.vararg = constructor.isVarArgs();
    }
}
