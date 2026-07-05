package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xda  reason: default package */
/* loaded from: classes3.dex */
public final class xda implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yda b;

    public /* synthetic */ xda(yda ydaVar, int i) {
        this.a = i;
        this.b = ydaVar;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        Object value2;
        Object value3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        yda ydaVar = this.b;
        switch (i) {
            case 0:
                laa laaVar = (laa) obj;
                cza czaVar = ydaVar.d;
                if (laaVar instanceof jaa) {
                    if (czaVar != null) {
                        do {
                            value2 = czaVar.getValue();
                        } while (!czaVar.l(value2, lda.a((lda) value2, false, true, ((jaa) laaVar).a, null, 25)));
                        return pvcVar;
                    }
                    return pvcVar;
                } else if (c16.i(laaVar, kaa.a)) {
                    if (czaVar != null) {
                        do {
                            value = czaVar.getValue();
                        } while (!czaVar.l(value, lda.a((lda) value, false, false, "", null, 25)));
                        return pvcVar;
                    }
                    return pvcVar;
                } else {
                    xk5.o();
                    return null;
                }
            default:
                kb6 kb6Var = (kb6) obj;
                cza czaVar2 = ydaVar.d;
                if (czaVar2 != null) {
                    do {
                        value3 = czaVar2.getValue();
                    } while (!czaVar2.l(value3, lda.a((lda) value3, false, false, null, kb6Var, 23)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
