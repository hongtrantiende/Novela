package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: arc  reason: default package */
/* loaded from: classes.dex */
public final class arc implements xl3 {
    public final int a;
    public final int b;
    public final mn3 c;

    public arc(int i, mn3 mn3Var, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? on3.a : mn3Var);
    }

    @Override // defpackage.xr
    public final o4d a(drc drcVar) {
        return new p88(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof arc) {
            arc arcVar = (arc) obj;
            if (arcVar.a == this.a && arcVar.b == this.b && c16.i(arcVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.xl3, defpackage.xr
    public final q4d a(drc drcVar) {
        return new p88(this.a, this.b, this.c);
    }

    public arc(int i, int i2, mn3 mn3Var) {
        this.a = i;
        this.b = i2;
        this.c = mn3Var;
    }
}
