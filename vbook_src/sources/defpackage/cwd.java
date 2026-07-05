package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cwd  reason: default package */
/* loaded from: classes.dex */
public final class cwd extends qz4 {
    public final dwd A;

    public cwd(Context context, Looper looper, yv yvVar, dwd dwdVar, oud oudVar, oud oudVar2) {
        super(context, looper, 68, yvVar, oudVar, oudVar2, 0);
        dwdVar = dwdVar == null ? dwd.c : dwdVar;
        rwa rwaVar = new rwa(15, false);
        rwaVar.b = Boolean.FALSE;
        dwd dwdVar2 = dwd.c;
        dwdVar.getClass();
        rwaVar.b = Boolean.valueOf(dwdVar.a);
        rwaVar.c = dwdVar.b;
        rwaVar.c = xvd.a();
        this.A = new dwd(rwaVar);
    }

    @Override // defpackage.rh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof fwd) {
            return (fwd) queryLocalInterface;
        }
        return new ftd(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 2);
    }

    @Override // defpackage.rh0
    public final Bundle h() {
        dwd dwdVar = this.A;
        dwdVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", dwdVar.a);
        bundle.putString("log_session_id", dwdVar.b);
        return bundle;
    }

    @Override // defpackage.rh0
    public final int i() {
        return 12800000;
    }

    @Override // defpackage.rh0
    public final String m() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.rh0
    public final String n() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
