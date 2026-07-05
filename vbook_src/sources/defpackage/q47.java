package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q47  reason: default package */
/* loaded from: classes.dex */
public final class q47 implements rad {
    public final /* synthetic */ u47 b;

    public q47(u47 u47Var) {
        this.b = u47Var;
    }

    @Override // defpackage.rad
    public final void b() {
        u47 u47Var = this.b;
        Surface surface = u47Var.w1;
        if (surface != null) {
            b60 b60Var = u47Var.g1;
            Handler handler = b60Var.a;
            if (handler != null) {
                handler.post(new n92(b60Var, surface, SystemClock.elapsedRealtime()));
            }
            u47Var.z1 = true;
        }
    }

    @Override // defpackage.rad
    public final void c() {
        u47 u47Var = this.b;
        if (u47Var.w1 != null) {
            u47Var.S0(0, 1);
        }
    }

    @Override // defpackage.rad
    public final void d() {
        l04 l04Var = this.b.e0;
        if (l04Var != null) {
            l04Var.a();
        }
    }

    @Override // defpackage.rad
    public final void a(uad uadVar) {
    }
}
