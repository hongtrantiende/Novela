package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sre  reason: default package */
/* loaded from: classes.dex */
public final class sre extends ypa {
    public final /* synthetic */ lse j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sre(lse lseVar) {
        super(20);
        this.j = lseVar;
    }

    @Override // defpackage.ypa
    public final Object d(Object obj) {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        am8.p(str);
        lse lseVar = this.j;
        lseVar.Y();
        am8.p(str);
        z9e z9eVar = lseVar.b.c;
        a6f.U(z9eVar);
        ac3 f1 = z9eVar.f1(str);
        if (f1 == null) {
            return null;
        }
        ppe ppeVar = ((lte) lseVar.a).f;
        lte.m(ppeVar);
        ppeVar.J.f(str, "Populate EES config from database on cache miss. appId");
        lseVar.f0(str, lseVar.g0(str, f1.a));
        sre sreVar = lseVar.G;
        synchronized (((kh5) sreVar.g)) {
            Set entrySet = ((lz6) sreVar.f).a.entrySet();
            entrySet.getClass();
            linkedHashMap = new LinkedHashMap(entrySet.size());
            Set<Map.Entry> entrySet2 = ((lz6) sreVar.f).a.entrySet();
            entrySet2.getClass();
            for (Map.Entry entry : entrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (bde) linkedHashMap.get(str);
    }
}
