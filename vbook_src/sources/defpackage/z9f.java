package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z9f  reason: default package */
/* loaded from: classes.dex */
public final class z9f {
    public static final m9e b;
    public final String a;

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[1]);
        b = new m9e(1, null, objArr);
    }

    public z9f(Context context, uga ugaVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        vq1.a(context);
        synchronized (abf.class) {
            if (abf.b == null) {
                abf.b = new abf(0);
            }
        }
        this.a = "common";
        fz4 E = fz4.E();
        iq7 iq7Var = new iq7(this, 4);
        E.getClass();
        fz4.o0(iq7Var);
        fz4 E2 = fz4.E();
        Objects.requireNonNull(ugaVar);
        rze rzeVar = new rze(ugaVar, 1);
        E2.getClass();
        fz4.o0(rzeVar);
        m9e m9eVar = b;
        if (m9eVar.containsKey("common")) {
            zm3.d(context, (String) m9eVar.get("common"), false);
        }
    }
}
