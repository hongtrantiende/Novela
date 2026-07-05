package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: twb  reason: default package */
/* loaded from: classes3.dex */
public final class twb implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vwb b;

    public /* synthetic */ twb(vwb vwbVar, int i) {
        this.a = i;
        this.b = vwbVar;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.a;
        pvc pvcVar = pvc.a;
        vwb vwbVar = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                cza czaVar = vwbVar.e;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, swb.a((swb) value, 0, list.size(), 0, 0, 27)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                List list2 = (List) obj;
                cza czaVar2 = vwbVar.e;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, swb.a((swb) value2, list2.size(), 0, 0, 0, 29)));
                    return pvcVar;
                }
                return pvcVar;
            case 2:
                List list3 = (List) obj;
                cza czaVar3 = vwbVar.e;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                    } while (!czaVar3.l(value3, swb.a((swb) value3, 0, 0, 0, list3.size(), 15)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                List list4 = (List) obj;
                cza czaVar4 = vwbVar.e;
                if (czaVar4 != null) {
                    do {
                        value4 = czaVar4.getValue();
                    } while (!czaVar4.l(value4, swb.a((swb) value4, 0, 0, list4.size(), 0, 23)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
