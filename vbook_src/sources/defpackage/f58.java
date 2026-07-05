package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.vbook.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f58  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class f58 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f58(aw7 aw7Var, t86 t86Var) {
        this.a = 2;
        q86 q86Var = q86.c;
        this.b = aw7Var;
        this.c = t86Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Object value;
        me9 me9Var;
        long j;
        boolean z3;
        String str;
        int i = this.a;
        float f = nae.e;
        fxb fxbVar = null;
        boolean z4 = false;
        pvc pvcVar = pvc.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cbe.c((j48) obj4, (vt4) obj3, (rv4) obj, xoe.p(9));
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                uaf.i((ov7) obj4, (jn6) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 2:
                aw7 aw7Var = (aw7) obj4;
                p1a p1aVar = hq7.T;
                t86 t86Var = (t86) obj3;
                q86 q86Var = q86.c;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    Object P = rv4Var.P();
                    lh9 lh9Var = ax1.a;
                    if (P == lh9Var) {
                        P = s21.e(rv4Var);
                    }
                    zm4 zm4Var = (zm4) P;
                    Object P2 = rv4Var.P();
                    if (P2 == lh9Var) {
                        P2 = new sr3(zm4Var, null, 15);
                        rv4Var.o0(P2);
                    }
                    yte.g((lu4) P2, rv4Var, zm4Var);
                    kq7 kq7Var = kq7.a;
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, f2);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, d);
                    jce.F(qw1.e, rv4Var, l);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    jub jubVar = (jub) aw7Var.getValue();
                    v72 v72Var = ((h27) rv4Var.j(j27.a)).c.b;
                    nq7 n = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                    boolean f3 = rv4Var.f(aw7Var);
                    Object P3 = rv4Var.P();
                    if (f3 || P3 == lh9Var) {
                        P3 = new qo7(aw7Var, 15);
                        rv4Var.o0(P3);
                    }
                    uwe.g(jubVar, (xt4) P3, n, false, null, null, null, null, false, p1aVar, t86Var, q86Var, false, 0, 0, v72Var, null, rv4Var, 0, 0, 6176760);
                    rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
                    return pvcVar;
                }
                rv4Var.X();
                return pvcVar;
            case 3:
                wb9 wb9Var = (wb9) obj4;
                xt4 xt4Var = (xt4) obj3;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    yqe.o(wb9Var.c, xt4Var, null, rv4Var2, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 4:
                yl9 yl9Var = (yl9) obj4;
                re9 re9Var = (re9) obj3;
                long longValue = ((Long) obj).longValue();
                Long l2 = (Long) obj2;
                long b = by5.a.k().b();
                if (b - yl9Var.a > 200) {
                    yl9Var.a = b;
                    cza czaVar = re9Var.d;
                    if (czaVar != null) {
                        do {
                            value = czaVar.getValue();
                            me9Var = (me9) value;
                            if (l2 != null) {
                                j = l2.longValue();
                            } else {
                                j = -1;
                            }
                        } while (!czaVar.l(value, me9.a(me9Var, null, null, null, null, null, false, longValue, j, 0, 0, 0, 0, 0, 0, false, false, 65343)));
                    }
                }
                return pvcVar;
            case 5:
                r13 r13Var = (r13) obj3;
                xq xqVar = (xq) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                xqVar.getClass();
                if (((Boolean) ((yya) obj4).getValue()).booleanValue()) {
                    r13Var.getClass();
                    return new z22(zt3.g(tte.x(350, 0, null, 6), 2), zt3.i(tte.x(350, 0, null, 6), 2));
                }
                r13Var.getClass();
                int i2 = ykc.a;
                return (z22) new tsa(19, (byte) 0).invoke(xqVar, num);
            case 6:
                tu1 tu1Var = (tu1) obj4;
                fz9 fz9Var = (fz9) obj3;
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z4 = true;
                }
                if (rv4Var3.U(intValue3 & 1, z4)) {
                    tu1Var.c(fz9Var, rv4Var3, 6);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 7:
                tu1 tu1Var2 = (tu1) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z3)) {
                    tu1Var2.c(arrayList, rv4Var4, 0);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 8:
                gy9 gy9Var = (gy9) obj3;
                rx9 rx9Var = (rx9) obj;
                obj2.getClass();
                gy9Var.getClass();
                Bundle v = jsc.v((yk8[]) Arrays.copyOf(new yk8[0], 0));
                new jy9(v, gy9Var).G((ru3) obj4, obj2);
                return v;
            case 9:
                ((Integer) obj2).getClass();
                jue.l((jo3) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 10:
                ((Integer) obj2).getClass();
                owe.r((d0b) obj4, (wza) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 11:
                o45 o45Var = (o45) obj4;
                lu4 lu4Var = (lu4) obj3;
                String str2 = (String) obj;
                List list = (List) obj2;
                str2.getClass();
                list.getClass();
                ArrayList arrayList2 = new ArrayList(list.size());
                for (Object obj5 : list) {
                    if (((Boolean) lu4Var.invoke(str2, (String) obj5)).booleanValue()) {
                        arrayList2.add(obj5);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    o45Var.d(str2, arrayList2);
                }
                return pvcVar;
            case 12:
                Context context = (Context) obj4;
                rq9 rq9Var = (rq9) obj3;
                rv4 rv4Var5 = (rv4) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z4 = true;
                }
                if (rv4Var5.U(intValue5 & 1, z4)) {
                    xwe.b(new il(R.drawable.ic_headphones), context.getString(R.string.widget_album_art_placeholder), s9e.w(36.0f), 1, new dm1(new mac(rq9Var)), rv4Var5, 32768, 0);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 13:
                ((Integer) obj2).getClass();
                oue.b((t23) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 14:
                int intValue6 = ((Integer) obj).intValue();
                float floatValue = ((Float) obj2).floatValue();
                ((aw7) obj3).setValue(Boolean.FALSE);
                ((y5c) obj4).L0(intValue6, floatValue);
                return pvcVar;
            case 15:
                ((Integer) obj2).getClass();
                ((nc6) obj4).h((Drawable) obj3, (rv4) obj, xoe.p(49));
                return pvcVar;
            case 16:
                mu4 mu4Var = (mu4) obj4;
                dsb dsbVar = (dsb) obj3;
                rv4 rv4Var6 = (rv4) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z4 = true;
                }
                if (rv4Var6.U(intValue7 & 1, z4)) {
                    mu4Var.c(dsbVar, rv4Var6, 6);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 17:
                gtb gtbVar = (gtb) obj4;
                m82 m82Var = (m82) obj3;
                lob lobVar = (lob) obj;
                Context context2 = (Context) obj2;
                boolean j2 = gtbVar.j();
                ps m = gtbVar.m();
                if (m != null) {
                    str = m.b;
                } else {
                    str = null;
                }
                fxb fxbVar2 = gtbVar.w;
                if (fxbVar2 != null) {
                    long j3 = fxbVar2.a;
                    j88 j88Var = gtbVar.b;
                    fxbVar = new fxb(sze.a(j88Var.w((int) (j3 >> 32)), j88Var.w((int) (j3 & 4294967295L))));
                }
                yx8.a(lobVar, context2, j2, str, fxbVar, gtbVar.j, new r6a(12, gtbVar, m82Var, context2));
                return pvcVar;
            case 18:
                ytb ytbVar = (ytb) obj4;
                Context context3 = (Context) obj2;
                boolean m2 = ytbVar.m();
                mkc mkcVar = ytbVar.a;
                yx8.a((lob) obj, context3, m2, mkcVar.f().d, new fxb(mkcVar.f().e), ytbVar.f, new r6a(15, ytbVar, (m82) obj3, context3));
                return pvcVar;
            case 19:
                ((Integer) obj2).getClass();
                cvb.a((oyb) obj4, (tu1) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 20:
                ((Integer) obj2).getClass();
                pc2.f((e6c) obj4, (tu1) obj3, (rv4) obj, xoe.p(49));
                return pvcVar;
            case 21:
                c5d c5dVar = (c5d) obj4;
                dm8 dm8Var = (dm8) obj3;
                z09 z09Var = (z09) obj;
                z09Var.getClass();
                tza tzaVar = e1c.a;
                float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & ((y78) obj2).a)) + dm8Var.h();
                if (intBitsToFloat >= nae.e) {
                    f = intBitsToFloat;
                }
                dm8Var.i(f);
                hse.e(c5dVar, z09Var);
                return pvcVar;
            case 22:
                ((Integer) obj2).getClass();
                uac.a((zxa) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 23:
                ((Integer) obj2).getClass();
                jsc.o((p23) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 24:
                ((Integer) obj2).getClass();
                jsc.p((q23) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 25:
                ((Integer) obj2).getClass();
                rgc.l((ArrayList) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 26:
                ((Integer) obj2).getClass();
                rgc.g((f33) obj4, (nq7) obj3, (rv4) obj, xoe.p(9));
                return pvcVar;
            case 27:
                ((Integer) obj2).getClass();
                aze.k((bkd) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 28:
                ((Integer) obj2).getClass();
                n4f.b((ic4) obj4, (nq7) obj3, (rv4) obj, xoe.p(49));
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                hif.f((wzc) obj4, (nq7) obj3, (rv4) obj, xoe.p(9));
                return pvcVar;
        }
    }

    public /* synthetic */ f58(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ f58(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
