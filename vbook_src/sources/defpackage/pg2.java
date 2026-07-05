package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pg2  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg2 implements lu4 {
    public final /* synthetic */ int a;

    public /* synthetic */ pg2(int i) {
        this.a = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ea7 ea7Var = (ea7) obj;
                Throwable th = (Throwable) obj2;
                ea7Var.getClass();
                bt1 bt1Var = ea7Var.b;
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                bt1Var.o0(th);
                return pvcVar;
            case 1:
                rx9 rx9Var = (rx9) obj;
                iw2 iw2Var = (iw2) obj2;
                return tl1.B(Integer.valueOf(iw2Var.k()), Float.valueOf(dce.m(iw2Var.l(), -0.5f, 0.5f)), Integer.valueOf(iw2Var.n()));
            case 2:
                e13 e13Var = (e13) obj2;
                ((rx9) obj).getClass();
                e13Var.getClass();
                Boolean bool = (Boolean) e13Var.a.getValue();
                bool.booleanValue();
                return tl1.B(bool, (String) e13Var.b.getValue(), (String) e13Var.c.getValue());
            case 3:
                g13 g13Var = (g13) obj2;
                ((rx9) obj).getClass();
                g13Var.getClass();
                Boolean bool2 = (Boolean) g13Var.a.getValue();
                bool2.booleanValue();
                return tl1.B(bool2, (Long) g13Var.b.getValue());
            case 4:
                l13 l13Var = (l13) obj2;
                ((rx9) obj).getClass();
                l13Var.getClass();
                Boolean bool3 = (Boolean) l13Var.a.getValue();
                bool3.booleanValue();
                return tl1.A(bool3);
            case 5:
                m13 m13Var = (m13) obj2;
                ((rx9) obj).getClass();
                m13Var.getClass();
                Boolean bool4 = (Boolean) m13Var.a.getValue();
                bool4.booleanValue();
                Boolean bool5 = (Boolean) m13Var.c.getValue();
                bool5.booleanValue();
                return tl1.B(bool4, (String) m13Var.b.getValue(), bool5);
            case 6:
                ((lg6) obj).getClass();
                ((us9) obj2).getClass();
                return new i25(dpe.b(lg6.b));
            case 7:
                ((Integer) obj2).getClass();
                fa3.i(xoe.p(1), (rv4) obj);
                return pvcVar;
            case 8:
                q0a q0aVar = (q0a) obj;
                q0aVar.getClass();
                ((wl8) obj2).getClass();
                return new pc4((re5) q0aVar.e(cm9.a(re5.class), null, null));
            case 9:
                ak3 ak3Var = (ak3) obj;
                xt4 xt4Var = (xt4) obj2;
                ak3Var.getClass();
                xt4Var.getClass();
                xt4Var.invoke(ak3Var);
                return pvcVar;
            case 10:
                co3 co3Var = (co3) obj2;
                ((rx9) obj).getClass();
                co3Var.getClass();
                Boolean bool6 = (Boolean) co3Var.a.getValue();
                bool6.booleanValue();
                return tl1.B(bool6, (String) co3Var.b.getValue(), (String) co3Var.c.getValue());
            case 11:
                do3 do3Var = (do3) obj2;
                ((rx9) obj).getClass();
                do3Var.getClass();
                Boolean bool7 = (Boolean) do3Var.a.getValue();
                bool7.booleanValue();
                return tl1.B(bool7, (String) do3Var.b.getValue(), (String) do3Var.c.getValue(), (String) do3Var.d.getValue());
            case 12:
                eo3 eo3Var = (eo3) obj2;
                ((rx9) obj).getClass();
                eo3Var.getClass();
                Boolean bool8 = (Boolean) eo3Var.a.getValue();
                bool8.booleanValue();
                return tl1.B(bool8, (String) eo3Var.b.getValue(), eo3Var.d());
            case 13:
                fo3 fo3Var = (fo3) obj2;
                ((rx9) obj).getClass();
                fo3Var.getClass();
                Boolean bool9 = (Boolean) fo3Var.a.getValue();
                bool9.booleanValue();
                return tl1.B(bool9, (String) fo3Var.b.getValue(), (String) fo3Var.c.getValue());
            case 14:
                go3 go3Var = (go3) obj2;
                ((rx9) obj).getClass();
                go3Var.getClass();
                Boolean bool10 = (Boolean) go3Var.a.getValue();
                bool10.booleanValue();
                Boolean bool11 = (Boolean) go3Var.d.getValue();
                bool11.booleanValue();
                return tl1.B(bool10, (String) go3Var.b.getValue(), (String) go3Var.c.getValue(), bool11);
            case 15:
                ho3 ho3Var = (ho3) obj2;
                ((rx9) obj).getClass();
                ho3Var.getClass();
                Boolean bool12 = (Boolean) ho3Var.a.getValue();
                bool12.booleanValue();
                return tl1.B(bool12, (String) ho3Var.b.getValue(), (String) ho3Var.c.getValue(), (String) ho3Var.d.getValue(), (String) ho3Var.e.getValue());
            case 16:
                io3 io3Var = (io3) obj2;
                ((rx9) obj).getClass();
                io3Var.getClass();
                Boolean bool13 = (Boolean) io3Var.a.getValue();
                bool13.booleanValue();
                String str = (String) io3Var.b.getValue();
                String a = io3Var.a();
                Boolean bool14 = (Boolean) io3Var.e.getValue();
                bool14.booleanValue();
                Boolean bool15 = (Boolean) io3Var.d.getValue();
                bool15.booleanValue();
                Boolean bool16 = (Boolean) io3Var.f.getValue();
                bool16.booleanValue();
                return tl1.B(bool13, str, a, bool14, bool15, bool16);
            case 17:
                ((Integer) obj).intValue();
                wp3 wp3Var = (wp3) obj2;
                wp3Var.getClass();
                return wp3Var.a;
            case 18:
                return Integer.valueOf(((String) obj2).length() - ((String) obj).length());
            case 19:
                ((Integer) obj).getClass();
                sjc sjcVar = (sjc) obj2;
                sjcVar.getClass();
                return new c00(new t04(sjcVar, null, 1), 2);
            case 20:
                ((Integer) obj).getClass();
                sjc sjcVar2 = (sjc) obj2;
                sjcVar2.getClass();
                return new c00(new t04(sjcVar2, null, 0), 2);
            case 21:
                q0a q0aVar2 = (q0a) obj;
                q0aVar2.getClass();
                ((wl8) obj2).getClass();
                return new h1a((ii2) q0aVar2.e(cm9.a(ii2.class), null, null), (re5) q0aVar2.e(cm9.a(re5.class), null, null), (i34) q0aVar2.e(cm9.a(i34.class), null, null), (lw0) q0aVar2.e(cm9.a(lw0.class), null, null), new t42(q0aVar2, 16));
            case 22:
                ((Integer) obj).intValue();
                f84 f84Var = (f84) obj2;
                f84Var.getClass();
                return f84Var.b;
            case 23:
                ((Integer) obj).intValue();
                l54 l54Var = (l54) obj2;
                l54Var.getClass();
                return s21.m("update_", l54Var.a);
            case 24:
                ((Integer) obj).intValue();
                l54 l54Var2 = (l54) obj2;
                l54Var2.getClass();
                return s21.m("installed_", l54Var2.a);
            case 25:
                ((Integer) obj).intValue();
                l54 l54Var3 = (l54) obj2;
                l54Var3.getClass();
                return l54Var3.a;
            case 26:
                ((Integer) obj2).getClass();
                zr1.d(xoe.p(1), (rv4) obj);
                return pvcVar;
            case 27:
                return Boolean.valueOf(c16.i(obj, obj2));
            case 28:
                ((Integer) obj).intValue();
                co4 co4Var = (co4) obj2;
                co4Var.getClass();
                return co4Var.a;
            default:
                rz4 rz4Var = (rz4) obj2;
                ((rx9) obj).getClass();
                rz4Var.getClass();
                Boolean bool17 = (Boolean) rz4Var.a.getValue();
                bool17.booleanValue();
                return tl1.B(bool17, (String) rz4Var.b.getValue());
        }
    }

    public /* synthetic */ pg2(int i, int i2) {
        this.a = i2;
    }

    public /* synthetic */ pg2(x04 x04Var, int i) {
        this.a = i;
    }
}
