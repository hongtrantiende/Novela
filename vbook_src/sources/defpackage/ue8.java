package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ue8  reason: default package */
/* loaded from: classes3.dex */
public final class ue8 implements v38 {
    public final String a;
    public final ny1 b;
    public final ArrayList c;

    public ue8(String str, ny1 ny1Var) {
        this.a = str;
        this.b = ny1Var;
        jq6 t = tl1.t();
        fbe.v(t, ny1Var);
        jq6 r = tl1.r(t);
        ArrayList arrayList = new ArrayList(tl1.s(r, 10));
        ListIterator listIterator = r.listIterator(0);
        while (true) {
            y65 y65Var = (y65) listIterator;
            if (!y65Var.hasNext()) {
                break;
            }
            arrayList.add(((bc4) y65Var.next()).c());
        }
        List<g1> C0 = sl1.C0(sl1.G0(arrayList));
        ArrayList arrayList2 = new ArrayList(tl1.s(C0, 10));
        for (g1 g1Var : C0) {
            g1Var.getClass();
            Object b = g1Var.b();
            if (b != null) {
                arrayList2.add(new te8(g1Var.a(), b));
            } else {
                hfd.h(g1Var.c(), "' does not define a default value", "The field '");
                throw null;
            }
        }
        this.c = arrayList2;
    }

    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, yq4] */
    @Override // defpackage.xq4
    public final yq4 a() {
        Object az1Var;
        Object obj;
        yq4 a = this.b.a();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            te8 te8Var = (te8) obj2;
            arrayList2.add(new zs1(te8Var.b, new mp6(1, te8Var.a, o89.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0, 7)));
        }
        boolean isEmpty = arrayList2.isEmpty();
        Object obj3 = roc.a;
        if (isEmpty) {
            obj = obj3;
        } else {
            if (arrayList2.size() == 1) {
                az1Var = (h39) sl1.r0(arrayList2);
            } else {
                az1Var = new az1(arrayList2);
            }
            obj = az1Var;
        }
        if (obj instanceof roc) {
            return new Object();
        }
        return new wy1(tl1.B(new yk8(new mp6(1, obj, h39.class, "test", "test(Ljava/lang/Object;)Z", 0, 8), new Object()), new yk8(new mp6(1, obj3, roc.class, "test", "test(Ljava/lang/Object;)Z", 0, 9), a)));
    }

    @Override // defpackage.xq4
    public final zm8 b() {
        List A;
        zm8 b = this.b.b();
        zm8 b2 = new f02(this.a).b();
        boolean isEmpty = this.c.isEmpty();
        ks3 ks3Var = ks3.a;
        if (isEmpty) {
            A = ks3Var;
        } else {
            A = tl1.A(new cvc(new cl7(this, 13)));
        }
        return new zm8(ks3Var, tl1.B(b, pye.h(tl1.B(b2, new zm8(A, ks3Var)))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ue8) {
            ue8 ue8Var = (ue8) obj;
            if (this.a.equals(ue8Var.a) && this.b.equals(ue8Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.a + ", " + this.b + ')';
    }
}
