package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y54  reason: default package */
/* loaded from: classes.dex */
public final class y54 {
    public static volatile y54 a;
    public static final y54 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [y54, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static y54 a() {
        y54 y54Var;
        y54 y54Var2 = a;
        if (y54Var2 == null) {
            synchronized (y54.class) {
                try {
                    y54Var = a;
                    if (y54Var == null) {
                        Class cls = v54.a;
                        y54 y54Var3 = null;
                        if (cls != null) {
                            try {
                                y54Var3 = (y54) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (y54Var3 != null) {
                            y54Var = y54Var3;
                        } else {
                            y54Var = b;
                        }
                        a = y54Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return y54Var;
        }
        return y54Var2;
    }
}
