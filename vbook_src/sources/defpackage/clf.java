package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: clf  reason: default package */
/* loaded from: classes.dex */
public final class clf {
    public final /* synthetic */ int a;

    public /* synthetic */ clf(int i) {
        this.a = i;
    }

    public final void a(sjf sjfVar, Iterator it, vkf vkfVar) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (sjfVar.c) {
                    if (sjfVar.d && ((xyd) xyd.b.get()).a > 20) {
                        while (it.hasNext()) {
                            vkfVar.a(it.next(), sjfVar.a);
                        }
                        return;
                    }
                    sjfVar.a(it, vkfVar);
                    return;
                }
                vs.k("non repeating key");
                return;
        }
    }

    private final void b(sjf sjfVar, Iterator it, vkf vkfVar) {
    }
}
