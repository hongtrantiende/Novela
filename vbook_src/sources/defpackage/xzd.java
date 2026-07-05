package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xzd  reason: default package */
/* loaded from: classes.dex */
public final class xzd extends p1e {
    public final /* synthetic */ int n;
    public final bp9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzd(ru8 ru8Var, int i) {
        super(2);
        this.n = i;
        switch (i) {
            case 1:
                super(2);
                this.o = new bp9(ru8Var, 25);
                return;
            default:
                ru8Var.d = false;
                this.o = new bp9(ru8Var, 25);
                return;
        }
    }

    @Override // defpackage.p1e
    public final String a() {
        switch (this.n) {
            case 0:
                return "reauthenticateWithPhoneCredentialWithData";
            default:
                return "signInWithPhoneNumber";
        }
    }

    @Override // defpackage.p1e
    public final void d(TaskCompletionSource taskCompletionSource, r0e r0eVar) {
        int i = this.n;
        l97 l97Var = this.b;
        bp9 bp9Var = this.o;
        switch (i) {
            case 0:
                this.g = new hvc(9, this, taskCompletionSource);
                r0eVar.a(bp9Var, l97Var);
                return;
            default:
                this.g = new hvc(9, this, taskCompletionSource);
                r0eVar.a(bp9Var, l97Var);
                return;
        }
    }

    @Override // defpackage.p1e
    public final void e() {
        switch (this.n) {
            case 0:
                f0e u = hvc.u(this.c, this.i);
                if (this.d.b.a.equalsIgnoreCase(u.b.a)) {
                    ((hve) this.e).b(this.h, u);
                    f(new ghf(u));
                    return;
                }
                c(new Status(17024, null, null, null));
                return;
            default:
                f0e u2 = hvc.u(this.c, this.i);
                ((hve) this.e).b(this.h, u2);
                f(new ghf(u2));
                return;
        }
    }
}
