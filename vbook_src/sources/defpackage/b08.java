package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b08  reason: default package */
/* loaded from: classes.dex */
public final class b08 {
    public final d08 a;
    public final List b;
    public final List c;
    public final int d;
    public jq6 e;

    public b08(d08 d08Var, List list, List list2, int i) {
        this.a = d08Var;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        if (this.e == null) {
            jq6 t = tl1.t();
            t.addAll(this.b);
            d08 d08Var = this.a;
            if (d08Var != null) {
                t.add(d08Var);
            }
            t.addAll(this.c);
            this.e = tl1.r(t);
        }
        jq6 jq6Var = this.e;
        jq6Var.getClass();
        return jq6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b08.class == obj.getClass()) {
                b08 b08Var = (b08) obj;
                if (this.d == b08Var.d && a().equals(b08Var.a())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return a().hashCode() + (this.d * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b08() {
        /*
            r3 = this;
            r0 = -1
            ks3 r1 = defpackage.ks3.a
            r2 = 0
            r3.<init>(r2, r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b08.<init>():void");
    }
}
