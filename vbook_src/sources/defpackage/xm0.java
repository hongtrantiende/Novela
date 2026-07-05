package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xm0  reason: default package */
/* loaded from: classes3.dex */
public final class xm0 implements q65 {
    public final String a;
    public final cm0 b;
    public final cm0 c;
    public final lo3 d;
    public final lo3 e;

    public xm0(String str, cm0 cm0Var, cm0 cm0Var2, lo3 lo3Var, lo3 lo3Var2) {
        lo3Var.getClass();
        lo3Var2.getClass();
        this.a = str;
        this.b = cm0Var;
        this.c = cm0Var2;
        this.d = lo3Var;
        this.e = lo3Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xm0) {
                xm0 xm0Var = (xm0) obj;
                if (!this.a.equals(xm0Var.a) || !this.b.equals(xm0Var.b) || !this.c.equals(xm0Var.c) || !c16.i(this.d, xm0Var.d) || !c16.i(this.e, xm0Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        return this.e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String a = pm0.a(this.a);
        return "BlockTextEntry(blockId=" + a + ", before=" + this.b + ", after=" + this.c + ", uiBefore=" + this.d + ", uiAfter=" + this.e + ")";
    }
}
