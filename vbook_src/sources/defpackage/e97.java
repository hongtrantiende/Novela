package defpackage;

import com.highcapable.kavaref.platform.ExecutableAccessor;
import com.highcapable.kavaref.platform.FieldAccessor;
import com.highcapable.kavaref.platform.MemberAccessor;
import com.highcapable.kavaref.platform.MethodAccessor;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e97  reason: default package */
/* loaded from: classes.dex */
public abstract class e97 {
    public static final boolean A(y67 y67Var, List list, ExecutableAccessor executableAccessor) {
        Annotation[][] parameterAnnotations = executableAccessor.getParameterAnnotations();
        ArrayList arrayList = new ArrayList(parameterAnnotations.length);
        for (Annotation[] annotationArr : parameterAnnotations) {
            ArrayList arrayList2 = new ArrayList(annotationArr.length);
            for (Annotation annotation : annotationArr) {
                arrayList2.add(nmd.B(nmd.A(annotation)));
            }
            arrayList.add(arrayList2);
        }
        return q(list, arrayList, y67Var);
    }

    public static final boolean B(y67 y67Var, List list, ExecutableAccessor executableAccessor) {
        Annotation[][] parameterAnnotations = executableAccessor.getParameterAnnotations();
        ArrayList arrayList = new ArrayList(parameterAnnotations.length);
        for (Annotation[] annotationArr : parameterAnnotations) {
            ArrayList arrayList2 = new ArrayList(annotationArr.length);
            for (Annotation annotation : annotationArr) {
                arrayList2.add(nmd.B(nmd.A(annotation)));
            }
            arrayList.add(arrayList2);
        }
        return !q(list, arrayList, y67Var);
    }

    public static final boolean C(y67 y67Var, Set set, ExecutableAccessor executableAccessor) {
        Annotation[] annotations = executableAccessor.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(nmd.B(nmd.A(annotation)));
        }
        return p(set, arrayList, y67Var);
    }

    public static final boolean D(y67 y67Var, Set set, ExecutableAccessor executableAccessor) {
        Annotation[] annotations = executableAccessor.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(nmd.B(nmd.A(annotation)));
        }
        return !p(set, arrayList, y67Var);
    }

    public static final boolean E(y67 y67Var, Set set, ExecutableAccessor executableAccessor) {
        Annotation[] annotations = executableAccessor.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(nmd.B(nmd.A(annotation)));
        }
        return p(set, arrayList, y67Var);
    }

    public static final boolean F(xt4 xt4Var, ExecutableAccessor executableAccessor) {
        Boolean gs9Var;
        try {
            Boolean bool = (Boolean) xt4Var.invoke(b00.D0(executableAccessor.getParameterTypes()));
            bool.booleanValue();
            gs9Var = bool;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Object obj = Boolean.FALSE;
        boolean z = gs9Var instanceof gs9;
        Object obj2 = gs9Var;
        if (z) {
            obj2 = obj;
        }
        return ((Boolean) obj2).booleanValue();
    }

    public static final boolean G(y67 y67Var, Set set, ExecutableAccessor executableAccessor) {
        Annotation[] annotations = executableAccessor.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(nmd.B(nmd.A(annotation)));
        }
        return !p(set, arrayList, y67Var);
    }

    public static final boolean H(y67 y67Var, Set set, ExecutableAccessor executableAccessor) {
        return p(set, o(executableAccessor.getAnnotatedParameterTypes()), y67Var);
    }

    public static final boolean I(y67 y67Var, Set set, ExecutableAccessor executableAccessor) {
        return !p(set, o(executableAccessor.getAnnotatedParameterTypes()), y67Var);
    }

    public static final boolean J(y67 y67Var, Set set, ExecutableAccessor executableAccessor) {
        return p(set, o(executableAccessor.getAnnotatedExceptionTypes()), y67Var);
    }

    public static final boolean K(y67 y67Var, Set set, ExecutableAccessor executableAccessor) {
        return !p(set, o(executableAccessor.getAnnotatedExceptionTypes()), y67Var);
    }

    public static final boolean L(int i, ExecutableAccessor executableAccessor) {
        if (executableAccessor.getParameterCount() == i) {
            return true;
        }
        return false;
    }

    public static final boolean M(xt4 xt4Var, ExecutableAccessor executableAccessor) {
        Boolean gs9Var;
        try {
            Boolean bool = (Boolean) xt4Var.invoke(Integer.valueOf(executableAccessor.getParameterCount()));
            bool.booleanValue();
            gs9Var = bool;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Object obj = Boolean.FALSE;
        boolean z = gs9Var instanceof gs9;
        Object obj2 = gs9Var;
        if (z) {
            obj2 = obj;
        }
        return ((Boolean) obj2).booleanValue();
    }

    public static final boolean N(Set set, ExecutableAccessor executableAccessor) {
        return r(set, b00.D0(executableAccessor.getTypeParameters()));
    }

    public static final boolean O(Set set, ExecutableAccessor executableAccessor) {
        return !r(set, b00.D0(executableAccessor.getTypeParameters()));
    }

    public static final boolean P(y67 y67Var, Set set, ExecutableAccessor executableAccessor) {
        return p(set, b00.D0(executableAccessor.getExceptionTypes()), y67Var);
    }

    public static final boolean Q(y67 y67Var, Set set, ExecutableAccessor executableAccessor) {
        return !p(set, b00.D0(executableAccessor.getExceptionTypes()), y67Var);
    }

    public static final boolean R(Set set, ExecutableAccessor executableAccessor) {
        return r(set, b00.D0(executableAccessor.getGenericExceptionTypes()));
    }

    public static final boolean S(boolean z, FieldAccessor fieldAccessor) {
        if (fieldAccessor.isEnumConstant() == z) {
            return true;
        }
        return false;
    }

    public static final boolean T(boolean z, FieldAccessor fieldAccessor) {
        if (fieldAccessor.isEnumConstant() != z) {
            return true;
        }
        return false;
    }

    public static final boolean U(y67 y67Var, Object obj, FieldAccessor fieldAccessor) {
        return c16.i(fieldAccessor.getType(), l0(obj, y67Var, "Field: type"));
    }

    public static final boolean V(xt4 xt4Var, FieldAccessor fieldAccessor) {
        return ((Boolean) xt4Var.invoke(fieldAccessor.getType())).booleanValue();
    }

    public static final boolean W(FieldAccessor fieldAccessor) {
        fieldAccessor.getGenericType();
        throw null;
    }

    public static final boolean X(xt4 xt4Var, FieldAccessor fieldAccessor) {
        return ((Boolean) xt4Var.invoke(fieldAccessor.getGenericType())).booleanValue();
    }

    public static ff4 Y(b9a b9aVar, y67 y67Var, String str, Object obj, lu4 lu4Var) {
        return new ff4(b9aVar, true, new nq3(obj, lu4Var, y67Var, str));
    }

    public static final boolean Z(y67 y67Var, Object obj, MethodAccessor methodAccessor) {
        return c16.i(methodAccessor.getReturnType(), l0(obj, y67Var, "Method: returnType"));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, lu4] */
    public static ff4 a(c00 c00Var, zo0 zo0Var, final y67 y67Var) {
        return Y(Y(Y(Y(Y(Y(Y(Y(Y(Y(new ki4(3, c00Var, new ww6(6)), y67Var, "name", (String) zo0Var.b, new Object()), y67Var, "nameCondition", null, new Object()), y67Var, "modifiers", (LinkedHashSet) zo0Var.c, new Object()), y67Var, "modifiersNot", (LinkedHashSet) zo0Var.d, new Object()), y67Var, "modifiersCondition", null, new Object()), y67Var, "isSynthetic", null, new Object()), y67Var, "isSyntheticNot", null, new Object()), y67Var, "annotations", (LinkedHashSet) zo0Var.e, new lu4() { // from class: r87
            @Override // defpackage.lu4
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(e97.i(y67.this, (Set) obj, (MemberAccessor) obj2));
            }
        }), y67Var, "annotationsNot", (LinkedHashSet) zo0Var.f, new lu4() { // from class: s87
            @Override // defpackage.lu4
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(e97.j(y67.this, (Set) obj, (MemberAccessor) obj2));
            }
        }), y67Var, "genericString", null, new Object());
    }

    public static final boolean a0(xt4 xt4Var, MethodAccessor methodAccessor) {
        Boolean gs9Var;
        try {
            Boolean bool = (Boolean) xt4Var.invoke(methodAccessor.getReturnType());
            bool.booleanValue();
            gs9Var = bool;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Object obj = Boolean.FALSE;
        boolean z = gs9Var instanceof gs9;
        Object obj2 = gs9Var;
        if (z) {
            obj2 = obj;
        }
        return ((Boolean) obj2).booleanValue();
    }

    public static final boolean b(String str, MemberAccessor memberAccessor) {
        return c16.i(memberAccessor.getName(), str);
    }

    public static final boolean b0(MethodAccessor methodAccessor) {
        methodAccessor.getGenericReturnType();
        throw null;
    }

    public static final boolean c(xt4 xt4Var, MemberAccessor memberAccessor) {
        Boolean gs9Var;
        try {
            Boolean bool = (Boolean) xt4Var.invoke(memberAccessor.getName());
            bool.booleanValue();
            gs9Var = bool;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Object obj = Boolean.FALSE;
        boolean z = gs9Var instanceof gs9;
        Object obj2 = gs9Var;
        if (z) {
            obj2 = obj;
        }
        return ((Boolean) obj2).booleanValue();
    }

    public static final boolean c0(xt4 xt4Var, MethodAccessor methodAccessor) {
        Boolean gs9Var;
        try {
            Boolean bool = (Boolean) xt4Var.invoke(methodAccessor.getGenericReturnType());
            bool.booleanValue();
            gs9Var = bool;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Object obj = Boolean.FALSE;
        boolean z = gs9Var instanceof gs9;
        Object obj2 = gs9Var;
        if (z) {
            obj2 = obj;
        }
        return ((Boolean) obj2).booleanValue();
    }

    public static final boolean d(Set set, MemberAccessor memberAccessor) {
        Set<vq7> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            for (vq7 vq7Var : set2) {
                if ((vq7Var.a & memberAccessor.getModifiers()) == 0) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static final boolean d0(boolean z, MethodAccessor methodAccessor) {
        if (methodAccessor.isBridge() == z) {
            return true;
        }
        return false;
    }

    public static final boolean e(Set set, MemberAccessor memberAccessor) {
        Set<vq7> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            for (vq7 vq7Var : set2) {
                if ((vq7Var.a & memberAccessor.getModifiers()) != 0) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static final boolean e0(boolean z, MethodAccessor methodAccessor) {
        if (methodAccessor.isBridge() != z) {
            return true;
        }
        return false;
    }

    public static final boolean f(xt4 xt4Var, MemberAccessor memberAccessor) {
        Object gs9Var;
        boolean z;
        try {
            kh5 kh5Var = vq7.b;
            int modifiers = memberAccessor.getModifiers();
            kh5Var.getClass();
            qu3 qu3Var = vq7.d;
            ArrayList arrayList = new ArrayList();
            Iterator it = qu3Var.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((((vq7) next).a & modifiers) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            gs9Var = (Boolean) xt4Var.invoke(sl1.H0(arrayList));
            gs9Var.getClass();
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Object obj = Boolean.FALSE;
        if (gs9Var instanceof gs9) {
            gs9Var = obj;
        }
        return ((Boolean) gs9Var).booleanValue();
    }

    public static final boolean f0(boolean z, MethodAccessor methodAccessor) {
        if (methodAccessor.isDefault() == z) {
            return true;
        }
        return false;
    }

    public static final boolean g(boolean z, MemberAccessor memberAccessor) {
        if (memberAccessor.isSynthetic() == z) {
            return true;
        }
        return false;
    }

    public static final boolean g0(boolean z, MethodAccessor methodAccessor) {
        if (methodAccessor.isDefault() != z) {
            return true;
        }
        return false;
    }

    public static final boolean h(boolean z, MemberAccessor memberAccessor) {
        if (memberAccessor.isSynthetic() != z) {
            return true;
        }
        return false;
    }

    public static final boolean h0(Object obj, MethodAccessor methodAccessor) {
        return c16.i(methodAccessor.getDefaultValue(), obj);
    }

    public static final boolean i(y67 y67Var, Set set, MemberAccessor memberAccessor) {
        Annotation[] annotations = memberAccessor.getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(nmd.B(nmd.A(annotation)));
        }
        return p(set, arrayList, y67Var);
    }

    public static final boolean i0(xt4 xt4Var, MethodAccessor methodAccessor) {
        Boolean gs9Var;
        try {
            Boolean bool = (Boolean) xt4Var.invoke(methodAccessor.getDefaultValue());
            bool.booleanValue();
            gs9Var = bool;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Object obj = Boolean.FALSE;
        boolean z = gs9Var instanceof gs9;
        Object obj2 = gs9Var;
        if (z) {
            obj2 = obj;
        }
        return ((Boolean) obj2).booleanValue();
    }

    public static final boolean j(y67 y67Var, Set set, MemberAccessor memberAccessor) {
        Annotation[] annotations = memberAccessor.getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(nmd.B(nmd.A(annotation)));
        }
        return !p(set, arrayList, y67Var);
    }

    public static List j0(zo0 zo0Var, y67 y67Var, Class cls, xt4 xt4Var) {
        List list = ks3.a;
        if (cls != null) {
            Class<Object> cls2 = Object.class;
            Class<Object> D = nmd.D(cm9.a(cls2));
            if (D != null) {
                cls2 = D;
            }
            if (!cls.equals(cls2)) {
                Collection collection = (Collection) xt4Var.invoke(cls);
                if (collection.isEmpty()) {
                    if (y67Var.c) {
                        list = j0(zo0Var, y67Var, cls.getSuperclass(), xt4Var);
                    } else {
                        k0(zo0Var, y67Var);
                    }
                    collection = list;
                }
                return (List) collection;
            }
        }
        k0(zo0Var, y67Var);
        return list;
    }

    public static final boolean k(String str, MemberAccessor memberAccessor) {
        return c16.i(memberAccessor.getGenericString(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k0(defpackage.zo0 r21, defpackage.y67 r22) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e97.k0(zo0, y67):void");
    }

    public static final MemberAccessor l(Member member) {
        return new MemberAccessor(member);
    }

    public static Class l0(Object obj, y67 y67Var, String str) {
        Class<?> cls;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else if (obj instanceof gi1) {
            cls = nmd.B((gi1) obj);
        } else if (obj instanceof String) {
            x67 x67Var = y67Var.d;
            Class cls2 = y67Var.a;
            if (x67Var == x67.a) {
                cls = ii1.a(cls2.getClassLoader(), (String) obj);
            } else {
                cls = ii1.b((String) obj, cls2.getClassLoader(), 2);
                if (cls == null) {
                    cls = z87.class;
                    Class<?> D = nmd.D(cm9.a(cls));
                    if (D != null) {
                        cls = D;
                    }
                }
            }
        } else if (obj instanceof u3d) {
            cls = obj.getClass();
        } else {
            cp8.m(obj, ", supported types are Class, KClass, String and VagueType.", "Unsupported type: ");
            return null;
        }
        Class<u3d> cls3 = u3d.class;
        Class<u3d> D2 = nmd.D(cm9.a(cls3));
        if (D2 != null) {
            cls3 = D2;
        }
        if (cls.equals(cls3) && str != null) {
            cp8.m(str, "\".", "VagueType is not supported for \"");
            return null;
        }
        return cls;
    }

    public static final int m(String str) {
        long j;
        long j2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                j = 2;
            } else {
                j = 1;
            }
            j2 += j;
        }
        return (int) j2;
    }

    public static final String n(int i, String str) {
        int m = i - m(str);
        if (m > 0) {
            return nk2.u(str, r4b.M(m, " "));
        }
        return str;
    }

    public static List o(AnnotatedElement[] annotatedElementArr) {
        int i = 0;
        for (AnnotatedElement annotatedElement : annotatedElementArr) {
            i += annotatedElement.getAnnotations().length;
        }
        if (i == 0) {
            return ks3.a;
        }
        jq6 t = tl1.t();
        for (AnnotatedElement annotatedElement2 : annotatedElementArr) {
            for (Annotation annotation : annotatedElement2.getAnnotations()) {
                t.add(nmd.B(nmd.A(annotation)));
            }
        }
        return tl1.r(t);
    }

    public static boolean p(Collection collection, List list, y67 y67Var) {
        if (collection.size() == list.size()) {
            int i = 0;
            for (Object obj : collection) {
                int i2 = i + 1;
                Class cls = (Class) list.get(i);
                Class l0 = l0(obj, y67Var, null);
                Class<u3d> cls2 = u3d.class;
                Class<u3d> D = nmd.D(cm9.a(cls2));
                if (D != null) {
                    cls2 = D;
                }
                if (l0.equals(cls2) || c16.i(cls, l0)) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean q(List list, ArrayList arrayList, y67 y67Var) {
        if (list.size() == arrayList.size()) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                if (p((Collection) it.next(), (List) arrayList.get(i), y67Var)) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean r(Set set, List list) {
        if (set.size() != list.size()) {
            return false;
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return true;
        }
        if (it.next() != null) {
            vm1.h();
            return false;
        }
        Type type = (Type) list.get(0);
        throw null;
    }

    public static final Member s(MemberAccessor memberAccessor) {
        Member member = memberAccessor.getMember();
        member.getClass();
        return member;
    }

    public static final boolean t(y67 y67Var, List list, ExecutableAccessor executableAccessor) {
        return p(list, b00.D0(executableAccessor.getParameterTypes()), y67Var);
    }

    public static final boolean u(y67 y67Var, List list, ExecutableAccessor executableAccessor) {
        return !p(list, b00.D0(executableAccessor.getParameterTypes()), y67Var);
    }

    public static final boolean v(Set set, ExecutableAccessor executableAccessor) {
        return !r(set, b00.D0(executableAccessor.getGenericExceptionTypes()));
    }

    public static final boolean w(Set set, ExecutableAccessor executableAccessor) {
        return r(set, b00.D0(executableAccessor.getGenericParameterTypes()));
    }

    public static final boolean x(Set set, ExecutableAccessor executableAccessor) {
        return !r(set, b00.D0(executableAccessor.getGenericParameterTypes()));
    }

    public static final boolean y(boolean z, ExecutableAccessor executableAccessor) {
        if (executableAccessor.isVarArgs() == z) {
            return true;
        }
        return false;
    }

    public static final boolean z(boolean z, ExecutableAccessor executableAccessor) {
        if (executableAccessor.isVarArgs() != z) {
            return true;
        }
        return false;
    }
}
