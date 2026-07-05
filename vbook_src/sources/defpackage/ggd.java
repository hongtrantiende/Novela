package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ggd  reason: default package */
/* loaded from: classes3.dex */
public final class ggd extends aab implements mu4 {
    public int a;
    public /* synthetic */ qv8 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ igd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggd(m42 m42Var, igd igdVar, boolean z) {
        super(3, m42Var);
        this.c = z;
        this.d = igdVar;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        ggd ggdVar = new ggd((m42) obj3, this.d, this.c);
        ggdVar.b = (qv8) obj;
        return ggdVar.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        qv8 qv8Var = this.b;
        int i = this.a;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        Object obj2 = qv8Var.a;
        ztc d = ((gh5) obj2).a.d();
        d.getClass();
        String str = d.a;
        if (!str.equals("ws") && !str.equals("wss")) {
            pw6 pw6Var = jgd.c;
            if (gwe.k(pw6Var)) {
                pw6Var.i("Skipping WebSocket plugin for non-websocket request: " + ((gh5) obj2).a);
                return pvcVar;
            }
        } else {
            pw6 pw6Var2 = jgd.c;
            if (gwe.k(pw6Var2)) {
                pw6Var2.i("Sending WebSocket request " + ((gh5) obj2).a);
            }
            gh5 gh5Var = (gh5) obj2;
            gh5Var.c(zfd.a, pvcVar);
            boolean z = this.c;
            igd igdVar = this.d;
            if (z) {
                ArrayList arrayList = igdVar.b.a;
                ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    if (((vt4) obj3).invoke() == null) {
                        arrayList2.add(null);
                    } else {
                        vm1.h();
                        return null;
                    }
                }
                gh5Var.f.f(jgd.a, arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                if (!it.hasNext()) {
                    if (!arrayList3.isEmpty()) {
                        kqe.t(gh5Var, "Sec-WebSocket-Extensions", sl1.i0(arrayList3, ",", null, null, null, 62));
                    }
                } else {
                    throw rs8.f(it);
                }
            }
            uy1 uy1Var = gh5Var.f;
            h40 h40Var = jgd.b;
            uy1Var.getClass();
            h40Var.getClass();
            igdVar.getClass();
            uy1Var.f(h40Var, igdVar);
            bgd bgdVar = new bgd();
            this.b = null;
            this.a = 1;
            Object d2 = qv8Var.d(this, bgdVar);
            n82 n82Var = n82.a;
            if (d2 == n82Var) {
                return n82Var;
            }
        }
        return pvcVar;
    }
}
