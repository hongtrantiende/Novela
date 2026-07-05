package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k01  reason: default package */
/* loaded from: classes.dex */
public final class k01 extends ef8 implements Serializable {
    public final tu4 a;
    public final ef8 b;

    public k01(tu4 tu4Var, ef8 ef8Var) {
        this.a = tu4Var;
        this.b = ef8Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        tu4 tu4Var = this.a;
        return this.b.compare(tu4Var.apply(obj), tu4Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof k01) {
                k01 k01Var = (k01) obj;
                if (this.a.equals(k01Var.a) && this.b.equals(k01Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
