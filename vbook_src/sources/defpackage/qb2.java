package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.CancellationSignal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qb2  reason: default package */
/* loaded from: classes.dex */
public interface qb2 {
    static Object a(Activity activity, qx4 qx4Var, v05 v05Var) {
        sb2 q;
        f61 f61Var = new f61(1, w92.t(v05Var));
        f61Var.u();
        CancellationSignal cancellationSignal = new CancellationSignal();
        f61Var.w(new mw1(cancellationSignal, 1));
        uwd uwdVar = new uwd(f61Var, 13);
        az azVar = new az(1);
        mce mceVar = new mce(activity);
        if (qx4Var != "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL") {
            for (ay4 ay4Var : qx4Var.a) {
            }
            int i = Build.VERSION.SDK_INT;
            q = null;
            if (i >= 34) {
                ac2 ac2Var = new ac2((Activity) mceVar.a);
                if (ac2Var.isAvailableOnDevice()) {
                    q = ac2Var;
                }
                if (q == null) {
                    q = mceVar.q();
                }
            } else if (i <= 33) {
                q = mceVar.q();
            }
        } else {
            q = mceVar.q();
        }
        sb2 sb2Var = q;
        if (sb2Var == null) {
            uwdVar.r(new ox4("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 2));
        } else {
            sb2Var.onGetCredential(activity, qx4Var, cancellationSignal, azVar, uwdVar);
        }
        return f61Var.s();
    }
}
