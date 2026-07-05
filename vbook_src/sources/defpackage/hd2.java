package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hd2  reason: default package */
/* loaded from: classes.dex */
public final class hd2 extends nmd {
    public final lk0 f;

    public hd2(lk0 lk0Var) {
        this.f = lk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hd2) && c16.i(this.f, ((hd2) obj).f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f.a);
    }

    @Override // defpackage.nmd
    public final int t(int i, int i2, tc6 tc6Var, mw8 mw8Var, int i3) {
        return this.f.a(i2, i, tc6Var);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f + ")";
    }
}
