package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ybe  reason: default package */
/* loaded from: classes.dex */
public final class ybe extends rbe {
    public final aa9 a;

    public ybe(aa9 aa9Var) {
        this.a = aa9Var;
    }

    @Override // defpackage.rbe
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.rbe
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ybe) {
            return this.a.equals(((ybe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return hl5.n("Optional.of(", this.a.toString(), ")");
    }
}
