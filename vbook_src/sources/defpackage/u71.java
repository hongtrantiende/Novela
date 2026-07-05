package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u71  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class u71 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uo3 b;

    public /* synthetic */ u71(uo3 uo3Var, int i) {
        this.a = i;
        this.b = uo3Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        List<xl0> list;
        xl0 c;
        xl0 c2;
        int i = this.a;
        pm0 pm0Var = null;
        boolean z = false;
        uo3 uo3Var = this.b;
        switch (i) {
            case 0:
                return uo3Var.e();
            case 1:
                return uo3Var.e();
            case 2:
                return uo3Var.e();
            case 3:
                so3 e = uo3Var.e();
                Boolean valueOf = Boolean.valueOf(e.d());
                String str = e.b;
                if (str != null) {
                    pm0Var = new pm0(str);
                }
                return new yk8(valueOf, pm0Var);
            case 4:
                so3 e2 = uo3Var.e();
                su9 su9Var = b81.a;
                e2.getClass();
                xoa xoaVar = e2.e;
                if (xoaVar != null) {
                    if (e2.d == null && e2.c.isEmpty() && ((list = e2.a) == null || !list.isEmpty())) {
                        for (xl0 xl0Var : list) {
                            if (c16.i(xl0Var.a, xoaVar.a)) {
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                return uo3Var.e();
            case 6:
                so3 e3 = uo3Var.e();
                String str2 = e3.b;
                if (str2 == null || (c = e3.c(str2)) == null) {
                    return null;
                }
                return c.b;
            case 7:
                return Boolean.valueOf(!uo3Var.e().c.isEmpty());
            case 8:
                if (uo3Var.e().d != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                return uo3Var.e().a;
            case 10:
                return uo3Var.e().c;
            case 11:
                so3 e4 = uo3Var.e();
                String str3 = e4.b;
                if (str3 == null || (c2 = e4.c(str3)) == null) {
                    return null;
                }
                return c2.b;
            case 12:
                return Boolean.valueOf(!uo3Var.e().c.isEmpty());
            case 13:
                if (uo3Var.e().d != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                uo3Var.getClass();
                so3 e5 = uo3Var.e();
                e5.getClass();
                xoa xoaVar2 = e5.e;
                if (xoaVar2 != null) {
                    List list2 = xoaVar2.d;
                    if (!list2.isEmpty()) {
                        e5 = so3.a(e5, null, null, null, null, xoa.a(xoaVar2, null, null, sl1.Z(list2), null, 7), 15);
                    }
                }
                uo3Var.j(e5.b());
                uo3Var.c(uo3Var.e().a);
                return pvc.a;
        }
    }
}
