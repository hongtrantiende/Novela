package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cd8  reason: default package */
/* loaded from: classes3.dex */
public final class cd8 extends ed8 {
    public final Throwable C;
    public final String c;
    public final ii5 d;
    public final String e;
    public final sw3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd8(String str, ii5 ii5Var, String str2, sw3 sw3Var, Throwable th) {
        super("Authentication failed. ".concat(str), th);
        ii5Var.getClass();
        this.c = str;
        this.d = ii5Var;
        this.e = str2;
        this.f = sw3Var;
        this.C = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd8)) {
            return false;
        }
        cd8 cd8Var = (cd8) obj;
        if (c16.i(this.c, cd8Var.c) && c16.i(this.d, cd8Var.d) && c16.i(this.e, cd8Var.e) && c16.i(this.f, cd8Var.f) && c16.i(this.C, cd8Var.C)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ed8, java.lang.Throwable
    public final Throwable getCause() {
        return this.C;
    }

    @Override // defpackage.ed8, java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int a = hl5.a(this.d.a, this.c.hashCode() * 31, 31);
        int i = 0;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        sw3 sw3Var = this.f;
        if (sw3Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = sw3Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Throwable th = this.C;
        if (th != null) {
            i = th.hashCode();
        }
        return i3 + i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "UnsuccessfulTokenRequest(message=" + this.c + ", statusCode=" + this.d + ", body=" + this.e + ", errorResponse=" + this.f + ", cause=" + this.C + ")";
    }
}
