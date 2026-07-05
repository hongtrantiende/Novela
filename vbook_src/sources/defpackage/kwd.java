package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kwd  reason: default package */
/* loaded from: classes.dex */
public final class kwd extends qz4 {
    public final Bundle A;

    public kwd(Context context, Looper looper, yv yvVar, oud oudVar, oud oudVar2) {
        super(context, looper, 223, yvVar, oudVar, oudVar2, 0);
        this.A = new Bundle();
    }

    @Override // defpackage.rh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        if (queryLocalInterface instanceof twd) {
            return (twd) queryLocalInterface;
        }
        return new ftd(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService", 2);
    }

    @Override // defpackage.rh0
    public final mb4[] f() {
        return k27.f;
    }

    @Override // defpackage.rh0
    public final Bundle h() {
        return this.A;
    }

    @Override // defpackage.rh0
    public final int i() {
        return 17895000;
    }

    @Override // defpackage.rh0
    public final String m() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // defpackage.rh0
    public final String n() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // defpackage.rh0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.rh0
    public final boolean s() {
        return true;
    }
}
