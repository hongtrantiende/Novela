package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y0f  reason: default package */
/* loaded from: classes.dex */
public final class y0f extends l0e {
    public final /* synthetic */ int f;
    public final /* synthetic */ FirebaseAuth g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ y0f(FirebaseAuth firebaseAuth, Object obj, Object obj2, int i) {
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.g = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [vf4, gee] */
    @Override // defpackage.l0e
    public final Task C(String str) {
        int i = this.f;
        Object obj = this.i;
        FirebaseAuth firebaseAuth = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
                }
                return firebaseAuth.e.p(firebaseAuth.a, (f0e) obj2, (kp3) obj, str, new vf4(firebaseAuth, 0));
            case 1:
                String str2 = (String) obj2;
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Password reset request " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email ".concat(str2));
                }
                hvc hvcVar = firebaseAuth.e;
                qf4 qf4Var = firebaseAuth.a;
                m5 m5Var = (m5) obj;
                String str3 = firebaseAuth.i;
                hvcVar.getClass();
                m5Var.E = 1;
                nzd nzdVar = new nzd(str2, m5Var, str3, str);
                nzdVar.b(qf4Var);
                return hvcVar.q(nzdVar);
            default:
                String str4 = (String) obj2;
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Creating user with " + str4 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + str4);
                }
                hvc hvcVar2 = firebaseAuth.e;
                qf4 qf4Var2 = firebaseAuth.a;
                String str5 = firebaseAuth.i;
                wf4 wf4Var = new wf4(firebaseAuth);
                hvcVar2.getClass();
                izd izdVar = new izd(str4, (String) obj, str5, str, 0);
                izdVar.b(qf4Var2);
                izdVar.e = wf4Var;
                return hvcVar2.q(izdVar);
        }
    }
}
