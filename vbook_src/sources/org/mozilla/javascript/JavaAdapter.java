package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.optimizer.Signatures;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class JavaAdapter implements IdFunctionCall {
    private static final Object FTAG = "JavaAdapter";
    private static final int Id_JavaAdapter = 1;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class JavaAdapterSignature {
        Class<?>[] interfaces;
        Map<String, Integer> names;
        Class<?> superClass;

        public JavaAdapterSignature(Class<?> cls, Class<?>[] clsArr, Map<String, Integer> map) {
            this.superClass = cls;
            this.interfaces = clsArr;
            this.names = map;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof JavaAdapterSignature)) {
                return false;
            }
            JavaAdapterSignature javaAdapterSignature = (JavaAdapterSignature) obj;
            if (this.superClass != javaAdapterSignature.superClass) {
                return false;
            }
            Class<?>[] clsArr = this.interfaces;
            Class<?>[] clsArr2 = javaAdapterSignature.interfaces;
            if (clsArr != clsArr2) {
                if (clsArr.length != clsArr2.length) {
                    return false;
                }
                int i = 0;
                while (true) {
                    Class<?>[] clsArr3 = this.interfaces;
                    if (i >= clsArr3.length) {
                        break;
                    } else if (clsArr3[i] != javaAdapterSignature.interfaces[i]) {
                        return false;
                    } else {
                        i++;
                    }
                }
            }
            if (this.names.size() != javaAdapterSignature.names.size()) {
                return false;
            }
            for (Map.Entry<String, Integer> entry : this.names.entrySet()) {
                int intValue = entry.getValue().intValue();
                if (intValue != javaAdapterSignature.names.getOrDefault(entry.getKey(), Integer.valueOf(intValue + 1)).intValue()) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.names.size() ^ (this.superClass.hashCode() + Arrays.hashCode(this.interfaces));
        }
    }

    public static /* synthetic */ ScriptableObject a(Script script, Context context) {
        return lambda$runScript$1(script, context);
    }

    public static int appendMethodSignature(Class<?>[] clsArr, Class<?> cls, StringBuilder sb) {
        sb.append('(');
        int length = clsArr.length + 1;
        for (Class<?> cls2 : clsArr) {
            appendTypeString(sb, cls2);
            if (cls2 == Long.TYPE || cls2 == Double.TYPE) {
                length++;
            }
        }
        sb.append(')');
        appendTypeString(sb, cls);
        return length;
    }

    private static void appendOverridableMethods(Class<?> cls, List<Method> list, Set<String> set) {
        Method[] declaredMethods;
        if (cls.isInterface()) {
            declaredMethods = cls.getMethods();
        } else {
            declaredMethods = cls.getDeclaredMethods();
        }
        for (Method method : declaredMethods) {
            String u = nk2.u(method.getName(), getMethodSignature(method, method.getParameterTypes()));
            if (!set.contains(u)) {
                int modifiers = method.getModifiers();
                if (!Modifier.isStatic(modifiers)) {
                    if (Modifier.isFinal(modifiers)) {
                        set.add(u);
                    } else if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers)) {
                        list.add(method);
                        set.add(u);
                    }
                }
            }
        }
    }

    private static StringBuilder appendTypeString(StringBuilder sb, Class<?> cls) {
        char upperCase;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                upperCase = 'Z';
            } else if (cls == Long.TYPE) {
                upperCase = 'J';
            } else {
                upperCase = Character.toUpperCase(cls.getName().charAt(0));
            }
            sb.append(upperCase);
            return sb;
        }
        sb.append('L');
        sb.append(cls.getName().replace('.', '/'));
        sb.append(';');
        return sb;
    }

    public static Object callMethod(ContextFactory contextFactory, final Scriptable scriptable, final Function function, final Object[] objArr, final long j) {
        if (function == null) {
            return null;
        }
        if (contextFactory == null) {
            contextFactory = ContextFactory.getGlobal();
        }
        final Scriptable parentScope = function.getParentScope();
        if (j == 0) {
            return Context.call(contextFactory, function, parentScope, scriptable, objArr);
        }
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null) {
            return doCall(currentContext, parentScope, scriptable, function, objArr, j);
        }
        return contextFactory.call(new ContextAction() { // from class: l26
            @Override // org.mozilla.javascript.ContextAction
            public final Object run(Context context) {
                Object lambda$callMethod$0;
                lambda$callMethod$0 = JavaAdapter.lambda$callMethod$0(Scriptable.this, scriptable, function, objArr, j, context);
                return lambda$callMethod$0;
            }
        });
    }

    public static Object convertResult(Object obj, Class<?> cls) {
        if (obj == Undefined.instance && cls != ScriptRuntime.ObjectClass && cls != ScriptRuntime.StringClass) {
            return null;
        }
        return Context.jsToJava(obj, cls);
    }

    public static byte[] createAdapterCode(Map<String, Integer> map, String str, Class<?> cls, Class<?>[] clsArr, String str2) {
        int length;
        Constructor<?>[] declaredConstructors;
        String str3;
        int i;
        fi1 fi1Var;
        int i2;
        Map<String, Integer> map2 = map;
        String str4 = str;
        Class<?>[] clsArr2 = clsArr;
        int i3 = 0;
        fi1 fi1Var2 = new fi1(str4, cls.getName(), "<adapter>");
        fi1Var2.k("factory", "Lorg/mozilla/javascript/ContextFactory;", (short) 17);
        fi1Var2.k("delegee", "Lorg/mozilla/javascript/Scriptable;", (short) 17);
        fi1Var2.k("self", "Lorg/mozilla/javascript/Scriptable;", (short) 17);
        if (clsArr2 == null) {
            length = 0;
        } else {
            length = clsArr2.length;
        }
        for (int i4 = 0; i4 < length; i4++) {
            Class<?> cls2 = clsArr2[i4];
            if (cls2 != null) {
                fi1Var2.r.add(Short.valueOf(fi1Var2.k.a(cls2.getName())));
            }
        }
        String replace = cls.getName().replace('.', '/');
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            int modifiers = constructor.getModifiers();
            if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers)) {
                generateCtor(fi1Var2, str4, replace, constructor);
            }
        }
        generateSerialCtor(fi1Var2, str4, replace);
        if (str2 != null) {
            generateEmptyCtor(fi1Var2, str4, replace, str2);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i5 = 0;
        while (i5 < length) {
            Method[] methods = clsArr2[i5].getMethods();
            int length2 = methods.length;
            int i6 = i3;
            while (i6 < length2) {
                Method method = methods[i6];
                int modifiers2 = method.getModifiers();
                if (Modifier.isStatic(modifiers2) || Modifier.isFinal(modifiers2) || method.isDefault()) {
                    i = length2;
                    fi1Var = fi1Var2;
                    i2 = i6;
                } else {
                    int i7 = length2;
                    fi1Var = fi1Var2;
                    String name = method.getName();
                    i2 = i6;
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (!map2.containsKey(name)) {
                        try {
                            cls.getMethod(name, parameterTypes);
                        } catch (NoSuchMethodException unused) {
                        }
                        i = i7;
                    }
                    String u = nk2.u(name, getMethodSignature(method, parameterTypes));
                    if (!hashMap.containsKey(u)) {
                        i = i7;
                        fi1Var = fi1Var;
                        generateMethod(fi1Var, str4, name, parameterTypes, method.getReturnType(), true);
                        hashMap.put(u, 0);
                        hashMap2.put(name, 0);
                    } else {
                        fi1Var = fi1Var;
                        i = i7;
                    }
                }
                i6 = i2 + 1;
                str4 = str;
                fi1Var2 = fi1Var;
                length2 = i;
            }
            i5++;
            str4 = str;
            clsArr2 = clsArr;
            i3 = 0;
        }
        fi1 fi1Var3 = fi1Var2;
        Method[] overridableMethods = getOverridableMethods(cls);
        int length3 = overridableMethods.length;
        int i8 = 0;
        while (i8 < length3) {
            Method method2 = overridableMethods[i8];
            boolean isAbstract = Modifier.isAbstract(method2.getModifiers());
            String name2 = method2.getName();
            if (isAbstract || map2.containsKey(name2)) {
                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                String methodSignature = getMethodSignature(method2, parameterTypes2);
                String u2 = nk2.u(name2, methodSignature);
                if (!hashMap.containsKey(u2)) {
                    generateMethod(fi1Var3, str, name2, parameterTypes2, method2.getReturnType(), true);
                    hashMap.put(u2, 0);
                    hashMap2.put(name2, 0);
                    if (!isAbstract) {
                        str3 = replace;
                        generateSuper(fi1Var3, str, str3, name2, methodSignature, parameterTypes2, method2.getReturnType());
                        i8++;
                        map2 = map;
                        replace = str3;
                    }
                }
            }
            str3 = replace;
            i8++;
            map2 = map;
            replace = str3;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!hashMap2.containsKey(key)) {
                int intValue = entry.getValue().intValue();
                Class[] clsArr3 = new Class[intValue];
                for (int i9 = 0; i9 < intValue; i9++) {
                    clsArr3[i9] = ScriptRuntime.ObjectClass;
                }
                fi1 fi1Var4 = fi1Var3;
                generateMethod(fi1Var4, str, key, clsArr3, ScriptRuntime.ObjectClass, false);
                fi1Var3 = fi1Var4;
            }
        }
        return fi1Var3.P();
    }

    public static Scriptable createAdapterWrapper(Scriptable scriptable, Object obj) {
        NativeJavaObject nativeJavaObject = new NativeJavaObject(ScriptableObject.getTopLevelScope(scriptable), obj, null, true);
        nativeJavaObject.setPrototype(scriptable);
        return nativeJavaObject;
    }

    private static Object doCall(Context context, Scriptable scriptable, Scriptable scriptable2, Function function, Object[] objArr, long j) {
        for (int i = 0; i != objArr.length; i++) {
            if (0 != ((1 << i) & j)) {
                Object obj = objArr[i];
                if (!(obj instanceof Scriptable)) {
                    objArr[i] = context.getWrapFactory().wrap(context, scriptable, obj, null);
                }
            }
        }
        return function.call(context, scriptable, scriptable2, objArr);
    }

    private static void generateCtor(fi1 fi1Var, String str, String str2, Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int i = 3;
        if (parameterTypes.length == 0) {
            fi1Var.N("<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/ContextFactory;)V", (short) 1);
            fi1Var.c(42);
            fi1Var.m(str2, "<init>", Token.TAGGED_TEMPLATE_LITERAL, "()V");
        } else {
            StringBuilder sb = new StringBuilder("(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/ContextFactory;");
            int length = sb.length();
            for (Class<?> cls : parameterTypes) {
                appendTypeString(sb, cls);
            }
            sb.append(")V");
            fi1Var.N("<init>", sb.toString(), (short) 1);
            fi1Var.c(42);
            for (Class<?> cls2 : parameterTypes) {
                i += generatePushParam(fi1Var, i, cls2);
            }
            sb.delete(1, length);
            fi1Var.m(str2, "<init>", Token.TAGGED_TEMPLATE_LITERAL, sb.toString());
        }
        fi1Var.c(42);
        fi1Var.c(43);
        fi1Var.f(str, "delegee", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        fi1Var.c(42);
        fi1Var.c(44);
        fi1Var.f(str, "factory", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/ContextFactory;");
        fi1Var.c(42);
        fi1Var.c(43);
        fi1Var.c(42);
        fi1Var.m("org/mozilla/javascript/JavaAdapter", "createAdapterWrapper", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        fi1Var.f(str, "self", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        fi1Var.c(Token.METHOD);
        fi1Var.O(i);
    }

    private static void generateEmptyCtor(fi1 fi1Var, String str, String str2, String str3) {
        fi1Var.N("<init>", "()V", (short) 1);
        fi1Var.c(42);
        fi1Var.m(str2, "<init>", Token.TAGGED_TEMPLATE_LITERAL, "()V");
        fi1Var.c(42);
        fi1Var.c(1);
        fi1Var.f(str, "factory", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/ContextFactory;");
        fi1Var.e(Token.LAST_TOKEN, str3);
        fi1Var.c(89);
        fi1Var.m(str3, "<init>", Token.TAGGED_TEMPLATE_LITERAL, "()V");
        fi1Var.m("org/mozilla/javascript/JavaAdapter", "runScript", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Script;)Lorg/mozilla/javascript/Scriptable;");
        fi1Var.c(76);
        fi1Var.c(42);
        fi1Var.c(43);
        fi1Var.f(str, "delegee", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        fi1Var.c(42);
        fi1Var.c(43);
        fi1Var.c(42);
        fi1Var.m("org/mozilla/javascript/JavaAdapter", "createAdapterWrapper", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        fi1Var.f(str, "self", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        fi1Var.c(Token.METHOD);
        fi1Var.O(2);
    }

    private static void generateMethod(fi1 fi1Var, String str, String str2, Class<?>[] clsArr, Class<?> cls, boolean z) {
        StringBuilder sb = new StringBuilder();
        int appendMethodSignature = appendMethodSignature(clsArr, cls, sb);
        fi1Var.N(str2, sb.toString(), (short) 1);
        fi1Var.c(42);
        fi1Var.f(str, "factory", 180, "Lorg/mozilla/javascript/ContextFactory;");
        fi1Var.c(42);
        fi1Var.f(str, "self", 180, "Lorg/mozilla/javascript/Scriptable;");
        fi1Var.c(42);
        fi1Var.f(str, "delegee", 180, "Lorg/mozilla/javascript/Scriptable;");
        fi1Var.s(str2);
        fi1Var.m("org/mozilla/javascript/JavaAdapter", "getFunction", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Lorg/mozilla/javascript/Function;");
        generatePushWrappedArgs(fi1Var, clsArr, clsArr.length);
        if (clsArr.length <= 64) {
            long j = 0;
            for (int i = 0; i != clsArr.length; i++) {
                if (!clsArr[i].isPrimitive()) {
                    j |= 1 << i;
                }
            }
            int i2 = (int) j;
            if (i2 == j) {
                fi1Var.r(i2);
                fi1Var.c(Token.BREAK);
            } else {
                fi1Var.d(20, fi1Var.k.d(j));
            }
            fi1Var.m("org/mozilla/javascript/JavaAdapter", "callMethod", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/ContextFactory;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Function;[Ljava/lang/Object;J)Ljava/lang/Object;");
            generateReturnResult(fi1Var, cls, z);
            fi1Var.O((short) appendMethodSignature);
            return;
        }
        throw Context.reportRuntimeErrorById("JavaAdapter can not subclass methods with more then 64 arguments.", new Object[0]);
    }

    private static void generatePopResult(fi1 fi1Var, Class<?> cls) {
        if (cls.isPrimitive()) {
            char charAt = cls.getName().charAt(0);
            if (charAt != 'f') {
                if (charAt != 'i') {
                    if (charAt != 'l') {
                        if (charAt != 's' && charAt != 'z') {
                            switch (charAt) {
                                case Token.COMMA /* 98 */:
                                case 'c':
                                    break;
                                case 'd':
                                    fi1Var.c(Token.COMMENT);
                                    return;
                                default:
                                    return;
                            }
                        }
                    } else {
                        fi1Var.c(Token.WITHEXPR);
                        return;
                    }
                }
                fi1Var.c(Token.LETEXPR);
                return;
            }
            fi1Var.c(Token.DEBUGGER);
            return;
        }
        fi1Var.c(Token.GENEXPR);
    }

    private static int generatePushParam(fi1 fi1Var, int i, Class<?> cls) {
        if (!cls.isPrimitive()) {
            fi1Var.g(i);
            return 1;
        }
        char charAt = cls.getName().charAt(0);
        if (charAt != 'f') {
            if (charAt != 'i') {
                if (charAt != 'l') {
                    if (charAt != 's' && charAt != 'z') {
                        switch (charAt) {
                            case Token.COMMA /* 98 */:
                            case 'c':
                                break;
                            case 'd':
                                fi1Var.i(i);
                                return 2;
                            default:
                                throw Kit.codeBug();
                        }
                    }
                } else {
                    fi1Var.Q(30, 22, i);
                    return 2;
                }
            }
            fi1Var.l(i);
            return 1;
        }
        fi1Var.Q(34, 23, i);
        return 1;
    }

    public static void generatePushWrappedArgs(fi1 fi1Var, Class<?>[] clsArr, int i) {
        fi1Var.r(i);
        fi1Var.e(189, "java/lang/Object");
        int i2 = 1;
        for (int i3 = 0; i3 != clsArr.length; i3++) {
            fi1Var.c(89);
            fi1Var.r(i3);
            i2 += generateWrapArg(fi1Var, i2, clsArr[i3]);
            fi1Var.c(83);
        }
    }

    public static void generateReturnResult(fi1 fi1Var, Class<?> cls, boolean z) {
        if (cls == Void.TYPE) {
            fi1Var.c(87);
            fi1Var.c(Token.METHOD);
        } else if (cls == Boolean.TYPE) {
            fi1Var.m("org/mozilla/javascript/Context", "toBoolean", Token.DOTDOTDOT, Signatures.MATH_TO_BOOLEAN);
            fi1Var.c(Token.LETEXPR);
        } else if (cls == Character.TYPE) {
            fi1Var.m("org/mozilla/javascript/Context", "toString", Token.DOTDOTDOT, "(Ljava/lang/Object;)Ljava/lang/String;");
            fi1Var.c(3);
            fi1Var.m("java/lang/String", "charAt", Token.TEMPLATE_LITERAL_SUBST, "(I)C");
            fi1Var.c(Token.LETEXPR);
        } else if (cls.isPrimitive()) {
            fi1Var.m("org/mozilla/javascript/Context", "toNumber", Token.DOTDOTDOT, Signatures.MATH_TO_NUMBER);
            char charAt = cls.getName().charAt(0);
            if (charAt != 'b') {
                if (charAt != 'd') {
                    if (charAt != 'f') {
                        if (charAt != 'i') {
                            if (charAt != 'l') {
                                if (charAt != 's') {
                                    cy7.e("Unexpected return type ".concat(String.valueOf(cls)));
                                    return;
                                }
                            } else {
                                fi1Var.c(Token.BLOCK);
                                fi1Var.c(Token.WITHEXPR);
                                return;
                            }
                        }
                    } else {
                        fi1Var.c(Token.LABEL);
                        fi1Var.c(Token.DEBUGGER);
                        return;
                    }
                } else {
                    fi1Var.c(Token.COMMENT);
                    return;
                }
            }
            fi1Var.c(Token.COMPUTED_PROPERTY);
            fi1Var.c(Token.LETEXPR);
        } else {
            String name = cls.getName();
            if (z) {
                fi1Var.d(18, fi1Var.k.e(name));
                fi1Var.m("java/lang/Class", "forName", Token.DOTDOTDOT, "(Ljava/lang/String;)Ljava/lang/Class;");
                fi1Var.m("org/mozilla/javascript/JavaAdapter", "convertResult", Token.DOTDOTDOT, "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;");
            }
            fi1Var.e(192, name);
            fi1Var.c(Token.GENEXPR);
        }
    }

    private static void generateSerialCtor(fi1 fi1Var, String str, String str2) {
        fi1Var.N("<init>", "(Lorg/mozilla/javascript/ContextFactory;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;)V", (short) 1);
        fi1Var.c(42);
        fi1Var.m(str2, "<init>", Token.TAGGED_TEMPLATE_LITERAL, "()V");
        fi1Var.c(42);
        fi1Var.c(43);
        fi1Var.f(str, "factory", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/ContextFactory;");
        fi1Var.c(42);
        fi1Var.c(44);
        fi1Var.f(str, "delegee", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        fi1Var.c(42);
        fi1Var.c(45);
        fi1Var.f(str, "self", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        fi1Var.c(Token.METHOD);
        fi1Var.O(4);
    }

    private static void generateSuper(fi1 fi1Var, String str, String str2, String str3, String str4, Class<?>[] clsArr, Class<?> cls) {
        fi1Var.N("super$" + str3, str4, (short) 1);
        fi1Var.d(25, 0);
        int i = 1;
        for (Class<?> cls2 : clsArr) {
            i += generatePushParam(fi1Var, i, cls2);
        }
        fi1Var.m(str2, str3, Token.TAGGED_TEMPLATE_LITERAL, str4);
        if (!cls.equals(Void.TYPE)) {
            generatePopResult(fi1Var, cls);
        } else {
            fi1Var.c(Token.METHOD);
        }
        fi1Var.O((short) (i + 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0067, code lost:
        if (r9 != 's') goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int generateWrapArg(defpackage.fi1 r7, int r8, java.lang.Class<?> r9) {
        /*
            boolean r0 = r9.isPrimitive()
            r1 = 1
            if (r0 != 0) goto Ld
            r9 = 25
            r7.d(r9, r8)
            return r1
        Ld:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.String r2 = "<init>"
            r3 = 183(0xb7, float:2.56E-43)
            r4 = 89
            r5 = 187(0xbb, float:2.62E-43)
            r6 = 21
            if (r9 != r0) goto L2c
            java.lang.String r9 = "java/lang/Boolean"
            r7.e(r5, r9)
            r7.c(r4)
            r7.d(r6, r8)
            java.lang.String r8 = "(Z)V"
            r7.m(r9, r2, r3, r8)
            return r1
        L2c:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r9 != r0) goto L3f
            r7.d(r6, r8)
            java.lang.String r8 = "valueOf"
            java.lang.String r9 = "(C)Ljava/lang/String;"
            java.lang.String r0 = "java/lang/String"
            r2 = 184(0xb8, float:2.58E-43)
            r7.m(r0, r8, r2, r9)
            return r1
        L3f:
            java.lang.String r0 = "java/lang/Double"
            r7.e(r5, r0)
            r7.c(r4)
            java.lang.String r9 = r9.getName()
            r4 = 0
            char r9 = r9.charAt(r4)
            r4 = 98
            if (r9 == r4) goto L87
            r4 = 100
            r5 = 2
            if (r9 == r4) goto L81
            r4 = 102(0x66, float:1.43E-43)
            if (r9 == r4) goto L76
            r4 = 105(0x69, float:1.47E-43)
            if (r9 == r4) goto L87
            r4 = 108(0x6c, float:1.51E-43)
            if (r9 == r4) goto L6a
            r4 = 115(0x73, float:1.61E-43)
            if (r9 == r4) goto L87
            goto L8f
        L6a:
            r9 = 22
            r7.d(r9, r8)
            r8 = 138(0x8a, float:1.93E-43)
            r7.c(r8)
        L74:
            r1 = r5
            goto L8f
        L76:
            r9 = 23
            r7.d(r9, r8)
            r8 = 141(0x8d, float:1.98E-43)
            r7.c(r8)
            goto L8f
        L81:
            r9 = 24
            r7.d(r9, r8)
            goto L74
        L87:
            r7.d(r6, r8)
            r8 = 135(0x87, float:1.89E-43)
            r7.c(r8)
        L8f:
            java.lang.String r8 = "(D)V"
            r7.m(r0, r2, r3, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.JavaAdapter.generateWrapArg(fi1, int, java.lang.Class):int");
    }

    private static Class<?> getAdapterClass(Scriptable scriptable, Class<?> cls, Class<?>[] clsArr, Scriptable scriptable2) {
        ClassCache classCache = ClassCache.get(scriptable);
        Map<JavaAdapterSignature, Class<?>> interfaceAdapterCacheMap = classCache.getInterfaceAdapterCacheMap();
        Map<String, Integer> objectFunctionNames = getObjectFunctionNames(scriptable2);
        JavaAdapterSignature javaAdapterSignature = new JavaAdapterSignature(cls, clsArr, objectFunctionNames);
        Class<?> cls2 = interfaceAdapterCacheMap.get(javaAdapterSignature);
        if (cls2 == null) {
            String j = a82.j(classCache.newClassSerialNumber(), "adapter");
            Class<?> loadAdapterClass = loadAdapterClass(j, createAdapterCode(objectFunctionNames, j, cls, clsArr, null));
            if (classCache.isCachingEnabled()) {
                interfaceAdapterCacheMap.put(javaAdapterSignature, loadAdapterClass);
            }
            return loadAdapterClass;
        }
        return cls2;
    }

    public static Object getAdapterSelf(Class<?> cls, Object obj) {
        return cls.getDeclaredField("self").get(obj);
    }

    public static int[] getArgsToConvert(Class<?>[] clsArr) {
        int i = 0;
        for (int i2 = 0; i2 != clsArr.length; i2++) {
            if (!clsArr[i2].isPrimitive()) {
                i++;
            }
        }
        if (i == 0) {
            return null;
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 != clsArr.length; i4++) {
            if (!clsArr[i4].isPrimitive()) {
                iArr[i3] = i4;
                i3++;
            }
        }
        return iArr;
    }

    public static Function getFunction(Scriptable scriptable, String str) {
        Object property = ScriptableObject.getProperty(scriptable, str);
        if (property == Scriptable.NOT_FOUND) {
            return null;
        }
        if (property instanceof Function) {
            return (Function) property;
        }
        throw ScriptRuntime.notFunctionError(property, str);
    }

    private static String getMethodSignature(Method method, Class<?>[] clsArr) {
        StringBuilder sb = new StringBuilder();
        appendMethodSignature(clsArr, method.getReturnType(), sb);
        return sb.toString();
    }

    private static Map<String, Integer> getObjectFunctionNames(Scriptable scriptable) {
        Object[] propertyIds = ScriptableObject.getPropertyIds(scriptable);
        HashMap hashMap = new HashMap();
        for (int i = 0; i != propertyIds.length; i++) {
            Object obj = propertyIds[i];
            if (obj instanceof String) {
                String str = (String) obj;
                Object property = ScriptableObject.getProperty(scriptable, str);
                if (property instanceof Function) {
                    int int32 = ScriptRuntime.toInt32(ScriptableObject.getProperty((Function) property, "length"));
                    if (int32 < 0) {
                        int32 = 0;
                    }
                    hashMap.put(str, Integer.valueOf(int32));
                }
            }
        }
        return hashMap;
    }

    public static Method[] getOverridableMethods(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            appendOverridableMethods(cls2, arrayList, hashSet);
        }
        while (true) {
            if (cls != null) {
                for (Class<?> cls3 : cls.getInterfaces()) {
                    appendOverridableMethods(cls3, arrayList, hashSet);
                }
                cls = cls.getSuperclass();
            } else {
                return (Method[]) arrayList.toArray(new Method[0]);
            }
        }
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        IdFunctionObject idFunctionObject = new IdFunctionObject(new JavaAdapter(), FTAG, 1, "JavaAdapter", 1, scriptable);
        idFunctionObject.markAsConstructor(null);
        if (z) {
            idFunctionObject.sealObject();
        }
        idFunctionObject.exportAsScopeProperty();
    }

    public static Object js_createAdapter(Context context, Scriptable scriptable, Object[] objArr) {
        Object newInstance;
        int length = objArr.length;
        if (length != 0) {
            int i = 0;
            while (i < length - 1) {
                Object obj = objArr[i];
                if (obj instanceof NativeObject) {
                    break;
                } else if (obj instanceof NativeJavaClass) {
                    i++;
                } else {
                    throw ScriptRuntime.typeErrorById("msg.not.java.class.arg", String.valueOf(i), ScriptRuntime.toString(obj));
                }
            }
            Class[] clsArr = new Class[i];
            Class<?> cls = null;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Class<?> classObject = ((NativeJavaClass) objArr[i3]).getClassObject();
                if (!classObject.isInterface()) {
                    if (cls == null) {
                        cls = classObject;
                    } else {
                        throw ScriptRuntime.typeErrorById("msg.only.one.super", cls.getName(), classObject.getName());
                    }
                } else {
                    clsArr[i2] = classObject;
                    i2++;
                }
            }
            if (cls == null) {
                cls = ScriptRuntime.ObjectClass;
            }
            Class[] clsArr2 = new Class[i2];
            System.arraycopy(clsArr, 0, clsArr2, 0, i2);
            Scriptable ensureScriptable = ScriptableObject.ensureScriptable(objArr[i]);
            Class<?> adapterClass = getAdapterClass(scriptable, cls, clsArr2, ensureScriptable);
            int i4 = length - i;
            int i5 = i4 - 1;
            try {
                if (i5 > 0) {
                    Object[] objArr2 = new Object[i4 + 1];
                    objArr2[0] = ensureScriptable;
                    objArr2[1] = context.getFactory();
                    System.arraycopy(objArr, i + 1, objArr2, 2, i5);
                    NativeJavaMethod nativeJavaMethod = new NativeJavaClass(scriptable, adapterClass, true).members.ctors;
                    int findCachedFunction = nativeJavaMethod.findCachedFunction(context, objArr2);
                    if (findCachedFunction >= 0) {
                        newInstance = NativeJavaClass.constructInternal(objArr2, nativeJavaMethod.methods[findCachedFunction]);
                    } else {
                        throw Context.reportRuntimeErrorById("msg.no.java.ctor", adapterClass.getName(), NativeJavaMethod.scriptSignature(objArr));
                    }
                } else {
                    newInstance = adapterClass.getConstructor(ScriptRuntime.ScriptableClass, ScriptRuntime.ContextFactoryClass).newInstance(ensureScriptable, context.getFactory());
                }
                Object adapterSelf = getAdapterSelf(adapterClass, newInstance);
                if (adapterSelf instanceof Wrapper) {
                    Object unwrap = ((Wrapper) adapterSelf).unwrap();
                    if (unwrap instanceof Scriptable) {
                        if (unwrap instanceof ScriptableObject) {
                            ScriptRuntime.setObjectProtoAndParent((ScriptableObject) unwrap, scriptable);
                        }
                        return unwrap;
                    }
                }
                return adapterSelf;
            } catch (Exception e) {
                throw Context.throwAsScriptRuntimeEx(e);
            }
        }
        throw ScriptRuntime.typeErrorById("msg.adapter.zero.args", new Object[0]);
    }

    public static /* synthetic */ Object lambda$callMethod$0(Scriptable scriptable, Scriptable scriptable2, Function function, Object[] objArr, long j, Context context) {
        return doCall(context, scriptable, scriptable2, function, objArr, j);
    }

    public static /* synthetic */ ScriptableObject lambda$runScript$1(Script script, Context context) {
        ScriptableObject global = ScriptRuntime.getGlobal(context);
        script.exec(context, global);
        return global;
    }

    public static Class<?> loadAdapterClass(String str, byte[] bArr) {
        ProtectionDomain scriptProtectionDomain;
        Class<?> staticSecurityDomainClass = SecurityController.getStaticSecurityDomainClass();
        if (staticSecurityDomainClass == CodeSource.class || staticSecurityDomainClass == ProtectionDomain.class) {
            scriptProtectionDomain = SecurityUtilities.getScriptProtectionDomain();
            if (scriptProtectionDomain == null) {
                scriptProtectionDomain = JavaAdapter.class.getProtectionDomain();
            }
            if (staticSecurityDomainClass == CodeSource.class) {
                if (scriptProtectionDomain != null) {
                    scriptProtectionDomain = scriptProtectionDomain.getCodeSource();
                }
            }
            GeneratedClassLoader createLoader = SecurityController.createLoader(null, scriptProtectionDomain);
            Class<?> defineClass = createLoader.defineClass(str, bArr);
            createLoader.linkClass(defineClass);
            return defineClass;
        }
        scriptProtectionDomain = null;
        GeneratedClassLoader createLoader2 = SecurityController.createLoader(null, scriptProtectionDomain);
        Class<?> defineClass2 = createLoader2.defineClass(str, bArr);
        createLoader2.linkClass(defineClass2);
        return defineClass2;
    }

    public static Object readAdapterObject(Scriptable scriptable, ObjectInputStream objectInputStream) {
        ContextFactory contextFactory;
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null) {
            contextFactory = currentContext.getFactory();
        } else {
            contextFactory = null;
        }
        Class<?> cls = Class.forName((String) objectInputStream.readObject());
        String[] strArr = (String[]) objectInputStream.readObject();
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            clsArr[i] = Class.forName(strArr[i]);
        }
        Scriptable scriptable2 = (Scriptable) objectInputStream.readObject();
        Class<?> adapterClass = getAdapterClass(scriptable, cls, clsArr, scriptable2);
        Class<?> cls2 = ScriptRuntime.ContextFactoryClass;
        Class<Scriptable> cls3 = ScriptRuntime.ScriptableClass;
        try {
            return adapterClass.getConstructor(cls2, cls3, cls3).newInstance(contextFactory, scriptable2, scriptable);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            throw new ClassNotFoundException("adapter");
        }
    }

    public static Scriptable runScript(Script script) {
        return (Scriptable) ContextFactory.getGlobal().call(new q6(script, 28));
    }

    public static void writeAdapterObject(Object obj, ObjectOutputStream objectOutputStream) {
        Class<?> cls = obj.getClass();
        objectOutputStream.writeObject(cls.getSuperclass().getName());
        Class<?>[] interfaces = cls.getInterfaces();
        String[] strArr = new String[interfaces.length];
        for (int i = 0; i < interfaces.length; i++) {
            strArr[i] = interfaces[i].getName();
        }
        objectOutputStream.writeObject(strArr);
        try {
            objectOutputStream.writeObject(cls.getField("delegee").get(obj));
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            throw new IOException();
        }
    }

    @Override // org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (idFunctionObject.hasTag(FTAG) && idFunctionObject.methodId() == 1) {
            return js_createAdapter(context, scriptable, objArr);
        }
        throw idFunctionObject.unknown();
    }
}
