package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ax5  reason: default package */
/* loaded from: classes3.dex */
public final class ax5 implements t97 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public ax5(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i + i2;
    }

    @Override // defpackage.t97
    public final String a() {
        return this.a;
    }

    @Override // defpackage.t97
    public final int b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ax5) {
                ax5 ax5Var = (ax5) obj;
                if (!this.a.equals(ax5Var.a) || this.b != ax5Var.b || this.c != ax5Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rs8.g(this.c, ")", s21.s("InsertForwardEdit(blockId=", pm0.a(this.a), ", start=", this.b, ", insertedLength="));
    }
}
