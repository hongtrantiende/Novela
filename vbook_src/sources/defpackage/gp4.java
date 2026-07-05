package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gp4  reason: default package */
/* loaded from: classes.dex */
public final class gp4 implements i12 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.i12
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                hp4 hp4Var = (hp4) obj;
                if (hp4Var == null) {
                    hp4Var = new hp4(-3);
                }
                ((s6f) this.b).I(hp4Var);
                return;
            default:
                hp4 hp4Var2 = (hp4) obj;
                synchronized (ip4.c) {
                    try {
                        jla jlaVar = ip4.d;
                        ArrayList arrayList = (ArrayList) jlaVar.get((String) this.b);
                        if (arrayList != null) {
                            jlaVar.remove((String) this.b);
                            for (int i = 0; i < arrayList.size(); i++) {
                                ((i12) arrayList.get(i)).accept(hp4Var2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
