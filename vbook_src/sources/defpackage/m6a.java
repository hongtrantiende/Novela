package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m6a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m6a implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7a b;

    public /* synthetic */ m6a(f7a f7aVar, int i) {
        this.a = i;
        this.b = f7aVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        f6a f6aVar;
        f6a f6aVar2;
        g6a i;
        int i2 = this.a;
        y78 y78Var = null;
        pvc pvcVar = pvc.a;
        f7a f7aVar = this.b;
        switch (i2) {
            case 0:
                ib3 ib3Var = (ib3) obj;
                return new r6(f7aVar, 18);
            case 1:
                if (f7aVar.a.a().b(((Long) obj).longValue())) {
                    f7aVar.l();
                    f7aVar.o(null);
                }
                return pvcVar;
            case 2:
                long longValue = ((Long) obj).longValue();
                g6a i3 = f7aVar.i();
                if (i3 != null && (f6aVar2 = i3.a) != null && longValue == f6aVar2.c) {
                    f7aVar.J.setValue(null);
                }
                g6a i4 = f7aVar.i();
                if (i4 != null && (f6aVar = i4.b) != null && longValue == f6aVar.c) {
                    f7aVar.K.setValue(null);
                }
                if (f7aVar.a.a().b(longValue)) {
                    f7aVar.t();
                }
                ai6 ai6Var = (ai6) f7aVar.R.g(longValue);
                if (ai6Var != null) {
                    ai6Var.b();
                }
                return pvcVar;
            case 3:
                sc6 sc6Var = (sc6) obj;
                rk9 rk9Var = (rk9) f7aVar.F.getValue();
                if (rk9Var == null) {
                    return null;
                }
                sc6 sc6Var2 = f7aVar.H;
                if (sc6Var2 != null) {
                    return jye.x(rk9Var, sc6Var2, sc6Var);
                }
                ov5.d("Required value was null.");
                ls2.c();
                return null;
            case 4:
                sc6 sc6Var3 = (sc6) obj;
                n7a n7aVar = f7aVar.a;
                f7aVar.H = sc6Var3;
                if (sc6Var3 != null && sc6Var3.t() && (i = f7aVar.i()) != null && n7aVar.a().e == 0) {
                    ArrayList e = n7aVar.e(f7aVar.m());
                    if (!e.isEmpty()) {
                        n7aVar.k.setValue(nye.p(i, e, new az9(26), new zy9(24), new tt7(i, 1)));
                    }
                    zm4.a(f7aVar.D);
                }
                if (((Boolean) f7aVar.E.getValue()).booleanValue() && f7aVar.i() != null) {
                    if (sc6Var3 != null) {
                        y78Var = new y78(sc6Var3.m(0L));
                    }
                    if (!c16.i(f7aVar.G, y78Var)) {
                        f7aVar.G = y78Var;
                        f7aVar.r();
                        f7aVar.t();
                    }
                }
                return pvcVar;
            case 5:
                hm8 hm8Var = f7aVar.E;
                dn4 dn4Var = (dn4) obj;
                if (!dn4Var.a() && ((Boolean) hm8Var.getValue()).booleanValue()) {
                    f7aVar.l();
                }
                hm8Var.setValue(Boolean.valueOf(dn4Var.a()));
                return pvcVar;
            case 6:
                f7aVar.n(((Boolean) obj).booleanValue());
                return pvcVar;
            case 7:
                f7aVar.o((g6a) obj);
                return pvcVar;
            default:
                if (f7aVar.a.a().b(((Long) obj).longValue())) {
                    f7aVar.I.setValue(pvcVar);
                    f7aVar.r();
                    f7aVar.t();
                }
                return pvcVar;
        }
    }
}
