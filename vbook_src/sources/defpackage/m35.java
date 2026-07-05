package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m35  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class m35 implements kb3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m35(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.kb3
    public final void a() {
        switch (this.a) {
            case 0:
                ((n35) this.b).c.removeCallbacks((Runnable) this.c);
                return;
            default:
                String str = (String) this.b;
                fl7 fl7Var = (fl7) this.c;
                synchronized (eu7.b) {
                    LinkedHashMap linkedHashMap = eu7.c;
                    eu7 eu7Var = (eu7) linkedHashMap.get(str);
                    if (eu7Var != null) {
                        eu7Var.a.remove(fl7Var);
                        if (eu7Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            eu7Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
