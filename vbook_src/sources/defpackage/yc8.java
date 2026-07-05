package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yc8  reason: default package */
/* loaded from: classes3.dex */
public final class yc8 extends ed8 {
    public final String c;

    public yc8(String str) {
        super("Authentication failed. ".concat(str), null);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof yc8) || !c16.i(this.c, ((yc8) obj).c)) {
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

    @Override // defpackage.ed8, java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() * 31;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return hl5.n("AuthenticationFailure(message=", this.c, ", cause=null)");
    }
}
