package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z54  reason: default package */
/* loaded from: classes.dex */
public final class z54 {
    public static volatile z54 a;
    public static final z54 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [z54, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static z54 a() {
        z54 z54Var;
        z89 z89Var = z89.c;
        z54 z54Var2 = a;
        if (z54Var2 == null) {
            synchronized (z54.class) {
                try {
                    z54Var = a;
                    if (z54Var == null) {
                        Class cls = w54.a;
                        z54 z54Var3 = null;
                        if (cls != null) {
                            try {
                                z54Var3 = (z54) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (z54Var3 != null) {
                            z54Var = z54Var3;
                        } else {
                            z54Var = b;
                        }
                        a = z54Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z54Var;
        }
        return z54Var2;
    }
}
