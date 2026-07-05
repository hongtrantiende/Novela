package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tke  reason: default package */
/* loaded from: classes.dex */
public final class tke extends exd {
    public final IBinder g;
    public final /* synthetic */ rh0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tke(rh0 rh0Var, int i, IBinder iBinder, Bundle bundle) {
        super(rh0Var, i, bundle);
        this.h = rh0Var;
        this.g = iBinder;
    }

    @Override // defpackage.exd
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            am8.s(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            rh0 rh0Var = this.h;
            if (!rh0Var.m().equals(interfaceDescriptor)) {
                String m = rh0Var.m();
                Log.w("GmsClient", nk2.w(new StringBuilder(m.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", m, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface b = rh0Var.b(iBinder);
            if (b == null || (!rh0Var.t(2, 4, b) && !rh0Var.t(3, 4, b))) {
                return false;
            }
            rh0Var.u = null;
            oh0 oh0Var = rh0Var.o;
            if (oh0Var != null) {
                oh0Var.f();
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.exd
    public final void b(jz1 jz1Var) {
        ph0 ph0Var = this.h.p;
        if (ph0Var != null) {
            ph0Var.a(jz1Var);
        }
        System.currentTimeMillis();
    }
}
