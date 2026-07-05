package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q52  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class q52 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kj6 b;
    public final /* synthetic */ lu4 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ q52(kj6 kj6Var, lu4 lu4Var, aw7 aw7Var, int i) {
        this.a = i;
        this.b = kj6Var;
        this.c = lu4Var;
        this.d = aw7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = null;
        aw7 aw7Var = this.d;
        lu4 lu4Var = this.c;
        kj6 kj6Var = this.b;
        y78 y78Var = (y78) obj;
        switch (i) {
            case 0:
                Iterator it = kj6Var.j().k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        gj6 gj6Var = (gj6) next;
                        if (gj6Var.p <= Float.intBitsToFloat((int) (y78Var.a >> 32)) && gj6Var.p + gj6Var.q > Float.intBitsToFloat((int) (y78Var.a >> 32))) {
                            obj2 = next;
                        }
                    }
                }
                gj6 gj6Var2 = (gj6) obj2;
                if (gj6Var2 != null) {
                    lu4Var.invoke(y78Var, ((List) aw7Var.getValue()).get(gj6Var2.a));
                }
                return pvcVar;
            case 1:
                Iterator it2 = kj6Var.j().k.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        gj6 gj6Var3 = (gj6) next2;
                        if (gj6Var3.p <= Float.intBitsToFloat((int) (y78Var.a >> 32)) && gj6Var3.p + gj6Var3.q > Float.intBitsToFloat((int) (y78Var.a >> 32))) {
                            obj2 = next2;
                        }
                    }
                }
                gj6 gj6Var4 = (gj6) obj2;
                if (gj6Var4 != null) {
                    lu4Var.invoke(y78Var, ((List) aw7Var.getValue()).get(gj6Var4.a));
                }
                return pvcVar;
            case 2:
                Iterator it3 = kj6Var.j().k.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next3 = it3.next();
                        gj6 gj6Var5 = (gj6) next3;
                        if (gj6Var5.p <= Float.intBitsToFloat((int) (y78Var.a & 4294967295L)) && gj6Var5.p + gj6Var5.q > Float.intBitsToFloat((int) (y78Var.a & 4294967295L))) {
                            obj2 = next3;
                        }
                    }
                }
                gj6 gj6Var6 = (gj6) obj2;
                if (gj6Var6 != null) {
                    lu4Var.invoke(y78Var, ((List) aw7Var.getValue()).get(gj6Var6.a));
                }
                return pvcVar;
            default:
                Iterator it4 = kj6Var.j().k.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next4 = it4.next();
                        gj6 gj6Var7 = (gj6) next4;
                        if (gj6Var7.p <= Float.intBitsToFloat((int) (y78Var.a & 4294967295L)) && gj6Var7.p + gj6Var7.q > Float.intBitsToFloat((int) (y78Var.a & 4294967295L))) {
                            obj2 = next4;
                        }
                    }
                }
                gj6 gj6Var8 = (gj6) obj2;
                if (gj6Var8 != null) {
                    lu4Var.invoke(y78Var, ((List) aw7Var.getValue()).get(gj6Var8.a));
                }
                return pvcVar;
        }
    }
}
