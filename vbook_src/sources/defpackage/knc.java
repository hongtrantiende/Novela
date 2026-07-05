package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: knc  reason: default package */
/* loaded from: classes.dex */
public final class knc {
    public static volatile we2 e;
    public final xj1 a;
    public final xj1 b;
    public final tw2 c;
    public final tc0 d;

    public knc(xj1 xj1Var, xj1 xj1Var2, tw2 tw2Var, tc0 tc0Var, odd oddVar) {
        this.a = xj1Var;
        this.b = xj1Var2;
        this.c = tw2Var;
        this.d = tc0Var;
        ((Executor) oddVar.b).execute(new e09(oddVar, 11));
    }

    public static knc a() {
        we2 we2Var = e;
        if (we2Var != null) {
            return (knc) we2Var.f.get();
        }
        vs.k("Not initialized!");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [mu9, java.lang.Object] */
    public static void b(Context context) {
        if (e == null) {
            synchronized (knc.class) {
                try {
                    if (e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.a = context;
                        e = obj.i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final inc c(d41 d41Var) {
        Set singleton;
        byte[] bytes;
        if (d41Var instanceof d41) {
            singleton = Collections.unmodifiableSet(d41.d);
        } else {
            singleton = Collections.singleton(new bt3("proto"));
        }
        ij1 a = ld0.a();
        d41Var.getClass();
        a.b = "cct";
        String str = d41Var.a;
        String str2 = d41Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = eub.p("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a.c = bytes;
        return new inc(singleton, a.l(), this);
    }
}
