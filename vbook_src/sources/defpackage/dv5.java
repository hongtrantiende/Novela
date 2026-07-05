package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dv5  reason: default package */
/* loaded from: classes.dex */
public final class dv5 {
    public static final dv5 f;
    public final float a;
    public final float b;
    public final float c;
    public final akc d;
    public final akc e;

    static {
        akc akcVar = akc.f;
        akc akcVar2 = akc.f;
        f = new dv5(1.0f, 1.0f, 1.0f, akcVar2, akcVar2);
    }

    public dv5(float f2, float f3, float f4, akc akcVar, akc akcVar2) {
        akcVar.getClass();
        akcVar2.getClass();
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = akcVar;
        this.e = akcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv5)) {
            return false;
        }
        dv5 dv5Var = (dv5) obj;
        if (Float.compare(this.a, dv5Var.a) == 0 && Float.compare(this.b, dv5Var.b) == 0 && Float.compare(this.c, dv5Var.c) == 0 && c16.i(this.d, dv5Var.d) && c16.i(this.e, dv5Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d = nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
        return this.e.hashCode() + ((this.d.hashCode() + d) * 31);
    }

    public final String toString() {
        return "InitialZoom(minScale=" + this.a + ", mediumScale=" + this.b + ", maxScale=" + this.c + ", baseTransform=" + this.d + ", userTransform=" + this.e + ')';
    }
}
