package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j5b  reason: default package */
/* loaded from: classes.dex */
public final class j5b {
    public final i5b a;
    public final i5b b;
    public final i5b c;
    public final i5b d;

    public j5b(i5b i5bVar, i5b i5bVar2, i5b i5bVar3, i5b i5bVar4) {
        i5bVar.getClass();
        i5bVar2.getClass();
        i5bVar3.getClass();
        i5bVar4.getClass();
        this.a = i5bVar;
        this.b = i5bVar2;
        this.c = i5bVar3;
        this.d = i5bVar4;
        zbe.i(nae.e, nae.e, nae.e, nae.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5b)) {
            return false;
        }
        j5b j5bVar = (j5b) obj;
        if (c16.i(this.a, j5bVar.a) && c16.i(this.b, j5bVar.b) && c16.i(this.c, j5bVar.c) && c16.i(this.d, j5bVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Borders(left=" + this.a + ", top=" + this.b + ", bottom=" + this.c + ", right=" + this.d + ")";
    }
}
