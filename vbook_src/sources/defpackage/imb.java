package defpackage;

import android.app.RemoteAction;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: imb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class imb implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ imb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        ksb ksbVar;
        qbc qbcVar;
        int i = this.a;
        boolean z = false;
        pvc pvcVar = pvc.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dub dubVar = (dub) obj;
                return new yk8(dubVar.d().d, new fxb(b23.r(dubVar)));
            case 1:
                return yae.z(Boolean.valueOf(((nnb) obj).D));
            case 2:
                if (rg3.a(((rh8) obj).d(), nae.e) > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                nc6.f((RemoteAction) obj);
                return pvcVar;
            case 4:
                epb epbVar = (epb) obj;
                if (epbVar.J) {
                    return mwe.j(epbVar);
                }
                return nob.b;
            case 5:
                ssb ssbVar = (ssb) obj;
                return new y78(jxe.n(ssbVar.M, ssbVar.N, ssbVar.O, ((zy5) ssbVar.Q.getValue()).a));
            case 6:
                msb msbVar = ((hvb) obj).a;
                lsb lsbVar = (lsb) msbVar.a.getValue();
                if (lsbVar == null || (ksbVar = (ksb) msbVar.b.getValue()) == null) {
                    return null;
                }
                return msbVar.f(lsbVar, ksbVar);
            case 7:
                return new py5(((uy5) obj).d());
            case 8:
                myb mybVar = (myb) obj;
                mybVar.U = null;
                ak0.t(mybVar);
                ube.y(mybVar);
                hud.o(mybVar);
                return Boolean.TRUE;
            case 9:
                if (((cyb) obj).d() != p7a.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                ((qbc) obj).j0.invoke(Boolean.valueOf(!qbcVar.i0));
                return pvcVar;
            case 11:
                ((l13) obj).a(true);
                return pvcVar;
            case 12:
                g0d g0dVar = (g0d) obj;
                if (!g0dVar.C && g0dVar.D) {
                    g0dVar.j();
                }
                return pvcVar;
            case 13:
                ubd ubdVar = (ubd) obj;
                hk1 a = jdd.a(ubdVar);
                sw2 sw2Var = ab3.a;
                ubdVar.f(a, ru2.c, new q4c(ubdVar, (m42) null, 22));
                return pvcVar;
            case 14:
                float f = ((tl) obj).a.getWindow().getAttributes().screenBrightness;
                Float valueOf = Float.valueOf(f);
                if (nae.e > f || f > 1.0f) {
                    return null;
                }
                return valueOf;
            case 15:
                j9d j9dVar = ((gcd) obj).n;
                if (j9dVar == null) {
                    return null;
                }
                return j9dVar.n();
            case 16:
                nid nidVar = (nid) obj;
                if (rg3.a(nidVar.a, nidVar.b) > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                return Float.valueOf(((dx4) obj).b.h());
            case 18:
                return Float.valueOf(((ddd) obj).b()[0]);
            case 19:
                ydd yddVar = (ydd) obj;
                qdd qddVar = yddVar.a;
                if (qddVar != null) {
                    Long l = yddVar.b;
                    LinkedHashMap linkedHashMap = qddVar.a;
                    Object obj2 = linkedHashMap.get(l);
                    if (obj2 == null) {
                        obj2 = new xdd();
                        linkedHashMap.put(l, obj2);
                    }
                    return (xdd) ((gdd) obj2);
                }
                return new xdd();
            case 20:
                return Float.valueOf(((zc6) ((ied) obj).d.getValue()).j.b);
            case 21:
                amd amdVar = (amd) obj;
                String str = rt3.a;
                lmd lmdVar = amdVar.a;
                HashSet hashSet = new HashSet();
                hashSet.addAll(amdVar.e);
                HashSet b = amd.b(amdVar);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (b.contains((String) it.next())) {
                            z = true;
                        }
                    } else {
                        hashSet.removeAll(amdVar.e);
                    }
                }
                if (!z) {
                    WorkDatabase workDatabase = lmdVar.c;
                    xy1 xy1Var = lmdVar.b;
                    workDatabase.b();
                    try {
                        aye.f(workDatabase, xy1Var, amdVar);
                        boolean a2 = rt3.a(amdVar);
                        workDatabase.p();
                        if (a2) {
                            g0a.b(xy1Var, lmdVar.c, lmdVar.e);
                        }
                        return pvcVar;
                    } finally {
                        workDatabase.l();
                    }
                }
                fb4.g(amdVar, ")", "WorkContinuation has cycles (");
                return null;
            case 22:
                return ((Worker) obj).c();
            default:
                return new atd((pq2) obj, 1.0f, nae.e, nae.e);
        }
    }
}
