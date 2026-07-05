package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qvd  reason: default package */
/* loaded from: classes.dex */
public final class qvd extends qz4 {
    public final flb A;

    public qvd(Context context, Looper looper, yv yvVar, flb flbVar, oud oudVar, oud oudVar2) {
        super(context, looper, 270, yvVar, oudVar, oudVar2, 0);
        this.A = flbVar;
    }

    @Override // defpackage.rh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof kvd) {
            return (kvd) queryLocalInterface;
        }
        return new ftd(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // defpackage.rh0
    public final mb4[] f() {
        return c16.g;
    }

    @Override // defpackage.rh0
    public final Bundle h() {
        flb flbVar = this.A;
        flbVar.getClass();
        Bundle bundle = new Bundle();
        String str = flbVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.rh0
    public final int i() {
        return 203400000;
    }

    @Override // defpackage.rh0
    public final String m() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.rh0
    public final String n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.rh0
    public final boolean o() {
        return true;
    }
}
