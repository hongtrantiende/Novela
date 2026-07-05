package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qxd  reason: default package */
/* loaded from: classes.dex */
public final class qxd {
    public final syd a = syd.b;
    public final String b;

    public qxd(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qxd) {
            qxd qxdVar = (qxd) obj;
            if (this.a.equals(qxdVar.a) && this.b.equals(qxdVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }
}
