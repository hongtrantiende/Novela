package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f75  reason: default package */
/* loaded from: classes.dex */
public final class f75 {
    public final du2 a;
    public final jg2 b;
    public final jg2 c;
    public final g99 d;
    public final b85[] e;
    public final vq4[] f;
    public final hu2 g;
    public final ajc h;
    public final List i;
    public final a09 k;
    public boolean l;
    public hk0 n;
    public Uri o;
    public Uri p;
    public boolean q;
    public c14 r;
    public final fz4 j = new fz4(20);
    public byte[] m = a2d.b;
    public long s = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v1, types: [ji0, d75, c14] */
    public f75(du2 du2Var, hu2 hu2Var, b85[] b85VarArr, vq4[] vq4VarArr, fz4 fz4Var, ys2 ys2Var, g99 g99Var, List list, a09 a09Var) {
        this.a = du2Var;
        this.g = hu2Var;
        this.e = b85VarArr;
        this.f = vq4VarArr;
        this.d = g99Var;
        this.i = list;
        this.k = a09Var;
        jg2 h = ((gg2) fz4Var.a).h();
        this.b = h;
        if (ys2Var != null) {
            h.u(ys2Var);
        }
        this.c = ((gg2) fz4Var.a).h();
        this.h = new ajc("", vq4VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b85VarArr.length; i++) {
            if ((vq4VarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        ajc ajcVar = this.h;
        int[] s = hc2.s(arrayList);
        ?? ji0Var = new ji0(ajcVar, s);
        ji0Var.g = ji0Var.e(ajcVar.d[s[0]]);
        this.r = ji0Var;
    }

    public static e75 f(q75 q75Var, long j, int i) {
        long j2 = q75Var.k;
        qs5 qs5Var = q75Var.s;
        int i2 = (int) (j - j2);
        qs5 qs5Var2 = q75Var.r;
        if (i2 == qs5Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < qs5Var.size()) {
                return new e75((o75) qs5Var.get(i), j, i);
            }
            return null;
        }
        n75 n75Var = (n75) qs5Var2.get(i2);
        if (i == -1) {
            return new e75(n75Var, j, -1);
        }
        if (i < n75Var.I.size()) {
            return new e75((o75) n75Var.I.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < qs5Var2.size()) {
            return new e75((o75) qs5Var2.get(i3), j + 1, -1);
        }
        if (!qs5Var.isEmpty()) {
            return new e75((o75) qs5Var.get(0), j + 1, 0);
        }
        return null;
    }

    public final mc2 a(Uri uri) {
        b85 b85Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hu2 hu2Var = this.g;
        gu2 gu2Var = (gu2) hu2Var.d.get(uri);
        if (gu2Var != null) {
            b85Var = gu2Var.a;
        } else {
            b85Var = null;
        }
        b85Var.getClass();
        HashMap hashMap = b85Var.b;
        int size = hashMap.size();
        jwc it = ts5.j(hashMap.values()).iterator();
        int i = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            gu2 gu2Var2 = (gu2) hu2Var.d.get(uri2);
            if (gu2Var2 != null) {
                fu2 fu2Var = (fu2) nk2.r(gu2Var2.b, uri2, uri2);
                fu2Var.getClass();
                if (elapsedRealtime <= fu2Var.E) {
                    i++;
                }
            }
        }
        return new mc2(size, i, this.r.length(), d(elapsedRealtime), 1);
    }

    public final a47[] b(g75 g75Var, long j) {
        int a;
        boolean z;
        List list;
        f75 f75Var = this;
        g75 g75Var2 = g75Var;
        if (g75Var2 == null) {
            a = -1;
        } else {
            a = f75Var.h.a(g75Var2.d);
        }
        int length = f75Var.r.length();
        a47[] a47VarArr = new a47[length];
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            int j2 = f75Var.r.j(i);
            Uri c = f75Var.e[j2].c();
            hu2 hu2Var = f75Var.g;
            if (!hu2Var.g(c)) {
                a47VarArr[i] = a47.n;
            } else {
                q75 b = hu2Var.b(z2, c);
                b.getClass();
                long j3 = b.h - hu2Var.O;
                if (j2 != a) {
                    z = true;
                } else {
                    z = z2;
                }
                Pair e = f75Var.e(g75Var2, z, b, j3, j);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j4 = b.k;
                qs5 qs5Var = b.s;
                qs5 qs5Var2 = b.r;
                int i2 = (int) (longValue - j4);
                if (i2 >= 0 && qs5Var2.size() >= i2) {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < qs5Var2.size()) {
                        if (intValue != -1) {
                            n75 n75Var = (n75) qs5Var2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(n75Var);
                            } else if (intValue < n75Var.I.size()) {
                                qs5 qs5Var3 = n75Var.I;
                                arrayList.addAll(qs5Var3.subList(intValue, qs5Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(qs5Var2.subList(i2, qs5Var2.size()));
                        intValue = 0;
                    }
                    if (b.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < qs5Var.size()) {
                            arrayList.addAll(qs5Var.subList(intValue, qs5Var.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                } else {
                    ms5 ms5Var = qs5.b;
                    list = mm9.e;
                }
                a47VarArr[i] = new c75(j3, list);
            }
            i++;
            f75Var = this;
            g75Var2 = g75Var;
            z2 = false;
        }
        return a47VarArr;
    }

    public final int c(g75 g75Var) {
        qs5 qs5Var;
        int i = g75Var.K;
        if (i != -1) {
            q75 b = this.g.b(false, g75Var.I);
            b.getClass();
            qs5 qs5Var2 = b.r;
            int i2 = (int) (g75Var.F - b.k);
            if (i2 >= 0) {
                if (i2 < qs5Var2.size()) {
                    qs5Var = ((n75) qs5Var2.get(i2)).I;
                } else {
                    qs5Var = b.s;
                }
                if (i < qs5Var.size()) {
                    l75 l75Var = (l75) qs5Var.get(i);
                    if (l75Var.I) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(voe.x(b.a, l75Var.a)), g75Var.b.a)) {
                        return 1;
                    }
                    return 2;
                }
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public final int d(long j) {
        c14 c14Var = this.r;
        int length = c14Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int j2 = c14Var.j(i2);
            if (!c14Var.a(i2, j)) {
                if (!this.g.e(this.e[j2], j)) {
                }
            }
            i++;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da A[EDGE_INSN: B:65:0x00da->B:62:0x00da ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair e(defpackage.g75 r17, boolean r18, defpackage.q75 r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f75.e(g75, boolean, q75, long, long):android.util.Pair");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [hh1, b75] */
    public final b75 g(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        fz4 fz4Var = this.j;
        byte[] bArr = (byte[]) ((tt4) fz4Var.a).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((tt4) fz4Var.a).put(uri, bArr);
            return null;
        }
        mg2 mg2Var = new mg2(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        vq4 vq4Var = this.f[i];
        int o = this.r.o();
        Object r = this.r.r();
        byte[] bArr3 = this.m;
        ?? hh1Var = new hh1(this.c, mg2Var, 3, vq4Var, o, r, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = a2d.b;
        }
        hh1Var.F = bArr3;
        return hh1Var;
    }
}
