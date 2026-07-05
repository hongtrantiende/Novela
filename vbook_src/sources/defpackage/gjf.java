package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gjf  reason: default package */
/* loaded from: classes.dex */
public final class gjf {
    public final String a;
    public final boolean b;
    public final aue c;
    public final BitSet d;
    public final BitSet e;
    public final yz f;
    public final yz g;
    public final /* synthetic */ d0e h;

    /* JADX WARN: Type inference failed for: r1v1, types: [yz, jla] */
    public gjf(d0e d0eVar, String str, aue aueVar, BitSet bitSet, BitSet bitSet2, yz yzVar, yz yzVar2) {
        this.h = d0eVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = yzVar;
        this.g = new jla(0);
        Iterator it = ((vz) yzVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) yzVar2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = aueVar;
    }

    public final void a(jxd jxdVar) {
        int u;
        switch (jxdVar.g) {
            case 0:
                u = ((kle) jxdVar.i).u();
                break;
            default:
                u = ((cme) jxdVar.i).u();
                break;
        }
        boolean z = true;
        if (jxdVar.c != null) {
            this.e.set(u, true);
        }
        Boolean bool = jxdVar.d;
        if (bool != null) {
            this.d.set(u, bool.booleanValue());
        }
        if (jxdVar.e != null) {
            Integer valueOf = Integer.valueOf(u);
            yz yzVar = this.f;
            Long l = (Long) yzVar.get(valueOf);
            long longValue = jxdVar.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                yzVar.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (jxdVar.f != null) {
            Integer valueOf2 = Integer.valueOf(u);
            yz yzVar2 = this.g;
            List list = (List) yzVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                yzVar2.put(valueOf2, list);
            }
            boolean z2 = false;
            switch (jxdVar.g) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                list.clear();
            }
            z4e.a();
            lte lteVar = (lte) this.h.a;
            t7e t7eVar = lteVar.d;
            wme wmeVar = yme.F0;
            String str = this.a;
            if (t7eVar.i0(str, wmeVar)) {
                switch (jxdVar.g) {
                    case 0:
                        z2 = ((kle) jxdVar.i).z();
                        break;
                }
                if (z2) {
                    list.clear();
                }
            }
            z4e.a();
            boolean i0 = lteVar.d.i0(str, wmeVar);
            Long l2 = jxdVar.f;
            if (i0) {
                Long valueOf3 = Long.valueOf(l2.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(l2.longValue() / 1000));
        }
    }

    public final are b(int i) {
        ArrayList arrayList;
        List list;
        xqe A = are.A();
        A.b();
        ((are) A.b).B(i);
        A.b();
        ((are) A.b).E(this.b);
        aue aueVar = this.c;
        if (aueVar != null) {
            A.b();
            ((are) A.b).D(aueVar);
        }
        xte B = aue.B();
        ArrayList D0 = e6f.D0(this.d);
        B.b();
        ((aue) B.b).F(D0);
        ArrayList D02 = e6f.D0(this.e);
        B.b();
        ((aue) B.b).D(D02);
        yz yzVar = this.f;
        if (yzVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(yzVar.c);
            Iterator it = ((vz) yzVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l = (Long) yzVar.get(num);
                if (l != null) {
                    zre x = dse.x();
                    x.b();
                    ((dse) x.b).y(intValue);
                    long longValue = l.longValue();
                    x.b();
                    ((dse) x.b).z(longValue);
                    arrayList2.add((dse) x.d());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            B.b();
            ((aue) B.b).H(arrayList);
        }
        yz yzVar2 = this.g;
        if (yzVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(yzVar2.c);
            Iterator it2 = ((vz) yzVar2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                due y = fue.y();
                int intValue2 = num2.intValue();
                y.b();
                ((fue) y.b).z(intValue2);
                List list2 = (List) yzVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    y.b();
                    ((fue) y.b).A(list2);
                }
                arrayList3.add((fue) y.d());
            }
            list = arrayList3;
        }
        B.b();
        ((aue) B.b).J(list);
        A.b();
        ((are) A.b).C((aue) B.d());
        return (are) A.d();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [yz, jla] */
    /* JADX WARN: Type inference failed for: r1v5, types: [yz, jla] */
    public gjf(d0e d0eVar, String str) {
        this.h = d0eVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new jla(0);
        this.g = new jla(0);
    }
}
