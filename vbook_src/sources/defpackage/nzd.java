package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nzd  reason: default package */
/* loaded from: classes.dex */
public final class nzd extends p1e {
    public final /* synthetic */ int n = 1;
    public final String o;
    public final Object p;

    public nzd(String str, m5 m5Var, String str2, String str3) {
        super(4);
        String str4;
        am8.q(str, "email cannot be null or empty");
        int i = m5Var.E;
        w2e w2eVar = new w2e(1);
        if (i != 1) {
            if (i != 4) {
                if (i != 6) {
                    if (i != 7) {
                        str4 = "REQUEST_TYPE_UNSET_ENUM_VALUE";
                    } else {
                        str4 = "VERIFY_AND_CHANGE_EMAIL";
                    }
                } else {
                    str4 = "EMAIL_SIGNIN";
                }
            } else {
                str4 = "VERIFY_EMAIL";
            }
        } else {
            str4 = "PASSWORD_RESET";
        }
        w2eVar.b = str4;
        this.p = w2eVar;
        am8.p(str);
        w2eVar.c = str;
        w2eVar.d = m5Var;
        w2eVar.e = str2;
        w2eVar.f = str3;
        this.o = "sendPasswordResetEmail";
    }

    @Override // defpackage.p1e
    public final String a() {
        switch (this.n) {
            case 0:
                return "linkEmailAuthCredential";
            default:
                return this.o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [a2e, java.lang.Object, l97] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a2e, java.lang.Object, yv] */
    /* JADX WARN: Type inference failed for: r8v8, types: [l1e, java.lang.Object] */
    @Override // defpackage.p1e
    public final void d(TaskCompletionSource taskCompletionSource, r0e r0eVar) {
        int i = this.n;
        l97 l97Var = this.b;
        Object obj = this.p;
        switch (i) {
            case 0:
                this.g = new hvc(9, this, taskCompletionSource);
                kp3 kp3Var = (kp3) obj;
                String str = kp3Var.a;
                String str2 = kp3Var.b;
                am8.p(str2);
                String d = this.d.a.d();
                String c = this.d.c();
                r0eVar.getClass();
                am8.p(str);
                am8.p(str2);
                am8.p(d);
                am8.s(l97Var);
                k57 k57Var = r0eVar.a;
                rwa rwaVar = new rwa(l97Var, r0e.b);
                k57Var.getClass();
                am8.p(str);
                am8.p(str2);
                am8.p(d);
                ?? obj2 = new Object();
                obj2.a = str;
                obj2.b = str2;
                obj2.c = c;
                obj2.d = this.o;
                obj2.e = rwaVar;
                Objects.requireNonNull(k57Var);
                obj2.f = k57Var;
                k57Var.H(d, obj2);
                return;
            default:
                this.g = new hvc(9, this, taskCompletionSource);
                w2e w2eVar = (w2e) obj;
                r0eVar.getClass();
                am8.s(w2eVar);
                am8.p((String) w2eVar.c);
                am8.s(l97Var);
                k57 k57Var2 = r0eVar.a;
                rwa rwaVar2 = new rwa(l97Var, r0e.b);
                k57Var2.getClass();
                am8.p((String) w2eVar.c);
                qu1 qu1Var = (qu1) k57Var2.b;
                ?? obj3 = new Object();
                obj3.a = rwaVar2;
                Objects.requireNonNull(k57Var2);
                qu1Var.getClass();
                if (((m5) w2eVar.d) != null) {
                    qu1Var.D().f = ((m5) w2eVar.d).D;
                }
                h1e h1eVar = (h1e) qu1Var.a;
                ch0.w(h1eVar.f("/getOobConfirmationCode", (String) qu1Var.f), w2eVar, obj3, new Object(), (bm1) h1eVar.c);
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
            default:
                f(null);
                return;
        }
    }

    public nzd(kp3 kp3Var, String str) {
        super(2);
        am8.t(kp3Var, "credential cannot be null");
        this.p = kp3Var;
        am8.q(kp3Var.a, "email cannot be null");
        am8.q(kp3Var.b, "password cannot be null");
        this.o = str;
    }
}
