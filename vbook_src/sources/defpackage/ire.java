package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ire  reason: default package */
/* loaded from: classes.dex */
public final class ire implements ServiceConnection {
    public final String a;
    public final /* synthetic */ mre b;

    public ire(mre mreVar, String str) {
        Objects.requireNonNull(mreVar);
        this.b = mreVar;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ice] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ice iceVar;
        mre mreVar = this.b;
        if (iBinder != null) {
            try {
                int i = ece.a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof ice) {
                    iceVar = (ice) queryLocalInterface;
                } else {
                    iceVar = new ftd(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 4);
                }
                lte lteVar = mreVar.a;
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.J.e("Install Referrer Service connected");
                ete eteVar = lteVar.C;
                lte.m(eteVar);
                eteVar.g0(new bv4(this, (ice) iceVar, this));
                return;
            } catch (RuntimeException e) {
                ppe ppeVar2 = mreVar.a.f;
                lte.m(ppeVar2);
                ppeVar2.E.f(e, "Exception occurred while calling Install Referrer API");
                return;
            }
        }
        ppe ppeVar3 = mreVar.a.f;
        lte.m(ppeVar3);
        ppeVar3.E.e("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ppe ppeVar = this.b.a.f;
        lte.m(ppeVar);
        ppeVar.J.e("Install Referrer Service disconnected");
    }
}
