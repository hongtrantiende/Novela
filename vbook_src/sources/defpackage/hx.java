package defpackage;

import android.content.res.Resources;
import android.os.LocaleList;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hx  reason: default package */
/* loaded from: classes3.dex */
public final class hx extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hx(tx txVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = txVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        tx txVar = this.c;
        switch (i) {
            case 0:
                hx hxVar = new hx(txVar, m42Var, 0);
                hxVar.b = obj;
                return hxVar;
            default:
                hx hxVar2 = new hx(txVar, m42Var, 1);
                hxVar2.b = obj;
                return hxVar2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((hx) create((kb6) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((hx) create((x6c) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        String e;
        Object value;
        Object value2;
        Object value3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        tx txVar = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kb6 kb6Var = (kb6) obj2;
                hre.r(obj);
                cza czaVar = txVar.G;
                p69 p69Var = mv6.b;
                if (kb6Var == null) {
                    p69Var.c(xve.c(""));
                    pv6 pv6Var = pv6.b;
                    Locale a = pv6.c(LocaleList.getAdjustedDefault()).a(0);
                    if (a == null && (a = Resources.getSystem().getConfiguration().getLocales().get(0)) == null) {
                        a = Locale.getDefault();
                    }
                    a.getClass();
                    e = a.toLanguageTag();
                    e.getClass();
                } else {
                    mv6 e2 = vve.e(kb6Var.b);
                    if (e2 == null) {
                        e2 = vve.g();
                    }
                    p69Var.c(e2.a);
                    e = e2.e();
                }
                if (!c16.i(((ex) czaVar.getValue()).b, e) && czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, ex.a((ex) value, e, 1)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                x6c x6cVar = (x6c) obj2;
                hre.r(obj);
                cza czaVar2 = txVar.G;
                cza czaVar3 = txVar.H;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                        x6c x6cVar2 = (x6c) value3;
                    } while (!czaVar3.l(value3, x6cVar));
                    if (!((ex) czaVar2.getValue()).a && czaVar2 != null) {
                        do {
                            value2 = czaVar2.getValue();
                        } while (!czaVar2.l(value2, ex.a((ex) value2, null, 2)));
                        return pvcVar;
                    }
                    return pvcVar;
                }
                if (!((ex) czaVar2.getValue()).a) {
                }
                return pvcVar;
        }
    }
}
