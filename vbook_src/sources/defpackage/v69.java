package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v69  reason: default package */
/* loaded from: classes.dex */
public final class v69 {
    public static final String l = r95.r("Processor");
    public final Context b;
    public final xy1 c;
    public final omd d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public v69(Context context, xy1 xy1Var, omd omdVar, WorkDatabase workDatabase) {
        this.b = context;
        this.c = xy1Var;
        this.d = omdVar;
        this.e = workDatabase;
    }

    public static boolean d(String str, nnd nndVar, int i) {
        String str2 = l;
        if (nndVar != null) {
            nndVar.m.s(new fnd(i));
            r95 n = r95.n();
            n.c(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        r95 n2 = r95.n();
        n2.c(str2, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(qy3 qy3Var) {
        synchronized (this.k) {
            this.j.add(qy3Var);
        }
    }

    public final nnd b(String str) {
        boolean z;
        nnd nndVar = (nnd) this.f.remove(str);
        if (nndVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            nndVar = (nnd) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = egb.F;
                        Intent intent = new Intent(context, SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        this.b.startService(intent);
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return nndVar;
    }

    public final nnd c(String str) {
        nnd nndVar = (nnd) this.f.get(str);
        if (nndVar == null) {
            return (nnd) this.g.get(str);
        }
        return nndVar;
    }
}
