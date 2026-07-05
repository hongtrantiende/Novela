package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iwb  reason: default package */
/* loaded from: classes3.dex */
public final class iwb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final int g;

    public iwb(int i, int i2, int i3, int i4, int i5, ArrayList arrayList, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = arrayList;
        this.g = i6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iwb) {
            iwb iwbVar = (iwb) obj;
            if (iwbVar.g == this.g && iwbVar.a == this.a && iwbVar.b == this.b && iwbVar.c == this.c && iwbVar.d == this.d && iwbVar.e == this.e && iwbVar.f.size() == this.f.size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.size() + hl5.a(this.e, ((((((((this.g * 31) + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31, 31);
    }

    public final String toString() {
        String a = tlb.a(this.e);
        StringBuilder r = hl5.r(this.a, this.b, "Page(index=", ", start=", ", end=");
        rs8.q(this.c, this.d, ", columnCount=", ", textAlign=", r);
        r.append(a);
        r.append(", columns=");
        r.append(this.f);
        r.append(", hash=");
        return rs8.g(this.g, ")", r);
    }
}
