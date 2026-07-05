package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gwb  reason: default package */
/* loaded from: classes3.dex */
public final class gwb extends wh8 {
    public final int d;
    public final String e;
    public final int f;
    public final iwb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwb(int i, String str, int i2, iwb iwbVar) {
        super(rs8.k("text_", i, iwbVar.a, "_"), str, i);
        iwbVar.getClass();
        this.d = i;
        this.e = str;
        this.f = i2;
        this.g = iwbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwb)) {
            return false;
        }
        gwb gwbVar = (gwb) obj;
        if (this.d == gwbVar.d && c16.i(this.e, gwbVar.e) && this.f == gwbVar.f && c16.i(this.g, gwbVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + hl5.a(this.f, eub.j(Integer.hashCode(this.d) * 31, 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder r = s21.r("TextPage(chapterIndex=", this.d, ", chapterName=", this.e, ", pageCount=");
        r.append(this.f);
        r.append(", page=");
        r.append(this.g);
        r.append(")");
        return r.toString();
    }
}
