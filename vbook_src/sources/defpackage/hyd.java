package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hyd  reason: default package */
/* loaded from: classes.dex */
public final class hyd extends l0e {
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ f0e h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ FirebaseAuth k;

    public hyd(FirebaseAuth firebaseAuth, String str, boolean z, f0e f0eVar, String str2, String str3) {
        this.f = str;
        this.g = z;
        this.h = f0eVar;
        this.i = str2;
        this.j = str3;
        this.k = firebaseAuth;
    }

    @Override // defpackage.l0e
    public final Task C(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = this.f;
        if (isEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z = this.g;
        String str3 = this.j;
        String str4 = this.i;
        FirebaseAuth firebaseAuth = this.k;
        if (z) {
            hvc hvcVar = firebaseAuth.e;
            qf4 qf4Var = firebaseAuth.a;
            f0e f0eVar = this.h;
            am8.s(f0eVar);
            vf4 vf4Var = new vf4(firebaseAuth, 0);
            hvcVar.getClass();
            izd izdVar = new izd(str2, str4, str3, str, 1);
            izdVar.b(qf4Var);
            izdVar.d = f0eVar;
            izdVar.e = vf4Var;
            izdVar.f = vf4Var;
            return hvcVar.q(izdVar);
        }
        hvc hvcVar2 = firebaseAuth.e;
        qf4 qf4Var2 = firebaseAuth.a;
        wf4 wf4Var = new wf4(firebaseAuth);
        hvcVar2.getClass();
        izd izdVar2 = new izd(str2, str4, str3, str, 2);
        izdVar2.b(qf4Var2);
        izdVar2.e = wf4Var;
        return hvcVar2.q(izdVar2);
    }
}
