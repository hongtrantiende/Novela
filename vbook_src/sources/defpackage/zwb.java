package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zwb  reason: default package */
/* loaded from: classes3.dex */
public final class zwb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;
    public final int f;
    public final List g;

    public zwb(boolean z, boolean z2, boolean z3, List list, List list2, int i, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = list2;
        this.f = i;
        this.g = list3;
    }

    public static zwb a(zwb zwbVar, boolean z, boolean z2, boolean z3, List list, List list2, int i, List list3, int i2) {
        if ((i2 & 1) != 0) {
            z = zwbVar.a;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            z2 = zwbVar.b;
        }
        boolean z5 = z2;
        if ((i2 & 4) != 0) {
            z3 = zwbVar.c;
        }
        boolean z6 = z3;
        if ((i2 & 8) != 0) {
            list = zwbVar.d;
        }
        List list4 = list;
        if ((i2 & 16) != 0) {
            list2 = zwbVar.e;
        }
        List list5 = list2;
        if ((i2 & 32) != 0) {
            i = zwbVar.f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            list3 = zwbVar.g;
        }
        List list6 = list3;
        zwbVar.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        return new zwb(z4, z5, z6, list4, list5, i3, list6);
    }

    public final List b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwb)) {
            return false;
        }
        zwb zwbVar = (zwb) obj;
        if (this.a == zwbVar.a && this.b == zwbVar.b && this.c == zwbVar.c && c16.i(this.d, zwbVar.d) && c16.i(this.e, zwbVar.e) && this.f == zwbVar.f && c16.i(this.g, zwbVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + hl5.a(this.f, eub.l(eub.l(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("TextQtNERAnalyzerState(isAnalyzing=", this.a, ", isAnalyzeFinished=", this.b, ", isSaving=");
        p.append(this.c);
        p.append(", analyzeEngines=");
        p.append(this.d);
        p.append(", translateEngines=");
        p.append(this.e);
        p.append(", analyzeProgress=");
        p.append(this.f);
        p.append(", analyzeResult=");
        return rs8.n(p, this.g, ")");
    }
}
