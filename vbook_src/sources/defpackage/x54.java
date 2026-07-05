package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x54  reason: default package */
/* loaded from: classes.dex */
public final class x54 {
    public static volatile x54 a;
    public static final x54 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [x54, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static x54 a() {
        x54 x54Var;
        w89 w89Var = w89.c;
        x54 x54Var2 = a;
        if (x54Var2 == null) {
            synchronized (x54.class) {
                try {
                    x54Var = a;
                    if (x54Var == null) {
                        Class cls = u54.a;
                        x54 x54Var3 = null;
                        if (cls != null) {
                            try {
                                x54Var3 = (x54) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (x54Var3 != null) {
                            x54Var = x54Var3;
                        } else {
                            x54Var = b;
                        }
                        a = x54Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return x54Var;
        }
        return x54Var2;
    }
}
