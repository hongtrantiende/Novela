package defpackage;

import android.os.SystemClock;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c5b  reason: default package */
/* loaded from: classes.dex */
public final class c5b {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ kn i;

    public c5b(kn knVar, int i) {
        this.i = knVar;
        this.a = i;
    }

    public final void a() {
        Object l;
        int i = this.a;
        kn knVar = this.i;
        if (((i04) knVar.b).r() == 2 && ((i04) knVar.b).q() && ((i04) knVar.b).s() == 0) {
            aac m = ((i04) knVar.b).m();
            if (m.p()) {
                l = null;
            } else {
                l = m.l(((i04) knVar.b).j());
            }
            int g = ((i04) knVar.b).g();
            int h = ((i04) knVar.b).h();
            long d = ((i04) knVar.b).d();
            long max = Math.max(0L, d - ((i04) knVar.b).k());
            i04 i04Var = (i04) knVar.b;
            i04Var.X();
            long max2 = Math.max(0L, a2d.e0(i04Var.q0.r) - max);
            if (l != null && g == -1) {
                d -= a2d.e0(m.g(l, (y9c) knVar.f).e);
            }
            ((xfb) knVar.e).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.g && Objects.equals(l, this.b) && g == this.c && h == this.d && d == this.e && max2 == this.f) {
                if (elapsedRealtime - this.h >= i) {
                    ((c04) knVar.d).a.S(new pz3(2, new g5b(1, i), 1003));
                    return;
                }
                return;
            }
            this.g = true;
            this.h = elapsedRealtime;
            this.b = l;
            this.c = g;
            this.d = h;
            this.e = d;
            this.f = max2;
            ((ggb) knVar.C).e(1);
            ((ggb) knVar.C).a.sendEmptyMessageDelayed(1, i);
            return;
        }
        if (this.g) {
            ((ggb) knVar.C).e(1);
        }
        this.g = false;
    }
}
