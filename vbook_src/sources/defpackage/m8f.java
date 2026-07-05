package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m8f  reason: default package */
/* loaded from: classes.dex */
public abstract class m8f extends u7f implements Set {
    public static final /* synthetic */ int c = 0;
    public transient a8f b;

    public static m8f h(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int i2 = i(i);
                Object[] objArr2 = new Object[i2];
                int i3 = i2 - 1;
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    Object obj = objArr[i6];
                    lpe.z(i6, obj);
                    int hashCode = obj.hashCode();
                    int v = dpe.v(hashCode);
                    while (true) {
                        int i7 = v & i3;
                        Object obj2 = objArr2[i7];
                        if (obj2 == null) {
                            objArr[i5] = obj;
                            objArr2[i7] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        } else if (!obj2.equals(obj)) {
                            v++;
                        }
                    }
                }
                Arrays.fill(objArr, i5, i, (Object) null);
                if (i5 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new aaf(obj3);
                }
                if (i(i5) < i2 / 2) {
                    return h(i5, objArr);
                }
                int length = objArr.length;
                if (i5 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i5);
                }
                return new t9f(i4, i3, i5, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new aaf(obj4);
        }
        return t9f.F;
    }

    public static int i(int i) {
        boolean z;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        vs.m("collection too large");
        return 0;
    }

    @Override // defpackage.u7f
    public a8f e() {
        a8f a8fVar = this.b;
        if (a8fVar == null) {
            a8f j = j();
            this.b = j;
            return j;
        }
        return a8fVar;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m8f) && (this instanceof t9f) && (((m8f) obj) instanceof t9f) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i;
        int i2 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    @Override // defpackage.u7f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public a8f j() {
        Object[] array = toArray(u7f.a);
        x7f x7fVar = a8f.b;
        return a8f.j(array.length, array);
    }
}
