package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dee  reason: default package */
/* loaded from: classes.dex */
public abstract class dee extends hwd implements Set {
    public static final /* synthetic */ int D = 0;
    public transient vde C;

    public static dee n(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int p = p(i);
                Object[] objArr2 = new Object[p];
                int i2 = p - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
                        while (true) {
                            int i6 = rotateLeft & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            } else if (!obj2.equals(obj)) {
                                rotateLeft++;
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
                    return new fge(obj3);
                }
                if (p(i4) < p / 2) {
                    return n(i4, objArr);
                }
                if (i4 <= 0) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new qfe(i3, i2, i4, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new fge(obj4);
        }
        return qfe.K;
    }

    public static int p(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            vs.m("collection too large");
            return 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof dee) || !(this instanceof qfe) || !(((dee) obj) instanceof qfe) || ((qfe) this).F == obj.hashCode()) {
                if (obj != this) {
                    if (obj instanceof Set) {
                        Set set = (Set) obj;
                        try {
                            if (size() == set.size()) {
                                if (containsAll(set)) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        } catch (ClassCastException | NullPointerException unused) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return cae.B(this);
    }

    public vde r() {
        vde vdeVar = this.C;
        if (vdeVar == null) {
            vde s = s();
            this.C = s;
            return s;
        }
        return vdeVar;
    }

    public vde s() {
        Object[] array = toArray(hwd.f);
        wce wceVar = vde.C;
        return vde.r(array.length, array);
    }
}
