package defpackage;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p6(sk8 sk8Var, ar8 ar8Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3) {
        this.a = 17;
        this.b = sk8Var;
        this.c = ar8Var;
        this.f = aw7Var;
        this.d = aw7Var2;
        this.e = aw7Var3;
    }

    private final Object a(Object obj) {
        float f;
        float f2;
        float f3;
        Iterator it;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        List list;
        float f9;
        rl8 rl8Var = (rl8) this.b;
        List list2 = (List) this.d;
        lq lqVar = (lq) this.e;
        List list3 = (List) this.f;
        ak3 ak3Var = (ak3) obj;
        ak3Var.getClass();
        char c = ' ';
        float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32));
        long j = 4294967295L;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L));
        float floatValue = ((Number) rl8Var.a.getValue()).floatValue();
        float floatValue2 = ((Number) rl8Var.b.getValue()).floatValue();
        float floatValue3 = ((Number) ((yya) this.c).getValue()).floatValue() % 120000.0f;
        float f10 = 1.0f;
        if (floatValue3 < 2000.0f) {
            f = floatValue3 / 2000.0f;
        } else if (floatValue3 > 118000.0f) {
            f = (120000.0f - floatValue3) / 2000.0f;
        } else {
            f = 1.0f;
        }
        Iterator it2 = sl1.u0(list2, new roa(1)).iterator();
        while (it2.hasNext()) {
            vra vraVar = (vra) it2.next();
            int i = vraVar.c;
            char c2 = c;
            float f11 = vraVar.f;
            long j2 = j;
            float f12 = vraVar.j;
            float f13 = floatValue3 / i;
            float f14 = (vraVar.b + f13) % f10;
            float f15 = floatValue2;
            float f16 = floatValue3;
            float sin = ((float) Math.sin((f13 * 2.0f * 3.1415927f * vraVar.e) + vraVar.i)) * vraVar.d;
            float f17 = (((f13 * 360000.0f) / vraVar.g) + vraVar.h) % 360.0f;
            float f18 = 40.0f * f12;
            float f19 = floatValue * f18;
            float f20 = f18 * f15;
            float floatValue4 = ((Number) lqVar.e()).floatValue();
            float f21 = nae.e;
            if (floatValue4 > nae.e) {
                f2 = 0.0f;
                float f22 = (intBitsToFloat2 + 200.0f) * floatValue4;
                f3 = f20;
                it = it2;
                f21 = a82.B(f12, 0.5f, 1.0f, f22);
            } else {
                f2 = 0.0f;
                f3 = f20;
                it = it2;
            }
            float f23 = ((vraVar.a + sin) * intBitsToFloat) + f19;
            float f24 = ((((intBitsToFloat2 + 100.0f) * f14) - 50.0f) + f3) - f21;
            if (f23 < -50.0f) {
                f23 = f23 + intBitsToFloat + 100.0f;
            } else if (f23 > intBitsToFloat + 50.0f) {
                f23 = (f23 - intBitsToFloat) - 100.0f;
            }
            nl5 nl5Var = (nl5) list3.get(vraVar.k);
            float width = ((jj) nl5Var).a.getWidth() * f11;
            float f25 = (f12 * 0.55f) + 0.35f;
            if (f24 < f2) {
                f4 = -50.0f;
                f5 = 50.0f;
                f6 = f2;
                f7 = 1.0f;
                f8 = dce.m((f24 + 50.0f) / 50.0f, f6, 1.0f);
            } else {
                f4 = -50.0f;
                f5 = 50.0f;
                f6 = f2;
                f7 = 1.0f;
                if (f24 > intBitsToFloat2) {
                    f8 = dce.m(((intBitsToFloat2 + 50.0f) - f24) / 50.0f, f6, 1.0f);
                } else {
                    f8 = 1.0f;
                }
            }
            if (((Number) lqVar.e()).floatValue() > f6) {
                list = list3;
                f9 = dce.m(f7 - ((Number) lqVar.e()).floatValue(), f6, f7);
            } else {
                list = list3;
                f9 = f7;
            }
            float f26 = ((f11 * 0.3f) + 0.7f) * f25 * f8 * f * f9;
            if (f26 > 0.01f && f24 > f4 && f24 < intBitsToFloat2 + f5) {
                k61 w = ak3Var.Q0().w();
                w.i();
                w.p(f23, f24);
                w.d(f17);
                Bitmap bitmap = ((jj) nl5Var).a;
                long width2 = (bitmap.getWidth() << c2) | (bitmap.getHeight() & j2);
                long j3 = (int) ((-width) / 2.0f);
                long j4 = (int) width;
                long j5 = (j4 << c2) | (j4 & j2);
                ljc c3 = lre.c();
                c3.n(f26);
                w.a(nl5Var, 0L, width2, (j3 << c2) | (j3 & j2), j5, c3);
                w.q();
            }
            c = c2;
            f10 = f7;
            j = j2;
            floatValue2 = f15;
            floatValue3 = f16;
            it2 = it;
            list3 = list;
        }
        return pvc.a;
    }

    private final Object b(Object obj) {
        rk9 rk9Var;
        float f;
        float rint;
        j88 j88Var = (j88) this.c;
        jub jubVar = (jub) this.d;
        ol6 ol6Var = (ol6) this.e;
        esa esaVar = (esa) this.f;
        qd6 qd6Var = (qd6) obj;
        qd6Var.a();
        float h = ((ee2) this.b).c.h();
        if (h != nae.e) {
            long j = jubVar.b;
            int i = fxb.c;
            int w = j88Var.w((int) (j >> 32));
            gvb d = ol6Var.d();
            if (d != null) {
                rk9Var = d.a.c(w);
            } else {
                rk9Var = new rk9(nae.e, nae.e, nae.e, nae.e);
            }
            float floor = (float) Math.floor(qd6Var.L0(2.0f));
            if (floor < 1.0f) {
                f = 1.0f;
            } else {
                f = floor;
            }
            float f2 = f / 2.0f;
            float f3 = rk9Var.a + f2;
            float intBitsToFloat = Float.intBitsToFloat((int) (qd6Var.a.b() >> 32)) - f2;
            if (f3 > intBitsToFloat) {
                f3 = intBitsToFloat;
            }
            if (f3 >= f2) {
                f2 = f3;
            }
            if (((int) f) % 2 == 1) {
                rint = ((float) Math.floor(f2)) + 0.5f;
            } else {
                rint = (float) Math.rint(f2);
            }
            ak3.u1(qd6Var, esaVar, (Float.floatToRawIntBits(rk9Var.b) & 4294967295L) | (Float.floatToRawIntBits(rint) << 32), (Float.floatToRawIntBits(rint) << 32) | (Float.floatToRawIntBits(rk9Var.d) & 4294967295L), f, h, 432);
        }
        return pvc.a;
    }

    private final Object e(Object obj) {
        Set set;
        cs9 cs9Var = (cs9) this.b;
        d3d d3dVar = (d3d) this.c;
        String str = (String) this.d;
        List<obb> list = (List) this.e;
        gn8 gn8Var = (gn8) this.f;
        ((vjc) obj).getClass();
        if (cs9Var == cs9.a) {
            d3dVar.a.D.g0(str);
        }
        cs9 cs9Var2 = cs9.c;
        if (cs9Var == cs9Var2) {
            set = sl1.A0(d3dVar.a.D.q0(str).c());
        } else {
            set = rs3.a;
        }
        Set set2 = set;
        for (obb obbVar : list) {
            if (cs9Var != cs9Var2 || !set2.contains(obbVar.a)) {
                String str2 = obbVar.a;
                d3dVar.getClass();
                gn8 b = sye.b(gn8Var, str2);
                r07 r07Var = new r07();
                for (String str3 : obbVar.c) {
                    gn8 b2 = sye.b(b, nk2.u(str3, ".txt"));
                    abf abfVar = qe4.a;
                    abfVar.getClass();
                    if (b2.a.exists()) {
                        wj9 wj9Var = new wj9(abfVar.A(b2));
                        try {
                            String i = zpe.i(wj9Var);
                            dxe.r(wj9Var, null);
                            r07Var.put(str3, i);
                        } finally {
                        }
                    }
                }
                try {
                    d3dVar.a.D.w0(new xm2(obbVar.a, str, obbVar.b, r07Var.b(), obbVar.d, obbVar.e));
                } catch (Throwable unused) {
                }
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:294:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    @Override // defpackage.xt4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 2920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ p6(Object obj, aw7 aw7Var, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.f = aw7Var;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ p6(Object obj, Object obj2, Object obj3, aw7 aw7Var, aw7 aw7Var2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = aw7Var;
        this.e = aw7Var2;
    }

    public /* synthetic */ p6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ p6(List list, String str, xt4 xt4Var, aw7 aw7Var, aw7 aw7Var2) {
        this.a = 15;
        this.b = list;
        this.d = str;
        this.c = xt4Var;
        this.f = aw7Var;
        this.e = aw7Var2;
    }
}
