package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ks5  reason: default package */
/* loaded from: classes.dex */
public final class ks5 implements Serializable {
    public static final ks5 c = new ks5(new int[0]);
    public final int[] a;
    public final int b;

    public ks5(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public final boolean equals(Object obj) {
        ks5 ks5Var;
        int i;
        int i2;
        if (obj != this) {
            if ((obj instanceof ks5) && (i2 = this.b) == (i = (ks5Var = (ks5) obj).b)) {
                for (int i3 = 0; i3 < i2; i3++) {
                    wq9.w(i3, i2);
                    int i4 = this.a[i3];
                    wq9.w(i3, i);
                    if (i4 == ks5Var.a[i3]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
