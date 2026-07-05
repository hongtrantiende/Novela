package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ph8  reason: default package */
/* loaded from: classes.dex */
public final class ph8 implements wy4 {
    public final mh8 a;
    public final mh8 b;
    public final mh8 c;
    public final mh8 d;
    public final mh8 e;
    public final mh8 f;

    public /* synthetic */ ph8(mh8 mh8Var, mh8 mh8Var2, mh8 mh8Var3, mh8 mh8Var4) {
        this(new mh8(3, (float) nae.e), mh8Var, mh8Var2, new mh8(3, (float) nae.e), mh8Var3, mh8Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph8)) {
            return false;
        }
        ph8 ph8Var = (ph8) obj;
        if (c16.i(this.a, ph8Var.a) && c16.i(this.b, ph8Var.b) && c16.i(this.c, ph8Var.c) && c16.i(this.d, ph8Var.d) && c16.i(this.e, ph8Var.e) && c16.i(this.f, ph8Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.a + ", start=" + this.b + ", top=" + this.c + ", right=" + this.d + ", end=" + this.e + ", bottom=" + this.f + ')';
    }

    public ph8(mh8 mh8Var, mh8 mh8Var2, mh8 mh8Var3, mh8 mh8Var4, mh8 mh8Var5, mh8 mh8Var6) {
        this.a = mh8Var;
        this.b = mh8Var2;
        this.c = mh8Var3;
        this.d = mh8Var4;
        this.e = mh8Var5;
        this.f = mh8Var6;
    }
}
