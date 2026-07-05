package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uka  reason: default package */
/* loaded from: classes.dex */
public final class uka extends qz4 {
    public final boolean A;
    public final yv B;
    public final Bundle C;
    public final Integer D;

    public uka(Context context, Looper looper, yv yvVar, Bundle bundle, wz4 wz4Var, xz4 xz4Var) {
        super(context, looper, 44, yvVar, wz4Var, xz4Var, 0);
        this.A = true;
        this.B = yvVar;
        this.C = bundle;
        this.D = (Integer) yvVar.f;
    }

    @Override // defpackage.rh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof dvd) {
            return (dvd) queryLocalInterface;
        }
        return new ftd(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // defpackage.rh0
    public final Bundle h() {
        yv yvVar = this.B;
        boolean equals = this.c.getPackageName().equals((String) yvVar.c);
        Bundle bundle = this.C;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) yvVar.c);
        }
        return bundle;
    }

    @Override // defpackage.rh0
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.rh0
    public final String m() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.rh0
    public final String n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.rh0
    public final boolean r() {
        return this.A;
    }
}
