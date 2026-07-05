package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k7b  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k7b implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7b b;

    public /* synthetic */ k7b(o7b o7bVar, int i) {
        this.a = i;
        this.b = o7bVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        o7b o7bVar = this.b;
        b7b b7bVar = (b7b) obj;
        switch (i) {
            case 0:
                b7bVar.getClass();
                o7bVar.G.setValue(Boolean.valueOf(b7bVar.v));
                o7bVar.H.setValue(b7bVar.u);
                Map map = b7bVar.A;
                LinkedHashMap linkedHashMap = new LinkedHashMap(p17.k(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    long j = ((qy5) entry.getValue()).a;
                    int i2 = qy5.c;
                    linkedHashMap.put(key, new py5((((int) (j >> 32)) << 32) | (4294967295L & ((int) (j & 4294967295L)))));
                }
                o7bVar.I.setValue(linkedHashMap);
                o7bVar.D.setValue(Boolean.valueOf(b7bVar.r));
                return pvcVar;
            default:
                b7bVar.getClass();
                o7bVar.M.setValue(b7bVar.x);
                o7bVar.L.setValue(b7bVar.w);
                o7bVar.J.i(b7bVar.y);
                o7bVar.K.setValue(dye.v(b7bVar.z));
                return pvcVar;
        }
    }
}
