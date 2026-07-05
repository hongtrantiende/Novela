package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x96  reason: default package */
/* loaded from: classes.dex */
public final class x96 implements Comparable {
    public static final x96 b = new x96();
    public final int a = 132096;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x96 x96Var = (x96) obj;
        x96Var.getClass();
        return this.a - x96Var.a;
    }

    public final boolean equals(Object obj) {
        x96 x96Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof x96) {
            x96Var = (x96) obj;
        } else {
            x96Var = null;
        }
        if (x96Var != null && this.a == x96Var.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.4.0";
    }
}
