package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cm9  reason: default package */
/* loaded from: classes3.dex */
public abstract class cm9 {
    public static final dm9 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [dm9] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        ?? r0 = 0;
        try {
            r0 = (dm9) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r0 == 0) {
            r0 = new Object();
        }
        a = r0;
    }

    public static gi1 a(Class cls) {
        a.getClass();
        return new gi1(cls);
    }

    public static nsc b(Class cls) {
        gi1 a2 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        list.getClass();
        return new nsc(a2, list, 1);
    }

    public static void c(ksc kscVar, nsc nscVar) {
        dm9 dm9Var = a;
        List singletonList = Collections.singletonList(nscVar);
        dm9Var.getClass();
        singletonList.getClass();
        if (kscVar.d == null) {
            kscVar.d = singletonList;
        } else {
            cp8.m(kscVar, "' have already been initialized.", "Upper bounds of type parameter '");
        }
    }

    public static nsc d(Class cls) {
        gi1 a2 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        list.getClass();
        return new nsc(a2, list, 0);
    }

    public static nsc e(Class cls, w76 w76Var) {
        gi1 a2 = a(cls);
        List singletonList = Collections.singletonList(w76Var);
        a.getClass();
        singletonList.getClass();
        return new nsc(a2, singletonList, 0);
    }

    public static nsc f(Class cls, w76... w76VarArr) {
        gi1 a2 = a(cls);
        List D0 = b00.D0(w76VarArr);
        a.getClass();
        return new nsc(a2, D0, 0);
    }
}
