package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [wl9, java.lang.Object, java.io.Serializable] */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        long j;
        float L0;
        float f2;
        Integer num;
        Integer num2;
        int i = this.a;
        int i2 = 0;
        boolean z = true;
        pvc pvcVar = pvc.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                ((yu7) obj3).c((k59) obj2);
                return pvcVar;
            case 1:
                ((r13) obj).getClass();
                return new py5(k27.A(((Number) dce.p(Float.valueOf(((qe) obj3).d()), (jk1) obj2)).floatValue()) << 32);
            case 2:
                ce ceVar = (ce) obj3;
                le leVar = (le) obj2;
                long j2 = ((rh3) obj).a;
                if (ceVar.d2()) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                long k = y78.k(f, j2);
                if (ceVar.M == ff8.a) {
                    j = k & 4294967295L;
                } else {
                    j = k >> 32;
                }
                le.b(leVar, ceVar.f0.c(Float.intBitsToFloat((int) j)));
                return pvcVar;
            case 3:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * ((Number) ((ja0) obj3).g.getValue()).floatValue();
                uf ufVar = ((h2a) obj2).h;
                if (ufVar != null) {
                    ufVar.a(ak3Var.Q0().w());
                }
                ak3.R0(ak3Var, zl1.h, (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var.b() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), nae.e, null, 0, 48);
                ij1 Q0 = ak3Var.Q0();
                long G = Q0.G();
                Q0.w().i();
                try {
                    mu9.E((mu9) Q0.b, nae.e, intBitsToFloat, 1);
                    ak3.h1(ak3Var, ox9.B(ha0.a, ak3Var.L0(ha0.b), 8), 0L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var.b() >> 32))) << 32) | (Float.floatToRawIntBits(L0) & 4294967295L), nae.e, null, null, 0, Token.FUNCTION);
                    return pvcVar;
                } finally {
                    rs8.r(Q0, G);
                }
            case 4:
                Float f3 = (Float) obj;
                ((ja0) obj3).i(f3.floatValue());
                ((xt4) obj2).invoke(f3);
                return pvcVar;
            case 5:
                Float f4 = (Float) obj;
                ((ja0) obj3).i(f4.floatValue());
                ((xt4) obj2).invoke(f4);
                return pvcVar;
            case 6:
                oe0 oe0Var = (oe0) obj3;
                pe0 pe0Var = (pe0) obj2;
                xm9 xm9Var = (xm9) obj;
                j7c j7cVar = oe0Var.K;
                if (j7cVar != null) {
                    j7cVar.b();
                }
                oe0Var.K = null;
                bt1 bt1Var = pe0Var.c;
                if (bt1Var != null) {
                    bt1Var.P(pvcVar);
                }
                pe0Var.c = null;
                return pvcVar;
            case 7:
                jf0 jf0Var = (jf0) obj3;
                xv1 xv1Var = (xv1) obj2;
                ib3 ib3Var = (ib3) obj;
                yz7 yz7Var = jf0Var.a;
                if (yz7Var != null) {
                    yz7.a(yz7Var, xv1Var.b);
                } else {
                    tb8 tb8Var = jf0Var.b;
                    if (tb8Var != null) {
                        if0 if0Var = xv1Var.a;
                        if0Var.getClass();
                        ob8 ob8Var = new ob8(if0Var, new pb8(if0Var, null));
                        if0Var.a.add(ob8Var);
                        yz7.a(tb8Var.b().c, ob8Var);
                    } else {
                        vs.k("Unreachable");
                        return null;
                    }
                }
                return new qf0(1, jf0Var, xv1Var);
            case 8:
                mw8 mw8Var = (mw8) obj3;
                mw8 mw8Var2 = (mw8) obj2;
                lw8 lw8Var = (lw8) obj;
                if (mw8Var.a <= lw8Var.X0(sxd.f)) {
                    z = false;
                }
                float f5 = 6.0f;
                if (z) {
                    f2 = 12.0f;
                } else {
                    f2 = 6.0f;
                }
                if (z) {
                    f5 = 14.0f;
                }
                lw8.z(lw8Var, mw8Var2, 0, 0);
                lw8.z(lw8Var, mw8Var, Math.min(mw8Var2.a - lw8Var.X0(f2), ((int) lw8Var.g(ctd.b, Float.POSITIVE_INFINITY)) - mw8Var.a), Math.max(lw8Var.X0(f5) + (-mw8Var.b), (int) lw8Var.g(ctd.a, Float.NEGATIVE_INFINITY)));
                return pvcVar;
            case 9:
                xt4 xt4Var = (xt4) obj2;
                jub jubVar = (jub) obj;
                if (!c16.i((jub) obj3, jubVar)) {
                    xt4Var.invoke(jubVar);
                }
                return pvcVar;
            case 10:
                String str = (String) obj;
                str.getClass();
                ((aw7) obj2).setValue(Boolean.FALSE);
                ((mq0) obj3).k(str);
                return pvcVar;
            case 11:
                qd6 qd6Var = (qd6) obj;
                qd6Var.a();
                ak3.N(qd6Var, (yj) obj3, (hy0) obj2, nae.e, null, null, 0, 60);
                return pvcVar;
            case 12:
                qd6 qd6Var2 = (qd6) obj;
                qd6Var2.a();
                ak3.N(qd6Var2, ((sf8) obj3).c, (hy0) obj2, nae.e, null, null, 0, 60);
                return pvcVar;
            case 13:
                Throwable th2 = (Throwable) obj;
                ((gw7) ((fz4) obj3).a).j((h22) obj2);
                return pvcVar;
            case 14:
                gh5 gh5Var = (gh5) obj;
                gh5Var.getClass();
                xtc xtcVar = gh5Var.a;
                ztc ztcVar = ztc.d;
                xtcVar.getClass();
                ztcVar.getClass();
                xtcVar.d = ztcVar;
                xtcVar.e(xtcVar.c);
                ytc.b(xtcVar, (String) obj3);
                ((zub) obj2).invoke(gh5Var);
                return pvcVar;
            case 15:
                gh5 gh5Var2 = (gh5) obj;
                gh5Var2.getClass();
                gh5Var2.d((pg5) obj3);
                h40 h40Var = hh5.a;
                xtc xtcVar2 = gh5Var2.a;
                xtcVar2.getClass();
                ztc ztcVar2 = ztc.c;
                xtcVar2.d = lbe.i("ws");
                ((k0) obj2).invoke(gh5Var2);
                return pvcVar;
            case 16:
                f31 f31Var = (f31) obj3;
                i11 i11Var = (i11) obj2;
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    gae.d(f31Var, th3);
                    i11Var.a(th3);
                }
                return pvcVar;
            case 17:
                i11 i11Var2 = (i11) obj3;
                i11 i11Var3 = (i11) obj2;
                Throwable th4 = (Throwable) obj;
                if (th4 != null) {
                    i11Var2.a(th4);
                    i11Var3.a(th4);
                }
                return pvcVar;
            case 18:
                qo3 qo3Var = (qo3) obj3;
                j19 j19Var = (j19) obj2;
                wi3 wi3Var = (wi3) obj;
                if (wi3Var != null) {
                    num = Integer.valueOf(wi3Var.a);
                } else {
                    num = null;
                }
                if (wi3Var != null) {
                    num2 = Integer.valueOf(wi3Var.b);
                } else {
                    num2 = null;
                }
                j19Var.getClass();
                if (qo3Var.i) {
                    j19Var.c(new vxc(num, num2));
                }
                return pvcVar;
            case 19:
                cg1 cg1Var = (cg1) obj3;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                List list = cg1Var.y;
                ri6Var.z(list.size(), new x7(9, new v71(15), list), new y7(12, list), new tu1(new ya(list, cg1Var, (xt4) obj2, 2), true, 802480018));
                if (cg1Var.w) {
                    ri6.y(ri6Var, null, npe.b, 3);
                }
                return pvcVar;
            case 20:
                lp1 lp1Var = (lp1) obj3;
                ((vjc) obj).getClass();
                ii2 ii2Var = lp1Var.b;
                gk2 gk2Var = ii2Var.N;
                String str2 = lp1Var.a;
                gk2Var.i0(str2);
                int i3 = 0;
                for (Object obj4 : (List) obj2) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        gk2 gk2Var2 = ii2Var.N;
                        String m = a82.m(str2, "_", i3);
                        String str3 = lp1Var.a;
                        String str4 = ((eua) obj4).a;
                        yj1 yj1Var = by5.a;
                        gk2Var2.D0(new vo2(m, str3, i3, str4, yj1Var.k().b(), yj1Var.k().b()));
                        i3 = i4;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar;
            case 21:
                lp1 lp1Var2 = (lp1) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ((vjc) obj).getClass();
                ii2 ii2Var2 = lp1Var2.b;
                ii2Var2.C.f0(lp1Var2.a);
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj5 = arrayList.get(i2);
                    i2++;
                    ii2Var2.C.z0((sm2) obj5);
                }
                return pvcVar;
            case 22:
                ArrayList arrayList2 = (ArrayList) obj2;
                o45 o45Var = (o45) obj;
                o45Var.getClass();
                ((oh5) obj3).a().c(new sj(o45Var, 4));
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj6 = arrayList2.get(i2);
                    i2++;
                    if (!arrayList2.contains((String) obj6)) {
                        arrayList3.add(obj6);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    o45Var.h("Content-Encoding", sl1.i0(arrayList3, ",", null, null, null, 62));
                }
                return pvcVar;
            case 23:
                a52 a52Var = (a52) obj3;
                m82 m82Var = (m82) obj2;
                long j3 = ((y78) obj).a;
                a52Var.getClass();
                m82Var.getClass();
                zc6 zc6Var = (zc6) ((cza) a52Var.c).getValue();
                ?? obj7 = new Object();
                obj7.a = zc6Var.h;
                z87.v(m82Var, null, null, new o0((Serializable) obj7, zc6Var, a52Var, j3, (m42) null, 2), 3);
                return pvcVar;
            case 24:
                u41 u41Var = (u41) obj;
                u41Var.getClass();
                return u41Var.a(new uh(((wc2) ((aw7) obj3).getValue()).a(npe.n(0L, u41Var.a.b())), u41Var.f() * 2.0f, (yya) obj2, 1));
            case 25:
                ol6 ol6Var = (ol6) obj3;
                hy0 hy0Var = (hy0) obj2;
                qd6 qd6Var3 = (qd6) obj;
                qd6Var3.a();
                if (((Boolean) ol6Var.s.getValue()).booleanValue() || ((Boolean) ol6Var.t.getValue()).booleanValue()) {
                    ak3.h1(qd6Var3, hy0Var, 0L, 0L, nae.e, null, null, 0, Token.ELSE);
                }
                return pvcVar;
            case 26:
                ak2 ak2Var = (ak2) obj3;
                gk2 gk2Var3 = (gk2) obj2;
                nm nmVar = (nm) obj;
                nmVar.getClass();
                nmVar.g(0, ak2Var.a);
                nmVar.g(1, ak2Var.b);
                nmVar.g(2, ak2Var.c);
                ((j55) gk2Var3.c).getClass();
                nmVar.j(3, Long.valueOf(ak2Var.d));
                ((j55) gk2Var3.c).getClass();
                nmVar.j(4, Long.valueOf(ak2Var.e));
                nmVar.g(5, ak2Var.f);
                nmVar.j(6, Long.valueOf(ak2Var.g));
                nmVar.g(7, ak2Var.h);
                nmVar.g(8, ak2Var.i);
                nmVar.g(9, ak2Var.j);
                nmVar.j(10, Long.valueOf(ak2Var.k));
                nmVar.j(11, Long.valueOf(ak2Var.l));
                return pvcVar;
            case 27:
                hk2 hk2Var = (hk2) obj3;
                gk2 gk2Var4 = (gk2) obj2;
                nm nmVar2 = (nm) obj;
                nmVar2.getClass();
                nmVar2.g(0, hk2Var.a);
                ((kh5) gk2Var4.c).getClass();
                cne cneVar = cne.C;
                nmVar2.g(1, (String) cneVar.p(hk2Var.b));
                ((kh5) gk2Var4.c).getClass();
                nmVar2.g(2, (String) cneVar.p(hk2Var.c));
                nmVar2.g(3, hk2Var.d);
                nmVar2.j(4, Long.valueOf(hk2Var.e));
                nmVar2.j(5, Long.valueOf(hk2Var.f));
                List list2 = hk2Var.g;
                list2.getClass();
                s46 s46Var = v46.a;
                s46Var.getClass();
                nmVar2.g(6, s46Var.b(new sz(c4b.a, 0), list2));
                nmVar2.g(7, hk2Var.h);
                nmVar2.g(8, hk2Var.i);
                nmVar2.g(9, hk2Var.j);
                nmVar2.g(10, hk2Var.k);
                nmVar2.g(11, hk2Var.l);
                nmVar2.j(12, Long.valueOf(hk2Var.m));
                nmVar2.j(13, Long.valueOf(hk2Var.n));
                nmVar2.g(14, (String) cneVar.p(hk2Var.o));
                nmVar2.l(15, Boolean.valueOf(hk2Var.p));
                nmVar2.g(16, hk2Var.q);
                nmVar2.g(17, hk2Var.r);
                nmVar2.j(18, Long.valueOf(hk2Var.s));
                nmVar2.k(19, Double.valueOf(hk2Var.t));
                nmVar2.j(20, Long.valueOf(hk2Var.u));
                nmVar2.j(21, Long.valueOf(hk2Var.v));
                nmVar2.j(22, Long.valueOf(hk2Var.w));
                nmVar2.l(23, Boolean.valueOf(hk2Var.x));
                nmVar2.l(24, Boolean.valueOf(hk2Var.y));
                nmVar2.l(25, Boolean.valueOf(hk2Var.z));
                nmVar2.l(26, Boolean.valueOf(hk2Var.A));
                nmVar2.j(27, Long.valueOf(hk2Var.B));
                nmVar2.g(28, (String) cneVar.p(hk2Var.C));
                nmVar2.g(29, (String) cneVar.p(hk2Var.D));
                nmVar2.j(30, Long.valueOf(hk2Var.E));
                nmVar2.j(31, Long.valueOf(hk2Var.F));
                nmVar2.j(32, Long.valueOf(hk2Var.G));
                nmVar2.j(33, Long.valueOf(hk2Var.H));
                nmVar2.j(34, Long.valueOf(hk2Var.I));
                return pvcVar;
            case 28:
                gk2 gk2Var5 = (gk2) obj2;
                nm nmVar3 = (nm) obj;
                nmVar3.getClass();
                for (Number number : (List) ((dk2) obj3).c) {
                    int intValue = number.intValue();
                    ((kh5) gk2Var5.c).getClass();
                    nmVar3.j(i2, Long.valueOf(intValue));
                    i2++;
                }
                return pvcVar;
            default:
                nm nmVar4 = (nm) obj;
                nmVar4.getClass();
                ((kh5) ((gk2) obj3).c).getClass();
                nmVar4.j(0, Long.valueOf(((pk2) obj2).c));
                return pvcVar;
        }
    }
}
