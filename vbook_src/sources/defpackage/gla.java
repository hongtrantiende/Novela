package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gla  reason: default package */
/* loaded from: classes3.dex */
public final class gla implements v38 {
    public final ri0 a;
    public final Set b;

    public gla(ri0 ri0Var) {
        this.a = ri0Var;
        jq6 t = tl1.t();
        fbe.v(t, ri0Var);
        jq6 r = tl1.r(t);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = r.listIterator(0);
        while (true) {
            y65 y65Var = (y65) listIterator;
            if (!y65Var.hasNext()) {
                break;
            }
            e88 d = ((bc4) y65Var.next()).c().d();
            if (d != null) {
                arrayList.add(d);
            }
        }
        Set H0 = sl1.H0(arrayList);
        this.b = H0;
        if (!H0.isEmpty()) {
            return;
        }
        vs.m("Signed format must contain at least one field with a sign");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yq4] */
    @Override // defpackage.xq4
    public final yq4 a() {
        this.a.a.a();
        return new Object();
    }

    @Override // defpackage.xq4
    public final zm8 b() {
        el7 el7Var = new el7(this, 15);
        return pye.h(tl1.B(new zm8(tl1.A(new zka(el7Var, "sign for " + this.b)), ks3.a), this.a.a.b()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gla) {
            if (this.a.equals(((gla) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.a + ')';
    }
}
