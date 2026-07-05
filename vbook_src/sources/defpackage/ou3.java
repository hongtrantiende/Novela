package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ou3  reason: default package */
/* loaded from: classes3.dex */
public final class ou3 extends n09 {
    public final t9a l;
    public final mfb m;

    public ou3(String str, int i) {
        super(str, null, i);
        this.l = t9a.f;
        this.m = new mfb(new hm(i, str, this, 2));
    }

    @Override // defpackage.n09, defpackage.o9a
    public final bze e() {
        return this.l;
    }

    @Override // defpackage.n09
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof o9a)) {
                o9a o9aVar = (o9a) obj;
                if (o9aVar.e() != t9a.f || !this.a.equals(o9aVar.a()) || !c16.i(q1d.e(this), q1d.e(o9aVar))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.n09
    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode();
        b2 b2Var = new b2(this);
        int i2 = 1;
        while (b2Var.hasNext()) {
            int i3 = i2 * 31;
            String str = (String) b2Var.next();
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    @Override // defpackage.n09, defpackage.o9a
    public final o9a i(int i) {
        return ((o9a[]) this.m.getValue())[i];
    }

    @Override // defpackage.n09
    public final String toString() {
        return sl1.i0(new eu5(this, 2), ", ", this.a.concat("("), ")", null, 56);
    }
}
