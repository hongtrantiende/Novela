package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hg  reason: default package */
/* loaded from: classes.dex */
public final class hg extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg(int i, Object obj, Object obj2) {
        super(0);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        boolean dispatchKeyEvent;
        boolean dispatchGenericMotionEvent;
        float f;
        float f2;
        b8a b8aVar;
        od6 od6Var;
        rk9 rk9Var;
        py5 py5Var;
        Integer num;
        int i = this.a;
        boolean z = false;
        long j = 0;
        pvc pvcVar = pvc.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case 1:
                dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) obj);
                return Boolean.valueOf(dispatchGenericMotionEvent);
            case 2:
                wg wgVar = (wg) obj;
                f2a f2aVar = (f2a) obj2;
                s1a s1aVar = f2aVar.e;
                s1a s1aVar2 = f2aVar.f;
                Float f3 = f2aVar.c;
                Float f4 = f2aVar.d;
                if (s1aVar != null && f3 != null) {
                    f = ((Number) s1aVar.a.invoke()).floatValue() - f3.floatValue();
                } else {
                    f = 0.0f;
                }
                if (s1aVar2 != null && f4 != null) {
                    f2 = ((Number) s1aVar2.a.invoke()).floatValue() - f4.floatValue();
                } else {
                    f2 = 0.0f;
                }
                if (f != nae.e || f2 != nae.e) {
                    int z2 = wgVar.z(f2aVar.a);
                    d8a d8aVar = (d8a) wgVar.r().b(wgVar.G);
                    if (d8aVar != null) {
                        try {
                            v4 v4Var = wgVar.I;
                            if (v4Var != null) {
                                v4Var.a.setBoundsInScreen(wgVar.k(d8aVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    d8a d8aVar2 = (d8a) wgVar.r().b(wgVar.H);
                    if (d8aVar2 != null) {
                        try {
                            v4 v4Var2 = wgVar.J;
                            if (v4Var2 != null) {
                                v4Var2.a.setBoundsInScreen(wgVar.k(d8aVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    wgVar.d.invalidate();
                    d8a d8aVar3 = (d8a) wgVar.r().b(z2);
                    if (d8aVar3 != null && (b8aVar = d8aVar3.a) != null && (od6Var = b8aVar.c) != null) {
                        if (s1aVar != null) {
                            wgVar.L.i(z2, s1aVar);
                        }
                        if (s1aVar2 != null) {
                            wgVar.M.i(z2, s1aVar2);
                        }
                        wgVar.v(od6Var);
                    }
                }
                if (s1aVar != null) {
                    f2aVar.c = (Float) s1aVar.a.invoke();
                }
                if (s1aVar2 != null) {
                    f2aVar.d = (Float) s1aVar2.a.invoke();
                }
                return pvcVar;
            case 3:
                vt4 vt4Var = (vt4) obj2;
                if (vt4Var != null && (rk9Var = (rk9) vt4Var.invoke()) != null) {
                    return rk9Var;
                }
                i38 i38Var = (i38) obj;
                if (!i38Var.E1().J) {
                    i38Var = null;
                }
                if (i38Var == null) {
                    return null;
                }
                return npe.n(0L, eg0.A(i38Var.c));
            case 4:
                ((s41) obj2).M.invoke((u41) obj);
                return pvcVar;
            case 5:
                wb2 wb2Var = (wb2) obj2;
                wb2Var.f().execute(new b9(18, wb2Var, (rx4) obj));
                return pvcVar;
            case 6:
                wb2 wb2Var2 = (wb2) obj2;
                wb2Var2.f().execute(new b9(19, wb2Var2, (zl9) obj));
                return pvcVar;
            case 7:
                wb2 wb2Var3 = (wb2) obj2;
                wb2Var3.f().execute(new ub2(wb2Var3, (px4) obj, 1));
                return pvcVar;
            case 8:
                wb2 wb2Var4 = (wb2) obj2;
                wb2Var4.f().execute(new b9(20, wb2Var4, (ox4) obj));
                return pvcVar;
            case 9:
                ((xt4) obj2).invoke(((zl9) obj).a);
                return pvcVar;
            case 10:
                cc2 cc2Var = (cc2) obj2;
                cc2Var.f().execute(new b9(22, cc2Var, (rx4) obj));
                return pvcVar;
            case 11:
                cc2 cc2Var2 = (cc2) obj2;
                cc2Var2.f().execute(new b9(23, cc2Var2, (zl9) obj));
                return pvcVar;
            case 12:
                cc2 cc2Var3 = (cc2) obj2;
                cc2Var3.f().execute(new bc2(cc2Var3, (px4) obj, 1));
                return pvcVar;
            case 13:
                cc2 cc2Var4 = (cc2) obj2;
                cc2Var4.f().execute(new b9(24, cc2Var4, (ox4) obj));
                return pvcVar;
            case 14:
                cc2 cc2Var5 = (cc2) obj2;
                cc2Var5.f().execute(new b9(25, cc2Var5, (sx4) obj));
                return pvcVar;
            case 15:
                ((zl9) obj2).a = nye.q((fn4) obj, mv8.a);
                return pvcVar;
            case 16:
                ((zl9) obj2).a = ((hn4) obj).J1();
                return pvcVar;
            case 17:
                ((x65) obj2).d((mq7) obj);
                return pvcVar;
            case 18:
                z87.v((m82) obj2, null, null, new o54((jq) obj, (m42) null, 13), 3);
                return pvcVar;
            case 19:
                kn knVar = ((od6) obj2).c0;
                zl9 zl9Var = (zl9) obj;
                if ((((mq7) knVar.C).d & 8) != 0) {
                    for (mq7 mq7Var = (hkb) knVar.f; mq7Var != null; mq7Var = mq7Var.e) {
                        if ((mq7Var.c & 8) != 0) {
                            mq7 mq7Var2 = mq7Var;
                            gw7 gw7Var = null;
                            while (mq7Var2 != null) {
                                if (mq7Var2 instanceof z7a) {
                                    z7a z7aVar = (z7a) mq7Var2;
                                    if (z7aVar.o0()) {
                                        u7a u7aVar = new u7a();
                                        zl9Var.a = u7aVar;
                                        u7aVar.d = true;
                                    }
                                    if (z7aVar.o1()) {
                                        ((u7a) zl9Var.a).c = true;
                                    }
                                    z7aVar.m1((l8a) zl9Var.a);
                                } else if ((mq7Var2.c & 8) != 0 && (mq7Var2 instanceof m03)) {
                                    int i2 = 0;
                                    for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                        if ((mq7Var3.c & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                mq7Var2 = voe.h(gw7Var);
                            }
                        }
                    }
                }
                return pvcVar;
            case 20:
                qs9 qs9Var = i38.p0;
                ((xt4) obj2).invoke(qs9Var);
                i38 i38Var2 = (i38) obj;
                boolean i3 = c16.i(i38Var2.f0, qs9Var.K);
                boolean z3 = i38Var2.g0;
                boolean z4 = qs9Var.L;
                if (z3 != z4) {
                    z = true;
                }
                if (!i3 || z) {
                    i38Var2.f0 = qs9Var.K;
                    i38Var2.g0 = z4;
                    if (i38Var2.h0 && (z || (z4 && !i3))) {
                        i38Var2.O.H();
                    }
                }
                i38Var2.h0 = true;
                qs9Var.U = qs9Var.K.a(qs9Var.N, qs9Var.Q, qs9Var.P);
                return pvcVar;
            case 21:
                mo9 mo9Var = ((do9) obj2).a;
                af6 d = mo9Var.d();
                hm8 hm8Var = mo9Var.k;
                if (d != null) {
                    py5Var = new py5(d.b());
                } else {
                    py5Var = null;
                }
                af6 d2 = mo9Var.d();
                if (d2 != null) {
                    num = Integer.valueOf(d2.getIndex());
                } else {
                    num = null;
                }
                if (num != null) {
                    mo9Var.s.setValue(hm8Var.getValue());
                    z87.v(mo9Var.b, null, null, new ip(mo9Var, mo9Var.e(), (m42) null, 3), 3);
                }
                mo9Var.m.setValue(new y78(0L));
                hm8Var.setValue(null);
                if (py5Var != null) {
                    j = py5Var.a;
                }
                mo9Var.n.setValue(new py5(j));
                o3a o3aVar = mo9Var.f;
                z87.v(o3aVar.b, null, null, new m3a(o3aVar, null, 1), 3);
                mo9Var.o.setValue(null);
                mo9Var.p.setValue(null);
                ((vt4) obj).invoke();
                return pvcVar;
            case 22:
                return Boolean.valueOf(c16.i(obj2, ((mo9) obj).k.getValue()));
            default:
                return Float.valueOf(((Number) ((vt4) ((aw7) obj2).getValue()).invoke()).floatValue() / (((Number) ((aw7) obj).getValue()).floatValue() / 1000.0f));
        }
    }
}
