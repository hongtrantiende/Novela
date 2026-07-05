package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g0a  reason: default package */
/* loaded from: classes.dex */
public abstract class g0a {
    public static final String a = r95.r("Schedulers");

    public static void a(bnd bndVar, bl8 bl8Var, List list) {
        if (list.size() > 0) {
            bl8Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bndVar.g(currentTimeMillis, ((ymd) it.next()).a);
            }
        }
    }

    public static void b(xy1 xy1Var, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            bnd w = workDatabase.w();
            workDatabase.b();
            try {
                fu9 fu9Var = w.a;
                fu9 fu9Var2 = w.a;
                List list2 = (List) gae.l(fu9Var, true, false, new x8d(13));
                a(w, xy1Var.d, list2);
                List list3 = (List) gae.l(fu9Var2, true, false, new tr0(xy1Var.k, 20));
                a(w, xy1Var.d, list3);
                list3.addAll(list2);
                List list4 = (List) gae.l(fu9Var2, true, false, new x8d(16));
                workDatabase.p();
                workDatabase.l();
                if (list3.size() > 0) {
                    ymd[] ymdVarArr = (ymd[]) list3.toArray(new ymd[list3.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        d0a d0aVar = (d0a) it.next();
                        if (d0aVar.c()) {
                            d0aVar.e(ymdVarArr);
                        }
                    }
                }
                if (list4.size() > 0) {
                    ymd[] ymdVarArr2 = (ymd[]) list4.toArray(new ymd[list4.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        d0a d0aVar2 = (d0a) it2.next();
                        if (!d0aVar2.c()) {
                            d0aVar2.e(ymdVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
    }
}
