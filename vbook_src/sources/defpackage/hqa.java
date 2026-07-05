package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hqa  reason: default package */
/* loaded from: classes.dex */
public final class hqa extends d3 {
    public static final hqa b = new hqa(new Object[0]);
    public final Object[] a;

    public hqa(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.v0
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.d3
    public final d3 b(int i, Object obj) {
        Object[] objArr = this.a;
        iue.L(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            b00.a0(0, i, 6, objArr, objArr2);
            b00.W(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new hqa(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        b00.W(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new ju8(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.d3
    public final d3 c(Object obj) {
        Object[] objArr = this.a;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new hqa(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new ju8(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.d3
    public final d3 d(Collection collection) {
        Object[] objArr = this.a;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            int length = objArr.length;
            for (Object obj : collection) {
                copyOf[length] = obj;
                length++;
            }
            return new hqa(copyOf);
        }
        ku8 e = e();
        e.addAll(collection);
        return e.c();
    }

    @Override // defpackage.d3
    public final ku8 e() {
        return new ku8(this, null, this.a, 0);
    }

    @Override // defpackage.d3
    public final d3 f(c3 c3Var) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) c3Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return b;
        }
        return new hqa(b00.e0(objArr2, 0, length));
    }

    @Override // defpackage.d3
    public final d3 g(int i) {
        Object[] objArr = this.a;
        iue.K(i, objArr.length);
        if (objArr.length == 1) {
            return b;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        b00.W(i, i + 1, objArr.length, objArr, copyOf);
        return new hqa(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.a;
        iue.K(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.d3
    public final d3 h(int i, Object obj) {
        Object[] objArr = this.a;
        iue.K(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new hqa(copyOf);
    }

    @Override // defpackage.e2, java.util.List
    public final int indexOf(Object obj) {
        return b00.r0(obj, this.a);
    }

    @Override // defpackage.e2, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.a;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.e2, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.a;
        iue.L(i, objArr.length);
        return new oy0(objArr, i, objArr.length);
    }
}
