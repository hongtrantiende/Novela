package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w97  reason: default package */
/* loaded from: classes.dex */
public final class w97 implements n57, m57 {
    public m57 C;
    public bjc D;
    public n57[] E;
    public lx1 F;
    public final n57[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final kh5 d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();

    public w97(kh5 kh5Var, long[] jArr, n57... n57VarArr) {
        this.d = kh5Var;
        this.a = n57VarArr;
        kh5Var.getClass();
        ms5 ms5Var = qs5.b;
        mm9 mm9Var = mm9.e;
        this.F = new lx1(mm9Var, mm9Var);
        this.c = new IdentityHashMap();
        this.E = new n57[0];
        this.b = new boolean[n57VarArr.length];
        for (int i = 0; i < n57VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new s9c(n57VarArr[i], j);
            }
        }
    }

    @Override // defpackage.m57
    public final void a(n57 n57Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(n57Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        n57[] n57VarArr = this.a;
        int i = 0;
        for (n57 n57Var2 : n57VarArr) {
            i += n57Var2.r().a;
        }
        ajc[] ajcVarArr = new ajc[i];
        int i2 = 0;
        for (int i3 = 0; i3 < n57VarArr.length; i3++) {
            bjc r = n57VarArr[i3].r();
            int i4 = r.a;
            int i5 = 0;
            while (i5 < i4) {
                ajc a = r.a(i5);
                int i6 = a.a;
                vq4[] vq4VarArr = new vq4[i6];
                int i7 = 0;
                while (i7 < i6) {
                    vq4 vq4Var = a.d[i7];
                    uq4 a2 = vq4Var.a();
                    String str = vq4Var.m;
                    n57[] n57VarArr2 = n57VarArr;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i3);
                    sb.append(":");
                    String str2 = vq4Var.a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb.append(str2);
                    a2.a = sb.toString();
                    if (str != null) {
                        a2.l = i3 + ":" + str;
                    }
                    vq4VarArr[i7] = new vq4(a2);
                    i7++;
                    n57VarArr = n57VarArr2;
                }
                n57[] n57VarArr3 = n57VarArr;
                ajc ajcVar = new ajc(i3 + ":" + a.b, vq4VarArr);
                this.f.put(ajcVar, a);
                ajcVarArr[i2] = ajcVar;
                i5++;
                i2++;
                n57VarArr = n57VarArr3;
            }
        }
        this.D = new bjc(ajcVarArr);
        m57 m57Var = this.C;
        m57Var.getClass();
        m57Var.a(this);
    }

    @Override // defpackage.e9a
    public final void d(f9a f9aVar) {
        n57 n57Var = (n57) f9aVar;
        m57 m57Var = this.C;
        m57Var.getClass();
        m57Var.d(this);
    }

    @Override // defpackage.n57
    public final long e(c14[] c14VarArr, boolean[] zArr, gx9[] gx9VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        gx9 gx9Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[c14VarArr.length];
        int[] iArr3 = new int[c14VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = c14VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            gx9 gx9Var2 = gx9VarArr[i2];
            if (gx9Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(gx9Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i2] = intValue;
            c14 c14Var = c14VarArr[i2];
            if (c14Var != null) {
                String str = c14Var.c().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = c14VarArr.length;
        gx9[] gx9VarArr2 = new gx9[length2];
        gx9[] gx9VarArr3 = new gx9[c14VarArr.length];
        c14[] c14VarArr2 = new c14[c14VarArr.length];
        n57[] n57VarArr = this.a;
        ArrayList arrayList = new ArrayList(n57VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < n57VarArr.length) {
            int i4 = i;
            while (i4 < c14VarArr.length) {
                if (iArr2[i4] == i3) {
                    gx9Var = gx9VarArr[i4];
                } else {
                    gx9Var = null;
                }
                gx9VarArr3[i4] = gx9Var;
                if (iArr3[i4] == i3) {
                    c14 c14Var2 = c14VarArr[i4];
                    c14Var2.getClass();
                    iArr = iArr2;
                    ajc ajcVar = (ajc) this.f.get(c14Var2.c());
                    ajcVar.getClass();
                    c14VarArr2[i4] = new v97(c14Var2, ajcVar);
                } else {
                    iArr = iArr2;
                    c14VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            n57[] n57VarArr2 = n57VarArr;
            int i5 = i3;
            long e = n57VarArr2[i3].e(c14VarArr2, zArr, gx9VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = e;
            } else if (e != j2) {
                vs.k("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < c14VarArr.length; i6++) {
                boolean z2 = true;
                if (iArr3[i6] == i5) {
                    gx9 gx9Var3 = gx9VarArr3[i6];
                    gx9Var3.getClass();
                    gx9VarArr2[i6] = gx9VarArr3[i6];
                    identityHashMap.put(gx9Var3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    if (gx9VarArr3[i6] != null) {
                        z2 = false;
                    }
                    wq9.D(z2);
                }
            }
            if (z) {
                arrayList.add(n57VarArr2[i5]);
            }
            i3 = i5 + 1;
            n57VarArr = n57VarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(gx9VarArr2, i7, gx9VarArr, i7, length2);
        this.E = (n57[]) arrayList.toArray(new n57[i7]);
        AbstractList F = uue.F(arrayList, new uz0(12));
        this.d.getClass();
        this.F = new lx1(arrayList, F);
        return j2;
    }

    @Override // defpackage.f9a
    public final long g() {
        return this.F.g();
    }

    @Override // defpackage.n57
    public final long h(long j, o4a o4aVar) {
        n57 n57Var;
        n57[] n57VarArr = this.E;
        if (n57VarArr.length > 0) {
            n57Var = n57VarArr[0];
        } else {
            n57Var = this.a[0];
        }
        return n57Var.h(j, o4aVar);
    }

    @Override // defpackage.n57
    public final void j() {
        for (n57 n57Var : this.a) {
            n57Var.j();
        }
    }

    @Override // defpackage.n57
    public final long k(long j) {
        long k = this.E[0].k(j);
        int i = 1;
        while (true) {
            n57[] n57VarArr = this.E;
            if (i < n57VarArr.length) {
                if (n57VarArr[i].k(k) == k) {
                    i++;
                } else {
                    vs.k("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else {
                return k;
            }
        }
    }

    @Override // defpackage.n57
    public final void l(long j) {
        for (n57 n57Var : this.E) {
            n57Var.l(j);
        }
    }

    @Override // defpackage.f9a
    public final boolean n() {
        return this.F.n();
    }

    @Override // defpackage.n57
    public final long p() {
        long j;
        n57 n57Var;
        n57[] n57VarArr = this.E;
        int length = n57VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            n57 n57Var2 = n57VarArr[i];
            long p = n57Var2.p();
            if (p != j2) {
                if (j3 == j2) {
                    n57[] n57VarArr2 = this.E;
                    int length2 = n57VarArr2.length;
                    int i2 = 0;
                    while (true) {
                        j = j2;
                        if (i2 >= length2 || (n57Var = n57VarArr2[i2]) == n57Var2) {
                            break;
                        } else if (n57Var.k(p) == p) {
                            i2++;
                            j2 = j;
                        } else {
                            vs.k("Unexpected child seekToUs result.");
                            return 0L;
                        }
                    }
                    j3 = p;
                } else {
                    j = j2;
                    if (p != j3) {
                        vs.k("Conflicting discontinuities.");
                        return 0L;
                    }
                }
            } else {
                j = j2;
                if (j3 != j && n57Var2.k(j3) != j3) {
                    vs.k("Unexpected child seekToUs result.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // defpackage.n57
    public final void q(m57 m57Var, long j) {
        this.C = m57Var;
        ArrayList arrayList = this.e;
        n57[] n57VarArr = this.a;
        Collections.addAll(arrayList, n57VarArr);
        for (n57 n57Var : n57VarArr) {
            n57Var.q(this, j);
        }
    }

    @Override // defpackage.n57
    public final bjc r() {
        bjc bjcVar = this.D;
        bjcVar.getClass();
        return bjcVar;
    }

    @Override // defpackage.f9a
    public final boolean t(vs6 vs6Var) {
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((n57) arrayList.get(i)).t(vs6Var);
            }
            return false;
        }
        return this.F.t(vs6Var);
    }

    @Override // defpackage.f9a
    public final long u() {
        return this.F.u();
    }

    @Override // defpackage.f9a
    public final void x(long j) {
        this.F.x(j);
    }
}
