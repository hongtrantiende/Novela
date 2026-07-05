package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ql5  reason: default package */
/* loaded from: classes3.dex */
public final class ql5 implements fe2 {
    public final String a = "";

    @Override // defpackage.hn0
    public final String c() {
        return "image";
    }

    @Override // defpackage.hn0
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ql5) || !this.a.equals(((ql5) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("ImageBlockType(unused=", this.a, ")");
    }
}
