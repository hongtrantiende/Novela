package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ap9  reason: default package */
/* loaded from: classes.dex */
public final class ap9 implements lf4 {
    public final arc a;
    public final yo9 b;
    public final long c;

    public ap9(arc arcVar, yo9 yo9Var, long j) {
        this.a = arcVar;
        this.b = yo9Var;
        this.c = j;
    }

    @Override // defpackage.xr
    public final o4d a(drc drcVar) {
        return new u4d(this.a.a(drcVar), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ap9) {
            ap9 ap9Var = (ap9) obj;
            if (ap9Var.a.equals(this.a) && ap9Var.b == this.b && ap9Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Long.hashCode(this.c) + ((hashCode + ((this.a.hashCode() + 93) * 31)) * 31);
    }
}
