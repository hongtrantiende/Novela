package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.optimizer.OptRuntime;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iu1 implements hu1, pr6, or6, OnCompleteListener, Continuation, n47, h12, ContextAction, fz2, rka, fw9, lfb, q51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iu1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.rka
    public boolean a() {
        z49 z49Var = (z49) this.b;
        ee0 ee0Var = (ee0) this.c;
        if (!z49Var.q) {
            z49Var.h();
            long a = ee0.a(z49Var.o, ee0Var.a);
            ee0Var.a = a;
            z49Var.q = !z49Var.g(z49Var.n, a + ee0Var.b);
        }
        return z49Var.q;
    }

    @Override // defpackage.h12
    public void accept(Object obj) {
        cl3 cl3Var = (cl3) this.b;
        ((k67) obj).d(cl3Var.a, cl3Var.b, (h57) this.c);
    }

    @Override // defpackage.fw9
    public Object apply(Object obj) {
        c69[] values;
        hw9 hw9Var = (hw9) this.b;
        ld0 ld0Var = (ld0) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        kc0 kc0Var = hw9Var.d;
        ArrayList G = hw9Var.G(sQLiteDatabase, ld0Var, kc0Var.b);
        for (c69 c69Var : c69.values()) {
            if (c69Var != ld0Var.c) {
                int size = kc0Var.b - G.size();
                if (size <= 0) {
                    break;
                }
                G.addAll(hw9Var.G(sQLiteDatabase, ld0Var.b(c69Var), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < G.size(); i++) {
            sb.append(((yc0) G.get(i)).a);
            if (i < G.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", ES6Iterator.VALUE_PROPERTY}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new gw9(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = G.listIterator();
        while (listIterator.hasNext()) {
            yc0 yc0Var = (yc0) listIterator.next();
            long j2 = yc0Var.a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                kn c = yc0Var.c.c();
                for (gw9 gw9Var : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.e(gw9Var.a, gw9Var.b);
                }
                listIterator.set(new yc0(j2, yc0Var.b, c.f()));
            }
        }
        return G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [s6f, java.lang.Object] */
    @Override // defpackage.pr6
    public void b(Object obj, ci4 ci4Var) {
        cz8 cz8Var = (cz8) this.c;
        dd ddVar = (dd) obj;
        SparseArray sparseArray = ((ms2) this.b).e;
        ?? obj2 = new Object();
        obj2.a = ci4Var;
        SparseBooleanArray sparseBooleanArray = ci4Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            wq9.w(i, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i);
            cd cdVar = (cd) sparseArray.get(keyAt);
            cdVar.getClass();
            sparseArray2.append(keyAt, cdVar);
        }
        obj2.b = sparseArray2;
        ((l57) ddVar).k(cz8Var, obj2);
    }

    @Override // defpackage.n47
    public int c(Object obj) {
        Context context = (Context) this.b;
        vq4 vq4Var = (vq4) this.c;
        h47 h47Var = (h47) obj;
        String str = h47Var.b;
        if ((!str.equals(vq4Var.o) && !str.equals(o47.c(vq4Var))) || !h47Var.c(context, vq4Var, false) || !h47Var.d(vq4Var)) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.q51
    public Object d(p51 p51Var) {
        Executor executor = (Executor) this.b;
        vt4 vt4Var = (vt4) this.c;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        fr6 fr6Var = new fr6(atomicBoolean, 1);
        kq9 kq9Var = p51Var.c;
        if (kq9Var != null) {
            kq9Var.a(fr6Var, d73.a);
        }
        executor.execute(new gr6(atomicBoolean, p51Var, vt4Var, 1));
        return pvc.a;
    }

    @Override // defpackage.fz2
    public void f(l99 l99Var) {
        ((fz2) this.b).f(l99Var);
        ((fz2) this.c).f(l99Var);
    }

    @Override // defpackage.lfb
    public Object h() {
        int i = this.a;
        Object obj = this.c;
        tc0 tc0Var = (tc0) this.b;
        switch (i) {
            case 15:
                Iterable iterable = (Iterable) obj;
                hw9 hw9Var = (hw9) tc0Var.c;
                hw9Var.getClass();
                if (iterable.iterator().hasNext()) {
                    hw9Var.o().compileStatement("DELETE FROM events WHERE _id in ".concat(hw9.V(iterable))).execute();
                }
                return null;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((hw9) tc0Var.i).Q(((Integer) entry.getValue()).intValue(), cw6.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override // defpackage.or6
    public void invoke(Object obj) {
        cd cdVar = (cd) this.b;
        h57 h57Var = (h57) this.c;
        l57 l57Var = (l57) ((dd) obj);
        l57Var.getClass();
        e67 e67Var = cdVar.d;
        if (e67Var != null) {
            vq4 vq4Var = h57Var.c;
            vq4Var.getClass();
            int i = h57Var.d;
            nw2 nw2Var = l57Var.c;
            aac aacVar = cdVar.b;
            e67Var.getClass();
            kj kjVar = new kj(vq4Var, i, nw2Var.c(aacVar, e67Var));
            int i2 = h57Var.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        l57Var.r = kjVar;
                        return;
                    }
                } else {
                    l57Var.q = kjVar;
                    return;
                }
            }
            l57Var.p = kjVar;
        }
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        int i = this.a;
        Object obj = this.c;
        String str = (String) this.b;
        switch (i) {
            case 0:
                pt1 pt1Var = (pt1) obj;
                try {
                    Trace.beginSection(str);
                    return pt1Var.f.j(yvVar);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) yvVar.a(Context.class);
                int i2 = ((fb4) obj).a;
                String str2 = "";
                switch (i2) {
                    case 3:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str2 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        break;
                    case 4:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            str2 = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        break;
                    case 5:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            str2 = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            str2 = "watch";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            str2 = "auto";
                            break;
                        } else if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            str2 = "embedded";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str2 = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        break;
                }
                return new sc0(str, str2);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = EnhancedIntentService.f;
        ((EnhancedIntentService) this.b).a((Intent) this.c);
    }

    @Override // org.mozilla.javascript.ContextAction
    public Object run(org.mozilla.javascript.Context context) {
        return OptRuntime.b((String[]) this.b, (Script) this.c, context);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Exception executionException;
        Exception executionException2;
        switch (this.a) {
            case 4:
                bm1 bm1Var = (bm1) this.b;
                ExecutorService executorService = (ExecutorService) this.c;
                bm1Var.getClass();
                if (!task.isSuccessful()) {
                    if (task.getException() != null) {
                        executionException = task.getException();
                    } else {
                        executionException = new ExecutionException(new RuntimeException("Unexpected Error"));
                    }
                    return Tasks.forException(executionException);
                }
                String str = (String) task.getResult();
                return ((hg4) ((ig4) bm1Var.d)).d().continueWithTask(Executors.newSingleThreadExecutor(new ux7("Firebase-Messaging-Network-Io")), new iu1(bm1Var, str, 5)).continueWith(executorService, new q6(str, 22));
            case 5:
                bm1 bm1Var2 = (bm1) this.c;
                String str2 = (String) this.b;
                qf4 qf4Var = (qf4) bm1Var2.c;
                if (!task.isSuccessful()) {
                    if (task.getException() != null) {
                        executionException2 = task.getException();
                    } else {
                        executionException2 = new ExecutionException(new RuntimeException("Unexpected Error"));
                    }
                    return Tasks.forException(executionException2);
                }
                String str3 = ((rc0) task.getResult()).a;
                qf4Var.a();
                sg4 sg4Var = qf4Var.c;
                String str4 = sg4Var.a;
                qf4Var.a();
                lm9 lm9Var = new lm9(ui5.d(qf4Var), sg4Var.b, str4, str2, str3);
                xb4 xb4Var = (xb4) bm1Var2.b;
                xb4Var.getClass();
                uu5 b = uu5.b();
                b.d = new mb4[]{nmd.d};
                b.c = new hvc(18, xb4Var, lm9Var);
                b.b = 39001;
                return xb4Var.b(0, b.a());
            default:
                s26 s26Var = (s26) this.c;
                String str5 = (String) this.b;
                synchronized (s26Var) {
                    ((yz) s26Var.c).remove(str5);
                }
                return task;
        }
    }

    public /* synthetic */ iu1(Object obj, String str, int i) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }
}
