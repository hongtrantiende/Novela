package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: of4  reason: default package */
/* loaded from: classes.dex */
public final class of4 implements bg0 {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.bg0
    public final void a(boolean z) {
        synchronized (qf4.k) {
            try {
                ArrayList arrayList = new ArrayList(qf4.l.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    qf4 qf4Var = (qf4) obj;
                    if (qf4Var.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = qf4Var.i.iterator();
                        while (it.hasNext()) {
                            qf4 qf4Var2 = ((nf4) it.next()).a;
                            if (!z) {
                                ((cu2) qf4Var2.h.get()).a();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
