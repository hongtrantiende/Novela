package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fy1  reason: default package */
/* loaded from: classes.dex */
public final class fy1 extends ef8 implements Serializable {
    public final Comparator[] a;

    public fy1(k01 k01Var, k01 k01Var2) {
        this.a = new Comparator[]{k01Var, k01Var2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fy1) {
            return Arrays.equals(this.a, ((fy1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return s21.q(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
