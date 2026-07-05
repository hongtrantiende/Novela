package defpackage;

import android.util.Pair;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l09  reason: default package */
/* loaded from: classes.dex */
public final class l09 extends aac {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final ska c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final aac[] h;
    public final Object[] i;
    public final HashMap j;

    public l09(aac[] aacVarArr, Object[] objArr, ska skaVar) {
        this.c = skaVar;
        this.b = skaVar.b.length;
        int length = aacVarArr.length;
        this.h = aacVarArr;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int length2 = aacVarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            aac aacVar = aacVarArr[i];
            this.h[i4] = aacVar;
            this.g[i4] = i2;
            this.f[i4] = i3;
            i2 += aacVar.o();
            i3 += this.h[i4].h();
            this.j.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.d = i2;
        this.e = i3;
    }

    @Override // defpackage.aac
    public final int a(boolean z) {
        if (this.b == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.c.b;
            if (iArr.length > 0) {
                i = iArr[0];
            } else {
                i = -1;
            }
        }
        do {
            aac[] aacVarArr = this.h;
            if (aacVarArr[i].p()) {
                i = q(i, z);
            } else {
                return aacVarArr[i].a(z) + this.g[i];
            }
        } while (i != -1);
        return -1;
    }

    @Override // defpackage.aac
    public final int b(Object obj) {
        int intValue;
        int b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            if (intValue != -1 && (b = this.h[intValue].b(obj3)) != -1) {
                return this.f[intValue] + b;
            }
        }
        return -1;
    }

    @Override // defpackage.aac
    public final int c(boolean z) {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.c.b;
            if (iArr.length > 0) {
                i = iArr[iArr.length - 1];
            } else {
                i = -1;
            }
        } else {
            i = i2 - 1;
        }
        do {
            aac[] aacVarArr = this.h;
            if (aacVarArr[i].p()) {
                i = r(i, z);
            } else {
                return aacVarArr[i].c(z) + this.g[i];
            }
        } while (i != -1);
        return -1;
    }

    @Override // defpackage.aac
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int i3 = 0;
        int e = a2d.e(iArr, i + 1, false, false);
        int i4 = iArr[e];
        aac[] aacVarArr = this.h;
        aac aacVar = aacVarArr[e];
        int i5 = i - i4;
        if (i2 != 2) {
            i3 = i2;
        }
        int e2 = aacVar.e(i5, i3, z);
        if (e2 != -1) {
            return i4 + e2;
        }
        int q = q(e, z);
        while (q != -1 && aacVarArr[q].p()) {
            q = q(q, z);
        }
        if (q != -1) {
            return aacVarArr[q].a(z) + iArr[q];
        } else if (i2 != 2) {
            return -1;
        } else {
            return a(z);
        }
    }

    @Override // defpackage.aac
    public final y9c f(int i, y9c y9cVar, boolean z) {
        int[] iArr = this.f;
        int e = a2d.e(iArr, i + 1, false, false);
        int i2 = this.g[e];
        this.h[e].f(i - iArr[e], y9cVar, z);
        y9cVar.c += i2;
        if (z) {
            Object obj = this.i[e];
            Object obj2 = y9cVar.b;
            obj2.getClass();
            y9cVar.b = Pair.create(obj, obj2);
        }
        return y9cVar;
    }

    @Override // defpackage.aac
    public final y9c g(Object obj, y9c y9cVar) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i = this.g[intValue];
        this.h[intValue].g(obj3, y9cVar);
        y9cVar.c += i;
        y9cVar.b = obj;
        return y9cVar;
    }

    @Override // defpackage.aac
    public final int h() {
        return this.e;
    }

    @Override // defpackage.aac
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int i3 = 0;
        int e = a2d.e(iArr, i + 1, false, false);
        int i4 = iArr[e];
        aac[] aacVarArr = this.h;
        aac aacVar = aacVarArr[e];
        int i5 = i - i4;
        if (i2 != 2) {
            i3 = i2;
        }
        int k2 = aacVar.k(i5, i3, z);
        if (k2 != -1) {
            return i4 + k2;
        }
        int r = r(e, z);
        while (r != -1 && aacVarArr[r].p()) {
            r = r(r, z);
        }
        if (r != -1) {
            return aacVarArr[r].c(z) + iArr[r];
        } else if (i2 != 2) {
            return -1;
        } else {
            return c(z);
        }
    }

    @Override // defpackage.aac
    public final Object l(int i) {
        int[] iArr = this.f;
        int e = a2d.e(iArr, i + 1, false, false);
        return Pair.create(this.i[e], this.h[e].l(i - iArr[e]));
    }

    @Override // defpackage.aac
    public final z9c m(int i, z9c z9cVar, long j) {
        int[] iArr = this.g;
        int e = a2d.e(iArr, i + 1, false, false);
        int i2 = iArr[e];
        int i3 = this.f[e];
        this.h[e].m(i - i2, z9cVar, j);
        Object obj = this.i[e];
        Object obj2 = z9c.p;
        Object obj3 = z9cVar.a;
        if (obj2 != obj3) {
            obj = Pair.create(obj, obj3);
        }
        z9cVar.a = obj;
        z9cVar.m += i3;
        z9cVar.n += i3;
        return z9cVar;
    }

    @Override // defpackage.aac
    public final int o() {
        return this.d;
    }

    public final int q(int i, boolean z) {
        if (z) {
            ska skaVar = this.c;
            int i2 = skaVar.c[i] + 1;
            int[] iArr = skaVar.b;
            if (i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        } else if (i >= this.b - 1) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final int r(int i, boolean z) {
        if (z) {
            ska skaVar = this.c;
            int i2 = skaVar.c[i] - 1;
            if (i2 < 0) {
                return -1;
            }
            return skaVar.b[i2];
        } else if (i <= 0) {
            return -1;
        } else {
            return i - 1;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l09(java.util.ArrayList r8, defpackage.ska r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            aac[] r0 = new defpackage.aac[r0]
            int r1 = r8.size()
            r2 = 0
            r3 = r2
            r4 = r3
        Ld:
            if (r4 >= r1) goto L21
            java.lang.Object r5 = r8.get(r4)
            int r4 = r4 + 1
            l67 r5 = (defpackage.l67) r5
            int r6 = r3 + 1
            aac r5 = r5.b()
            r0[r3] = r5
            r3 = r6
            goto Ld
        L21:
            int r1 = r8.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r3 = r8.size()
            r4 = r2
        L2c:
            if (r4 >= r3) goto L40
            java.lang.Object r5 = r8.get(r4)
            int r4 = r4 + 1
            l67 r5 = (defpackage.l67) r5
            int r6 = r2 + 1
            java.lang.Object r5 = r5.a()
            r1[r2] = r5
            r2 = r6
            goto L2c
        L40:
            r7.<init>(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l09.<init>(java.util.ArrayList, ska):void");
    }
}
