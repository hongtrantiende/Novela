package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dd8  reason: default package */
/* loaded from: classes3.dex */
public final class dd8 extends ed8 {
    public final String c;

    public dd8(String str) {
        super(str, null);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dd8) && c16.i(this.c, ((dd8) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ed8, java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return hl5.n("UnsupportedFormat(message=", this.c, ")");
    }
}
