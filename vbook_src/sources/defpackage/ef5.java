package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ef5  reason: default package */
/* loaded from: classes3.dex */
public abstract class ef5 {
    public static final h40 a;

    static {
        nsc nscVar;
        gi1 a2 = cm9.a(Map.class);
        try {
            w76 y = v9e.y(cm9.e(df5.class, w76.c));
            w76 y2 = v9e.y(cm9.d(Object.class));
            dm9 dm9Var = cm9.a;
            gi1 a3 = cm9.a(Map.class);
            List asList = Arrays.asList(y, y2);
            dm9Var.getClass();
            asList.getClass();
            nscVar = new nsc(a3, asList, 2);
        } catch (Throwable unused) {
            nscVar = null;
        }
        a = new h40("EngineCapabilities", new isc(a2, nscVar));
        fca.B(ki5.a);
    }
}
