package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tw3  reason: default package */
/* loaded from: classes.dex */
public final class tw3 implements wp5 {
    public final ml5 a;
    public final jp5 b;
    public final Throwable c;

    public tw3(ml5 ml5Var, jp5 jp5Var, Throwable th) {
        this.a = ml5Var;
        this.b = jp5Var;
        this.c = th;
    }

    @Override // defpackage.wp5
    public final jp5 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tw3) {
                tw3 tw3Var = (tw3) obj;
                if (!c16.i(this.a, tw3Var.a) || !c16.i(this.b, tw3Var.b) || !this.c.equals(tw3Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        ml5 ml5Var = this.a;
        if (ml5Var == null) {
            hashCode = 0;
        } else {
            hashCode = ml5Var.hashCode();
        }
        int hashCode2 = this.b.hashCode();
        return this.c.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }
}
