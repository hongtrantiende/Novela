package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oxe  reason: default package */
/* loaded from: classes.dex */
public final class oxe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ yze c;

    public oxe(yze yzeVar, long j, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = yzeVar;
                return;
            default:
                this.b = j;
                Objects.requireNonNull(yzeVar);
                this.c = yzeVar;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        yze yzeVar = this.c;
        switch (i) {
            case 0:
                lte lteVar = (lte) yzeVar.a;
                dre dreVar = lteVar.e;
                lte.k(dreVar);
                dreVar.G.h(j);
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.I.f(Long.valueOf(j), "Session timeout duration set");
                return;
            default:
                yzeVar.W();
                yzeVar.Y();
                lte lteVar2 = (lte) yzeVar.a;
                ppe ppeVar2 = lteVar2.f;
                lte.m(ppeVar2);
                ppeVar2.I.e("Resetting analytics data (FE)");
                f4f f4fVar = lteVar2.D;
                lte.l(f4fVar);
                f4fVar.W();
                ju0 ju0Var = f4fVar.f;
                ((v3f) ju0Var.c).c();
                ((lte) ((f4f) ju0Var.d).a).G.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ju0Var.a = elapsedRealtime;
                ju0Var.b = elapsedRealtime;
                lteVar2.r().c0();
                boolean z = !lteVar2.a();
                dre dreVar2 = lteVar2.e;
                lte.k(dreVar2);
                dreVar2.f.h(j);
                lte lteVar3 = (lte) dreVar2.a;
                dre dreVar3 = lteVar3.e;
                lte.k(dreVar3);
                if (!TextUtils.isEmpty(dreVar3.R.k())) {
                    dreVar2.R.l(null);
                }
                dreVar2.L.h(0L);
                dreVar2.M.h(0L);
                if (!lteVar3.d.l0()) {
                    dreVar2.f0(z);
                }
                dreVar2.S.l(null);
                dreVar2.T.h(0L);
                dreVar2.U.u(null);
                w2f p = lteVar2.p();
                p.W();
                p.Y();
                d8f n0 = p.n0(false);
                p.j0();
                ((lte) p.a).o().b0();
                p.l0(new o1f(p, n0, 0));
                lte.l(f4fVar);
                f4fVar.e.A();
                yzeVar.N = z;
                lteVar2.p().b0(new AtomicReference());
                return;
        }
    }
}
