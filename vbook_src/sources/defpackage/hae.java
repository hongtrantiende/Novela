package defpackage;

import android.os.Handler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hae  reason: default package */
/* loaded from: classes.dex */
public abstract class hae {
    public static volatile ovd d;
    public final tve a;
    public final bv4 b;
    public volatile long c;

    public hae(tve tveVar) {
        am8.s(tveVar);
        this.a = tveVar;
        this.b = new bv4(this, false, tveVar, 17);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            tve tveVar = this.a;
            tveVar.e().getClass();
            this.c = System.currentTimeMillis();
            if (!d().postDelayed(this.b, j)) {
                tveVar.c().f.f(Long.valueOf(j), "Failed to schedule delayed post. time");
            }
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        ovd ovdVar;
        if (d != null) {
            return d;
        }
        synchronized (hae.class) {
            try {
                if (d == null) {
                    d = new ovd(this.a.g().getMainLooper(), 2);
                }
                ovdVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ovdVar;
    }
}
