package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qla  reason: default package */
/* loaded from: classes3.dex */
public final class qla {
    public final HashMap a;

    public qla(HashMap hashMap) {
        this.a = hashMap;
    }

    public final int[] a(String str) {
        str.getClass();
        byte[] H = r4b.H(str);
        if (H.length != 0) {
            List<pla> list = (List) this.a.get(Integer.valueOf(wq9.E(H)));
            if (list != null) {
                for (pla plaVar : list) {
                    if (plaVar.a.equalsIgnoreCase(str)) {
                        return plaVar.b;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
