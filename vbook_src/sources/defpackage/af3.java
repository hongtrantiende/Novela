package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: af3  reason: default package */
/* loaded from: classes3.dex */
public abstract class af3 {
    public static final h40 a;
    public static final h40 b;
    public static final mfb c;
    public static final ij1 d;

    static {
        nsc nscVar;
        nsc nscVar2;
        gi1 a2 = cm9.a(pvc.class);
        nsc nscVar3 = null;
        try {
            nscVar = cm9.d(pvc.class);
        } catch (Throwable unused) {
            nscVar = null;
        }
        a = new h40("SkipSaveBody", new isc(a2, nscVar));
        gi1 a3 = cm9.a(pvc.class);
        try {
            nscVar2 = cm9.d(pvc.class);
        } catch (Throwable unused2) {
            nscVar2 = null;
        }
        b = new h40("ResponseBodySaved", new isc(a3, nscVar2));
        c = new mfb(new ye3(0));
        d = new ij1("SaveBody", new cd1(15), new u83(8));
        int i = ze3.a;
        gi1 a4 = cm9.a(jj1.class);
        try {
            w76 w76Var = w76.c;
            gi1 a5 = cm9.a(ij1.class);
            cm9.a.getClass();
            ksc kscVar = new ksc(a5);
            cm9.c(kscVar, cm9.d(Object.class));
            List list = Collections.EMPTY_LIST;
            list.getClass();
            nscVar3 = cm9.e(jj1.class, v9e.y(new nsc(kscVar, list, 0)));
        } catch (Throwable unused3) {
        }
        new h40("DoubleReceivePlugin", new isc(a4, nscVar3));
    }

    public static final pw6 a() {
        return (pw6) c.getValue();
    }

    public static final boolean b(oh5 oh5Var) {
        oh5Var.getClass();
        return oh5Var.y0().getAttributes().b(b);
    }
}
