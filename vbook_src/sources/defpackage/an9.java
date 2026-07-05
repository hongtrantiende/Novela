package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: an9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class an9 implements rn6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ an9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rn6
    public final void C(un6 un6Var, jn6 jn6Var) {
        String str;
        z8c z8cVar;
        int i = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                cw1 cw1Var = (cw1) obj;
                cw1Var.getClass();
                cw1Var.b = jn6Var.a();
                cw1Var.a();
                return;
            case 1:
                sy9 sy9Var = (sy9) obj;
                if (jn6Var == jn6.ON_START) {
                    sy9Var.h = true;
                    return;
                } else if (jn6Var == jn6.ON_STOP) {
                    sy9Var.h = false;
                    return;
                } else {
                    return;
                }
            default:
                b7b b7bVar = (b7b) obj;
                qw6 qw6Var = b7bVar.a;
                qw6Var.getClass();
                String str2 = qw6Var.a;
                mw6 mw6Var = mw6.b;
                if (qw6Var.a(mw6Var)) {
                    qw6Var.b.getClass();
                    pj.a(mw6Var, str2, "SubsamplingState. lifecycle. " + un6Var.k().h + ". disabledAutoStopWithLifecycle=false. '" + b7bVar.c() + '\'');
                }
                xn6 xn6Var = b7bVar.s;
                if (xn6Var != null) {
                    if (xn6Var.h.compareTo(kn6.d) >= 0) {
                        z = true;
                    }
                    boolean z2 = !z;
                    zr1.A();
                    if (b7bVar.r != z2) {
                        if (qw6Var.a(mw6Var)) {
                            qw6Var.b.getClass();
                            pj.a(mw6Var, str2, "SubsamplingState. stopped=" + z2 + ". '" + b7bVar.c() + '\'');
                        }
                        b7bVar.r = z2;
                        if (!z) {
                            str = "stopped";
                        } else {
                            str = "started";
                        }
                        if (!z && (z8cVar = b7bVar.g) != null) {
                            z8cVar.a(str);
                        }
                        b7bVar.d(str);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
