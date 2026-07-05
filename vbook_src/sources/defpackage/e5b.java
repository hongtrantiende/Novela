package defpackage;

import android.os.SystemClock;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e5b  reason: default package */
/* loaded from: classes.dex */
public final class e5b {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ kn g;

    public e5b(kn knVar, int i) {
        this.g = knVar;
        this.a = i;
    }

    public final void a() {
        Object l;
        long j;
        kn knVar = this.g;
        y9c y9cVar = (y9c) knVar.f;
        ggb ggbVar = (ggb) knVar.C;
        i04 i04Var = (i04) knVar.b;
        aac m = i04Var.m();
        if (m.p()) {
            l = null;
        } else {
            l = m.l(i04Var.j());
        }
        int g = i04Var.g();
        int h = i04Var.h();
        long k = i04Var.k();
        if (l != null && g == -1) {
            m.g(l, y9cVar);
            k -= a2d.e0(y9cVar.e);
            j = a2d.e0(y9cVar.d);
        } else if (g != -1) {
            j = i04Var.p();
        } else {
            j = -9223372036854775807L;
        }
        boolean x = i04Var.x();
        if (x && j != -9223372036854775807L && k >= j) {
            ((xfb) knVar.e).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.e;
            int i = this.a;
            if (z && Objects.equals(l, this.b) && g == this.c && h == this.d) {
                if (elapsedRealtime - this.f >= i) {
                    ((c04) knVar.d).a.S(new pz3(2, new g5b(3, i), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f = elapsedRealtime;
            this.b = l;
            this.c = g;
            this.d = h;
            ggbVar.e(3);
            ggbVar.a.sendEmptyMessageDelayed(3, i);
            return;
        }
        ggbVar.e(3);
        if (x && j != -9223372036854775807L) {
            i04Var.X();
            ggbVar.a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j - k)) / i04Var.q0.o.a));
        }
        this.e = false;
    }
}
