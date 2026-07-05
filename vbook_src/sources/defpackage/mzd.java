package defpackage;

import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mzd  reason: default package */
/* loaded from: classes.dex */
public final class mzd extends p1e {
    public final /* synthetic */ int n;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzd(String str, int i) {
        super(1);
        this.n = i;
        switch (i) {
            case 1:
                super(10);
                am8.p("RECAPTCHA_ENTERPRISE");
                this.o = new yhe(str, 4);
                return;
            default:
                am8.q(str, "refresh token cannot be null");
                this.o = str;
                return;
        }
    }

    @Override // defpackage.p1e
    public final String a() {
        switch (this.n) {
            case 0:
                return "getAccessToken";
            case 1:
                return "getRecaptchaConfig";
            case 2:
                return "linkPhoneAuthCredential";
            case 3:
                return "linkEmailAuthCredential";
            default:
                return "updateProfile";
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [l1e, java.lang.Object] */
    @Override // defpackage.p1e
    public final void d(TaskCompletionSource taskCompletionSource, r0e r0eVar) {
        int i = this.n;
        l97 l97Var = this.b;
        Object obj = this.o;
        switch (i) {
            case 0:
                this.g = new hvc(9, this, taskCompletionSource);
                String str = (String) obj;
                r0eVar.getClass();
                am8.p(str);
                am8.s(l97Var);
                k57 k57Var = r0eVar.a;
                rwa rwaVar = new rwa(l97Var, r0e.b);
                k57Var.getClass();
                am8.p(str);
                lie lieVar = new lie(str, 6);
                qu1 qu1Var = (qu1) k57Var.b;
                bp9 bp9Var = new bp9(k57Var, rwaVar);
                h1e h1eVar = (h1e) qu1Var.c;
                ch0.w(h1eVar.f("/token", (String) qu1Var.f), lieVar, bp9Var, new p4e(), (bm1) h1eVar.c);
                return;
            case 1:
                this.g = new hvc(9, this, taskCompletionSource);
                yhe yheVar = (yhe) obj;
                r0eVar.getClass();
                am8.s(yheVar);
                k57 k57Var2 = r0eVar.a;
                rwa rwaVar2 = new rwa(l97Var, r0e.b);
                k57Var2.getClass();
                qu1 qu1Var2 = (qu1) k57Var2.b;
                g99 g99Var = new g99(k57Var2, rwaVar2);
                qu1Var2.getClass();
                h1e h1eVar2 = (h1e) qu1Var2.b;
                String concat = h1eVar2.f("/recaptchaConfig", (String) qu1Var2.f).concat("&clientType=CLIENT_TYPE_ANDROID&version=RECAPTCHA_ENTERPRISE");
                String str2 = yheVar.b;
                if (str2 != null && !str2.isEmpty()) {
                    concat = eub.o(concat, "&tenantId=", str2);
                }
                ?? obj2 = new Object();
                bm1 bm1Var = (bm1) h1eVar2.c;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(concat).openConnection();
                    httpURLConnection.setConnectTimeout(60000);
                    bm1Var.b0(httpURLConnection);
                    ch0.x(httpURLConnection, g99Var, obj2);
                    return;
                } catch (SocketTimeoutException unused) {
                    g99Var.mo0zza("TIMEOUT");
                    return;
                } catch (UnknownHostException unused2) {
                    g99Var.mo0zza("<<Network Error>>");
                    return;
                } catch (IOException e) {
                    g99Var.mo0zza(e.getMessage());
                    return;
                }
            case 2:
                this.g = new hvc(9, this, taskCompletionSource);
                String d = this.d.a.d();
                wf2 y = st0.y((ru8) obj);
                am8.p(d);
                r0eVar.getClass();
                am8.s(l97Var);
                am8.p(d);
                k57 k57Var3 = r0eVar.a;
                rwa rwaVar3 = new rwa(l97Var, r0e.b);
                k57Var3.getClass();
                am8.p(d);
                k57Var3.H(d, new yx9(k57Var3, y, rwaVar3));
                return;
            case 3:
                this.g = new hvc(9, this, taskCompletionSource);
                kp3 kp3Var = (kp3) obj;
                f0e f0eVar = this.d;
                kp3Var.getClass();
                kp3Var.d = f0eVar.a.d();
                kp3Var.e = true;
                r0eVar.b(new b3e(kp3Var, null, null), l97Var);
                return;
            default:
                this.g = new hvc(9, this, taskCompletionSource);
                String d2 = this.d.a.d();
                l0d l0dVar = (l0d) obj;
                r0eVar.getClass();
                am8.p(d2);
                am8.s(l0dVar);
                am8.s(l97Var);
                k57 k57Var4 = r0eVar.a;
                rwa rwaVar4 = new rwa(l97Var, r0e.b);
                k57Var4.getClass();
                am8.p(d2);
                k57Var4.H(d2, new yx9(k57Var4, l0dVar, rwaVar4));
                return;
        }
    }

    @Override // defpackage.p1e
    public final void e() {
        switch (this.n) {
            case 0:
                if (TextUtils.isEmpty(this.h.a)) {
                    p4e p4eVar = this.h;
                    String str = (String) this.o;
                    p4eVar.getClass();
                    am8.p(str);
                    p4eVar.a = str;
                }
                ((hve) this.e).b(this.h, this.d);
                f(gbe.a(this.h.b));
                return;
            case 1:
                f(this.l);
                return;
            case 2:
                f0e u = hvc.u(this.c, this.i);
                ((hve) this.e).b(this.h, u);
                f(new ghf(u));
                return;
            case 3:
                f0e u2 = hvc.u(this.c, this.i);
                ((hve) this.e).b(this.h, u2);
                f(new ghf(u2));
                return;
            default:
                ((hve) this.e).b(this.h, hvc.u(this.c, this.i));
                f(null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzd(ru8 ru8Var) {
        super(2);
        this.n = 2;
        am8.t(ru8Var, "credential cannot be null");
        this.o = ru8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzd(l0d l0dVar) {
        super(2);
        this.n = 4;
        this.o = l0dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzd(kp3 kp3Var) {
        super(2);
        this.n = 3;
        am8.t(kp3Var, "credential cannot be null");
        this.o = kp3Var;
    }
}
