package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ieb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ieb implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ web b;

    public /* synthetic */ ieb(web webVar, int i) {
        this.a = i;
        this.b = webVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.a;
        pvc pvcVar = pvc.a;
        web webVar = this.b;
        switch (i) {
            case 0:
                ycb ycbVar = (ycb) obj;
                ycbVar.getClass();
                hk1 a = jdd.a(webVar);
                sw2 sw2Var = ab3.a;
                webVar.f(a, ru2.c, new koa(webVar, ycbVar, null, 8));
                return pvcVar;
            case 1:
                r24 r24Var = (r24) obj;
                cza czaVar = webVar.d;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, xeb.a((xeb) value, false, 0L, null, null, null, false, false, null, null, false, null, r24Var, false, null, false, false, false, false, false, false, false, false, false, 16773119)));
                    return pvcVar;
                }
                return pvcVar;
            case 2:
                dt5 dt5Var = (dt5) obj;
                cza czaVar2 = webVar.d;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, xeb.a((xeb) value2, false, 0L, null, null, null, false, false, null, null, false, dt5Var, null, false, null, false, false, false, false, false, false, false, false, false, 16775167)));
                    return pvcVar;
                }
                return pvcVar;
            case 3:
                dt5 dt5Var2 = (dt5) obj;
                cza czaVar3 = webVar.d;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                    } while (!czaVar3.l(value3, xeb.a((xeb) value3, false, 0L, null, null, null, false, false, null, null, false, dt5Var2, null, false, null, false, false, false, false, false, false, false, false, false, 16775167)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                r24 r24Var2 = (r24) obj;
                cza czaVar4 = webVar.d;
                if (czaVar4 != null) {
                    do {
                        value4 = czaVar4.getValue();
                    } while (!czaVar4.l(value4, xeb.a((xeb) value4, false, 0L, null, null, null, false, false, r24Var2, null, false, null, null, false, null, false, false, false, false, false, false, false, false, false, 16776959)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
