package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: um3  reason: default package */
/* loaded from: classes.dex */
public final class um3 implements z3d {
    public final hm8 a;

    public um3(hm8 hm8Var) {
        this.a = hm8Var;
    }

    @Override // defpackage.z3d
    public final Object a(xt8 xt8Var) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof um3) && this.a == ((um3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ")";
    }
}
