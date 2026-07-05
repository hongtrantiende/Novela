package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q8e  reason: default package */
/* loaded from: classes.dex */
public final class q8e extends l5e {
    public final ArrayList c;
    public final ArrayList d;
    public final odd e;

    public q8e(String str, ArrayList arrayList, List list, odd oddVar) {
        super(str);
        this.c = new ArrayList();
        this.e = oddVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.c.add(((e9e) obj).zzc());
            }
        }
        this.d = new ArrayList(list);
    }

    @Override // defpackage.l5e, defpackage.e9e
    public final e9e f() {
        return new q8e(this);
    }

    @Override // defpackage.l5e
    public final e9e g(odd oddVar, List list) {
        r9e r9eVar;
        odd v = this.e.v();
        hvc hvcVar = (hvc) v.c;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            r9eVar = e9e.u;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                v.A((String) arrayList.get(i2), ((hvc) oddVar.c).J(oddVar, (e9e) list.get(i2)));
            } else {
                v.A((String) arrayList.get(i2), r9eVar);
            }
            i2++;
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            e9e e9eVar = (e9e) obj;
            e9e J = hvcVar.J(v, e9eVar);
            if (J instanceof j9e) {
                J = hvcVar.J(v, e9eVar);
            }
            if (J instanceof v2e) {
                return ((v2e) J).a;
            }
        }
        return r9eVar;
    }

    public q8e(q8e q8eVar) {
        super(q8eVar.a);
        ArrayList arrayList = new ArrayList(q8eVar.c.size());
        this.c = arrayList;
        arrayList.addAll(q8eVar.c);
        ArrayList arrayList2 = new ArrayList(q8eVar.d.size());
        this.d = arrayList2;
        arrayList2.addAll(q8eVar.d);
        this.e = q8eVar.e;
    }
}
