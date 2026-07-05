package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kwb  reason: default package */
/* loaded from: classes3.dex */
public final class kwb {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final mn h;
    public final mwb i;

    public kwb(long j, int i, int i2, int i3, int i4, int i5, int i6, mn mnVar, mwb mwbVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = mnVar;
        this.i = mwbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kwb)) {
            return false;
        }
        kwb kwbVar = (kwb) obj;
        if (kwbVar.d != this.d || kwbVar.e != this.e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.d * 31) + this.e) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder s = s21.s("Paragraph(offset=", y78.l(this.a), ", textStart=", this.b, ", textEnd=");
        rs8.q(this.c, this.d, ", start=", ", end=", s);
        rs8.q(this.e, this.f, ", width=", ", height=", s);
        s.append(this.g);
        s.append(", textLayoutResult=");
        s.append(this.h);
        s.append(", placeholder=");
        s.append(this.i);
        s.append(")");
        return s.toString();
    }
}
