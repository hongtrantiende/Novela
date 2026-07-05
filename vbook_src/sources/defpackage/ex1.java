package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ex1  reason: default package */
/* loaded from: classes.dex */
public abstract class ex1 {
    public static final kc8 a = new kc8("provider");
    public static final kc8 b = new kc8("provider");
    public static final kc8 c = new kc8("compositionLocalMap");
    public static final kc8 d = new kc8("providers");
    public static final kc8 e = new kc8("reference");

    public static final void a(String str) {
        throw new hw1(hl5.n("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new hw1(hl5.n("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [ks3] */
    public static final ks7 c(ux1 ux1Var, ls7 ls7Var, eqa eqaVar, ny nyVar) {
        lh9 lh9Var;
        bqa bqaVar;
        int length;
        lh9 lh9Var2;
        ?? r6;
        lv4 lv4Var;
        long[] jArr;
        lv4 lv4Var2;
        lh9 lh9Var3;
        bqa bqaVar2;
        long[] jArr2;
        int i;
        long j;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        long[] jArr3;
        int i4;
        long j2;
        long[] jArr4;
        int i5;
        int i6;
        int F;
        int F2;
        ls7 ls7Var2 = ls7Var;
        lh9 lh9Var4 = ax1.a;
        bqa bqaVar3 = new bqa();
        if (eqaVar.e != null) {
            bqaVar3.b();
        }
        if (eqaVar.f != null) {
            bqaVar3.G = new wu7();
        }
        int i7 = eqaVar.t;
        if (nyVar != null && eqaVar.F(i7) > 0) {
            int i8 = eqaVar.v;
            while (i8 > 0 && !eqaVar.y(i8)) {
                i8 = eqaVar.G(i8, eqaVar.b);
            }
            if (i8 >= 0 && eqaVar.y(i8)) {
                Object E = eqaVar.E(i8);
                int i9 = i8 + 1;
                int u = eqaVar.u(i8) + i8;
                int i10 = 0;
                while (i9 < u) {
                    int u2 = eqaVar.u(i9) + i9;
                    if (u2 > i7) {
                        break;
                    }
                    if (eqaVar.y(i9)) {
                        F2 = 1;
                    } else {
                        F2 = eqaVar.F(i9);
                    }
                    i10 += F2;
                    i9 = u2;
                }
                if (eqaVar.y(i7)) {
                    F = 1;
                } else {
                    F = eqaVar.F(i7);
                }
                nyVar.e(E);
                nyVar.k(i10, F);
                nyVar.n();
            }
        }
        lv4 lv4Var3 = ls7Var2.e;
        if (lv4Var3.a()) {
            ux1Var.getClass();
            if (ux1Var.J.e > 0) {
                r6 = new ArrayList();
                tv7 tv7Var = ux1Var.J;
                long[] jArr5 = tv7Var.a;
                int length2 = jArr5.length - 2;
                if (length2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j3 = jArr5[i11];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length2)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j3 & 255) < 128) {
                                    int i15 = i12;
                                    int i16 = (i11 << 3) + i14;
                                    lv4Var2 = lv4Var3;
                                    Object obj = tv7Var.b[i16];
                                    Object obj2 = tv7Var.c[i16];
                                    obj.getClass();
                                    jArr2 = jArr5;
                                    if (obj2 instanceof uv7) {
                                        uv7 uv7Var = (uv7) obj2;
                                        Object[] objArr = uv7Var.b;
                                        long[] jArr6 = uv7Var.a;
                                        j = j3;
                                        int length3 = jArr6.length - 2;
                                        lh9Var3 = lh9Var4;
                                        bqaVar2 = bqaVar3;
                                        if (length3 >= 0) {
                                            int i17 = 0;
                                            while (true) {
                                                long j4 = jArr6[i17];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                                    int i19 = 0;
                                                    while (i19 < i18) {
                                                        if ((j4 & 255) < 128) {
                                                            i4 = i19;
                                                            int i20 = (i17 << 3) + i4;
                                                            j2 = j4;
                                                            Object obj3 = objArr[i20];
                                                            ek9 ek9Var = (ek9) obj;
                                                            jArr4 = jArr6;
                                                            lv4 lv4Var4 = ek9Var.c;
                                                            if (lv4Var4 != null) {
                                                                lv4 m = zbe.m(lv4Var2);
                                                                i6 = i14;
                                                                lv4 m2 = zbe.m(lv4Var4);
                                                                int c2 = eqaVar.c(m);
                                                                i5 = length2;
                                                                int i21 = eqaVar.b[(c2 * 5) + 3] + c2;
                                                                int i22 = m2.a;
                                                                if (c2 <= i22 && i22 < i21) {
                                                                    r6.add(new yk8(ek9Var, obj3));
                                                                    uv7Var.m(i20);
                                                                }
                                                                j4 = j2 >> i15;
                                                                i19 = i4 + 1;
                                                                jArr6 = jArr4;
                                                                length2 = i5;
                                                                i14 = i6;
                                                            }
                                                        } else {
                                                            i4 = i19;
                                                            j2 = j4;
                                                            jArr4 = jArr6;
                                                        }
                                                        i5 = length2;
                                                        i6 = i14;
                                                        j4 = j2 >> i15;
                                                        i19 = i4 + 1;
                                                        jArr6 = jArr4;
                                                        length2 = i5;
                                                        i14 = i6;
                                                    }
                                                    jArr3 = jArr6;
                                                    i = length2;
                                                    i2 = i14;
                                                    if (i18 != i15) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr3 = jArr6;
                                                    i = length2;
                                                    i2 = i14;
                                                }
                                                if (i17 == length3) {
                                                    break;
                                                }
                                                i17++;
                                                jArr6 = jArr3;
                                                length2 = i;
                                                i14 = i2;
                                                i15 = 8;
                                            }
                                        } else {
                                            i = length2;
                                            i2 = i14;
                                        }
                                        z2 = uv7Var.g();
                                    } else {
                                        lh9Var3 = lh9Var4;
                                        bqaVar2 = bqaVar3;
                                        i = length2;
                                        j = j3;
                                        i2 = i14;
                                        obj2.getClass();
                                        ek9 ek9Var2 = (ek9) obj;
                                        lv4 lv4Var5 = ek9Var2.c;
                                        if (lv4Var5 != null) {
                                            lv4 m3 = zbe.m(lv4Var2);
                                            lv4 m4 = zbe.m(lv4Var5);
                                            int c3 = eqaVar.c(m3);
                                            int i23 = eqaVar.b[(c3 * 5) + 3] + c3;
                                            int i24 = m4.a;
                                            if (c3 <= i24 && i24 < i23) {
                                                r6.add(new yk8(ek9Var2, obj2));
                                                z = true;
                                                z2 = z;
                                            }
                                        }
                                        z = false;
                                        z2 = z;
                                    }
                                    if (z2) {
                                        tv7Var.m(i16);
                                    }
                                    i3 = 8;
                                } else {
                                    lv4Var2 = lv4Var3;
                                    lh9Var3 = lh9Var4;
                                    bqaVar2 = bqaVar3;
                                    jArr2 = jArr5;
                                    i = length2;
                                    j = j3;
                                    i2 = i14;
                                    i3 = i12;
                                }
                                j3 = j >> i3;
                                i14 = i2 + 1;
                                i12 = i3;
                                lv4Var3 = lv4Var2;
                                jArr5 = jArr2;
                                lh9Var4 = lh9Var3;
                                bqaVar3 = bqaVar2;
                                length2 = i;
                            }
                            lv4Var = lv4Var3;
                            lh9Var = lh9Var4;
                            bqaVar = bqaVar3;
                            jArr = jArr5;
                            int i25 = length2;
                            if (i13 != i12) {
                                break;
                            }
                            length2 = i25;
                        } else {
                            lv4Var = lv4Var3;
                            lh9Var = lh9Var4;
                            bqaVar = bqaVar3;
                            jArr = jArr5;
                        }
                        if (i11 == length2) {
                            break;
                        }
                        i11++;
                        lv4Var3 = lv4Var;
                        jArr5 = jArr;
                        lh9Var4 = lh9Var;
                        bqaVar3 = bqaVar;
                    }
                } else {
                    lh9Var = lh9Var4;
                    bqaVar = bqaVar3;
                }
            } else {
                lh9Var = lh9Var4;
                bqaVar = bqaVar3;
                r6 = ks3.a;
            }
            ls7Var2 = ls7Var;
            ls7Var2.f = sl1.n0(ls7Var2.f, r6);
        } else {
            lh9Var = lh9Var4;
            bqaVar = bqaVar3;
        }
        eqa f = bqaVar.f();
        try {
            f.d();
            lh9 lh9Var5 = lh9Var;
            f.S(ls7Var2.a, false, lh9Var5, 126665345);
            eqa.z(f);
            f.U(ls7Var2.b);
            List D = eqaVar.D(zbe.m(ls7Var2.e), f);
            f.N();
            f.j();
            f.k();
            f.e(true);
            bqa bqaVar4 = bqaVar;
            ks7 ks7Var = new ks7(bqaVar4);
            if (!D.isEmpty()) {
                int size = D.size();
                for (int i26 = 0; i26 < size; i26++) {
                    lv4 lv4Var6 = (lv4) D.get(i26);
                    if (bqaVar4.g(lv4Var6)) {
                        int a2 = bqaVar4.a(lv4Var6);
                        int b2 = dqa.b(a2, bqaVar4.a);
                        int i27 = a2 + 1;
                        if (i27 < bqaVar4.b) {
                            length = bqaVar4.a[(i27 * 5) + 4];
                        } else {
                            length = bqaVar4.c.length;
                        }
                        if (length - b2 > 0) {
                            lh9Var2 = bqaVar4.c[b2];
                        } else {
                            lh9Var2 = lh9Var5;
                        }
                        if (lh9Var2 instanceof ek9) {
                            s6f s6fVar = new s6f(ux1Var, ls7Var2);
                            eqa f2 = bqaVar4.f();
                            try {
                                voe.i(f2, D, s6fVar);
                                f2.e(true);
                                return ks7Var;
                            } finally {
                            }
                        }
                    }
                }
            }
            return ks7Var;
        } finally {
        }
    }
}
