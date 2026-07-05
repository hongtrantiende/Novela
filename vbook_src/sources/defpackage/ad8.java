package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ad8  reason: default package */
/* loaded from: classes3.dex */
public final class ad8 extends ed8 {
    public final String c;

    public ad8(String str) {
        super("Invalid URL: ".concat(str), null);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ad8) || !c16.i(this.c, ((ad8) obj).c)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.ed8, java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode * 31;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return hl5.n("InvalidUrl(url=", this.c, ", cause=null)");
    }
}
