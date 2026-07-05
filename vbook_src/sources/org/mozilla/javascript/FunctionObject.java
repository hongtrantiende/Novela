package org.mozilla.javascript;

import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import org.mozilla.javascript.commonjs.module.ModuleScope;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class FunctionObject extends BaseFunction {
    public static final int JAVA_BOOLEAN_TYPE = 3;
    public static final int JAVA_DOUBLE_TYPE = 4;
    public static final int JAVA_INT_TYPE = 2;
    public static final int JAVA_OBJECT_TYPE = 6;
    public static final int JAVA_SCRIPTABLE_TYPE = 5;
    public static final int JAVA_STRING_TYPE = 1;
    public static final int JAVA_UNSUPPORTED_TYPE = 0;
    private static final short VARARGS_CTOR = -2;
    private static final short VARARGS_METHOD = -1;
    private static boolean sawSecurityException = false;
    private static final long serialVersionUID = -5332312783643935019L;
    private String functionName;
    private transient boolean hasVoidReturn;
    private boolean isStatic;
    MemberBox member;
    private int parmsLength;
    private transient int returnTypeTag;
    private transient byte[] typeTags;

    public FunctionObject(String str, Member member, Scriptable scriptable) {
        if (member instanceof Constructor) {
            this.member = new MemberBox((Constructor) member);
            this.isStatic = true;
        } else {
            MemberBox memberBox = new MemberBox((Method) member);
            this.member = memberBox;
            this.isStatic = memberBox.isStatic();
        }
        String name = this.member.getName();
        this.functionName = str;
        Class<?>[] clsArr = this.member.argTypes;
        int length = clsArr.length;
        if (length == 4 && (clsArr[1].isArray() || clsArr[2].isArray())) {
            boolean isArray = clsArr[1].isArray();
            boolean z = this.isStatic;
            if (isArray) {
                if (z && clsArr[0] == ScriptRuntime.ContextClass && clsArr[1].getComponentType() == ScriptRuntime.ObjectClass && clsArr[2] == ScriptRuntime.FunctionClass && clsArr[3] == Boolean.TYPE) {
                    this.parmsLength = -2;
                } else {
                    throw Context.reportRuntimeErrorById("msg.varargs.ctor", name);
                }
            } else if (z && clsArr[0] == ScriptRuntime.ContextClass && clsArr[1] == ScriptRuntime.ScriptableClass && clsArr[2].getComponentType() == ScriptRuntime.ObjectClass && clsArr[3] == ScriptRuntime.FunctionClass) {
                this.parmsLength = -1;
            } else {
                throw Context.reportRuntimeErrorById("msg.varargs.fun", name);
            }
        } else {
            this.parmsLength = length;
            if (length > 0) {
                this.typeTags = new byte[length];
                for (int i = 0; i != length; i++) {
                    int typeTag = getTypeTag(clsArr[i]);
                    if (typeTag != 0) {
                        this.typeTags[i] = (byte) typeTag;
                    } else {
                        throw Context.reportRuntimeErrorById("msg.bad.parms", clsArr[i].getName(), name);
                    }
                }
            }
        }
        boolean isMethod = this.member.isMethod();
        MemberBox memberBox2 = this.member;
        if (isMethod) {
            Class<?> returnType = memberBox2.method().getReturnType();
            if (returnType == Void.TYPE) {
                this.hasVoidReturn = true;
            } else {
                this.returnTypeTag = getTypeTag(returnType);
            }
        } else {
            Class<?> declaringClass = memberBox2.getDeclaringClass();
            if (!ScriptRuntime.ScriptableClass.isAssignableFrom(declaringClass)) {
                throw Context.reportRuntimeErrorById("msg.bad.ctor.return", declaringClass.getName());
            }
        }
        ScriptRuntime.setFunctionProtoAndParent(this, Context.getCurrentContext(), scriptable, false);
    }

    public static Object convertArg(Context context, Scriptable scriptable, Object obj, int i) {
        switch (i) {
            case 1:
                if (obj instanceof String) {
                    return obj;
                }
                return ScriptRuntime.toString(obj);
            case 2:
                if (obj instanceof Integer) {
                    return obj;
                }
                return Integer.valueOf(ScriptRuntime.toInt32(obj));
            case 3:
                if (obj instanceof Boolean) {
                    return obj;
                }
                if (ScriptRuntime.toBoolean(obj)) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 4:
                if (obj instanceof Double) {
                    return obj;
                }
                return Double.valueOf(ScriptRuntime.toNumber(obj));
            case 5:
                return ScriptRuntime.toObjectOrNull(context, obj, scriptable);
            case 6:
                if (obj instanceof ConsString) {
                    return obj.toString();
                }
                return obj;
            default:
                p1a.g();
                return null;
        }
    }

    public static Method findSingleMethod(Method[] methodArr, String str) {
        int length = methodArr.length;
        Method method = null;
        for (int i = 0; i != length; i++) {
            Method method2 = methodArr[i];
            if (method2 != null && str.equals(method2.getName())) {
                if (method == null) {
                    method = method2;
                } else {
                    throw Context.reportRuntimeErrorById("msg.no.overload", str, method2.getDeclaringClass().getName());
                }
            }
        }
        return method;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Method[] getMethodList(java.lang.Class<?> r6) {
        /*
            r0 = 0
            boolean r1 = org.mozilla.javascript.FunctionObject.sawSecurityException     // Catch: java.lang.SecurityException -> La
            if (r1 != 0) goto Ld
            java.lang.reflect.Method[] r1 = r6.getDeclaredMethods()     // Catch: java.lang.SecurityException -> La
            goto Le
        La:
            r1 = 1
            org.mozilla.javascript.FunctionObject.sawSecurityException = r1
        Ld:
            r1 = r0
        Le:
            if (r1 != 0) goto L14
            java.lang.reflect.Method[] r1 = r6.getMethods()
        L14:
            r2 = 0
            r3 = r2
            r4 = r3
        L17:
            int r5 = r1.length
            if (r3 >= r5) goto L3b
            boolean r5 = org.mozilla.javascript.FunctionObject.sawSecurityException
            if (r5 == 0) goto L27
            r5 = r1[r3]
            java.lang.Class r5 = r5.getDeclaringClass()
            if (r5 == r6) goto L36
            goto L33
        L27:
            r5 = r1[r3]
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isPublic(r5)
            if (r5 != 0) goto L36
        L33:
            r1[r3] = r0
            goto L38
        L36:
            int r4 = r4 + 1
        L38:
            int r3 = r3 + 1
            goto L17
        L3b:
            java.lang.reflect.Method[] r6 = new java.lang.reflect.Method[r4]
            int r0 = r1.length
            r3 = r2
        L3f:
            if (r2 >= r0) goto L4d
            r4 = r1[r2]
            if (r4 == 0) goto L4a
            int r5 = r3 + 1
            r6[r3] = r4
            r3 = r5
        L4a:
            int r2 = r2 + 1
            goto L3f
        L4d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.FunctionObject.getMethodList(java.lang.Class):java.lang.reflect.Method[]");
    }

    public static int getTypeTag(Class<?> cls) {
        if (cls == ScriptRuntime.StringClass) {
            return 1;
        }
        if (cls != ScriptRuntime.IntegerClass && cls != Integer.TYPE) {
            if (cls != ScriptRuntime.BooleanClass && cls != Boolean.TYPE) {
                if (cls != ScriptRuntime.DoubleClass && cls != Double.TYPE) {
                    if (ScriptRuntime.ScriptableClass.isAssignableFrom(cls)) {
                        return 5;
                    }
                    if (cls == ScriptRuntime.ObjectClass) {
                        return 6;
                    }
                    return 0;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int i = this.parmsLength;
        if (i > 0) {
            Class<?>[] clsArr = this.member.argTypes;
            this.typeTags = new byte[i];
            for (int i2 = 0; i2 != this.parmsLength; i2++) {
                this.typeTags[i2] = (byte) getTypeTag(clsArr[i2]);
            }
        }
        if (this.member.isMethod()) {
            Class<?> returnType = this.member.method().getReturnType();
            if (returnType == Void.TYPE) {
                this.hasVoidReturn = true;
            } else {
                this.returnTypeTag = getTypeTag(returnType);
            }
        }
    }

    public void addAsConstructor(Scriptable scriptable, Scriptable scriptable2) {
        initAsConstructor(scriptable, scriptable2, 7);
        ScriptableObject.defineProperty(scriptable, scriptable2.getClassName(), this, 2);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object[] objArr2;
        Object obj;
        Object newInstance;
        Scriptable parentScope;
        boolean isInstance;
        Boolean bool;
        int length = objArr.length;
        boolean z = true;
        if (this.parmsLength < 0) {
            for (int i = 0; i < length; i++) {
                Object obj2 = objArr[i];
                if (obj2 instanceof ConsString) {
                    objArr[i] = obj2.toString();
                }
            }
            if (this.parmsLength == -1) {
                newInstance = this.member.invoke(null, new Object[]{context, scriptable2, objArr, this});
            } else {
                if (scriptable2 == null) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                Object[] objArr3 = {context, objArr, this, bool};
                boolean isCtor = this.member.isCtor();
                MemberBox memberBox = this.member;
                if (isCtor) {
                    newInstance = memberBox.newInstance(objArr3);
                } else {
                    newInstance = memberBox.invoke(null, objArr3);
                }
                z = false;
            }
        } else {
            if (!this.isStatic) {
                Class<?> declaringClass = this.member.getDeclaringClass();
                if (scriptable2 instanceof Delegator) {
                    scriptable2 = ((Delegator) scriptable2).getDelegee();
                }
                if (!declaringClass.isInstance(scriptable2)) {
                    if ((scriptable2 == scriptable || (scriptable2 instanceof ModuleScope)) && scriptable != (parentScope = getParentScope())) {
                        isInstance = declaringClass.isInstance(parentScope);
                        if (isInstance) {
                            scriptable2 = parentScope;
                        }
                    } else {
                        isInstance = false;
                    }
                    if (!isInstance) {
                        throw ScriptRuntime.typeErrorById("msg.incompat.call", this.functionName);
                    }
                }
            }
            int i2 = this.parmsLength;
            if (i2 == length) {
                objArr2 = objArr;
                for (int i3 = 0; i3 != this.parmsLength; i3++) {
                    Object obj3 = objArr[i3];
                    Object convertArg = convertArg(context, scriptable, obj3, this.typeTags[i3]);
                    if (obj3 != convertArg) {
                        if (objArr2 == objArr) {
                            objArr2 = (Object[]) objArr.clone();
                        }
                        objArr2[i3] = convertArg;
                    }
                }
            } else if (i2 == 0) {
                objArr2 = ScriptRuntime.emptyArgs;
            } else {
                objArr2 = new Object[i2];
                for (int i4 = 0; i4 != this.parmsLength; i4++) {
                    if (i4 < length) {
                        obj = objArr[i4];
                    } else {
                        obj = Undefined.instance;
                    }
                    objArr2[i4] = convertArg(context, scriptable, obj, this.typeTags[i4]);
                }
            }
            boolean isMethod = this.member.isMethod();
            MemberBox memberBox2 = this.member;
            if (isMethod) {
                newInstance = memberBox2.invoke(scriptable2, objArr2);
            } else {
                newInstance = memberBox2.newInstance(objArr2);
                z = false;
            }
        }
        if (z) {
            if (this.hasVoidReturn) {
                return Undefined.instance;
            }
            if (this.returnTypeTag == 0) {
                return context.getWrapFactory().wrap(context, scriptable, newInstance, null);
            }
        }
        return newInstance;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public Scriptable createObject(Context context, Scriptable scriptable) {
        if (this.member.isCtor() || this.parmsLength == -2) {
            return null;
        }
        try {
            Scriptable scriptable2 = (Scriptable) this.member.getDeclaringClass().getDeclaredConstructor(null).newInstance(null);
            scriptable2.setPrototype(getClassPrototype());
            scriptable2.setParentScope(getParentScope());
            return scriptable2;
        } catch (Exception e) {
            throw Context.throwAsScriptRuntimeEx(e);
        }
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getArity() {
        int i = this.parmsLength;
        if (i < 0) {
            return 1;
        }
        return i;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String getFunctionName() {
        String str = this.functionName;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getLength() {
        return getArity();
    }

    public Member getMethodOrConstructor() {
        boolean isMethod = this.member.isMethod();
        MemberBox memberBox = this.member;
        if (isMethod) {
            return memberBox.method();
        }
        return memberBox.ctor();
    }

    public void initAsConstructor(Scriptable scriptable, Scriptable scriptable2, int i) {
        ScriptRuntime.setFunctionProtoAndParent(this, Context.getCurrentContext(), scriptable);
        setImmunePrototypeProperty(scriptable2);
        scriptable2.setParentScope(this);
        ScriptableObject.defineProperty(scriptable2, "constructor", this, i);
        setParentScope(scriptable);
    }

    public boolean isVarArgsConstructor() {
        if (this.parmsLength == -2) {
            return true;
        }
        return false;
    }

    public boolean isVarArgsMethod() {
        if (this.parmsLength == -1) {
            return true;
        }
        return false;
    }

    public void addAsConstructor(Scriptable scriptable, Scriptable scriptable2, int i) {
        initAsConstructor(scriptable, scriptable2, i);
        ScriptableObject.defineProperty(scriptable, scriptable2.getClassName(), this, 2);
    }

    @Deprecated
    public static Object convertArg(Context context, Scriptable scriptable, Object obj, Class<?> cls) {
        int typeTag = getTypeTag(cls);
        if (typeTag != 0) {
            return convertArg(context, scriptable, obj, typeTag);
        }
        throw Context.reportRuntimeErrorById("msg.cant.convert", cls.getName());
    }
}
