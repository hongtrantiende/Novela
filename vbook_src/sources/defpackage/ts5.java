package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ts5  reason: default package */
/* loaded from: classes.dex */
public abstract class ts5 extends is5 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient qs5 b;

    public static int h(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        wq9.r("collection too large", z);
        return 1073741824;
    }

    public static ts5 i(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int h = h(i);
                Object[] objArr2 = new Object[h];
                int i2 = h - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int A = nqe.A(hashCode);
                        while (true) {
                            int i6 = A & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                A++;
                            }
                        }
                    } else {
                        xk5.k(a82.j(i5, "at index "));
                        return null;
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new xma(obj3);
                } else if (h(i4) < h / 2) {
                    return i(i4, objArr);
                } else {
                    int length = objArr.length;
                    if (i4 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new tm9(i3, i2, i4, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new xma(obj4);
        }
        return tm9.F;
    }

    public static ts5 j(Collection collection) {
        if ((collection instanceof ts5) && !(collection instanceof SortedSet)) {
            ts5 ts5Var = (ts5) collection;
            if (!ts5Var.f()) {
                return ts5Var;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    public static ts5 l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        boolean z;
        if (objArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        wq9.r("the total number of elements must fit in an int", z);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return i(length, objArr2);
    }

    @Override // defpackage.is5
    public qs5 a() {
        qs5 qs5Var = this.b;
        if (qs5Var == null) {
            qs5 k = k();
            this.b = k;
            return k;
        }
        return qs5Var;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ts5) && (this instanceof tm9) && (((ts5) obj) instanceof tm9) && ((tm9) this).e != obj.hashCode()) {
            return false;
        }
        return hif.m(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return hif.p(this);
    }

    public qs5 k() {
        Object[] array = toArray(is5.a);
        ms5 ms5Var = qs5.b;
        return qs5.h(array.length, array);
    }
}
