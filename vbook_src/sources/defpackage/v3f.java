package defpackage;

import android.content.Intent;
import android.os.SystemClock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v3f  reason: default package */
/* loaded from: classes.dex */
public final class v3f extends hae {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3f(Object obj, tve tveVar, int i) {
        super(tveVar);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.hae
    public final void a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ju0 ju0Var = (ju0) obj;
                f4f f4fVar = (f4f) ju0Var.d;
                f4fVar.W();
                lte lteVar = (lte) f4fVar.a;
                lteVar.G.getClass();
                ju0Var.n(SystemClock.elapsedRealtime(), false, false);
                gge ggeVar = lteVar.J;
                lte.j(ggeVar);
                lteVar.G.getClass();
                ggeVar.a0(SystemClock.elapsedRealtime());
                return;
            case 1:
                s4f s4fVar = (s4f) obj;
                s4fVar.c0();
                ppe ppeVar = ((lte) s4fVar.a).f;
                lte.m(ppeVar);
                ppeVar.J.e("Starting upload from DelayedRunnable");
                s4fVar.b.q();
                return;
            default:
                a6f a6fVar = (a6f) obj;
                a6fVar.f().W();
                String str = (String) a6fVar.M.pollFirst();
                if (str != null) {
                    a6fVar.e().getClass();
                    a6fVar.e0 = SystemClock.elapsedRealtime();
                    a6fVar.c().J.f(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    a6f.S(a6fVar.H.a, intent);
                }
                a6fVar.H();
                return;
        }
    }
}
