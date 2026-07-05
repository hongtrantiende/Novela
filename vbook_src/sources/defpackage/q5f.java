package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q5f  reason: default package */
/* loaded from: classes.dex */
public final class q5f extends qz4 {
    @Override // defpackage.rh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof l9f) {
            return (l9f) queryLocalInterface;
        }
        return new l9f(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // defpackage.rh0
    public final mb4[] f() {
        return new mb4[]{z87.d, z87.c};
    }

    @Override // defpackage.rh0
    public final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // defpackage.rh0
    public final int i() {
        return 13000000;
    }

    @Override // defpackage.rh0
    public final String m() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // defpackage.rh0
    public final String n() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // defpackage.rh0
    public final boolean s() {
        return true;
    }
}
