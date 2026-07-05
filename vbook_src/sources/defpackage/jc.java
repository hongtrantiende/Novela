package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.inputmethod.InputConnection;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jc  reason: default package */
/* loaded from: classes.dex */
public final class jc extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(br brVar, long j) {
        super(1);
        this.a = 7;
        this.b = brVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        xv5 xv5Var;
        xv5 xv5Var2;
        yya yyaVar;
        int i = this.a;
        float f = nae.e;
        int i2 = -1;
        int i3 = 0;
        switch (i) {
            case 0:
                kc kcVar = (kc) obj;
                pd6 pd6Var = (pd6) this.b;
                if (kcVar.H() != Integer.MAX_VALUE) {
                    if (kcVar.g().b) {
                        kcVar.d0();
                    }
                    for (Map.Entry entry : kcVar.g().i.entrySet()) {
                        pd6.a(pd6Var, (ec) entry.getKey(), ((Number) entry.getValue()).intValue(), kcVar.n());
                    }
                    i38 i38Var = kcVar.n().S;
                    i38Var.getClass();
                    while (!i38Var.equals(pd6Var.a.n())) {
                        for (ec ecVar : pd6Var.b(i38Var).keySet()) {
                            pd6.a(pd6Var, ecVar, pd6Var.c(i38Var, ecVar), i38Var);
                        }
                        i38Var = i38Var.S;
                        i38Var.getClass();
                    }
                }
                return pvc.a;
            case 1:
                u95 u95Var = (u95) obj;
                eg egVar = (eg) this.b;
                if (egVar.K == null) {
                    egVar.K = new fkd(egVar.N.getInsetsWatcher());
                }
                wu7 wu7Var = fkd.e;
                int[] iArr = wu7Var.b;
                Object[] objArr = wu7Var.c;
                long[] jArr = wu7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    z = false;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = i3; i6 < i5; i6++) {
                                if ((255 & j) < 128) {
                                    int i7 = (i4 << 3) + i6;
                                    int i8 = iArr[i7];
                                    dkd dkdVar = (dkd) objArr[i7];
                                    if (fkd.a(u95Var, ((ekd) dkdVar).c) || fkd.a(u95Var, ((ekd) dkdVar).d) || (i8 != -1 && (xv5Var = (xv5) fkd.c.b(i8)) != null && (fkd.a(u95Var, xv5Var) || ((xv5Var2 = (xv5) fkd.d.b(i8)) != null && fkd.a(u95Var, xv5Var2))))) {
                                        z4 = true;
                                        z = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                    }
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                            }
                        }
                        if (i4 != length) {
                            i4++;
                            i3 = 0;
                        }
                    }
                } else {
                    z = false;
                }
                dkd.a.getClass();
                ekd ekdVar = ckd.j;
                if (fkd.a(u95Var, ekdVar.c) || fkd.a(u95Var, ekdVar.d)) {
                    z2 = true;
                    z = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    for (xv5 xv5Var3 : fkd.b) {
                        if (fkd.a(u95Var, xv5Var3)) {
                            z3 = true;
                            return Boolean.valueOf(z3);
                        }
                    }
                }
                z3 = z;
                return Boolean.valueOf(z3);
            case 2:
                return Boolean.valueOf(((hn4) obj).O1(((em4) this.b).a));
            case 3:
                return Boolean.valueOf(((ny5) this.b).a(((b8a) obj).f));
            case 4:
                return Boolean.valueOf(kqe.e((b8a) obj, (Resources) this.b));
            case 5:
                ((od6) this.b).e0((r13) obj);
                return pvc.a;
            case 6:
                return Boolean.valueOf(c16.i(obj, this.b));
            case 7:
                qkc qkcVar = (qkc) obj;
                Object d = qkcVar.d();
                br brVar = (br) this.b;
                if (!c16.i(d, brVar.N.d()) && (yyaVar = (yya) brVar.N.e.g(qkcVar.d())) != null) {
                    long j2 = ((zy5) yyaVar.getValue()).a;
                }
                yya yyaVar2 = (yya) brVar.N.e.g(qkcVar.f());
                if (yyaVar2 != null) {
                    long j3 = ((zy5) yyaVar2.getValue()).a;
                }
                if (((xna) brVar.M.getValue()) != null) {
                    rk9 rk9Var = qed.a;
                    return tte.v(nae.e, 400.0f, 1, new zy5(4294967297L));
                }
                return tte.v(nae.e, 400.0f, 5, null);
            case 8:
                Throwable th = (Throwable) obj;
                ((y69) this.b).j(null);
                return pvc.a;
            case 9:
                qkc qkcVar2 = (qkc) obj;
                return ((vt0) this.b).f;
            case 10:
                rk9 rk9Var2 = (rk9) obj;
                wu0 wu0Var = (wu0) this.b;
                if (wu0Var.J) {
                    z87.v(wu0Var.v1(), null, null, new l0(wu0Var, rk9Var2, null, 29), 3);
                }
                return pvc.a;
            case 11:
                is isVar = (is) obj;
                float f2 = isVar.b;
                if (f2 < nae.e) {
                    f2 = 0.0f;
                }
                float f3 = 1.0f;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                float f4 = isVar.c;
                float f5 = -0.5f;
                if (f4 < -0.5f) {
                    f4 = -0.5f;
                }
                float f6 = 0.5f;
                if (f4 > 0.5f) {
                    f4 = 0.5f;
                }
                float f7 = isVar.d;
                if (f7 >= -0.5f) {
                    f5 = f7;
                }
                if (f5 <= 0.5f) {
                    f6 = f5;
                }
                float f8 = isVar.a;
                if (f8 >= nae.e) {
                    f = f8;
                }
                if (f <= 1.0f) {
                    f3 = f;
                }
                return new zl1(zl1.a(sve.a(f2, f4, f6, f3, wm1.x), (sm1) this.b));
            case 12:
                ib3 ib3Var = (ib3) obj;
                return new r6((lb3) this.b, 6);
            case 13:
                px4 px4Var = (px4) obj;
                px4Var.getClass();
                wb2 wb2Var = (wb2) this.b;
                wb2Var.f().execute(new ub2(wb2Var, px4Var, 0));
                return pvc.a;
            case 14:
                px4 px4Var2 = (px4) obj;
                px4Var2.getClass();
                cc2 cc2Var = (cc2) this.b;
                cc2Var.f().execute(new bc2(cc2Var, px4Var2, 0));
                return pvc.a;
            case 15:
                return Boolean.valueOf(!c16.i(obj, ((tkc) this.b).d.getValue()));
            case 16:
                ((t15) obj).q(((Number) ((yya) this.b).getValue()).floatValue());
                return pvc.a;
            case 17:
                hh3 hh3Var = (hh3) obj;
                if (!hh3Var.a.J) {
                    return qnc.b;
                }
                ih3 ih3Var = hh3Var.M;
                if (ih3Var != null) {
                    ih3Var.d0((bh3) this.b);
                }
                hh3Var.M = null;
                hh3Var.L = null;
                return qnc.a;
            case 18:
                pvc pvcVar = pvc.a;
                if (mz4.b.compareAndSet(false, true)) {
                    ((xy0) this.b).j(pvcVar);
                }
                return pvcVar;
            case 19:
                ak3 ak3Var = (ak3) obj;
                p15 p15Var = (p15) this.b;
                yj yjVar = p15Var.l;
                if (p15Var.n && p15Var.A && yjVar != null) {
                    ij1 Q0 = ak3Var.Q0();
                    long G = Q0.G();
                    Q0.w().i();
                    try {
                        ((ij1) ((mu9) Q0.b).a).w().f(yjVar, 1);
                        p15Var.d(ak3Var);
                    } finally {
                        rs8.r(Q0, G);
                    }
                } else {
                    p15Var.d(ak3Var);
                }
                return pvc.a;
            case 20:
                ak3 ak3Var2 = (ak3) obj;
                k61 w = ak3Var2.Q0().w();
                lu4 lu4Var = ((s15) this.b).d;
                if (lu4Var != null) {
                    lu4Var.invoke(w, (p15) ak3Var2.Q0().c);
                }
                return pvc.a;
            case 21:
                t3d t3dVar = (t3d) obj;
                q25 q25Var = (q25) this.b;
                q25Var.g(t3dVar);
                xt4 xt4Var = q25Var.i;
                if (xt4Var != null) {
                    xt4Var.invoke(t3dVar);
                }
                return pvc.a;
            case 22:
                if (((fa5) obj).M) {
                    ((vl9) this.b).a = false;
                    return qnc.c;
                }
                return qnc.a;
            case 23:
                q68 q68Var = (q68) obj;
                InputConnection inputConnection = q68Var.b;
                if (inputConnection != null) {
                    inputConnection.closeConnection();
                    q68Var.b = null;
                }
                lw5 lw5Var = (lw5) this.b;
                gw7 gw7Var = lw5Var.d;
                Object[] objArr2 = gw7Var.a;
                int i9 = gw7Var.c;
                while (true) {
                    if (i3 < i9) {
                        if (c16.i((ofd) objArr2[i3], q68Var)) {
                            i2 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                if (i2 >= 0) {
                    gw7Var.k(i2);
                }
                if (gw7Var.c == 0) {
                    lw5Var.b.invoke();
                }
                return pvc.a;
            case 24:
                Throwable th2 = (Throwable) obj;
                lz5 lz5Var = (lz5) this.b;
                synchronized (lz5Var.c) {
                    lz5Var.d = 5;
                    lz5Var.f = null;
                }
                return pvc.a;
            case 25:
                Throwable th3 = (Throwable) obj;
                ((ListenableFuture) this.b).cancel(false);
                return pvc.a;
            case 26:
                return Integer.valueOf(hxe.j((Float) ((yk8) obj).a, (Float) this.b));
            case 27:
                ((Context) obj).getClass();
                return new j37((Context) this.b, 0);
            case 28:
                ((gw7) this.b).b((lq7) obj);
                return Boolean.TRUE;
            default:
                sc6 sc6Var = (sc6) obj;
                sc6Var.getClass();
                ((aw7) this.b).setValue(new y78(sc6Var.h0(0L)));
                return pvc.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc(Object obj, int i) {
        super(1);
        this.a = i;
        this.b = obj;
    }
}
