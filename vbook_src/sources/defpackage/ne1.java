package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ne1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ne1 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kj6 b;

    public /* synthetic */ ne1(kj6 kj6Var, int i) {
        this.a = i;
        this.b = kj6Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        Object obj;
        int i = this.a;
        int i2 = -1;
        boolean z = true;
        int i3 = 0;
        kj6 kj6Var = this.b;
        switch (i) {
            case 0:
                if (kj6Var.h() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (kj6Var.h() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return Integer.valueOf(kj6Var.h());
            case 3:
                return Boolean.valueOf(kj6Var.j().o);
            case 4:
                Iterator it = kj6Var.j().k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((gj6) obj).a == kj6Var.h()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                return (gj6) obj;
            case 5:
                return Integer.valueOf(kj6Var.j().n);
            case 6:
                gj6 gj6Var = (gj6) sl1.k0(kj6Var.j().k);
                if (gj6Var != null && gj6Var.a < kj6Var.j().n - 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                gj6 gj6Var2 = (gj6) sl1.e0(kj6Var.j().k);
                if (gj6Var2 != null) {
                    i3 = gj6Var2.a;
                }
                return Integer.valueOf(i3);
            case 8:
                gj6 gj6Var3 = (gj6) sl1.k0(kj6Var.j().k);
                if (gj6Var3 != null) {
                    i2 = gj6Var3.a;
                }
                return Integer.valueOf(i2);
            case 9:
                gj6 gj6Var4 = (gj6) sl1.e0(kj6Var.j().k);
                if (gj6Var4 != null) {
                    i3 = gj6Var4.a;
                }
                return Integer.valueOf(i3);
            case 10:
                gj6 gj6Var5 = (gj6) sl1.k0(kj6Var.j().k);
                if (gj6Var5 != null) {
                    i2 = gj6Var5.a;
                }
                return Integer.valueOf(i2);
            case 11:
                return Integer.valueOf(kj6Var.h());
            case 12:
                return Integer.valueOf(kj6Var.h());
            case 13:
                return Integer.valueOf(kj6Var.h());
            case 14:
                return Integer.valueOf(kj6Var.h());
            case 15:
                return Boolean.valueOf(kj6Var.j.a());
            case 16:
                return Boolean.valueOf(!kj6Var.j().k.isEmpty());
            default:
                if (kj6Var.h() <= 2) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
