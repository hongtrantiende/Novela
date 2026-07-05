package defpackage;

import android.graphics.pdf.models.selection.PageSelection;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: in2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class in2 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ in2(q5d q5dVar, mw8 mw8Var, int i) {
        this.a = 9;
        this.d = q5dVar;
        this.b = mw8Var;
        this.c = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int length;
        ox1 ox1Var;
        long[] jArr;
        boolean z;
        ox1 ox1Var2;
        long[] jArr2;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        int i4 = this.a;
        fvb fvbVar = null;
        boolean z4 = true;
        int i5 = 0;
        pvc pvcVar = pvc.a;
        int i6 = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i4) {
            case 0:
                nm nmVar = (nm) obj;
                nmVar.getClass();
                ((cne) ((gk2) obj3).c).getClass();
                nmVar.j(0, Long.valueOf(i6));
                nmVar.g(1, (String) obj2);
                return pvcVar;
            case 1:
                nm nmVar2 = (nm) obj;
                nmVar2.getClass();
                nmVar2.g(0, (String) obj2);
                ((zj1) ((gk2) obj3).c).getClass();
                nmVar2.j(1, Long.valueOf(i6));
                return pvcVar;
            case 2:
                String str = (String) obj2;
                List list = (List) obj3;
                frb frbVar = (frb) obj;
                fxb fxbVar = frbVar.C;
                if (fxbVar != null) {
                    long j = fxbVar.a;
                    int i7 = (int) (j >> 32);
                    b23.m(frbVar, i7, (int) (j & 4294967295L), str);
                    if (str.length() > 0) {
                        frbVar.e(i7, list, str.length() + i7);
                    }
                } else {
                    int g = fxb.g(frbVar.f);
                    b23.m(frbVar, g, fxb.f(frbVar.f), str);
                    if (str.length() > 0) {
                        frbVar.e(g, list, str.length() + g);
                    }
                }
                int g2 = fxb.g(frbVar.f);
                if (i6 > 0) {
                    length = (g2 + i6) - 1;
                } else {
                    length = (g2 + i6) - str.length();
                }
                int n = dce.n(length, 0, frbVar.c.length());
                frbVar.g(sze.a(n, n));
                return pvcVar;
            case 3:
                ((ora) obj3).set(i6, new rg3(((r13) obj2).y0((int) (((zy5) obj).a >> 32))));
                return pvcVar;
            case 4:
                dt8 dt8Var = (dt8) obj3;
                int intValue = ((Integer) obj).intValue();
                ((aw7) obj2).setValue(Boolean.FALSE);
                int i8 = intValue - 1;
                int i9 = i6 - 1;
                if (i9 < 0) {
                    i9 = 0;
                }
                dt8Var.a(dce.n(i8, 0, i9), false);
                return pvcVar;
            case 5:
                ek9 ek9Var = (ek9) obj3;
                gv7 gv7Var = (gv7) obj2;
                ox1 ox1Var3 = (ox1) obj;
                if (ek9Var.e == i6 && c16.i(gv7Var, ek9Var.f) && (ox1Var3 instanceof ux1)) {
                    long[] jArr3 = gv7Var.a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j2 = jArr3[i10];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length2)) >>> 31);
                                int i13 = i5;
                                while (i13 < i12) {
                                    if ((255 & j2) < 128) {
                                        int i14 = (i10 << 3) + i13;
                                        z2 = z4;
                                        Object obj4 = gv7Var.b[i14];
                                        if (gv7Var.c[i14] != i6) {
                                            z3 = z2;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            i = i11;
                                            ux1 ux1Var = (ux1) ox1Var3;
                                            ox1Var2 = ox1Var3;
                                            tv7 tv7Var = ux1Var.C;
                                            axe.q(tv7Var, obj4, ek9Var);
                                            jArr2 = jArr3;
                                            if (obj4 instanceof h23) {
                                                h23 h23Var = (h23) obj4;
                                                if (!tv7Var.c(h23Var)) {
                                                    axe.r(ux1Var.F, h23Var);
                                                }
                                                tv7 tv7Var2 = ek9Var.g;
                                                if (tv7Var2 != null) {
                                                    tv7Var2.l(obj4);
                                                }
                                            }
                                        } else {
                                            ox1Var2 = ox1Var3;
                                            jArr2 = jArr3;
                                            i = i11;
                                        }
                                        if (z3) {
                                            gv7Var.f(i14);
                                        }
                                    } else {
                                        ox1Var2 = ox1Var3;
                                        jArr2 = jArr3;
                                        z2 = z4;
                                        i = i11;
                                    }
                                    j2 >>= i;
                                    i13++;
                                    i11 = i;
                                    ox1Var3 = ox1Var2;
                                    z4 = z2;
                                    jArr3 = jArr2;
                                }
                                ox1Var = ox1Var3;
                                jArr = jArr3;
                                z = z4;
                                if (i12 != i11) {
                                }
                            } else {
                                ox1Var = ox1Var3;
                                jArr = jArr3;
                                z = z4;
                            }
                            if (i10 != length2) {
                                i10++;
                                ox1Var3 = ox1Var;
                                z4 = z;
                                jArr3 = jArr;
                                i5 = 0;
                            }
                        }
                    }
                }
                return pvcVar;
            case 6:
                fp8 fp8Var = (fp8) obj;
                fp8Var.getClass();
                PageSelection m = fp8Var.m(i6, t4.c((jt1) obj3), t4.c((jt1) obj2));
                if (m == null) {
                    return null;
                }
                return t4.e(m);
            case 7:
                e2a e2aVar = (e2a) obj3;
                mw8 mw8Var = (mw8) obj2;
                lw8 lw8Var = (lw8) obj;
                int h = e2aVar.K.a.h();
                if (h < 0) {
                    h = 0;
                }
                if (h <= i6) {
                    i6 = h;
                }
                int i15 = -i6;
                boolean z5 = e2aVar.L;
                if (z5) {
                    i2 = 0;
                } else {
                    i2 = i15;
                }
                if (z5) {
                    i3 = i15;
                } else {
                    i3 = 0;
                }
                lw8Var.a = true;
                lw8.E(lw8Var, mw8Var, i2, i3, null, 12);
                lw8Var.a = false;
                return pvcVar;
            case 8:
                mw8 mw8Var2 = (mw8) obj3;
                lw8 lw8Var2 = (lw8) obj;
                lw8Var2.getClass();
                lw8.z(lw8Var2, mw8Var2, i6, Math.max(x02.j(((x02) obj2).a) - mw8Var2.b, 0));
                return pvcVar;
            default:
                q5d q5dVar = (q5d) obj3;
                mw8 mw8Var3 = (mw8) obj2;
                lw8 lw8Var3 = (lw8) obj;
                int i16 = q5dVar.b;
                zsb zsbVar = q5dVar.a;
                ikc ikcVar = q5dVar.c;
                gvb gvbVar = (gvb) q5dVar.d.invoke();
                if (gvbVar != null) {
                    fvbVar = gvbVar.a;
                }
                zsbVar.a(ff8.a, kxe.k(lw8Var3, i16, ikcVar, fvbVar, false, mw8Var3.a), i6, mw8Var3.b);
                lw8.z(lw8Var3, mw8Var3, 0, Math.round(-zsbVar.a.h()));
                return pvcVar;
        }
    }

    public /* synthetic */ in2(int i, String str, Object obj, int i2) {
        this.a = i2;
        this.b = str;
        this.d = obj;
        this.c = i;
    }

    public /* synthetic */ in2(int i, jt1 jt1Var, jt1 jt1Var2) {
        this.a = 6;
        this.c = i;
        this.d = jt1Var;
        this.b = jt1Var2;
    }

    public /* synthetic */ in2(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.d = obj;
        this.c = i;
        this.b = obj2;
    }
}
