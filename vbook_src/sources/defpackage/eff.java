package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eff  reason: default package */
/* loaded from: classes.dex */
public abstract class eff {
    public static final WeakHashMap a = new WeakHashMap();
    public static final WeakHashMap b = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable th2;
        boolean z;
        fn8 fn8Var;
        Closeable closeable;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            th2 = th;
            while (th2 != null) {
                try {
                    if (weakHashMap.containsKey(th2)) {
                        break;
                    }
                    th2 = th2.getCause();
                } finally {
                }
            }
            if (th2 != null) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(th, Boolean.valueOf(z));
        }
        if (th2 == null) {
            WeakHashMap weakHashMap2 = a;
            synchronized (weakHashMap2) {
                Throwable th3 = th;
                while (th3 != null) {
                    try {
                        if (weakHashMap2.containsKey(th3)) {
                            break;
                        }
                        th3 = th3.getCause();
                    } finally {
                    }
                }
                if (th3 == null) {
                    fn8Var = null;
                } else {
                    weakHashMap2.put(th, (wef) weakHashMap2.get(th3));
                    fn8Var = new fn8(29);
                }
            }
            if (fn8Var == null && (closeable = kff.c().b) != null) {
                ArrayList arrayList = new ArrayList();
                for (closeable = kff.c().b; closeable != null; closeable = ((ref) closeable).a) {
                    arrayList.add(closeable);
                }
                UUID uuid = ((ref) ((sgf) arrayList.get(0))).b;
                if (uuid != null) {
                    ((sgf) arrayList.get(0)).getClass();
                    ls5 j = qs5.j(arrayList.size());
                    ls5 j2 = qs5.j(arrayList.size());
                    for (sgf sgfVar : uue.D(arrayList)) {
                        j2.b(((ref) sgfVar).d);
                        j.b(sgfVar.zzh());
                    }
                    WeakHashMap weakHashMap3 = a;
                    synchronized (weakHashMap3) {
                        try {
                            mm9 g = j2.g();
                            if (g != null) {
                                mm9 g2 = j.g();
                                if (g2 != null) {
                                    weakHashMap3.put(th, new wef(g, g2, uuid));
                                } else {
                                    throw new NullPointerException("Null extras");
                                }
                            } else {
                                throw new NullPointerException("Null spansNames");
                            }
                        } finally {
                        }
                    }
                    return;
                }
                xk5.k("Null rootTraceId");
            }
        }
    }
}
