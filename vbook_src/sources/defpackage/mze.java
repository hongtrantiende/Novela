package defpackage;

import android.content.Context;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mze  reason: default package */
/* loaded from: classes.dex */
public final class mze {
    public final /* synthetic */ int a;
    public final Object b;

    public mze(Context context, gze gzeVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                d41 d41Var = d41.e;
                knc.b(context);
                final inc c = knc.a().c(d41Var);
                if (d41.d.contains(new bt3("json"))) {
                    new ze6(new l99() { // from class: g0f
                        @Override // defpackage.l99
                        public final Object get() {
                            int i2 = r2;
                            inc incVar = c;
                            switch (i2) {
                                case 0:
                                    return incVar.a("FIREBASE_ML_SDK", new bt3("json"), cne.J);
                                default:
                                    return incVar.a("FIREBASE_ML_SDK", new bt3("proto"), ox9.L);
                            }
                        }
                    });
                }
                this.b = new ze6(new l99() { // from class: g0f
                    @Override // defpackage.l99
                    public final Object get() {
                        int i2 = r2;
                        inc incVar = c;
                        switch (i2) {
                            case 0:
                                return incVar.a("FIREBASE_ML_SDK", new bt3("json"), cne.J);
                            default:
                                return incVar.a("FIREBASE_ML_SDK", new bt3("proto"), ox9.L);
                        }
                    }
                });
                return;
            default:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                arrayList.add(new mze(context, gzeVar, 1));
                return;
        }
    }

    public final void a(kj kjVar) {
        ic0 ic0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((mze) obj2).a(kjVar);
                }
                return;
            default:
                jnc jncVar = (jnc) ((ze6) obj).get();
                if (kjVar.a != 0) {
                    ic0Var = new ic0(kjVar.E(), c69.a, null);
                } else {
                    ic0Var = new ic0(kjVar.E(), c69.b, null);
                }
                jncVar.a(ic0Var, new p1a(19));
                return;
        }
    }
}
