package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: imc  reason: default package */
/* loaded from: classes3.dex */
public final class imc extends aab implements ou4 {
    public /* synthetic */ boolean a;
    public /* synthetic */ List b;
    public /* synthetic */ Map c;
    public /* synthetic */ Map d;
    public final /* synthetic */ rmc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imc(rmc rmcVar, m42 m42Var) {
        super(5, m42Var);
        this.e = rmcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        List<tmc> list = this.b;
        Map map = this.c;
        Map map2 = this.d;
        hre.r(obj);
        this.e.G = list;
        String str = "";
        if (!z) {
            return "";
        }
        String str2 = (String) map.get("engine_id");
        if (str2 == null) {
            str2 = "";
        }
        if (list == null || !list.isEmpty()) {
            for (tmc tmcVar : list) {
                if (str2.equals(tmcVar.a)) {
                    break;
                }
            }
        }
        str2 = "";
        if (str2.length() == 0) {
            String str3 = (String) map2.get("engine_id");
            if (str3 != null) {
                str = str3;
            }
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str.equals(((tmc) it.next()).a)) {
                            str2 = str;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (str2.length() == 0) {
            return ((tmc) sl1.c0(list)).a;
        }
        return str2;
    }

    @Override // defpackage.ou4
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        imc imcVar = new imc(this.e, (m42) obj5);
        imcVar.a = booleanValue;
        imcVar.b = (List) obj2;
        imcVar.c = (Map) obj3;
        imcVar.d = (Map) obj4;
        return imcVar.invokeSuspend(pvc.a);
    }
}
