package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e3a  reason: default package */
/* loaded from: classes.dex */
public final class e3a {
    public final int a;
    public final float b;
    public final wea c;
    public final float d;
    public final long e;
    public final f3a f;
    public final g3a g;

    public e3a(int i, float f, wea weaVar, float f2, long j, f3a f3aVar, g3a g3aVar) {
        weaVar.getClass();
        g3aVar.getClass();
        this.a = i;
        this.b = f;
        this.c = weaVar;
        this.d = f2;
        this.e = j;
        this.f = f3aVar;
        this.g = g3aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e3a) {
                e3a e3aVar = (e3a) obj;
                if (this.a != e3aVar.a || !rg3.b(this.b, e3aVar.b) || !c16.i(this.c, e3aVar.c) || !rg3.b(this.d, e3aVar.d) || !zl1.c(this.e, e3aVar.e) || this.f != e3aVar.f || this.g != e3aVar.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = nk2.d(this.b, hl5.a(this.a, Integer.hashCode(500) * 31, 31), 31);
        int d2 = nk2.d(this.d, (this.c.hashCode() + d) * 31, 31);
        int i = zl1.j;
        int c = hl5.c(d2, this.e, 31);
        return this.g.hashCode() + ((this.f.hashCode() + c) * 31);
    }

    public final String toString() {
        String c = rg3.c(this.b);
        String c2 = rg3.c(this.d);
        String i = zl1.i(this.e);
        StringBuilder r = s21.r("ScrollbarLayoutSettings(durationAnimationMillis=500, hideDelayMillis=", this.a, ", scrollbarPadding=", c, ", thumbShape=");
        r.append(this.c);
        r.append(", thumbThickness=");
        r.append(c2);
        r.append(", thumbColor=");
        r.append(i);
        r.append(", side=");
        r.append(this.f);
        r.append(", selectionActionable=");
        r.append(this.g);
        r.append(")");
        return r.toString();
    }
}
