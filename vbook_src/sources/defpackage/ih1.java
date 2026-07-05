package defpackage;

import android.util.SparseBooleanArray;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ih1  reason: default package */
/* loaded from: classes.dex */
public class ih1 implements q78, xf9 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public ih1(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.c = new SparseBooleanArray();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.xf9
    public void a(wf9 wf9Var, int i) {
        StringBuilder sb = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void b(int i) {
        wq9.D(!this.b);
        ((SparseBooleanArray) this.c).append(i, true);
    }

    public ci4 c() {
        wq9.D(!this.b);
        this.b = true;
        return new ci4((SparseBooleanArray) this.c);
    }

    public void d() {
        this.b = false;
    }

    public void e(byte b) {
        ((g06) this.c).writeLong(b);
    }

    @Override // defpackage.q78
    public void f(Object obj) {
        this.b = true;
        Void r2 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) ((l97) this.c).a;
        signInHubActivity.setResult(signInHubActivity.Z, signInHubActivity.a0);
        signInHubActivity.finish();
    }

    public void g(char c) {
        ((g06) this.c).c(c);
    }

    public void h(int i) {
        ((g06) this.c).writeLong(i);
    }

    public void i(long j) {
        ((g06) this.c).writeLong(j);
    }

    public void j(short s) {
        ((g06) this.c).writeLong(s);
    }

    public void k(String str) {
        str.getClass();
        ((g06) this.c).g(str);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return ((l97) this.c).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ih1(Object obj, int i) {
        this.a = i;
        this.c = obj;
        this.b = true;
    }

    public ih1(ytb ytbVar, boolean z) {
        this.a = 6;
        this.c = ytbVar;
        this.b = z;
    }

    public ih1(pj1 pj1Var) {
        this.a = 1;
        this.c = pj1Var;
    }

    public void l() {
    }

    public void m() {
    }

    public ih1(awd awdVar, l97 l97Var) {
        this.a = 4;
        this.b = false;
        this.c = l97Var;
    }
}
