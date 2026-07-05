package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ywe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ywe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yze b;

    public /* synthetic */ ywe(yze yzeVar, int i) {
        this.a = i;
        this.b = yzeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i = this.a;
        yze yzeVar = this.b;
        switch (i) {
            case 0:
                yzeVar.u0();
                return;
            case 1:
                g99 g99Var = yzeVar.M;
                lte lteVar = (lte) g99Var.b;
                ete eteVar = lteVar.C;
                yze yzeVar2 = lteVar.I;
                dre dreVar = lteVar.e;
                lte.m(eteVar);
                eteVar.W();
                if (g99Var.I()) {
                    if (g99Var.H()) {
                        lte.k(dreVar);
                        dreVar.S.l(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        lte.l(yzeVar2);
                        yzeVar2.e0("auto", "_cmpx", bundle);
                    } else {
                        lte.k(dreVar);
                        o40 o40Var = dreVar.S;
                        String k = o40Var.k();
                        if (TextUtils.isEmpty(k)) {
                            ppe ppeVar = lteVar.f;
                            lte.m(ppeVar);
                            ppeVar.C.e("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long g = dreVar.T.g() / 3600000;
                            Uri parse = Uri.parse(k);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str2 : parse.getQueryParameterNames()) {
                                bundle2.putString(str2, parse.getQueryParameter(str2));
                                j = j;
                            }
                            Bundle bundle3 = (Bundle) pair.second;
                            bundle3.putLong("_cc", (g - 1) * j);
                            Object obj = pair.first;
                            if (obj == null) {
                                str = "app";
                            } else {
                                str = (String) obj;
                            }
                            lte.l(yzeVar2);
                            yzeVar2.e0(str, "_cmp", (Bundle) pair.second);
                        }
                        o40Var.l(null);
                    }
                    lte.k(dreVar);
                    dreVar.T.h(0L);
                    return;
                }
                return;
            case 2:
                yzeVar.W();
                lte lteVar2 = (lte) yzeVar.a;
                dre dreVar2 = lteVar2.e;
                ppe ppeVar2 = lteVar2.f;
                lte.k(dreVar2);
                oqe oqeVar = dreVar2.P;
                if (!oqeVar.a()) {
                    jya jyaVar = dreVar2.Q;
                    long g2 = jyaVar.g();
                    jyaVar.h(1 + g2);
                    if (g2 >= 5) {
                        lte.m(ppeVar2);
                        ppeVar2.E.e("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        oqeVar.b(true);
                        return;
                    }
                    if (yzeVar.O == null) {
                        yzeVar.O = new bxe(yzeVar, lteVar2, 3);
                    }
                    yzeVar.O.b(0L);
                    return;
                }
                lte.m(ppeVar2);
                ppeVar2.I.e("Deferred Deep Link already retrieved. Not fetching again.");
                return;
            default:
                yzeVar.u0();
                return;
        }
    }
}
