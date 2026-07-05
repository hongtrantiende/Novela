package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xc8  reason: default package */
/* loaded from: classes.dex */
public final class xc8 extends ed8 {
    public final String c;

    public xc8() {
        super("Authentication cancelled", null);
        this.c = "Authentication cancelled";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xc8) && c16.i(this.c, ((xc8) obj).c)) {
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
        return hl5.n("AuthenticationCancelled(message=", this.c, ")");
    }
}
