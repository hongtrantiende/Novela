package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mxe  reason: default package */
/* loaded from: classes.dex */
public final class mxe extends l5e {
    public final /* synthetic */ int c = 3;
    public final Object d;

    public mxe(xk9 xk9Var) {
        super("internal.logger");
        this.d = xk9Var;
        this.b.put("log", new m9f(this, false, true));
        this.b.put("silent", new m2f("silent", 1));
        ((l5e) this.b.get("silent")).c("log", new m9f(this, true, true));
        this.b.put("unmonitored", new m2f("unmonitored", 2));
        ((l5e) this.b.get("unmonitored")).c("log", new m9f(this, false, false));
    }

    @Override // defpackage.l5e
    public final e9e g(odd oddVar, List list) {
        HashMap hashMap;
        Object obj;
        int i;
        TreeMap treeMap;
        int i2 = this.c;
        String str = this.a;
        r9e r9eVar = e9e.u;
        Object obj2 = this.d;
        String str2 = null;
        switch (i2) {
            case 0:
                yae.K(3, str, list);
                String zzc = ((hvc) oddVar.c).J(oddVar, (e9e) list.get(0)).zzc();
                hvc hvcVar = (hvc) oddVar.c;
                long R = (long) yae.R(hvcVar.J(oddVar, (e9e) list.get(1)).zzd().doubleValue());
                e9e J = hvcVar.J(oddVar, (e9e) list.get(2));
                if (J instanceof q7e) {
                    hashMap = yae.T((q7e) J);
                } else {
                    hashMap = new HashMap();
                }
                yx9 yx9Var = (yx9) obj2;
                yx9Var.getClass();
                HashMap hashMap2 = new HashMap();
                for (String str3 : hashMap.keySet()) {
                    HashMap hashMap3 = ((hxd) yx9Var.b).c;
                    if (hashMap3.containsKey(str3)) {
                        obj = hashMap3.get(str3);
                    } else {
                        obj = null;
                    }
                    hashMap2.put(str3, hxd.b(obj, hashMap.get(str3), str3));
                }
                ((ArrayList) yx9Var.d).add(new hxd(zzc, R, hashMap2));
                return r9eVar;
            case 1:
                yae.K(2, "getValue", list);
                e9e J2 = ((hvc) oddVar.c).J(oddVar, (e9e) list.get(0));
                e9e J3 = ((hvc) oddVar.c).J(oddVar, (e9e) list.get(1));
                String zzc2 = J2.zzc();
                hvc hvcVar2 = (hvc) obj2;
                Map map = (Map) ((lse) hvcVar2.c).d.get((String) hvcVar2.b);
                if (map != null && map.containsKey(zzc2)) {
                    str2 = (String) map.get(zzc2);
                }
                if (str2 != null) {
                    return new p9e(str2);
                }
                return J3;
            case 2:
                return r9eVar;
            case 3:
                try {
                    return hbe.m0(((bse) obj2).call());
                } catch (Exception unused) {
                    return r9eVar;
                }
            default:
                yae.K(3, str, list);
                ((hvc) oddVar.c).J(oddVar, (e9e) list.get(0)).zzc();
                hvc hvcVar3 = (hvc) oddVar.c;
                e9e J4 = hvcVar3.J(oddVar, (e9e) list.get(1));
                if (J4 instanceof q8e) {
                    e9e J5 = hvcVar3.J(oddVar, (e9e) list.get(2));
                    if (J5 instanceof q7e) {
                        q7e q7eVar = (q7e) J5;
                        HashMap hashMap4 = q7eVar.a;
                        if (hashMap4.containsKey("type")) {
                            String zzc3 = q7eVar.b("type").zzc();
                            if (hashMap4.containsKey("priority")) {
                                i = yae.Q(q7eVar.b("priority").zzd().doubleValue());
                            } else {
                                i = 1000;
                            }
                            hvc hvcVar4 = (hvc) obj2;
                            q8e q8eVar = (q8e) J4;
                            hvcVar4.getClass();
                            if ("create".equals(zzc3)) {
                                treeMap = (TreeMap) hvcVar4.c;
                            } else if ("edit".equals(zzc3)) {
                                treeMap = (TreeMap) hvcVar4.b;
                            } else {
                                vs.k("Unknown callback type: ".concat(String.valueOf(zzc3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(i))) {
                                i = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(i), q8eVar);
                            return r9eVar;
                        }
                        vs.m("Undefined rule type");
                    } else {
                        vs.m("Invalid callback params");
                    }
                } else {
                    vs.m("Invalid callback type");
                }
                return null;
        }
    }

    public mxe(yx9 yx9Var) {
        super("internal.eventLogger");
        this.d = yx9Var;
    }

    public mxe(hvc hvcVar) {
        super("internal.registerCallback");
        this.d = hvcVar;
    }

    public mxe(bse bseVar) {
        super("internal.appMetadata");
        this.d = bseVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxe(m2f m2fVar, hvc hvcVar) {
        super("getValue");
        this.d = hvcVar;
    }
}
