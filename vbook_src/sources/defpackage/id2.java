package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: id2  reason: default package */
/* loaded from: classes.dex */
public final class id2 extends nmd {
    public final mk0 f;

    public id2(mk0 mk0Var) {
        this.f = mk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof id2) && c16.i(this.f, ((id2) obj).f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f.a);
    }

    @Override // defpackage.nmd
    public final int t(int i, int i2, tc6 tc6Var, mw8 mw8Var, int i3) {
        return this.f.a(i2, i);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f + ")";
    }
}
