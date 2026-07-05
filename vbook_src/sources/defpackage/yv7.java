package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yv7  reason: default package */
/* loaded from: classes.dex */
public class yv7 extends zqa {
    public static final int[] n = new int[0];
    public final xt4 e;
    public final xt4 f;
    public int g;
    public uv7 h;
    public ArrayList i;
    public cra j;
    public int[] k;
    public int l;
    public boolean m;

    public yv7(long j, cra craVar, xt4 xt4Var, xt4 xt4Var2) {
        super(j, craVar);
        this.e = xt4Var;
        this.f = xt4Var2;
        this.j = cra.e;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (dra.c) {
            this.j = this.j.e(j);
        }
    }

    public void B(uv7 uv7Var) {
        this.h = uv7Var;
    }

    public yv7 C(xt4 xt4Var, xt4 xt4Var2) {
        s08 s08Var;
        if (this.c) {
            e39.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            e39.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = dra.c;
        synchronized (obj) {
            long j = dra.e;
            dra.e = j + 1;
            dra.d = dra.d.e(j);
            cra d = d();
            r(d.e(j));
            s08Var = new s08(j, dra.d(d, g() + 1, j), dra.k(xt4Var, e(), true), dra.l(xt4Var2, i()), this);
        }
        if (!this.m && !this.c) {
            long g = g();
            synchronized (obj) {
                long j2 = dra.e;
                dra.e = j2 + 1;
                s(j2);
                dra.d = dra.d.e(g());
            }
            r(dra.d(d(), g + 1, g()));
            return s08Var;
        }
        return s08Var;
    }

    @Override // defpackage.zqa
    public final void b() {
        dra.d = dra.d.b(g()).a(this.j);
    }

    @Override // defpackage.zqa
    public void c() {
        if (!this.c) {
            this.c = true;
            synchronized (dra.c) {
                o();
            }
            l();
        }
    }

    @Override // defpackage.zqa
    public boolean f() {
        return false;
    }

    @Override // defpackage.zqa
    public int h() {
        return this.g;
    }

    @Override // defpackage.zqa
    public xt4 i() {
        return this.f;
    }

    @Override // defpackage.zqa
    public void k() {
        this.l++;
    }

    @Override // defpackage.zqa
    public void l() {
        if (this.l <= 0) {
            e39.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i == 0 && !this.m) {
            uv7 x = x();
            if (x != null) {
                if (this.m) {
                    e39.b("Unsupported operation on a snapshot that has been applied");
                }
                B(null);
                long g = g();
                Object[] objArr = x.b;
                long[] jArr = x.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    for (kza a = ((iza) objArr[(i2 << 3) + i4]).a(); a != null; a = a.b) {
                                        long j2 = a.a;
                                        if (j2 == g || sl1.W(this.j, Long.valueOf(j2))) {
                                            eja ejaVar = dra.a;
                                            a.a = 0L;
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            a();
        }
    }

    @Override // defpackage.zqa
    public void m() {
        if (!this.m && !this.c) {
            v();
        }
    }

    @Override // defpackage.zqa
    public void n(iza izaVar) {
        uv7 x = x();
        if (x == null) {
            uv7 uv7Var = uz9.a;
            x = new uv7();
            B(x);
        }
        x.a(izaVar);
    }

    @Override // defpackage.zqa
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            dra.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.zqa
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.zqa
    public zqa u(xt4 xt4Var) {
        t08 t08Var;
        if (this.c) {
            e39.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            e39.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = dra.c;
        synchronized (obj) {
            long j = dra.e;
            dra.e = j + 1;
            dra.d = dra.d.e(j);
            t08Var = new t08(j, dra.d(d(), g + 1, j), dra.k(xt4Var, e(), true), this);
        }
        if (!this.m && !this.c) {
            long g2 = g();
            synchronized (obj) {
                long j2 = dra.e;
                dra.e = j2 + 1;
                s(j2);
                dra.d = dra.d.e(g());
            }
            r(dra.d(d(), g2 + 1, g()));
            return t08Var;
        }
        return t08Var;
    }

    public final void v() {
        A(g());
        if (!this.m && !this.c) {
            long g = g();
            synchronized (dra.c) {
                long j = dra.e;
                dra.e = j + 1;
                s(j);
                dra.d = dra.d.e(g());
            }
            r(dra.d(d(), g + 1, g()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab A[LOOP:1: B:39:0x00a9->B:40:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.rae w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv7.w():rae");
    }

    public uv7 x() {
        return this.h;
    }

    @Override // defpackage.zqa
    /* renamed from: y */
    public xt4 e() {
        return this.e;
    }

    public final rae z(long j, uv7 uv7Var, HashMap hashMap, cra craVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        cra craVar2;
        Object[] objArr;
        long[] jArr;
        cra craVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        kza b;
        yk8 yk8Var;
        ArrayList arrayList5;
        cra d = d().e(g()).d(this.j);
        Object[] objArr3 = uv7Var.b;
        long[] jArr3 = uv7Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            iza izaVar = (iza) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            kza a = izaVar.a();
                            i = i4;
                            ArrayList arrayList6 = arrayList3;
                            kza s = dra.s(a, j, craVar);
                            if (s == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                kza s2 = dra.s(a, g(), d);
                                if (s2 != null && s2.a != 1 && !s.equals(s2)) {
                                    craVar3 = d;
                                    kza s3 = dra.s(a, g(), d());
                                    if (s3 != null) {
                                        if (hashMap == null || (b = (kza) hashMap.get(s)) == null) {
                                            b = izaVar.b(s2, s, s3);
                                        }
                                        if (b == null) {
                                            return new ara(this);
                                        }
                                        if (!b.equals(s3)) {
                                            if (b.equals(s)) {
                                                if (arrayList6 == null) {
                                                    arrayList5 = new ArrayList();
                                                } else {
                                                    arrayList5 = arrayList6;
                                                }
                                                arrayList5.add(new yk8(izaVar, s.c(g())));
                                                if (arrayList4 == null) {
                                                    arrayList2 = new ArrayList();
                                                } else {
                                                    arrayList2 = arrayList4;
                                                }
                                                arrayList2.add(izaVar);
                                                arrayList3 = arrayList5;
                                            } else {
                                                if (arrayList6 == null) {
                                                    arrayList3 = new ArrayList();
                                                } else {
                                                    arrayList3 = arrayList6;
                                                }
                                                if (!b.equals(s2)) {
                                                    yk8Var = new yk8(izaVar, b);
                                                } else {
                                                    yk8Var = new yk8(izaVar, s2.c(g()));
                                                }
                                                arrayList3.add(yk8Var);
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        arrayList3 = arrayList6;
                                        arrayList2 = arrayList4;
                                    } else {
                                        dra.r();
                                        throw null;
                                    }
                                }
                            }
                            craVar3 = d;
                            arrayList3 = arrayList6;
                            arrayList2 = arrayList4;
                        } else {
                            craVar3 = d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        d = craVar3;
                    }
                    craVar2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    craVar2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 != length) {
                    i2++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    d = craVar2;
                } else {
                    arrayList = arrayList3;
                    break;
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                yk8 yk8Var2 = (yk8) arrayList3.get(i5);
                iza izaVar2 = (iza) yk8Var2.a;
                kza kzaVar = (kza) yk8Var2.b;
                kzaVar.a = j;
                synchronized (dra.c) {
                    kzaVar.b = izaVar2.a();
                    izaVar2.e(kzaVar);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                uv7Var.l((iza) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = sl1.n0(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return bra.u;
    }
}
