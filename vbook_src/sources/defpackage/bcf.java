package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bcf  reason: default package */
/* loaded from: classes.dex */
public final class bcf {
    public final String a;
    public final s3 b;
    public final kn c;
    public final s6f d;
    public final yv e;
    public final yv f = new yv(new hvc(this, 26));
    public final Object g;
    public final bl8 h;
    public List i;

    public bcf(kn knVar, s3 s3Var) {
        Object obj = new Object();
        this.g = obj;
        this.i = new ArrayList();
        this.c = knVar;
        this.b = s3Var;
        this.a = (String) knVar.b;
        this.e = new yv(new xk9(knVar, 24));
        this.d = new s6f(23);
        this.h = new bl8(29);
        e5f e5fVar = new e5f(this, 4);
        synchronized (obj) {
            this.i.add(e5fVar);
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [tu4, java.lang.Object] */
    public final t3 a(n5f n5fVar, hr7 hr7Var) {
        e5f e5fVar = new e5f(n5fVar, 3);
        int i = khf.a;
        b7f b7fVar = new b7f(4, kff.a(), e5fVar);
        nc2 nc2Var = xhf.a;
        wq9.z(nc2Var, "ticker");
        nc2Var.n();
        String concat = "Update ".concat(String.valueOf(this.a));
        this.h.getClass();
        dgf f = bl8.f(concat);
        try {
            x1 H = this.f.H();
            s6f s6fVar = this.d;
            bp9 bp9Var = new bp9(H, 23);
            e73 e73Var = e73.a;
            s6fVar.N(bp9Var, e73Var);
            ListenableFuture N = s6fVar.N(khf.a(new odd(this, H, b7fVar, hr7Var, 20)), e73Var);
            dv4.propagateCancellation(N, H);
            dv4.d(this.b);
            t3 e = dv4.e(N, new Object(), e73Var);
            f.o(e);
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
