package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xu5  reason: default package */
/* loaded from: classes.dex */
public final class xu5 implements xr {
    public final xl3 a;
    public final yo9 b;
    public final long c;

    public xu5(xl3 xl3Var, yo9 yo9Var, long j) {
        this.a = xl3Var;
        this.b = yo9Var;
        this.c = j;
        if (xl3Var instanceof arc) {
            arc arcVar = (arc) xl3Var;
            if (arcVar.a != 0 || arcVar.b != 0) {
                return;
            }
        } else if (xl3Var instanceof yqa) {
            if (((yqa) xl3Var).a != 0) {
                return;
            }
        } else if (!(xl3Var instanceof e96) || ((e96) xl3Var).a.a != 0) {
            return;
        }
        vs.m("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ju0, java.lang.Object, o4d] */
    @Override // defpackage.xr
    public final o4d a(drc drcVar) {
        q4d a = this.a.a(drcVar);
        ?? obj = new Object();
        obj.c = a;
        obj.d = this.b;
        obj.a = (a.g() + a.o()) * 1000000;
        obj.b = this.c * 1000000;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xu5) {
            xu5 xu5Var = (xu5) obj;
            if (xu5Var.a.equals(this.a) && xu5Var.b == this.b && xu5Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Long.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }
}
