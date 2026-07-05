package defpackage;

import android.content.Context;
import android.os.Bundle;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uu6  reason: default package */
/* loaded from: classes.dex */
public final class uu6 implements fea {
    public final Bundle a;

    public uu6(Context context) {
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), Token.CASE).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // defpackage.fea
    public final Object a(m42 m42Var) {
        return pvc.a;
    }

    @Override // defpackage.fea
    public final Boolean b() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // defpackage.fea
    public final wl3 c() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new wl3(jue.O(bundle.getInt("firebase_sessions_sessions_restart_timeout"), am3.SECONDS));
        }
        return null;
    }

    @Override // defpackage.fea
    public final Double d() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
