package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h0e  reason: default package */
/* loaded from: classes.dex */
public final class h0e {
    public static volatile h0e a;
    public static final h0e b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, h0e] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static h0e a() {
        h0e h0eVar = a;
        if (h0eVar != null) {
            return h0eVar;
        }
        synchronized (h0e.class) {
            try {
                h0e h0eVar2 = a;
                if (h0eVar2 != null) {
                    return h0eVar2;
                }
                int i = kzd.a;
                h0e D = l0e.D();
                a = D;
                return D;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
