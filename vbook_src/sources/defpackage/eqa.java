package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eqa  reason: default package */
/* loaded from: classes.dex */
public final class eqa {
    public final bqa a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public wu7 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final bz5 p;
    public final bz5 q;
    public final bz5 r;
    public wu7 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public vu7 x;

    public eqa(bqa bqaVar) {
        this.a = bqaVar;
        int[] iArr = bqaVar.a;
        this.b = iArr;
        Object[] objArr = bqaVar.c;
        this.c = objArr;
        this.d = bqaVar.E;
        this.e = bqaVar.F;
        this.f = bqaVar.G;
        int i = bqaVar.b;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = bqaVar.d;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new bz5(1, false);
        this.q = new bz5(1, false);
        this.r = new bz5(1, false);
        this.u = i;
        this.v = -1;
    }

    public static int i(int i, int i2, int i3, int i4) {
        if (i > i2) {
            return -(((i4 - i3) - i) + 1);
        }
        return i;
    }

    public static void z(eqa eqaVar) {
        int i = eqaVar.v;
        int r = eqaVar.r(i);
        int[] iArr = eqaVar.b;
        int i2 = (r * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) == 0) {
            int i4 = (i3 & (-134217729)) | 134217728;
            iArr[i2] = i4;
            if ((67108864 & i4) != 0) {
                return;
            }
            eqaVar.W(eqaVar.G(i, iArr));
        }
    }

    public final void A(bqa bqaVar, int i) {
        if (this.n <= 0) {
            ex1.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.b == 0) {
            int[] iArr = bqaVar.a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = bqaVar.b;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                wu7 wu7Var = this.f;
                Object[] objArr2 = bqaVar.c;
                int i4 = bqaVar.d;
                HashMap hashMap2 = bqaVar.F;
                wu7 wu7Var2 = bqaVar.G;
                this.b = iArr;
                this.c = objArr2;
                this.d = bqaVar.E;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = hashMap2;
                this.f = wu7Var2;
                bqaVar.a = iArr2;
                bqaVar.b = 0;
                bqaVar.c = objArr;
                bqaVar.d = 0;
                bqaVar.E = arrayList;
                bqaVar.F = hashMap;
                bqaVar.G = wu7Var;
                return;
            }
        }
        eqa f = bqaVar.f();
        try {
            gae.k(f, i, this, true, true, false);
            f.e(true);
        } catch (Throwable th) {
            f.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r9 >= r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        defpackage.b00.V(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        defpackage.b00.V(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r9) {
        /*
            r8 = this;
            int r0 = r8.h
            int r1 = r8.g
            if (r1 == r9) goto Lab
            java.util.ArrayList r2 = r8.d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L59
            int r2 = r8.h
            int r3 = r8.o()
            int r3 = r3 - r2
            java.util.ArrayList r2 = r8.d
            if (r1 >= r9) goto L39
            int r2 = defpackage.dqa.a(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r8.d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.d
            java.lang.Object r4 = r4.get(r2)
            lv4 r4 = (defpackage.lv4) r4
            int r5 = r4.a
            if (r5 >= 0) goto L59
            int r5 = r5 + r3
            if (r5 >= r9) goto L59
            r4.a = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            int r2 = defpackage.dqa.a(r2, r9, r3)
        L3d:
            java.util.ArrayList r4 = r8.d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.d
            java.lang.Object r4 = r4.get(r2)
            lv4 r4 = (defpackage.lv4) r4
            int r5 = r4.a
            if (r5 < 0) goto L59
            int r5 = r3 - r5
            int r5 = -r5
            r4.a = r5
            int r2 = r2 + 1
            goto L3d
        L59:
            if (r0 <= 0) goto L70
            int[] r2 = r8.b
            int r3 = r9 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            if (r9 >= r1) goto L6a
            int r4 = r4 + r3
            defpackage.b00.V(r4, r3, r5, r2, r2)
            goto L70
        L6a:
            int r6 = r5 + r4
            int r3 = r3 + r4
            defpackage.b00.V(r5, r6, r3, r2, r2)
        L70:
            if (r9 >= r1) goto L74
            int r1 = r9 + r0
        L74:
            int r2 = r8.o()
            if (r1 >= r2) goto L7b
            goto L80
        L7b:
            java.lang.String r3 = "Check failed"
            defpackage.ex1.a(r3)
        L80:
            if (r1 >= r2) goto Lab
            int[] r3 = r8.b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            r5 = -2
            if (r3 <= r5) goto L8f
            r6 = r3
            goto L95
        L8f:
            int r6 = r8.p()
            int r6 = r6 + r3
            int r6 = r6 - r5
        L95:
            if (r6 >= r9) goto L98
            goto L9f
        L98:
            int r7 = r8.p()
            int r7 = r7 - r6
            int r7 = r7 - r5
            int r6 = -r7
        L9f:
            if (r6 == r3) goto La5
            int[] r3 = r8.b
            r3[r4] = r6
        La5:
            int r1 = r1 + 1
            if (r1 != r9) goto L80
            int r1 = r1 + r0
            goto L80
        Lab:
            r8.g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqa.B(int):void");
    }

    public final void C(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, p());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int r = r(min);
                int r2 = r(i5);
                int i7 = this.g;
                while (r < r2) {
                    int i8 = (r * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        ex1.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    r++;
                    if (r == i7) {
                        r += this.h;
                    }
                }
            } else {
                int r3 = r(i5);
                int r4 = r(min);
                while (r3 < r4) {
                    int i10 = (r3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        ex1.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    r3++;
                    if (r3 == this.g) {
                        r3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final List D(lv4 lv4Var, eqa eqaVar) {
        int F;
        if (eqaVar.n <= 0) {
            ex1.a("Check failed");
        }
        if (this.n != 0) {
            ex1.a("Check failed");
        }
        if (!lv4Var.a()) {
            ex1.a("Check failed");
        }
        boolean z = true;
        int c = c(lv4Var) + 1;
        int i = this.t;
        if (i > c || c >= this.u) {
            ex1.a("Check failed");
        }
        int G = G(c, this.b);
        int u = u(c);
        if (y(c)) {
            F = 1;
        } else {
            F = F(c);
        }
        List k = gae.k(this, c, eqaVar, false, false, true);
        W(G);
        if (F <= 0) {
            z = false;
        }
        while (G >= i) {
            int r = r(G);
            int[] iArr = this.b;
            int i2 = r * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - u;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    dqa.c(iArr, r, (i4 & 67108863) - F);
                }
            }
            G = G(G, this.b);
        }
        if (z) {
            if (this.o < F) {
                ex1.a("Check failed");
            }
            this.o -= F;
        }
        return k;
    }

    public final Object E(int i) {
        int r = r(i);
        int[] iArr = this.b;
        if ((iArr[(r * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(r, iArr))];
        }
        return null;
    }

    public final int F(int i) {
        return this.b[(r(i) * 5) + 1] & 67108863;
    }

    public final int G(int i, int[] iArr) {
        int i2 = iArr[(r(i) * 5) + 2];
        if (i2 > -2) {
            return i2;
        }
        return (p() + i2) - (-2);
    }

    public final Object H(Object obj) {
        if (this.n > 0) {
            x(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            ex1.a("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void I() {
        int i;
        int i2;
        vu7 vu7Var = this.x;
        if (vu7Var != null) {
            while (vu7Var.b != 0) {
                int p = gae.p(vu7Var);
                int r = r(p);
                int i3 = p + 1;
                int u = u(p) + p;
                while (true) {
                    i = 0;
                    if (i3 < u) {
                        if ((this.b[(r(i3) * 5) + 1] & 201326592) != 0) {
                            i2 = 1;
                            break;
                        }
                        i3 += u(i3);
                    } else {
                        i2 = 0;
                        break;
                    }
                }
                int[] iArr = this.b;
                int i4 = (r * 5) + 1;
                int i5 = iArr[i4];
                if ((67108864 & i5) != 0) {
                    i = 1;
                }
                if (i != i2) {
                    iArr[i4] = (i2 << 26) | ((-67108865) & i5);
                    int G = G(p, iArr);
                    if (G >= 0) {
                        gae.c(vu7Var, G);
                    }
                }
            }
        }
    }

    public final boolean J() {
        if (this.n != 0) {
            ex1.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int g = g(r(i), this.b);
        int N = N();
        Q(this.v);
        vu7 vu7Var = this.x;
        if (vu7Var != null) {
            while (true) {
                int i3 = vu7Var.b;
                if (i3 == 0) {
                    break;
                } else if (i3 != 0) {
                    if (vu7Var.a[0] < i) {
                        break;
                    }
                    gae.p(vu7Var);
                } else {
                    p1a.l("IntList is empty.");
                    return false;
                }
            }
        }
        boolean K = K(i, this.t - i);
        L(g, this.i - g, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= N;
        return K;
    }

    public final boolean K(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            B(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int a = dqa.a(this.d, i3, o() - this.h);
                if (a >= this.d.size()) {
                    a--;
                }
                int i4 = a + 1;
                int i5 = 0;
                while (a >= 0) {
                    lv4 lv4Var = (lv4) this.d.get(a);
                    int c = c(lv4Var);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        lv4Var.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                            uv4 uv4Var = (uv4) hashMap.remove(lv4Var);
                        }
                        if (i5 == 0) {
                            i5 = a + 1;
                        }
                        i4 = a;
                    }
                    a--;
                }
                if (i4 < i5) {
                    z = true;
                }
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(r(i8) * 5) + 1] & 67108864) != 0) {
                W(i8);
            }
        }
        return z;
    }

    public final void L(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            C(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object M(int i, Object obj, int i2) {
        int P = P(r(i), this.b);
        int g = g(r(i + 1), this.b);
        int i3 = P + i2;
        if (i3 < P || i3 >= g) {
            ex1.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int h = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[h];
        objArr[h] = obj;
        return obj2;
    }

    public final int N() {
        int r = r(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = r * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = g(r(i3), iArr);
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void O() {
        int i = this.u;
        this.t = i;
        this.i = g(r(i), this.b);
    }

    public final int P(int i, int[] iArr) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int b = dqa.b(i, iArr);
        int i2 = this.l;
        int length = this.c.length;
        if (b < 0) {
            return (length - i2) + b + 1;
        }
        return b;
    }

    public final uv4 Q(int i) {
        lv4 T;
        HashMap hashMap = this.e;
        if (hashMap == null || (T = T(i)) == null) {
            return null;
        }
        return (uv4) hashMap.get(T);
    }

    public final void R() {
        if (this.n != 0) {
            ex1.a("Key must be supplied when inserting");
        }
        lh9 lh9Var = ax1.a;
        S(lh9Var, false, lh9Var, 0);
    }

    public final void S(Object obj, boolean z, Object obj2, int i) {
        Object[] objArr;
        int i2;
        int i3;
        int i4;
        int i5 = this.v;
        if (this.n > 0) {
            objArr = 1;
        } else {
            objArr = null;
        }
        this.r.e(this.o);
        lh9 lh9Var = ax1.a;
        if (objArr != null) {
            int i6 = this.t;
            int g = g(r(i6), this.b);
            w(1);
            this.i = g;
            this.j = g;
            int r = r(i6);
            if (obj != lh9Var) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (!z && obj2 != lh9Var) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i7 = i(g, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i6) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = r * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i3 << 29) | (i4 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i3 + i4;
            if (i10 > 0) {
                x(i10, i6);
                Object[] objArr2 = this.c;
                int i11 = this.i;
                if (z) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                if (i3 != 0) {
                    objArr2[i11] = obj;
                    i11++;
                }
                if (i4 != 0) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i2 = i6 + 1;
            this.v = i6;
            this.t = i2;
            if (i5 >= 0) {
                Q(i5);
            }
        } else {
            this.p.e(i5);
            this.q.e((o() - this.h) - this.u);
            int i12 = this.t;
            int r2 = r(i12);
            if (!c16.i(obj2, lh9Var)) {
                if (z) {
                    X(this.t, obj2);
                } else {
                    V(obj2);
                }
            }
            this.i = P(r2, this.b);
            this.j = g(r(this.t + 1), this.b);
            int[] iArr2 = this.b;
            int i13 = r2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    public final lv4 T(int i) {
        ArrayList arrayList;
        int e;
        if (i < 0 || i >= p() || (e = dqa.e((arrayList = this.d), i, p())) < 0) {
            return null;
        }
        return (lv4) arrayList.get(e);
    }

    public final void U(Object obj) {
        if (this.n > 0 && this.i != this.k) {
            wu7 wu7Var = this.s;
            if (wu7Var == null) {
                wu7Var = new wu7();
            }
            this.s = wu7Var;
            int i = this.v;
            Object b = wu7Var.b(i);
            if (b == null) {
                b = new kv7();
                wu7Var.i(i, b);
            }
            ((kv7) b).a(obj);
            return;
        }
        H(obj);
    }

    public final void V(Object obj) {
        int r = r(this.t);
        int i = (r * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            ex1.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(r, iArr))] = obj;
    }

    public final void W(int i) {
        if (i >= 0) {
            vu7 vu7Var = this.x;
            if (vu7Var == null) {
                vu7Var = new vu7();
                this.x = vu7Var;
            }
            gae.c(vu7Var, i);
        }
    }

    public final void X(int i, Object obj) {
        int r = r(i);
        int[] iArr = this.b;
        if (r >= iArr.length || (iArr[(r * 5) + 1] & 1073741824) == 0) {
            ex1.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[h(g(r, this.b))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            ex1.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            e39.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        int i3 = this.v;
        if (i2 < i3 || i2 > this.u) {
            int i4 = this.u;
            ex1.a("Cannot seek outside the current group (" + i3 + "-" + i4 + ")");
        }
        this.t = i2;
        int g = g(r(i2), this.b);
        this.i = g;
        this.j = g;
    }

    public final lv4 b(int i) {
        ArrayList arrayList = this.d;
        int e = dqa.e(arrayList, i, p());
        if (e < 0) {
            if (i > this.g) {
                i = -(p() - i);
            }
            lv4 lv4Var = new lv4(i);
            arrayList.add(-(e + 1), lv4Var);
            return lv4Var;
        }
        return (lv4) arrayList.get(e);
    }

    public final int c(lv4 lv4Var) {
        int i = lv4Var.a;
        if (i < 0) {
            return p() + i;
        }
        return i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.e((o() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            B(p());
            C(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            I();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        wu7 wu7Var = this.f;
        bqa bqaVar = this.a;
        if (!bqaVar.C) {
            e39.a("Unexpected writer close()");
        }
        bqaVar.C = false;
        bqaVar.a = iArr;
        bqaVar.b = i2;
        bqaVar.c = objArr;
        bqaVar.d = i3;
        bqaVar.E = arrayList;
        bqaVar.F = hashMap;
        bqaVar.G = wu7Var;
    }

    public final int f(int i) {
        return g(r(i), this.b);
    }

    public final int g(int i, int[] iArr) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = this.l;
        int length = this.c.length;
        if (i2 < 0) {
            return (length - i3) + i2 + 1;
        }
        return i2;
    }

    public final int h(int i) {
        int i2;
        int i3 = this.l;
        if (i < this.k) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return (i3 * i2) + i;
    }

    public final void j() {
        boolean z;
        boolean z2;
        int i;
        int r;
        kv7 kv7Var;
        int i2 = 0;
        if (this.n > 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = this.t;
        int i4 = this.u;
        int i5 = this.v;
        int r2 = r(i5);
        int i6 = this.o;
        int i7 = i3 - i5;
        int i8 = r2 * 5;
        int i9 = i8 + 1;
        if ((this.b[i9] & 1073741824) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        bz5 bz5Var = this.r;
        if (z) {
            wu7 wu7Var = this.s;
            if (wu7Var != null && (kv7Var = (kv7) wu7Var.b(i5)) != null) {
                Object[] objArr = kv7Var.a;
                int i10 = kv7Var.b;
                for (int i11 = 0; i11 < i10; i11++) {
                    H(objArr[i11]);
                }
                kv7 kv7Var2 = (kv7) wu7Var.g(i5);
            }
            int[] iArr = this.b;
            iArr[i8 + 3] = i7;
            dqa.c(iArr, r2, i6);
            int d = bz5Var.d();
            if (z2) {
                i6 = 1;
            }
            this.o = d + i6;
            int G = G(i5, this.b);
            this.v = G;
            if (G < 0) {
                r = p();
            } else {
                r = r(G + 1);
            }
            if (r >= 0) {
                i2 = g(r, this.b);
            }
            this.i = i2;
            this.j = i2;
            return;
        }
        if (i3 != i4) {
            ex1.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i12 = i8 + 3;
        int i13 = iArr2[i12];
        int i14 = iArr2[i9] & 67108863;
        iArr2[i12] = i7;
        dqa.c(iArr2, r2, i6);
        int d2 = this.p.d();
        this.u = (o() - this.h) - this.q.d();
        this.v = d2;
        int G2 = G(i5, this.b);
        int d3 = bz5Var.d();
        this.o = d3;
        if (G2 == d2) {
            if (!z2) {
                i2 = i6 - i14;
            }
            this.o = d3 + i2;
            return;
        }
        int i15 = i7 - i13;
        if (z2) {
            i = 0;
        } else {
            i = i6 - i14;
        }
        if (i15 != 0 || i != 0) {
            while (G2 != 0 && G2 != d2 && (i != 0 || i15 != 0)) {
                int r3 = r(G2);
                if (i15 != 0) {
                    int[] iArr3 = this.b;
                    int i16 = (r3 * 5) + 3;
                    iArr3[i16] = iArr3[i16] + i15;
                }
                if (i != 0) {
                    int[] iArr4 = this.b;
                    dqa.c(iArr4, r3, (iArr4[(r3 * 5) + 1] & 67108863) + i);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(r3 * 5) + 1] & 1073741824) != 0) {
                    i = 0;
                }
                G2 = G(G2, iArr5);
            }
        }
        this.o += i;
    }

    public final void k() {
        if (this.n <= 0) {
            e39.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                ex1.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (o() - this.h) - this.q.d();
        }
    }

    public final void l(int i) {
        boolean z;
        boolean z2 = false;
        if (this.n <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ex1.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z2 = true;
            }
            if (!z2) {
                ex1.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            R();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((p() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(r(i3) * 5) + 2] = i;
            int i4 = this.b[(r(i3) * 5) + 3] + i3;
            m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r20, defpackage.lu4 r21) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqa.n(int, lu4):void");
    }

    public final int o() {
        return this.b.length / 5;
    }

    public final int p() {
        return o() - this.h;
    }

    public final Object q(int i) {
        int r = r(i);
        int[] iArr = this.b;
        int i2 = (r * 5) + 1;
        if ((iArr[i2] & 268435456) != 0) {
            return this.c[Integer.bitCount(iArr[i2] >> 29) + g(r, iArr)];
        }
        return ax1.a;
    }

    public final int r(int i) {
        int i2;
        int i3 = this.h;
        if (i < this.g) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return (i3 * i2) + i;
    }

    public final int s(int i) {
        return this.b[r(i) * 5];
    }

    public final Object t(int i) {
        int r = r(i);
        int[] iArr = this.b;
        int i2 = r * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
        }
        return null;
    }

    public final String toString() {
        int i = this.t;
        int i2 = this.u;
        int p = p();
        int i3 = this.g;
        StringBuilder r = hl5.r(i, i2, "SlotWriter(current = ", " end=", " size = ");
        rs8.q(p, i3, " gap=", "-", r);
        return rs8.g(this.h + i3, ")", r);
    }

    public final int u(int i) {
        return this.b[(r(i) * 5) + 3];
    }

    public final boolean v(int i, int i2) {
        int o;
        int u;
        if (i2 == this.v) {
            o = this.u;
        } else {
            bz5 bz5Var = this.p;
            if (i2 > bz5Var.c(0)) {
                u = u(i2);
            } else {
                int[] iArr = bz5Var.a;
                int min = Math.min(iArr.length, bz5Var.b);
                int i3 = 0;
                while (true) {
                    if (i3 < min) {
                        if (iArr[i3] == i2) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 < 0) {
                    u = u(i2);
                } else {
                    o = (o() - this.h) - this.q.a[i3];
                }
            }
            o = u + i2;
        }
        if (i <= i2 || i >= o) {
            return false;
        }
        return true;
    }

    public final void w(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.t;
            B(i3);
            int i4 = this.g;
            int i5 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i6;
                b00.V(0, 0, i4 * 5, iArr, iArr2);
                b00.V((i4 + i8) * 5, (i5 + i4) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i5 = i8;
            }
            int i9 = this.u;
            if (i9 >= i4) {
                this.u = i9 + i;
            }
            int i10 = i4 + i;
            this.g = i10;
            this.h = i5 - i;
            if (i6 > 0) {
                i2 = f(i3 + i);
            } else {
                i2 = 0;
            }
            if (this.m >= i4) {
                i7 = this.k;
            }
            int i11 = i(i2, i7, this.l, this.c.length);
            for (int i12 = i4; i12 < i10; i12++) {
                this.b[(i12 * 5) + 4] = i11;
            }
            int i13 = this.m;
            if (i13 >= i4) {
                this.m = i13 + i;
            }
        }
    }

    public final void x(int i, int i2) {
        if (i > 0) {
            C(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean y(int i) {
        if ((this.b[(r(i) * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }
}
