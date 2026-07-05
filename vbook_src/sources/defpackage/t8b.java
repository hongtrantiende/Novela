package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t8b  reason: default package */
/* loaded from: classes.dex */
public final class t8b implements wp5 {
    public final ml5 a;
    public final jp5 b;
    public final hg2 c;
    public final h97 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public t8b(ml5 ml5Var, jp5 jp5Var, hg2 hg2Var, h97 h97Var, String str, boolean z, boolean z2) {
        this.a = ml5Var;
        this.b = jp5Var;
        this.c = hg2Var;
        this.d = h97Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.wp5
    public final jp5 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8b)) {
            return false;
        }
        t8b t8bVar = (t8b) obj;
        if (c16.i(this.a, t8bVar.a) && c16.i(this.b, t8bVar.b) && this.c == t8bVar.c && c16.i(this.d, t8bVar.d) && c16.i(this.e, t8bVar.e) && this.f == t8bVar.f && this.g == t8bVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = 0;
        h97 h97Var = this.d;
        if (h97Var == null) {
            hashCode = 0;
        } else {
            hashCode = h97Var.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return Boolean.hashCode(this.g) + eub.k((i2 + i) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        rs8.y(sb, this.e, ", isSampled=", this.f, ", isPlaceholderCached=");
        return rs8.m(")", sb, this.g);
    }
}
