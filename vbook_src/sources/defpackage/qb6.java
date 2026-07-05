package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qb6  reason: default package */
/* loaded from: classes.dex */
public final class qb6 implements ob6 {
    public final use C;
    public final nb6 a;
    public final xze b;
    public final rwa c;
    public final Executor d;
    public final AtomicReference e;
    public final CancellationTokenSource f = new CancellationTokenSource();

    public qb6(nb6 nb6Var, dne dneVar, xze xzeVar, Executor executor) {
        use useVar;
        this.a = nb6Var;
        this.b = xzeVar;
        this.d = executor;
        this.e = new AtomicReference(dneVar);
        if (dneVar.g) {
            useVar = use.TYPE_THICK;
        } else {
            useVar = use.TYPE_THIN;
        }
        this.C = useVar;
        this.c = new rwa((Context) uc7.b().a(Context.class), 24);
    }

    public static final ose V(Float f) {
        bp9 bp9Var = new bp9(18);
        bp9Var.b = Float.valueOf(f.floatValue());
        return new ose(bp9Var);
    }

    public final void S(long j, boolean z, nve nveVar, xse xseVar) {
        String a;
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        xze xzeVar = this.b;
        ate ateVar = ate.ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT;
        xzeVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = xzeVar.i;
        if (hashMap.get(ateVar) == null || elapsedRealtime2 - ((Long) hashMap.get(ateVar)).longValue() > 30000) {
            hashMap.put(ateVar, Long.valueOf(elapsedRealtime2));
            jje jjeVar = new jje(3);
            jjeVar.c = V(this.a.a);
            jje jjeVar2 = new jje(2);
            jjeVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            jjeVar2.d = Boolean.valueOf(z);
            jjeVar2.c = xseVar;
            jjeVar.b = new xre(jjeVar2);
            if (nveVar != null) {
                jjeVar.d = nveVar;
            }
            odd oddVar = new odd(15, false);
            oddVar.d = this.C;
            oddVar.e = new pve(jjeVar);
            kj kjVar = new kj(oddVar, 0);
            Task task = xzeVar.e;
            if (task.isSuccessful()) {
                a = (String) task.getResult();
            } else {
                a = gn6.c.a(xzeVar.g);
            }
            eqe.a.execute(new sid(xzeVar, kjVar, ateVar, a, 6));
        }
        long currentTimeMillis = System.currentTimeMillis();
        rwa rwaVar = this.c;
        if (this.C == use.TYPE_THICK) {
            i = 24603;
        } else {
            i = 24602;
        }
        int i2 = i;
        int i3 = xseVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (rwaVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) rwaVar.c).get() != -1 && elapsedRealtime3 - ((AtomicLong) rwaVar.c).get() <= 1800000) {
                return;
            }
            ((xb4) rwaVar.b).c(new elb(0, Arrays.asList(new cc7(i2, i3, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new zg1(rwaVar, elapsedRealtime3, 7));
        }
    }

    @Override // defpackage.ob6, java.io.Closeable, java.lang.AutoCloseable
    @zb8(jn6.ON_DESTROY)
    public void close() {
        boolean z;
        String a;
        dne dneVar = (dne) this.e.getAndSet(null);
        if (dneVar == null) {
            return;
        }
        this.f.cancel();
        if (dneVar.b.get() > 0) {
            z = true;
        } else {
            z = false;
        }
        am8.v(z);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        dneVar.a.j(new bv4(28, dneVar, taskCompletionSource), this.d);
        taskCompletionSource.getTask();
        odd oddVar = new odd(15, false);
        oddVar.d = this.C;
        jje jjeVar = new jje(3);
        jjeVar.c = V(this.a.a);
        oddVar.e = new pve(jjeVar);
        kj kjVar = new kj(oddVar, 1);
        xze xzeVar = this.b;
        Task task = xzeVar.e;
        if (task.isSuccessful()) {
            a = (String) task.getResult();
        } else {
            a = gn6.c.a(xzeVar.g);
        }
        eqe.a.execute(new sid(xzeVar, kjVar, ate.ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE, a, 6));
    }
}
