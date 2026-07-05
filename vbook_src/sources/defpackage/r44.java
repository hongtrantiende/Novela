package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r44  reason: default package */
/* loaded from: classes3.dex */
public final class r44 extends s44 {
    public final String a;
    public final String b;

    public r44(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.s44
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r44) {
                r44 r44Var = (r44) obj;
                if (!c16.i(this.a, r44Var.a) || !this.b.equals(r44Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("Success(log=", this.a, ", data=", this.b, ")");
    }
}
