package defpackage;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rx2  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class rx2 implements ckb, uu4 {
    public final /* synthetic */ sx2 a;

    public rx2(sx2 sx2Var) {
        this.a = sx2Var;
    }

    @Override // defpackage.uu4
    public final hu4 a() {
        return new wu4(3, 0, sx2.class, this.a, "decodeListItem", "decodeListItem(Lio/github/linreal/cascade/editor/htmlserialization/TagDecodeContext;Ljava/util/Map;Ljava/util/List;)Lio/github/linreal/cascade/editor/htmlserialization/TagDecodeResult;");
    }

    @Override // defpackage.ckb
    public final bkb b(o40 o40Var, Map map, ArrayList arrayList) {
        int i;
        hn0 hn0Var;
        map.getClass();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            gc5 gc5Var = (gc5) obj;
            if (gc5Var instanceof ec5) {
                sx2 sx2Var = sx2.a;
                if (sx2.d(((ec5) gc5Var).a)) {
                }
            }
            arrayList2.add(obj);
        }
        qv5 a = o40.a(o40Var, arrayList2, 8);
        Integer b = sx2.b(o40Var, map, "li");
        if (b != null) {
            i = b.intValue();
        } else {
            i = 0;
        }
        if (c16.i((String) o40Var.d, "ol")) {
            hn0Var = new dn0(1);
        } else {
            hn0Var = zm0.a;
        }
        return new xjb(sx2.h(sx2.f(hn0Var, a), dce.n(i, 0, 5)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ckb) || !(obj instanceof uu4)) {
            return false;
        }
        return c16.i(a(), ((uu4) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
