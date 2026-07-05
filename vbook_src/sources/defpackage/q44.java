package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q44  reason: default package */
/* loaded from: classes3.dex */
public final class q44 extends s44 {
    public final String a;
    public final String b;

    public q44(String str, String str2) {
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
            if (obj instanceof q44) {
                q44 q44Var = (q44) obj;
                if (!c16.i(this.a, q44Var.a) || !this.b.equals(q44Var.b)) {
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
        return hl5.o("Error(log=", this.a, ", message=", this.b, ")");
    }
}
