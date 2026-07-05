package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h37  reason: default package */
/* loaded from: classes.dex */
public final class h37 extends e2 {
    public final r0f a;
    public final ArrayList b;
    public final List c;

    public h37(r0f r0fVar, jq6 jq6Var, ArrayList arrayList, tu7 tu7Var) {
        if (tu7Var.b == arrayList.size() + 1) {
            int i = tu7Var.b;
            if (i != 0) {
                float[] fArr = tu7Var.a;
                int i2 = 0;
                float f = fArr[0];
                float f2 = nae.e;
                if (f == nae.e) {
                    if (i != 0) {
                        if (fArr[i - 1] == 1.0f) {
                            this.a = r0fVar;
                            this.c = jq6Var;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            while (i2 < size) {
                                int i3 = i2 + 1;
                                if (tu7Var.b(i3) - tu7Var.b(i2) > 1.0E-4f) {
                                    arrayList2.add(new g37(this, (qd2) arrayList.get(i2), f2, tu7Var.b(i3)));
                                    f2 = tu7Var.b(i3);
                                }
                                i2 = i3;
                            }
                            g37 g37Var = (g37) nk2.n(1, arrayList2);
                            float f3 = g37Var.c;
                            if (1.0f >= f3) {
                                g37Var.c = f3;
                                g37Var.d = 1.0f;
                                this.b = arrayList2;
                                return;
                            }
                            vs.m("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
                            throw null;
                        }
                        vs.m("Last outline progress value is expected to be one");
                        throw null;
                    }
                    p1a.l("FloatList is empty.");
                    throw null;
                }
                vs.m("First outline progress value is expected to be zero");
                throw null;
            }
            p1a.l("FloatList is empty.");
            throw null;
        }
        vs.m("Outline progress size is expected to be the cubics size + 1");
        throw null;
    }

    @Override // defpackage.v0
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.v0, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof g37)) {
            return false;
        }
        return super.contains((g37) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (g37) this.b.get(i);
    }

    @Override // defpackage.e2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof g37)) {
            return -1;
        }
        return super.indexOf((g37) obj);
    }

    @Override // defpackage.e2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof g37)) {
            return -1;
        }
        return super.lastIndexOf((g37) obj);
    }
}
