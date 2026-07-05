package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ize  reason: default package */
/* loaded from: classes.dex */
public final class ize extends q7e {
    public final yx9 b;

    public ize(yx9 yx9Var) {
        this.b = yx9Var;
    }

    @Override // defpackage.q7e, defpackage.e9e
    public final e9e d(String str, odd oddVar, ArrayList arrayList) {
        int hashCode = str.hashCode();
        Object obj = null;
        yx9 yx9Var = this.b;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    yae.K(0, "getEventName", arrayList);
                    return new p9e(((hxd) yx9Var.c).a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    yae.K(0, "getTimestamp", arrayList);
                    return new g4e(Double.valueOf(((hxd) yx9Var.c).b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    yae.K(1, "getParamValue", arrayList);
                    String zzc = ((hvc) oddVar.c).J(oddVar, (e9e) arrayList.get(0)).zzc();
                    HashMap hashMap = ((hxd) yx9Var.c).c;
                    if (hashMap.containsKey(zzc)) {
                        obj = hashMap.get(zzc);
                    }
                    return hbe.m0(obj);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    yae.K(0, "getParams", arrayList);
                    HashMap hashMap2 = ((hxd) yx9Var.c).c;
                    q7e q7eVar = new q7e();
                    for (String str2 : hashMap2.keySet()) {
                        q7eVar.c(str2, hbe.m0(hashMap2.get(str2)));
                    }
                    return q7eVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    yae.K(2, "setParamValue", arrayList);
                    String zzc2 = ((hvc) oddVar.c).J(oddVar, (e9e) arrayList.get(0)).zzc();
                    e9e J = ((hvc) oddVar.c).J(oddVar, (e9e) arrayList.get(1));
                    Object S = yae.S(J);
                    HashMap hashMap3 = ((hxd) yx9Var.c).c;
                    if (S == null) {
                        hashMap3.remove(zzc2);
                        return J;
                    }
                    hashMap3.put(zzc2, hxd.b(hashMap3.get(zzc2), S, zzc2));
                    return J;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    yae.K(1, "setEventName", arrayList);
                    e9e J2 = ((hvc) oddVar.c).J(oddVar, (e9e) arrayList.get(0));
                    if (!e9e.u.equals(J2) && !e9e.v.equals(J2)) {
                        ((hxd) yx9Var.c).a = J2.zzc();
                        return new p9e(J2.zzc());
                    }
                    vs.m("Illegal event name");
                    return null;
                }
                break;
        }
        return super.d(str, oddVar, arrayList);
    }
}
