package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: skd  reason: default package */
/* loaded from: classes.dex */
public final class skd implements rn6 {
    public final /* synthetic */ m41 a;
    public final /* synthetic */ vo b;
    public final /* synthetic */ kk9 c;
    public final /* synthetic */ zl9 d;

    public skd(m41 m41Var, vo voVar, kk9 kk9Var, zl9 zl9Var) {
        this.a = m41Var;
        this.b = voVar;
        this.c = kk9Var;
        this.d = zl9Var;
    }

    @Override // defpackage.rn6
    public final void C(un6 un6Var, jn6 jn6Var) {
        boolean z;
        e61 e61Var = null;
        switch (rkd.a[jn6Var.ordinal()]) {
            case 1:
                z87.v(this.a, null, p82.d, new byb(this.d, this.c, un6Var, this, null, 24), 1);
                return;
            case 2:
                vo voVar = this.b;
                if (voVar != null) {
                    o40 o40Var = (o40) voVar.c;
                    synchronized (o40Var.b) {
                        try {
                            synchronized (o40Var.b) {
                                z = o40Var.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) o40Var.c;
                                o40Var.c = (ArrayList) o40Var.d;
                                o40Var.d = arrayList;
                                o40Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((m42) arrayList.get(i)).resumeWith(pvc.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                kk9 kk9Var = this.c;
                synchronized (kk9Var.d) {
                    if (kk9Var.u) {
                        kk9Var.u = false;
                        e61Var = kk9Var.C();
                    }
                }
                if (e61Var != null) {
                    ((f61) e61Var).resumeWith(pvc.a);
                    return;
                }
                return;
            case 3:
                kk9 kk9Var2 = this.c;
                synchronized (kk9Var2.d) {
                    kk9Var2.u = true;
                }
                return;
            case 4:
                this.c.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                xk5.o();
                return;
        }
    }
}
