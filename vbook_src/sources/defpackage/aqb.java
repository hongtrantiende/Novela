package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aqb  reason: default package */
/* loaded from: classes3.dex */
public final class aqb extends aab implements mu4 {
    public /* synthetic */ boolean a;
    public /* synthetic */ List b;
    public final /* synthetic */ cqb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqb(cqb cqbVar, m42 m42Var) {
        super(3, m42Var);
        this.c = cqbVar;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        aqb aqbVar = new aqb(this.c, (m42) obj3);
        aqbVar.a = booleanValue;
        aqbVar.b = (List) obj2;
        pvc pvcVar = pvc.a;
        aqbVar.invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        String str;
        boolean z = this.a;
        List list = this.b;
        hre.r(obj);
        cqb cqbVar = this.c;
        cza czaVar = cqbVar.e;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
                zpb zpbVar = (zpb) value;
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    String str2 = ((ox7) obj2).b;
                    if (z) {
                        str = "general";
                    } else {
                        str = cqbVar.c;
                    }
                    if (c16.i(str2, str)) {
                        arrayList.add(obj2);
                    }
                }
                zpbVar.getClass();
            } while (!czaVar.l(value, new zpb(arrayList, z)));
            return pvc.a;
        }
        return pvc.a;
    }
}
