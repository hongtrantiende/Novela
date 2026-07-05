package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iga  reason: default package */
/* loaded from: classes.dex */
public final class iga extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jga b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iga(jga jgaVar, int i) {
        super(0);
        this.a = i;
        this.b = jgaVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        Object obj;
        int i = this.a;
        int i2 = 0;
        jga jgaVar = this.b;
        switch (i) {
            case 0:
                boolean z = jgaVar.g;
                lq lqVar = jgaVar.f;
                lha lhaVar = jgaVar.b;
                if (!z && lhaVar.b() && lqVar.f()) {
                    List c = jgaVar.c();
                    int size = c.size();
                    while (true) {
                        if (i2 < size) {
                            obj = c.get(i2);
                            if (!((kga) obj).d().b()) {
                                i2++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    kga kgaVar = (kga) obj;
                    if (kgaVar != null) {
                        lf4 lf4Var = kgaVar.d().f;
                        if (lf4Var instanceof gxa) {
                            gxa gxaVar = (gxa) lf4Var;
                            z87.v(lhaVar.b, null, null, new z38(jgaVar, new gxa(gxaVar.a, gxaVar.b, new y78((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L))), null, 24), 3);
                        }
                        jgaVar.g = true;
                    }
                }
                return new y78(((y78) lqVar.e()).a);
            default:
                List b = jgaVar.b();
                int size2 = b.size();
                while (i2 < size2) {
                    kga kgaVar2 = (kga) b.get(i2);
                    if (!kgaVar2.d().b() || !kgaVar2.h()) {
                        i2++;
                    } else {
                        return pvc.a;
                    }
                }
                return pvc.a;
        }
    }
}
