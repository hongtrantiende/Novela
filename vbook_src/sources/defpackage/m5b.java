package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m5b  reason: default package */
/* loaded from: classes.dex */
public final class m5b {
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final gpb e;
    public final l5b f;
    public final l5b g;
    public final j5b h;

    public m5b(int i, long j, long j2, long j3, gpb gpbVar, l5b l5bVar, l5b l5bVar2, j5b j5bVar) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = gpbVar;
        this.f = l5bVar;
        this.g = l5bVar2;
        this.h = j5bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m5b) {
                m5b m5bVar = (m5b) obj;
                if (this.a == m5bVar.a && zl1.c(this.b, m5bVar.b) && zl1.c(this.c, m5bVar.c) && e4c.a(this.d, m5bVar.d) && c16.i(this.e, m5bVar.e) && this.f.equals(m5bVar.f) && this.g.equals(m5bVar.g) && this.h.equals(m5bVar.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = zl1.j;
        int c = hl5.c(hl5.c(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        f4c[] f4cVarArr = e4c.b;
        int c2 = hl5.c(c, this.d, 31);
        gpb gpbVar = this.e;
        if (gpbVar == null) {
            i = 0;
        } else {
            i = gpbVar.a;
        }
        int hashCode = this.f.hashCode();
        int hashCode2 = this.g.hashCode();
        return this.h.hashCode() + ((hashCode2 + ((hashCode + ((c2 + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String a = tlb.a(this.a);
        String i = zl1.i(this.b);
        String i2 = zl1.i(this.c);
        String e = e4c.e(this.d);
        StringBuilder y = nk2.y("Style(textAlign=", a, ", color=", i, ", backgroundColor=");
        nk2.C(y, i2, ", fontSize=", e, ", textDecoration=");
        y.append(this.e);
        y.append(", padding=");
        y.append(this.f);
        y.append(", margin=");
        y.append(this.g);
        y.append(", borders=");
        y.append(this.h);
        y.append(")");
        return y.toString();
    }
}
