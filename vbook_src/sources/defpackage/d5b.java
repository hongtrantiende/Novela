package defpackage;

import android.os.SystemClock;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d5b  reason: default package */
/* loaded from: classes.dex */
public final class d5b {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ kn h;

    public d5b(kn knVar, int i) {
        this.h = knVar;
        this.a = i;
    }

    public final void a() {
        Object l;
        kn knVar = this.h;
        ggb ggbVar = (ggb) knVar.C;
        i04 i04Var = (i04) knVar.b;
        if (!i04Var.x()) {
            if (this.f) {
                ggbVar.e(2);
            }
            this.f = false;
            return;
        }
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
            k -= a2d.e0(m.g(l, (y9c) knVar.f).e);
        }
        ((xfb) knVar.e).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && g == this.c && h == this.d && k == this.e) {
            if (elapsedRealtime - this.g >= i) {
                ((c04) knVar.d).a.S(new pz3(2, new g5b(2, i), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.b = l;
        this.c = g;
        this.d = h;
        this.e = k;
        ggbVar.e(2);
        ggbVar.a.sendEmptyMessageDelayed(2, i);
    }
}
