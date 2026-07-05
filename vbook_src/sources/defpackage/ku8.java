package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ku8  reason: default package */
/* loaded from: classes.dex */
public final class ku8 extends a3 implements Collection, k76 {
    public Object[] C;
    public int D;
    public d3 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public cne e = new cne(29);
    public Object[] f;

    public ku8(d3 d3Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = d3Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.C = objArr2;
        this.D = d3Var.a();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r0 != r8) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (z(r1, r8, r5) != r8) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(defpackage.xt4 r16) {
        /*
            r15 = this;
            r1 = r16
            int r8 = r15.H()
            l78 r5 = new l78
            r9 = 0
            r5.<init>(r9)
            java.lang.Object[] r0 = r15.f
            r10 = 0
            r11 = 1
            if (r0 != 0) goto L1b
            int r0 = r15.z(r1, r8, r5)
            if (r0 == r8) goto Ld1
        L18:
            r10 = r11
            goto Ld1
        L1b:
            f2 r12 = r15.j(r10)
            r13 = 32
            r0 = r13
        L22:
            if (r0 != r13) goto L35
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r15.y(r1, r0, r13, r5)
            goto L22
        L35:
            if (r0 != r13) goto L49
            int r0 = r15.z(r1, r8, r5)
            if (r0 != 0) goto L46
            java.lang.Object[] r1 = r15.f
            int r2 = r15.D
            int r3 = r15.d
            r15.s(r1, r2, r3)
        L46:
            if (r0 == r8) goto Ld1
            goto L18
        L49:
            int r2 = r12.a
            int r2 = r2 - r11
            int r14 = r2 << 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r0
        L59:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r15
            int r4 = r0.x(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            goto L59
        L70:
            java.lang.Object[] r2 = r15.C
            r0 = r15
            r1 = r16
            r3 = r8
            int r1 = r0.x(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.a
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.Arrays.fill(r2, r1, r13, r9)
            boolean r3 = r7.isEmpty()
            java.lang.Object[] r4 = r15.f
            if (r3 == 0) goto L90
            r4.getClass()
            goto L9a
        L90:
            int r3 = r15.d
            java.util.Iterator r5 = r7.iterator()
            java.lang.Object[] r4 = r15.t(r4, r14, r3, r5)
        L9a:
            int r3 = r7.size()
            int r3 = r3 << 5
            int r14 = r14 + r3
            r3 = r14 & 31
            if (r3 != 0) goto La6
            goto Lab
        La6:
            java.lang.String r3 = "invalid size"
            defpackage.e39.a(r3)
        Lab:
            if (r14 != 0) goto Lb0
            r15.d = r10
            goto Lc8
        Lb0:
            int r3 = r14 + (-1)
        Lb2:
            int r5 = r15.d
            int r6 = r3 >> r5
            if (r6 != 0) goto Lc4
            int r5 = r5 + (-5)
            r15.d = r5
            r4 = r4[r10]
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto Lb2
        Lc4:
            java.lang.Object[] r9 = r15.p(r4, r3, r5)
        Lc8:
            r15.f = r9
            r15.C = r2
            int r14 = r14 + r1
            r15.D = r14
            goto L18
        Ld1:
            if (r10 == 0) goto Ld8
            int r1 = r15.modCount
            int r1 = r1 + r11
            r15.modCount = r1
        Ld8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku8.A(xt4):boolean");
    }

    public final Object[] B(Object[] objArr, int i, int i2, l78 l78Var) {
        int u = hma.u(i2, i);
        int i3 = 31;
        if (i == 0) {
            Object obj = objArr[u];
            Object[] k = k(objArr);
            b00.W(u, u + 1, 32, objArr, k);
            k[31] = l78Var.a;
            l78Var.a = obj;
            return k;
        }
        if (objArr[31] == null) {
            i3 = hma.u(E() - 1, i);
        }
        Object[] k2 = k(objArr);
        int i4 = i - 5;
        int i5 = u + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj2 = k2[i3];
                obj2.getClass();
                k2[i3] = B((Object[]) obj2, i4, 0, l78Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = k2[u];
        obj3.getClass();
        k2[u] = B((Object[]) obj3, i4, i2, l78Var);
        return k2;
    }

    public final Object D(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.D - i;
        Object[] objArr2 = this.C;
        if (i4 == 1) {
            Object obj = objArr2[0];
            s(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] k = k(objArr2);
        b00.W(i3, i3 + 1, i4, objArr2, k);
        k[i4 - 1] = null;
        this.f = objArr;
        this.C = k;
        this.D = (i + i4) - 1;
        this.d = i2;
        return obj2;
    }

    public final int E() {
        int i = this.D;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] F(Object[] objArr, int i, int i2, Object obj, l78 l78Var) {
        int u = hma.u(i2, i);
        Object[] k = k(objArr);
        if (i == 0) {
            if (k != objArr) {
                ((AbstractList) this).modCount++;
            }
            l78Var.a = k[u];
            k[u] = obj;
            return k;
        }
        Object obj2 = k[u];
        obj2.getClass();
        k[u] = F((Object[]) obj2, i - 5, i2, obj, l78Var);
        return k;
    }

    public final void G(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] m;
        if (i3 < 1) {
            e39.a("requires at least one nullBuffer");
        }
        Object[] k = k(objArr);
        objArr2[0] = k;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            b00.W(size + 1, i4, i2, k, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                m = k;
            } else {
                m = m();
                i3--;
                objArr2[i3] = m;
            }
            int i7 = i2 - i6;
            b00.W(0, i7, i2, k, objArr3);
            b00.W(size + 1, i4, i7, k, m);
            objArr3 = m;
        }
        Iterator it = collection.iterator();
        d(k, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] m2 = m();
            d(m2, 0, it);
            objArr2[i8] = m2;
        }
        d(objArr3, 0, it);
    }

    public final int H() {
        int i = this.D;
        if (i <= 32) {
            return i;
        }
        return i - ((i - 1) & (-32));
    }

    @Override // defpackage.a3
    public final int a() {
        return this.D;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        iue.L(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int E = E();
        if (i >= E) {
            h(i - E, obj, this.f);
            return;
        }
        l78 l78Var = new l78(null);
        Object[] objArr = this.f;
        objArr.getClass();
        h(0, l78Var.a, g(objArr, this.d, i, obj, l78Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] m;
        iue.L(i, this.D);
        if (i == this.D) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.D - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.C;
            Object[] k = k(objArr);
            b00.W(size2 + 1, i3, H(), objArr, k);
            d(k, i3, collection.iterator());
            this.C = k;
            this.D = collection.size() + this.D;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int H = H();
        int size3 = collection.size() + this.D;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= E()) {
            m = m();
            collection2 = collection;
            G(collection2, i, this.C, H, objArr2, size, m);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.C;
            if (size3 > H) {
                int i4 = size3 - H;
                Object[] l = l(i4, objArr3);
                f(collection2, i, i4, objArr2, size, l);
                objArr2 = objArr2;
                m = l;
            } else {
                m = m();
                int i5 = H - size3;
                b00.W(0, i5, H, objArr3, m);
                int i6 = 32 - i5;
                Object[] l2 = l(i6, this.C);
                int i7 = size - 1;
                objArr2[i7] = l2;
                f(collection2, i, i6, objArr2, i7, l2);
                collection2 = collection2;
            }
        }
        this.f = u(this.f, i2, objArr2);
        this.C = m;
        this.D = collection2.size() + this.D;
        return true;
    }

    @Override // defpackage.a3
    public final Object b(int i) {
        iue.K(i, a());
        ((AbstractList) this).modCount++;
        int E = E();
        if (i >= E) {
            return D(this.f, E, this.d, i - E);
        }
        l78 l78Var = new l78(this.C[0]);
        Object[] objArr = this.f;
        objArr.getClass();
        D(B(objArr, this.d, i, l78Var), E, this.d, 0);
        return l78Var.a;
    }

    public final d3 c() {
        d3 ju8Var;
        Object[] objArr = this.f;
        if (objArr == this.b && this.C == this.c) {
            ju8Var = this.a;
        } else {
            this.e = new cne(29);
            this.b = objArr;
            Object[] objArr2 = this.C;
            this.c = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    ju8Var = hqa.b;
                } else {
                    ju8Var = new hqa(Arrays.copyOf(objArr2, this.D));
                }
            } else {
                ju8Var = new ju8(objArr, objArr2, this.D, this.d);
            }
        }
        this.a = ju8Var;
        return ju8Var;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f != null) {
            int i4 = i >> 5;
            f2 j = j(E() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (j.a - 1 != i4) {
                Object[] objArr4 = (Object[]) j.previous();
                b00.W(0, 32 - i2, 32, objArr4, objArr3);
                objArr3 = l(i2, objArr4);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) j.previous();
            int E = i3 - (((E() >> 5) - 1) - i4);
            if (E < i3) {
                objArr2 = objArr[E];
                objArr2.getClass();
            }
            G(collection, i, objArr5, 32, objArr, E, objArr2);
            return;
        }
        vs.k("root is null");
    }

    public final Object[] g(Object[] objArr, int i, int i2, Object obj, l78 l78Var) {
        Object obj2;
        int u = hma.u(i2, i);
        if (i == 0) {
            l78Var.a = objArr[31];
            Object[] k = k(objArr);
            b00.W(u + 1, u, 31, objArr, k);
            k[u] = obj;
            return k;
        }
        Object[] k2 = k(objArr);
        int i3 = i - 5;
        Object obj3 = k2[u];
        obj3.getClass();
        k2[u] = g((Object[]) obj3, i3, i2, obj, l78Var);
        while (true) {
            u++;
            if (u >= 32 || (obj2 = k2[u]) == null) {
                break;
            }
            k2[u] = g((Object[]) obj2, i3, 0, l78Var.a, l78Var);
        }
        return k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        iue.K(i, a());
        if (E() <= i) {
            objArr = this.C;
        } else {
            Object[] objArr2 = this.f;
            objArr2.getClass();
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[hma.u(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final void h(int i, Object obj, Object[] objArr) {
        int H = H();
        Object[] k = k(this.C);
        Object[] objArr2 = this.C;
        if (H < 32) {
            b00.W(i + 1, i, H, objArr2, k);
            k[i] = obj;
            this.f = objArr;
            this.C = k;
            this.D++;
            return;
        }
        Object obj2 = objArr2[31];
        b00.W(i + 1, i, 31, objArr2, k);
        k[i] = obj;
        v(objArr, k, n(obj2));
    }

    public final boolean i(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.e) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final f2 j(int i) {
        Object[] objArr = this.f;
        if (objArr != null) {
            int E = E() >> 5;
            iue.L(i, E);
            int i2 = this.d;
            if (i2 == 0) {
                return new oy0(objArr, i);
            }
            return new ync(objArr, i, E, i2 / 5);
        }
        vs.k("Invalid root");
        return null;
    }

    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] m = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        b00.a0(0, length, 6, objArr, m);
        return m;
    }

    public final Object[] l(int i, Object[] objArr) {
        if (i(objArr)) {
            b00.W(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] m = m();
        b00.W(i, 0, 32 - i, objArr, m);
        return m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        iue.L(i, this.D);
        return new mu8(this, i);
    }

    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            e39.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int u = hma.u(i, i2);
        Object obj = objArr[u];
        obj.getClass();
        Object p = p((Object[]) obj, i, i2 - 5);
        if (u < 31) {
            int i3 = u + 1;
            if (objArr[i3] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] m = m();
                b00.W(0, 0, i3, objArr, m);
                objArr = m;
            }
        }
        if (p != objArr[u]) {
            Object[] k = k(objArr);
            k[u] = p;
            return k;
        }
        return objArr;
    }

    public final Object[] r(Object[] objArr, int i, int i2, l78 l78Var) {
        Object[] r;
        int u = hma.u(i2 - 1, i);
        if (i == 5) {
            l78Var.a = objArr[u];
            r = null;
        } else {
            Object obj = objArr[u];
            obj.getClass();
            r = r((Object[]) obj, i - 5, i2, l78Var);
        }
        if (r == null && u == 0) {
            return null;
        }
        Object[] k = k(objArr);
        k[u] = r;
        return k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return A(new c3(1, collection));
    }

    public final void s(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.C = objArr;
            this.D = i;
            this.d = i2;
            return;
        }
        l78 l78Var = new l78(null);
        objArr.getClass();
        Object[] r = r(objArr, i2, i, l78Var);
        r.getClass();
        Object obj = l78Var.a;
        obj.getClass();
        this.C = (Object[]) obj;
        this.D = i;
        if (r[1] == null) {
            this.f = (Object[]) r[0];
            this.d = i2 - 5;
            return;
        }
        this.f = r;
        this.d = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        iue.K(i, a());
        if (E() <= i) {
            Object[] k = k(this.C);
            if (k != this.C) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            Object obj2 = k[i2];
            k[i2] = obj;
            this.C = k;
            return obj2;
        }
        l78 l78Var = new l78(null);
        Object[] objArr = this.f;
        objArr.getClass();
        this.f = F(objArr, this.d, i, obj, l78Var);
        return l78Var.a;
    }

    public final Object[] t(Object[] objArr, int i, int i2, Iterator it) {
        boolean z;
        if (!it.hasNext()) {
            e39.a("invalid buffersIterator");
        }
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            e39.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] k = k(objArr);
        int u = hma.u(i, i2);
        int i3 = i2 - 5;
        k[u] = t((Object[]) k[u], i, i3, it);
        while (true) {
            u++;
            if (u >= 32 || !it.hasNext()) {
                break;
            }
            k[u] = t((Object[]) k[u], 0, i3, it);
        }
        return k;
    }

    public final Object[] u(Object[] objArr, int i, Object[][] objArr2) {
        Object[] k;
        Iterator b2Var = new b2(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 < (1 << i3)) {
            k = t(objArr, i, i3, b2Var);
        } else {
            k = k(objArr);
        }
        while (b2Var.hasNext()) {
            this.d += 5;
            k = n(k);
            int i4 = this.d;
            t(k, 1 << i4, i4, b2Var);
        }
        return k;
    }

    public final void v(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.D;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.f = w(this.d + 5, n(objArr), objArr2);
            this.C = objArr3;
            this.d += 5;
            this.D++;
        } else if (objArr == null) {
            this.f = objArr2;
            this.C = objArr3;
            this.D = i + 1;
        } else {
            this.f = w(i3, objArr, objArr2);
            this.C = objArr3;
            this.D++;
        }
    }

    public final Object[] w(int i, Object[] objArr, Object[] objArr2) {
        int u = hma.u(a() - 1, i);
        Object[] k = k(objArr);
        if (i == 5) {
            k[u] = objArr2;
            return k;
        }
        k[u] = w(i - 5, (Object[]) k[u], objArr2);
        return k;
    }

    public final int x(xt4 xt4Var, Object[] objArr, int i, int i2, l78 l78Var, ArrayList arrayList, ArrayList arrayList2) {
        Object[] m;
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = l78Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) xt4Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    if (!arrayList.isEmpty()) {
                        m = (Object[]) a82.h(1, arrayList);
                    } else {
                        m = m();
                    }
                    objArr3 = m;
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        l78Var.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int y(xt4 xt4Var, Object[] objArr, int i, l78 l78Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) xt4Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = k(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        l78Var.a = objArr2;
        return i2;
    }

    public final int z(xt4 xt4Var, int i, l78 l78Var) {
        int y = y(xt4Var, this.C, i, l78Var);
        Object obj = l78Var.a;
        if (y == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, y, i, (Object) null);
        this.C = objArr;
        this.D -= i - y;
        return y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int H = H();
        if (H < 32) {
            Object[] k = k(this.C);
            k[H] = obj;
            this.C = k;
            this.D = a() + 1;
        } else {
            v(this.f, this.C, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int H = H();
        Iterator it = collection.iterator();
        if (32 - H >= collection.size()) {
            Object[] k = k(this.C);
            d(k, H, it);
            this.C = k;
            this.D = collection.size() + this.D;
            return true;
        }
        int size = ((collection.size() + H) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] k2 = k(this.C);
        d(k2, H, it);
        objArr[0] = k2;
        for (int i = 1; i < size; i++) {
            Object[] m = m();
            d(m, 0, it);
            objArr[i] = m;
        }
        this.f = u(this.f, E(), objArr);
        Object[] m2 = m();
        d(m2, 0, it);
        this.C = m2;
        this.D = collection.size() + this.D;
        return true;
    }
}
