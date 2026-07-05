package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t47  reason: default package */
/* loaded from: classes.dex */
public final class t47 implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ u47 b;

    public t47(u47 u47Var, d47 d47Var) {
        this.b = u47Var;
        Handler p = a2d.p(this);
        this.a = p;
        d47Var.r(this, p);
    }

    public final void a(long j) {
        boolean z;
        Surface surface;
        u47 u47Var = this.b;
        b60 b60Var = u47Var.g1;
        if (this == u47Var.R1 && u47Var.j0 != null) {
            if (j == Long.MAX_VALUE) {
                u47Var.R0 = true;
                return;
            }
            try {
                u47Var.D0(j);
                uad uadVar = u47Var.M1;
                if (!uadVar.equals(uad.d) && !uadVar.equals(u47Var.N1)) {
                    u47Var.N1 = uadVar;
                    b60Var.b(uadVar);
                }
                u47Var.T0.e++;
                q8d q8dVar = u47Var.j1;
                if (q8dVar.e != 3) {
                    z = true;
                } else {
                    z = false;
                }
                q8dVar.e = 3;
                q8dVar.l.getClass();
                q8dVar.g = a2d.Q(SystemClock.elapsedRealtime());
                if (z && (surface = u47Var.w1) != null) {
                    Handler handler = b60Var.a;
                    if (handler != null) {
                        handler.post(new n92(b60Var, surface, SystemClock.elapsedRealtime()));
                    }
                    u47Var.z1 = true;
                }
                u47Var.i0(j);
            } catch (pz3 e) {
                u47Var.S0 = e;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = a2d.a;
        a(((i & 4294967295L) << 32) | (4294967295L & i2));
        return true;
    }
}
