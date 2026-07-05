package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bd8  reason: default package */
/* loaded from: classes3.dex */
public final class bd8 extends ed8 {
    public final String c;
    public final Throwable d;

    public bd8(String str, Throwable th) {
        super(str, th);
        this.c = str;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd8)) {
            return false;
        }
        bd8 bd8Var = (bd8) obj;
        if (c16.i(this.c, bd8Var.c) && c16.i(this.d, bd8Var.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ed8, java.lang.Throwable
    public final Throwable getCause() {
        return this.d;
    }

    @Override // defpackage.ed8, java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.c.hashCode() * 31;
        Throwable th = this.d;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "TechnicalFailure(message=" + this.c + ", cause=" + this.d + ")";
    }
}
