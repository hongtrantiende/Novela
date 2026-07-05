package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tc  reason: default package */
/* loaded from: classes3.dex */
public final class tc implements v38 {
    public final ny1 a;
    public final ArrayList b;

    public tc(ny1 ny1Var, ArrayList arrayList) {
        this.a = ny1Var;
        this.b = arrayList;
    }

    @Override // defpackage.xq4
    public final yq4 a() {
        return this.a.a();
    }

    @Override // defpackage.xq4
    public final zm8 b() {
        jq6 t = tl1.t();
        t.add(this.a.b());
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t.add(((xq4) obj).b());
        }
        return new zm8(ks3.a, tl1.r(t));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tc) {
            tc tcVar = (tc) obj;
            if (this.a.equals(tcVar.a) && this.b.equals(tcVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.b + ')';
    }
}
