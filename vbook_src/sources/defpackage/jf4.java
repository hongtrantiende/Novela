package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jf4  reason: default package */
/* loaded from: classes3.dex */
public final class jf4 extends c16 {
    public final int h;
    public final int i;
    public final String j;
    public final String k;

    public jf4(String str, int i, int i2, String str2) {
        str2.getClass();
        this.h = i;
        this.i = i2;
        this.j = str;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jf4) {
                jf4 jf4Var = (jf4) obj;
                if (this.h != jf4Var.h || this.i != jf4Var.i || !this.j.equals(jf4Var.j) || !c16.i(this.k, jf4Var.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.k.hashCode() + eub.j(hl5.a(this.i, Integer.hashCode(this.h) * 31, 31), 31, this.j);
    }

    public final String toString() {
        return nk2.w(hl5.r(this.h, this.i, "Replace(start=", ", end=", ", oldText="), this.j, ", newText=", this.k, ")");
    }
}
