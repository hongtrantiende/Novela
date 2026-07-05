package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tg0  reason: default package */
/* loaded from: classes.dex */
public final class tg0 extends mq7 implements fd6, zj3, z7a, c19, sq7, jm8, oc6, hz4, fm4, xm4, bn4, xg8, gz0 {
    public lq7 K;
    public HashSet L;

    @Override // defpackage.mq7
    public final void A1() {
        if (!this.J) {
            lv5.c("unInitializeModifier called on unattached node");
        }
        if ((this.c & 8) != 0) {
            ((rg) voe.w(this)).B();
        }
    }

    @Override // defpackage.sq7
    public final xpe E0() {
        return ms3.f;
    }

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        return ((dd6) lq7Var).n(new i16(ry6Var, ry6Var.getLayoutDirection()), new qu2(w27Var, m37.b, n37.b, 1), y02.b(0, i, 0, 0, 13)).d();
    }

    public final void H1(boolean z) {
        if (!this.J) {
            lv5.c("initializeModifier called on unattached node");
        }
        lq7 lq7Var = this.K;
        if ((this.c & 4) != 0 && !z) {
            ube.x(this);
        }
        if ((this.c & 2) != 0) {
            hkb hkbVar = (hkb) voe.v(this).c0.f;
            hkbVar.getClass();
            if (hkbVar.K) {
                i38 i38Var = this.D;
                i38Var.getClass();
                ((id6) i38Var).h2(this);
                vg8 vg8Var = i38Var.n0;
                if (vg8Var != null) {
                    ((s15) vg8Var).c();
                }
            }
            if (!z) {
                ube.x(this);
                voe.v(this).G();
            }
        }
        if (lq7Var instanceof ng6) {
            ng6 ng6Var = (ng6) lq7Var;
            od6 v = voe.v(this);
            switch (ng6Var.a) {
                case 0:
                    ((qg6) ng6Var.b).j = v;
                    break;
                case 1:
                    ((kj6) ng6Var.b).l = v;
                    break;
                case 2:
                    ((nk6) ng6Var.b).h = v;
                    break;
                default:
                    ((rj8) ng6Var.b).x.setValue(v);
                    break;
            }
        }
        if ((this.c & 256) != 0 && (lq7Var instanceof xb8)) {
            hkb hkbVar2 = (hkb) voe.v(this).c0.f;
            hkbVar2.getClass();
            if (hkbVar2.K) {
                voe.v(this).G();
            }
        }
        int i = this.c;
        if ((i & 16) != 0 && (lq7Var instanceof g19)) {
            ((g19) lq7Var).d.b = this.D;
        }
        if ((i & 8) != 0) {
            ((rg) voe.w(this)).B();
        }
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        return ((dd6) lq7Var).n(new i16(ry6Var, ry6Var.getLayoutDirection()), new qu2(w27Var, m37.a, n37.b, 1), y02.b(0, i, 0, 0, 13)).d();
    }

    @Override // defpackage.xg8
    public final boolean T() {
        return this.J;
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        gka gkaVar = (gka) lq7Var;
        n61 n61Var = qd6Var.a;
        fka fkaVar = gkaVar.b;
        zja zjaVar = gkaVar.a;
        ljc ljcVar = fkaVar.i;
        float[] fArr = fkaVar.f;
        zjaVar.getClass();
        if (!zjaVar.g.l() && !zjaVar.h.l()) {
            float floatValue = ((Number) fkaVar.e.e()).floatValue();
            float f = zjaVar.e;
            float intBitsToFloat = Float.intBitsToFloat((int) (zjaVar.f >> 32)) + (f * floatValue) + ((-f) / 2.0f);
            l27.f(fArr);
            l27.k(fArr, Float.intBitsToFloat((int) (zjaVar.f >> 32)), Float.intBitsToFloat((int) (zjaVar.f & 4294967295L)));
            l27.g(15.0f, fArr);
            l27.k(fArr, -Float.intBitsToFloat((int) (zjaVar.f >> 32)), -Float.intBitsToFloat((int) (zjaVar.f & 4294967295L)));
            l27.k(fArr, intBitsToFloat, nae.e);
            ljcVar.t(eh.e(16, l27.c(fkaVar.g, fArr), l27.c(fkaVar.h, fArr), fkaVar.b, fkaVar.c));
            rk9 n = npe.n(0L, n61Var.b());
            k61 w = n61Var.b.w();
            try {
                w.h(n, fkaVar.j);
                qd6Var.a();
                w.g(n.a, n.b, n.c, n.d, ljcVar);
            } finally {
                w.q();
            }
        }
    }

    @Override // defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        return ((dd6) lq7Var).n(new i16(ry6Var, ry6Var.getLayoutDirection()), new qu2(w27Var, m37.a, n37.a, 1), y02.b(0, 0, 0, i, 7)).e();
    }

    @Override // defpackage.gz0
    public final long b() {
        return eg0.A(voe.s(this, Token.CASE).c);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.c19
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(defpackage.r09 r9, defpackage.s09 r10, long r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg0.b0(r09, s09, long):void");
    }

    @Override // defpackage.c19
    public final boolean d1() {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        ((g19) lq7Var).d.getClass();
        return true;
    }

    @Override // defpackage.xm4
    public final void e0(tm4 tm4Var) {
        lq7 lq7Var = this.K;
        lv5.c("applyFocusProperties called on wrong node");
        lq7Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.gz0
    public final r13 f() {
        return voe.v(this).V;
    }

    @Override // defpackage.sq7
    public final Object f0(g99 g99Var) {
        kn knVar;
        this.L.add(g99Var);
        if (!this.a.J) {
            lv5.c("visitAncestors called on an unattached node");
        }
        mq7 mq7Var = this.a.e;
        od6 v = voe.v(this);
        while (v != null) {
            if ((((mq7) v.c0.C).d & 32) != 0) {
                while (mq7Var != null) {
                    if ((mq7Var.c & 32) != 0) {
                        mq7 mq7Var2 = mq7Var;
                        gw7 gw7Var = null;
                        while (mq7Var2 != null) {
                            if (mq7Var2 instanceof sq7) {
                                sq7 sq7Var = (sq7) mq7Var2;
                                if (sq7Var.E0().e(g99Var)) {
                                    return sq7Var.E0().g(g99Var);
                                }
                            } else if ((mq7Var2.c & 32) != 0 && (mq7Var2 instanceof m03)) {
                                int i = 0;
                                for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                    if ((mq7Var3.c & 32) != 0) {
                                        i++;
                                        if (i == 1) {
                                            mq7Var2 = mq7Var3;
                                        } else {
                                            if (gw7Var == null) {
                                                gw7Var = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var2 != null) {
                                                gw7Var.b(mq7Var2);
                                                mq7Var2 = null;
                                            }
                                            gw7Var.b(mq7Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            mq7Var2 = voe.h(gw7Var);
                        }
                        continue;
                    }
                    mq7Var = mq7Var.e;
                }
            }
            v = v.v();
            if (v != null && (knVar = v.c0) != null) {
                mq7Var = (hkb) knVar.f;
            } else {
                mq7Var = null;
            }
        }
        return ((vt4) g99Var.b).invoke();
    }

    @Override // defpackage.gz0
    public final tc6 getLayoutDirection() {
        return voe.v(this).W;
    }

    @Override // defpackage.fm4
    public final void h0(dn4 dn4Var) {
        lq7 lq7Var = this.K;
        lv5.c("onFocusEvent called on wrong node");
        lq7Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.jm8
    public final Object j(r13 r13Var, Object obj) {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        return ((im8) lq7Var).j(r13Var, obj);
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        u7a p1 = ((x7a) lq7Var).p1();
        l8aVar.getClass();
        u7a u7aVar = (u7a) l8aVar;
        tv7 tv7Var = u7aVar.a;
        if (p1.c) {
            u7aVar.c = true;
        }
        if (p1.d) {
            u7aVar.d = true;
        }
        tv7 tv7Var2 = p1.a;
        Object[] objArr = tv7Var2.b;
        Object[] objArr2 = tv7Var2.c;
        long[] jArr = tv7Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            k8a k8aVar = (k8a) obj;
                            if (!tv7Var.b(k8aVar)) {
                                tv7Var.n(k8aVar, obj2);
                            } else if (obj2 instanceof g4) {
                                Object g = tv7Var.g(k8aVar);
                                g.getClass();
                                g4 g4Var = (g4) g;
                                String str = g4Var.a;
                                if (str == null) {
                                    str = ((g4) obj2).a;
                                }
                                hu4 hu4Var = g4Var.b;
                                if (hu4Var == null) {
                                    hu4Var = ((g4) obj2).b;
                                }
                                tv7Var.n(k8aVar, new g4(str, hu4Var));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        return ((dd6) lq7Var).n(e37Var, w27Var, j);
    }

    @Override // defpackage.c19
    public final void n0() {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        oaa oaaVar = ((g19) lq7Var).d;
        e19 e19Var = (e19) oaaVar.c;
        g19 g19Var = (g19) oaaVar.e;
        if (e19Var == e19.b) {
            long uptimeMillis = SystemClock.uptimeMillis();
            f19 f19Var = new f19(g19Var, 0);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, nae.e, nae.e, 0);
            obtain.setSource(0);
            f19Var.invoke(obtain);
            obtain.recycle();
            oaaVar.c = e19.a;
            g19Var.c = false;
            oaaVar.d = null;
        }
    }

    @Override // defpackage.f03
    public final void p() {
        if (this.K instanceof g19) {
            n0();
        }
    }

    @Override // defpackage.hz4
    public final void t(i38 i38Var) {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        ((xb8) lq7Var).t(i38Var);
    }

    public final String toString() {
        return this.K.toString();
    }

    @Override // defpackage.zj3
    public final void v0() {
        hud.o(this);
    }

    @Override // defpackage.c19
    public final void w0() {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        ((g19) lq7Var).d.getClass();
    }

    @Override // defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        lq7 lq7Var = this.K;
        lq7Var.getClass();
        return ((dd6) lq7Var).n(new i16(ry6Var, ry6Var.getLayoutDirection()), new qu2(w27Var, m37.b, n37.a, 1), y02.b(0, 0, 0, i, 7)).e();
    }

    @Override // defpackage.mq7
    public final void z1() {
        H1(true);
    }

    @Override // defpackage.oc6
    public final void L(sc6 sc6Var) {
    }

    @Override // defpackage.oc6, defpackage.i37
    public final void g(long j) {
    }
}
