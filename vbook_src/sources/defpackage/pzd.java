package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pzd  reason: default package */
/* loaded from: classes.dex */
public final class pzd extends p1e {
    public final /* synthetic */ int n;
    public final u5e o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzd(c70 c70Var, String str, int i) {
        super(2);
        this.n = i;
        switch (i) {
            case 2:
                super(2);
                am8.t(c70Var, "credential cannot be null");
                this.o = fce.y(c70Var, str);
                return;
            default:
                am8.t(c70Var, "credential cannot be null");
                u5e y = fce.y(c70Var, str);
                y.F = false;
                this.o = y;
                return;
        }
    }

    @Override // defpackage.p1e
    public final String a() {
        switch (this.n) {
            case 0:
                return "linkFederatedCredential";
            case 1:
                return "reauthenticateWithCredentialWithData";
            default:
                return "signInWithCredential";
        }
    }

    @Override // defpackage.p1e
    public final void d(TaskCompletionSource taskCompletionSource, r0e r0eVar) {
        int i = this.n;
        l97 l97Var = this.b;
        u5e u5eVar = this.o;
        switch (i) {
            case 0:
                this.g = new hvc(9, this, taskCompletionSource);
                String d = this.d.a.d();
                r0eVar.getClass();
                am8.p(d);
                am8.s(u5eVar);
                am8.s(l97Var);
                k57 k57Var = r0eVar.a;
                rwa rwaVar = new rwa(l97Var, r0e.b);
                k57Var.getClass();
                am8.p(d);
                k57Var.H(d, new yx9(k57Var, u5eVar, rwaVar));
                return;
            case 1:
                this.g = new hvc(9, this, taskCompletionSource);
                r0eVar.c(u5eVar, l97Var);
                return;
            default:
                this.g = new hvc(9, this, taskCompletionSource);
                r0eVar.c(u5eVar, l97Var);
                return;
        }
    }

    @Override // defpackage.p1e
    public final void e() {
        switch (this.n) {
            case 0:
                f0e u = hvc.u(this.c, this.i);
                ((hve) this.e).b(this.h, u);
                f(new ghf(u));
                return;
            case 1:
                f0e u2 = hvc.u(this.c, this.i);
                if (this.d.b.a.equalsIgnoreCase(u2.b.a)) {
                    ((hve) this.e).b(this.h, u2);
                    f(new ghf(u2));
                    return;
                }
                c(new Status(17024, null, null, null));
                return;
            default:
                f0e u3 = hvc.u(this.c, this.i);
                ((hve) this.e).b(this.h, u3);
                f(new ghf(u3));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzd(c70 c70Var) {
        super(2);
        this.n = 0;
        am8.t(c70Var, "credential cannot be null");
        this.o = fce.y(c70Var, null);
    }
}
