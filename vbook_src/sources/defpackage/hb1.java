package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hb1  reason: default package */
/* loaded from: classes3.dex */
public final class hb1 extends ib1 {
    public final Throwable a;

    public hb1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hb1) {
            if (c16.i(this.a, ((hb1) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ib1
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
