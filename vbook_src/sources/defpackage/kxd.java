package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kxd  reason: default package */
/* loaded from: classes.dex */
public final class kxd extends l0e {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ f0e g;
    public final /* synthetic */ kp3 h;
    public final /* synthetic */ FirebaseAuth i;

    public kxd(FirebaseAuth firebaseAuth, boolean z, f0e f0eVar, kp3 kp3Var) {
        this.f = z;
        this.g = f0eVar;
        this.h = kp3Var;
        this.i = firebaseAuth;
    }

    @Override // defpackage.l0e
    public final Task C(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        boolean z = this.f;
        kp3 kp3Var = this.h;
        FirebaseAuth firebaseAuth = this.i;
        if (z) {
            hvc hvcVar = firebaseAuth.e;
            qf4 qf4Var = firebaseAuth.a;
            f0e f0eVar = this.g;
            am8.s(f0eVar);
            vf4 vf4Var = new vf4(firebaseAuth, 0);
            hvcVar.getClass();
            uzd uzdVar = new uzd(kp3Var, str, 0);
            uzdVar.b(qf4Var);
            uzdVar.d = f0eVar;
            uzdVar.e = vf4Var;
            uzdVar.f = vf4Var;
            return hvcVar.q(uzdVar);
        }
        hvc hvcVar2 = firebaseAuth.e;
        qf4 qf4Var2 = firebaseAuth.a;
        wf4 wf4Var = new wf4(firebaseAuth);
        hvcVar2.getClass();
        uzd uzdVar2 = new uzd(kp3Var, str, 1);
        uzdVar2.b(qf4Var2);
        uzdVar2.e = wf4Var;
        return hvcVar2.q(uzdVar2);
    }
}
