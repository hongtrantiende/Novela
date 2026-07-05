package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xp3  reason: default package */
/* loaded from: classes.dex */
public final class xp3 extends axe {
    public final /* synthetic */ zc d;

    public xp3(zc zcVar) {
        this.d = zcVar;
    }

    @Override // defpackage.axe
    public final void n(Throwable th) {
        ((cq3) this.d.a).f(th);
    }

    @Override // defpackage.axe
    public final void o(oaa oaaVar) {
        Set<int[]> t;
        zc zcVar = this.d;
        zcVar.c = oaaVar;
        oaa oaaVar2 = (oaa) zcVar.c;
        cq3 cq3Var = (cq3) zcVar.a;
        r0f r0fVar = cq3Var.g;
        zt2 zt2Var = cq3Var.i;
        if (Build.VERSION.SDK_INT >= 34) {
            t = hq3.a();
        } else {
            t = dxe.t();
        }
        zcVar.b = new ij1(oaaVar2, r0fVar, zt2Var, t);
        cq3 cq3Var2 = (cq3) zcVar.a;
        ArrayList arrayList = new ArrayList();
        cq3Var2.a.writeLock().lock();
        try {
            cq3Var2.c = 1;
            arrayList.addAll(cq3Var2.b);
            cq3Var2.b.clear();
            cq3Var2.a.writeLock().unlock();
            cq3Var2.d.post(new aq3(arrayList, cq3Var2.c, null));
        } catch (Throwable th) {
            cq3Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
