package defpackage;

import java.util.Arrays;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ju8  reason: default package */
/* loaded from: classes.dex */
public final class ju8 extends d3 {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public ju8(Object[] objArr, Object[] objArr2, int i, int i2) {
        boolean z;
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (a() > 32) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int a = a();
            e39.a("Trie-based persistent vector should have at least 33 elements, got " + a);
        }
        int length = objArr2.length;
    }

    public static Object[] i(Object[] objArr, int i, int i2, Object obj, l78 l78Var) {
        Object[] copyOf;
        int u = hma.u(i2, i);
        if (i == 0) {
            if (u == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            b00.W(u + 1, u, 31, objArr, copyOf);
            l78Var.a = objArr[31];
            copyOf[u] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[u];
        obj2.getClass();
        copyOf2[u] = i((Object[]) obj2, i3, i2, obj, l78Var);
        while (true) {
            u++;
            if (u >= 32 || copyOf2[u] == null) {
                break;
            }
            Object obj3 = objArr[u];
            obj3.getClass();
            copyOf2[u] = i((Object[]) obj3, i3, 0, l78Var.a, l78Var);
        }
        return copyOf2;
    }

    public static Object[] k(Object[] objArr, int i, int i2, l78 l78Var) {
        Object[] k;
        int u = hma.u(i2, i);
        if (i == 5) {
            l78Var.a = objArr[u];
            k = null;
        } else {
            Object obj = objArr[u];
            obj.getClass();
            k = k((Object[]) obj, i - 5, i2, l78Var);
        }
        if (k == null && u == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[u] = k;
        return copyOf;
    }

    public static Object[] s(int i, int i2, Object obj, Object[] objArr) {
        int u = hma.u(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[u] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[u];
        obj2.getClass();
        copyOf[u] = s(i - 5, i2, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // defpackage.v0
    public final int a() {
        return this.c;
    }

    @Override // defpackage.d3
    public final d3 b(int i, Object obj) {
        int i2 = this.c;
        iue.L(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int r = r();
        Object[] objArr = this.a;
        if (i >= r) {
            return j(i - r, obj, objArr);
        }
        l78 l78Var = new l78(null);
        return j(0, l78Var.a, i(objArr, this.d, i, obj, l78Var));
    }

    @Override // defpackage.d3
    public final d3 c(Object obj) {
        int r = r();
        int i = this.c;
        int i2 = i - r;
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new ju8(objArr, copyOf, i + 1, this.d);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return l(objArr, objArr2, objArr3);
    }

    @Override // defpackage.d3
    public final ku8 e() {
        return new ku8(this, this.a, this.b, this.d);
    }

    @Override // defpackage.d3
    public final d3 f(c3 c3Var) {
        ku8 ku8Var = new ku8(this, this.a, this.b, this.d);
        ku8Var.A(c3Var);
        return ku8Var.c();
    }

    @Override // defpackage.d3
    public final d3 g(int i) {
        iue.K(i, a());
        int r = r();
        int i2 = this.d;
        Object[] objArr = this.a;
        if (i >= r) {
            return p(objArr, r, i2, i - r);
        }
        return p(n(objArr, i2, i, new l78(this.b[0])), r, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        iue.K(i, a());
        if (r() <= i) {
            objArr = this.b;
        } else {
            Object[] objArr2 = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[hma.u(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.d3
    public final d3 h(int i, Object obj) {
        int i2 = this.c;
        iue.K(i, i2);
        int r = r();
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int i3 = this.d;
        if (r <= i) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i & 31] = obj;
            return new ju8(objArr, copyOf, i2, i3);
        }
        return new ju8(s(i3, i, obj, objArr), objArr2, i2, i3);
    }

    public final ju8 j(int i, Object obj, Object[] objArr) {
        int r = r();
        int i2 = this.c;
        int i3 = i2 - r;
        Object[] objArr2 = this.b;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            b00.W(i + 1, i, i3, objArr2, copyOf);
            copyOf[i] = obj;
            return new ju8(objArr, copyOf, i2 + 1, this.d);
        }
        Object obj2 = objArr2[31];
        b00.W(i + 1, i, i3 - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, copyOf, objArr3);
    }

    public final ju8 l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i4 = i3 + 5;
            return new ju8(m(i4, objArr4, objArr2), objArr3, i + 1, i4);
        }
        return new ju8(m(i3, objArr, objArr2), objArr3, i + 1, i3);
    }

    @Override // defpackage.e2, java.util.List
    public final ListIterator listIterator(int i) {
        iue.L(i, this.c);
        return new lu8(i, this.c, (this.d / 5) + 1, this.a, this.b);
    }

    public final Object[] m(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int u = hma.u(a() - 1, i);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[u] = objArr2;
            return objArr3;
        }
        objArr3[u] = m(i - 5, (Object[]) objArr3[u], objArr2);
        return objArr3;
    }

    public final Object[] n(Object[] objArr, int i, int i2, l78 l78Var) {
        Object[] copyOf;
        int u = hma.u(i2, i);
        int i3 = 31;
        if (i == 0) {
            if (u == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            b00.W(u, u + 1, 32, objArr, copyOf);
            copyOf[31] = l78Var.a;
            l78Var.a = objArr[u];
            return copyOf;
        }
        if (objArr[31] == null) {
            i3 = hma.u(r() - 1, i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        int i5 = u + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj = copyOf2[i3];
                obj.getClass();
                copyOf2[i3] = n((Object[]) obj, i4, 0, l78Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf2[u];
        obj2.getClass();
        copyOf2[u] = n((Object[]) obj2, i4, i2, l78Var);
        return copyOf2;
    }

    public final d3 p(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        if (i4 == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                }
                return new hqa(objArr);
            }
            l78 l78Var = new l78(null);
            Object[] k = k(objArr, i2, i - 1, l78Var);
            k.getClass();
            Object obj = l78Var.a;
            obj.getClass();
            Object[] objArr2 = (Object[]) obj;
            if (k[1] == null) {
                Object obj2 = k[0];
                obj2.getClass();
                return new ju8((Object[]) obj2, objArr2, i, i2 - 5);
            }
            return new ju8(k, objArr2, i, i2);
        }
        Object[] objArr3 = this.b;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        int i5 = i4 - 1;
        if (i3 < i5) {
            b00.W(i3, i3 + 1, i4, objArr3, copyOf);
        }
        copyOf[i5] = null;
        return new ju8(objArr, copyOf, (i + i4) - 1, i2);
    }

    public final int r() {
        return (this.c - 1) & (-32);
    }
}
