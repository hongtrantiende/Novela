package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oi7  reason: default package */
/* loaded from: classes3.dex */
public final class oi7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi7(aw7 aw7Var, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = aw7Var;
        this.c = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.c;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                return new oi7(aw7Var, str, m42Var, 0);
            case 1:
                return new oi7(aw7Var, str, m42Var, 1);
            default:
                return new oi7(aw7Var, str, m42Var, 2);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((oi7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((oi7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((oi7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = -1;
        int i3 = 0;
        String str = this.c;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                Iterator it = ((List) aw7Var.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (c16.i(((mq5) it.next()).a, str)) {
                            i2 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                return new Integer(i2);
            case 1:
                hre.r(obj);
                Iterator it2 = ((List) aw7Var.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (c16.i(((u2c) it2.next()).a, str)) {
                            i2 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                return new Integer(i2);
            default:
                hre.r(obj);
                Iterator it3 = ((List) aw7Var.getValue()).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (c16.i(((lbd) it3.next()).a, str)) {
                            i2 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                return new Integer(i2);
        }
    }
}
