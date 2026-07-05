package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fsa  reason: default package */
/* loaded from: classes3.dex */
public final class fsa {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final e4d i;
    public final hsa j;
    public final float k;
    public final float l;
    public final int m;

    public fsa(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, e4d e4dVar, hsa hsaVar, float f9, float f10, int i) {
        hsaVar.getClass();
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = e4dVar;
        this.j = hsaVar;
        this.k = f9;
        this.l = f10;
        this.m = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fsa) {
                fsa fsaVar = (fsa) obj;
                if (Float.compare(this.a, fsaVar.a) != 0 || Float.compare(this.b, fsaVar.b) != 0 || Float.compare(this.c, fsaVar.c) != 0 || Float.compare(this.d, fsaVar.d) != 0 || Float.compare(this.e, fsaVar.e) != 0 || Float.compare(this.f, fsaVar.f) != 0 || Float.compare(this.g, fsaVar.g) != 0 || Float.compare(this.h, fsaVar.h) != 0 || !this.i.equals(fsaVar.i) || this.j != fsaVar.j || Float.compare(this.k, fsaVar.k) != 0 || Float.compare(this.l, fsaVar.l) != 0 || this.m != fsaVar.m) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = nk2.d(this.h, nk2.d(this.g, nk2.d(this.f, nk2.d(this.e, nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
        int hashCode = this.j.hashCode();
        return Integer.hashCode(this.m) + nk2.d(this.l, nk2.d(this.k, (hashCode + ((this.i.hashCode() + d) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("SolidConfig(cx=", this.a, ", cy=", this.b, ", fx1=");
        s21.D(x, this.c, ", fx2=", this.d, ", fy1=");
        s21.D(x, this.e, ", fy2=", this.f, ", ampX=");
        s21.D(x, this.g, ", ampY=", this.h, ", rotSpeeds=");
        x.append(this.i);
        x.append(", solidType=");
        x.append(this.j);
        x.append(", depth=");
        s21.D(x, this.k, ", scale=", this.l, ", colorIdx=");
        return rs8.g(this.m, ")", x);
    }
}
