package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gn0  reason: default package */
/* loaded from: classes3.dex */
public final class gn0 implements hn0 {
    public final boolean a;

    public gn0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.hn0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.hn0
    public final String c() {
        return "todo";
    }

    @Override // defpackage.hn0
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gn0) && this.a == ((gn0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "Todo(checked=" + this.a + ")";
    }
}
