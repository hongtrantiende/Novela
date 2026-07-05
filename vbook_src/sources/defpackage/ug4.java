package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ug4  reason: default package */
/* loaded from: classes.dex */
public final class ug4 {
    public final qf4 a;
    public final wba b;

    public ug4(qf4 qf4Var, wba wbaVar, d82 d82Var, uba ubaVar) {
        qf4Var.getClass();
        wbaVar.getClass();
        d82Var.getClass();
        ubaVar.getClass();
        this.a = qf4Var;
        this.b = wbaVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.6.");
        qf4Var.a();
        Context applicationContext = qf4Var.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(ubaVar);
            z87.v(k27.a(d82Var), null, null, new d53(this, ubaVar, (m42) null, 18), 3);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
