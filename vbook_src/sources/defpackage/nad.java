package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nad  reason: default package */
/* loaded from: classes3.dex */
public final class nad extends oad {
    public final xic a;

    public nad(xic xicVar) {
        xicVar.getClass();
        this.a = xicVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nad) && c16.i(this.a, ((nad) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(content=" + this.a + ")";
    }
}
