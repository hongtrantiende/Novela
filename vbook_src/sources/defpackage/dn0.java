package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dn0  reason: default package */
/* loaded from: classes3.dex */
public final class dn0 implements hn0 {
    public final int a;

    public dn0(int i) {
        this.a = i;
        if (i >= 1) {
            return;
        }
        p1a.k(a82.j(i, "NumberedList number must be >= 1, got "));
        throw null;
    }

    @Override // defpackage.hn0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.hn0
    public final String c() {
        return "numbered_list";
    }

    @Override // defpackage.hn0
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dn0) && this.a == ((dn0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.l("NumberedList(number=", ")", this.a);
    }
}
