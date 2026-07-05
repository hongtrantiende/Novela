package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r6a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r6a implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r6a(vl9 vl9Var, os osVar, uva uvaVar) {
        this.a = 7;
        this.d = vl9Var;
        this.b = osVar;
        this.c = uvaVar;
    }

    private final Object a(Object obj) {
        vfb vfbVar = (vfb) this.b;
        cz7 cz7Var = (cz7) this.d;
        ((ib3) obj).getClass();
        if (((Boolean) ((yya) this.c).getValue()).booleanValue()) {
            vfbVar.e(tfb.c);
        }
        return new qf0(13, cz7Var, vfbVar);
    }

    private final Object b(Object obj) {
        String f;
        long b;
        cs9 cs9Var = (cs9) this.b;
        ii2 ii2Var = ((i2c) this.c).b;
        List<goa> list = (List) this.d;
        ((vjc) obj).getClass();
        if (cs9Var == cs9.a) {
            ii2Var.T.c0();
        }
        if (list != null) {
            for (goa goaVar : list) {
                lm2 lm2Var = ii2Var.T;
                String str = goaVar.a;
                lm2Var.getClass();
                str.getClass();
                sp2 sp2Var = sp2.a;
                qp2 qp2Var = (qp2) new dk2(lm2Var, str, new yo2(21)).e();
                if (cs9Var != cs9.c || qp2Var == null) {
                    lm2 lm2Var2 = ii2Var.T;
                    if (qp2Var == null || (f = qp2Var.a) == null) {
                        e31 e31Var = e31.d;
                        f = p40.o(goaVar.a).d("MD5").f();
                    }
                    String str2 = goaVar.a;
                    String str3 = goaVar.b;
                    boolean z = goaVar.c;
                    if (qp2Var != null) {
                        b = qp2Var.e;
                    } else {
                        b = by5.a.k().b();
                    }
                    lm2Var2.q0(new qp2(f, str2, str3, z, b, by5.a.k().b()));
                }
            }
        }
        return pvc.a;
    }

    private final Object e(Object obj) {
        Throwable th = (Throwable) obj;
        z87.v((m82) this.b, null, null, new lc9((s8c) this.c, (t8c) this.d, (m42) null), 3);
        return pvc.a;
    }

    private final Object f(Object obj) {
        p0c p0cVar = (p0c) this.c;
        String str = (String) this.d;
        ((Boolean) obj).getClass();
        if (((qo3) ((p0c) this.b).invoke()).c) {
            ((zl0) p0cVar.invoke()).c(new mbc(str));
        }
        return pvc.a;
    }

    private final Object g(Object obj) {
        m82 m82Var = (m82) this.b;
        an5 an5Var = (an5) this.c;
        aw7 aw7Var = (aw7) this.d;
        f76 f76Var = (f76) obj;
        pvc pvcVar = pvc.a;
        if (f76Var == null) {
            return pvcVar;
        }
        z87.v(m82Var, null, null, new byb(an5Var, f76Var, aw7Var, (m42) null), 3);
        return pvcVar;
    }

    private final Object m(Object obj) {
        g0d g0dVar = (g0d) this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((aw7) this.d).setValue(Boolean.FALSE);
        String str = ((wzc) this.c).a;
        str.getClass();
        hk1 a = jdd.a(g0dVar);
        sw2 sw2Var = ab3.a;
        g0dVar.f(a, ru2.c, new pz2(g0dVar, str, booleanValue, (m42) null, 9));
        return pvc.a;
    }

    private final Object n(Object obj) {
        ((ib3) obj).getClass();
        return new qq(8, (gcd) this.b, (lu4) this.c, (j9d) this.d);
    }

    private final Object o(Object obj) {
        gcd gcdVar = (gcd) this.b;
        lu4 lu4Var = (lu4) this.c;
        xt4 xt4Var = (xt4) this.d;
        Integer num = (Integer) obj;
        num.getClass();
        long longValue = ((Number) gcdVar.g.a.getValue()).longValue();
        long longValue2 = ((Number) gcdVar.h.a.getValue()).longValue();
        if (longValue2 > 0) {
            lu4Var.invoke(Long.valueOf(longValue), Long.valueOf(longValue2));
        }
        xt4Var.invoke(num);
        return pvc.a;
    }

    private final Object p(Object obj) {
        xt4 xt4Var = (xt4) this.d;
        vf6 vf6Var = (vf6) obj;
        vf6Var.getClass();
        List list = (List) ((aw7) this.b).getValue();
        vf6Var.z(list.size(), new poa(18, new h4d(29), list), null, new zgb(12, list), new tu1(new zm7(6, xt4Var, (String) this.c, list), true, -1117249557));
        return pvc.a;
    }

    private final Object q(Object obj) {
        dx4 dx4Var = (dx4) this.b;
        lq lqVar = (lq) this.d;
        ak3 ak3Var = (ak3) obj;
        ak3Var.getClass();
        float h = dx4Var.m.h() * Float.intBitsToFloat((int) (ak3Var.b() >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(dx4Var.n.h() * Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(h) << 32);
        float floatValue = ((Number) ((lq) this.c).e()).floatValue() * Math.min(Float.intBitsToFloat((int) (ak3Var.b() >> 32)), Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L))) * 0.32f;
        long j = zl1.e;
        long b = zl1.b(((Number) lqVar.e()).floatValue(), j);
        long b2 = zl1.b(((Number) lqVar.e()).floatValue() * 0.55f, j);
        ak3.D0(ak3Var, b, floatValue, floatToRawIntBits, nae.e, null, 120);
        ak3.D0(ak3Var, b2, floatValue * 0.72f, floatToRawIntBits, nae.e, new s4b(ak3Var.L0(2.0f), nae.e, 0, 0, null, 30), Token.ASSIGN_LOGICAL_AND);
        return pvc.a;
    }

    private final Object r(Object obj) {
        String B;
        long b;
        cs9 cs9Var = (cs9) this.b;
        ii2 ii2Var = ((yld) this.c).a;
        List<pnc> list = (List) this.d;
        ((vjc) obj).getClass();
        if (cs9Var == cs9.a) {
            gk2 gk2Var = ii2Var.V;
            ((mm) gk2Var.a).q(-571959754, "DELETE FROM DbTrash\nWHERE type = 0", null);
            gk2Var.C(-571959754, new bq2(1));
        }
        if (list != null) {
            for (pnc pncVar : list) {
                gk2 gk2Var2 = ii2Var.V;
                String str = pncVar.a;
                gk2Var2.getClass();
                str.getClass();
                gq2 gq2Var = gq2.a;
                zp2 zp2Var = (zp2) new dq2(gk2Var2, str, new aq2(gk2Var2, 3), (byte) 0).e();
                cs9 cs9Var2 = cs9.c;
                if (cs9Var != cs9Var2 || zp2Var == null) {
                    if (cs9Var != cs9Var2) {
                        gk2Var2.e0(pncVar.a);
                    }
                    if (zp2Var == null || (B = zp2Var.a) == null) {
                        B = ube.B();
                    }
                    String str2 = B;
                    String str3 = pncVar.a;
                    boolean z = pncVar.b;
                    if (zp2Var != null) {
                        b = zp2Var.f;
                    } else {
                        b = by5.a.k().b();
                    }
                    gk2Var2.G0(new zp2(0, b, by5.a.k().b(), str2, "general", str3, z));
                }
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022d  */
    @Override // defpackage.xt4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 3404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6a.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ r6a(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
