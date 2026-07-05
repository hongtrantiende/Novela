package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ny1  reason: default package */
/* loaded from: classes3.dex */
public class ny1 implements xq4 {
    public final List a;

    public ny1(List list) {
        list.getClass();
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, yq4] */
    @Override // defpackage.xq4
    public yq4 a() {
        List<v38> list = this.a;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (v38 v38Var : list) {
            arrayList.add(v38Var.a());
        }
        if (arrayList.size() == 1) {
            return (yq4) sl1.r0(arrayList);
        }
        return new Object();
    }

    @Override // defpackage.xq4
    public zm8 b() {
        List<v38> list = this.a;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (v38 v38Var : list) {
            arrayList.add(v38Var.b());
        }
        return pye.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ny1) {
            if (c16.i(this.a, ((ny1) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return s21.p(new StringBuilder("ConcatenatedFormatStructure("), sl1.i0(this.a, ", ", null, null, null, 62), ')');
    }
}
