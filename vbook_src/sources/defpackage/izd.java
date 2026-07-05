package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: izd  reason: default package */
/* loaded from: classes.dex */
public final class izd extends p1e {
    public final /* synthetic */ int n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izd(String str, String str2, String str3, String str4, int i) {
        super(2);
        this.n = i;
        switch (i) {
            case 1:
                super(2);
                am8.q(str, "email cannot be null or empty");
                am8.q(str2, "password cannot be null or empty");
                this.o = str;
                this.p = str2;
                this.q = str3;
                this.r = str4;
                return;
            case 2:
                super(2);
                am8.q(str, "email cannot be null or empty");
                am8.q(str2, "password cannot be null or empty");
                this.o = str;
                this.p = str2;
                this.q = str3;
                this.r = str4;
                return;
            default:
                am8.q(str, "email cannot be null or empty");
                am8.q(str2, "password cannot be null or empty");
                this.o = str;
                this.p = str2;
                this.q = str3;
                this.r = str4;
                return;
        }
    }

    @Override // defpackage.p1e
    public final String a() {
        switch (this.n) {
            case 0:
                return "createUserWithEmailAndPassword";
            case 1:
                return "reauthenticateWithEmailPasswordWithData";
            default:
                return "signInWithEmailAndPassword";
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l1e, java.lang.Object] */
    @Override // defpackage.p1e
    public final void d(TaskCompletionSource taskCompletionSource, r0e r0eVar) {
        switch (this.n) {
            case 0:
                this.g = new hvc(9, this, taskCompletionSource);
                r0eVar.getClass();
                String str = this.o;
                am8.p(str);
                String str2 = this.p;
                am8.p(str2);
                l97 l97Var = this.b;
                am8.s(l97Var);
                k57 k57Var = r0eVar.a;
                rwa rwaVar = new rwa(l97Var, r0e.b);
                k57Var.getClass();
                am8.p(str);
                am8.p(str2);
                j5e j5eVar = new j5e(str, str2, this.q, this.r, null, 0);
                qu1 qu1Var = (qu1) k57Var.b;
                rxd rxdVar = new rxd(k57Var, rwaVar, 0);
                h1e h1eVar = (h1e) qu1Var.a;
                ch0.w(h1eVar.f("/signupNewUser", (String) qu1Var.f), j5eVar, rxdVar, new Object(), (bm1) h1eVar.c);
                return;
            case 1:
                this.g = new hvc(9, this, taskCompletionSource);
                r0eVar.d(this.o, this.p, this.q, this.r, this.b);
                return;
            default:
                this.g = new hvc(9, this, taskCompletionSource);
                r0eVar.d(this.o, this.p, this.q, this.r, this.b);
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
}
