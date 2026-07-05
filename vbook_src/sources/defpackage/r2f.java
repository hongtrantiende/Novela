package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r2f  reason: default package */
/* loaded from: classes.dex */
public final class r2f implements ServiceConnection, oh0, ph0 {
    public volatile boolean a;
    public volatile bpe b;
    public final /* synthetic */ w2f c;

    public r2f(w2f w2fVar) {
        this.c = w2fVar;
    }

    @Override // defpackage.ph0
    public final void a(jz1 jz1Var) {
        w2f w2fVar = this.c;
        ete eteVar = ((lte) w2fVar.a).C;
        lte.m(eteVar);
        eteVar.c0();
        ppe ppeVar = ((lte) w2fVar.a).f;
        if (ppeVar == null || !ppeVar.b) {
            ppeVar = null;
        }
        if (ppeVar != null) {
            ppeVar.J.f(jz1Var, "Service connection failed");
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        ete eteVar2 = ((lte) this.c.a).C;
        lte.m(eteVar2);
        eteVar2.g0(new w1f(3, this, jz1Var));
    }

    @Override // defpackage.oh0
    public final void e(int i) {
        lte lteVar = (lte) this.c.a;
        ete eteVar = lteVar.C;
        lte.m(eteVar);
        eteVar.c0();
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        ppeVar.I.e("Service connection suspended");
        ete eteVar2 = lteVar.C;
        lte.m(eteVar2);
        eteVar2.g0(new og(this, 18));
    }

    @Override // defpackage.oh0
    public final void f() {
        ete eteVar = ((lte) this.c.a).C;
        lte.m(eteVar);
        eteVar.c0();
        synchronized (this) {
            try {
                am8.s(this.b);
                ete eteVar2 = ((lte) this.c.a).C;
                lte.m(eteVar2);
                eteVar2.g0(new h2f(this, (lne) this.b.l(), 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        lne bneVar;
        ete eteVar = ((lte) this.c.a).C;
        lte.m(eteVar);
        eteVar.c0();
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                ppe ppeVar = ((lte) this.c.a).f;
                lte.m(ppeVar);
                ppeVar.f.e("Service connected with null binder");
                return;
            }
            lne lneVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof lne) {
                        bneVar = (lne) queryLocalInterface;
                    } else {
                        bneVar = new bne(iBinder);
                    }
                    lneVar = bneVar;
                    ppe ppeVar2 = ((lte) this.c.a).f;
                    lte.m(ppeVar2);
                    ppeVar2.J.e("Bound to IMeasurementService interface");
                } else {
                    ppe ppeVar3 = ((lte) this.c.a).f;
                    lte.m(ppeVar3);
                    ppeVar3.f.f(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                ppe ppeVar4 = ((lte) this.c.a).f;
                lte.m(ppeVar4);
                ppeVar4.f.e("Service connect failed to get IMeasurementService");
            }
            if (lneVar == null) {
                this.a = false;
                try {
                    tz1 b = tz1.b();
                    w2f w2fVar = this.c;
                    b.c(((lte) w2fVar.a).a, w2fVar.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                ete eteVar2 = ((lte) this.c.a).C;
                lte.m(eteVar2);
                eteVar2.g0(new h2f(this, lneVar, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        lte lteVar = (lte) this.c.a;
        ete eteVar = lteVar.C;
        lte.m(eteVar);
        eteVar.c0();
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        ppeVar.I.e("Service disconnected");
        ete eteVar2 = lteVar.C;
        lte.m(eteVar2);
        eteVar2.g0(new w1f(1, this, componentName));
    }
}
