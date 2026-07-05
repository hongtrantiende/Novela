package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lmd  reason: default package */
/* loaded from: classes.dex */
public final class lmd {
    public static lmd k;
    public static lmd l;
    public static final Object m;
    public final Context a;
    public final xy1 b;
    public final WorkDatabase c;
    public final omd d;
    public final List e;
    public final v69 f;
    public final fz4 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final ojc j;

    static {
        r95.r("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public lmd(Context context, final xy1 xy1Var, omd omdVar, final WorkDatabase workDatabase, final List list, v69 v69Var, ojc ojcVar) {
        int i = 0;
        Context applicationContext = context.getApplicationContext();
        yk8 yk8Var = null;
        if (!applicationContext.isDeviceProtectedStorage()) {
            r95 r95Var = new r95(xy1Var.h, 1);
            synchronized (r95.C) {
                try {
                    if (r95.D == null) {
                        r95.D = r95Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a = applicationContext;
            this.d = omdVar;
            this.c = workDatabase;
            this.f = v69Var;
            this.j = ojcVar;
            this.b = xy1Var;
            this.e = list;
            f82 f82Var = omdVar.b;
            f82Var.getClass();
            m41 a = k27.a(f82Var);
            this.g = new fz4(workDatabase);
            final r9a r9aVar = omdVar.a;
            String str = g0a.a;
            v69Var.a(new qy3() { // from class: f0a
                @Override // defpackage.qy3
                public final void b(hmd hmdVar, boolean z) {
                    r9aVar.execute(new rw2(list, hmdVar, xy1Var, workDatabase, 1));
                }
            });
            omdVar.a.execute(new iq4(applicationContext, this));
            String str2 = kvc.a;
            if (u69.a(applicationContext, xy1Var)) {
                fu9 fu9Var = workDatabase.w().a;
                x8d x8dVar = new x8d(15);
                w16 f = fu9Var.f();
                String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
                koc kocVar = f.b;
                kocVar.getClass();
                xba xbaVar = new xba();
                for (String str3 : strArr) {
                    String lowerCase = str3.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    Set set = (Set) ((LinkedHashMap) kocVar.d).get(lowerCase);
                    if (set != null) {
                        xbaVar.addAll(set);
                    } else {
                        xbaVar.add(str3);
                    }
                }
                String[] strArr2 = (String[]) fca.d(xbaVar).toArray(new String[0]);
                int length = strArr2.length;
                int[] iArr = new int[length];
                while (true) {
                    if (i < length) {
                        String str4 = strArr2[i];
                        String lowerCase2 = str4.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        Integer num = (Integer) ((LinkedHashMap) kocVar.e).get(lowerCase2);
                        if (num != null) {
                            iArr[i] = num.intValue();
                            i++;
                        } else {
                            vs.m("There is no table with name ".concat(str4));
                            break;
                        }
                    } else {
                        yk8Var = new yk8(strArr2, iArr);
                        break;
                    }
                }
                String[] strArr3 = (String[]) yk8Var.a;
                int[] iArr2 = (int[]) yk8Var.b;
                strArr3.getClass();
                iArr2.getClass();
                z1d.H(new ok4(z1d.A(z1d.r(new ja(9, new yh2(2, z1d.r(new s02(new byb(kocVar, iArr2, strArr3, (m42) null, 11), 6), -1), fu9Var, x8dVar), new aab(4, null)), -1)), new v65(applicationContext, (m42) null), 2), a);
                return;
            }
            return;
        }
        vs.k("Cannot initialize WorkManager in direct boot mode");
        throw null;
    }

    public static lmd b(Context context) {
        lmd lmdVar;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    lmdVar = k;
                    if (lmdVar == null) {
                        lmdVar = l;
                    }
                }
                return lmdVar;
            } finally {
            }
        }
        if (lmdVar != null) {
            return lmdVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final mu9 a(String str, kz3 kz3Var, jc8 jc8Var) {
        jc8Var.getClass();
        return new amd(this, str, kz3Var, tl1.A(jc8Var), 0).a();
    }

    public final void c() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        r0f r0fVar = this.b.m;
        d61 d61Var = new d61(this, 1);
        r0fVar.getClass();
        boolean l2 = sxd.l();
        if (l2) {
            try {
                Trace.beginSection(sxd.o("ReschedulingWork"));
            } finally {
                if (l2) {
                    Trace.endSection();
                }
            }
        }
        d61Var.invoke();
    }
}
