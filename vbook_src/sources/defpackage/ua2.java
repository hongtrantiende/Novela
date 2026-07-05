package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ua2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ua2 implements Continuation, lfb, iy2, q51, h12, fw9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ua2(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.h12
    public void accept(Object obj) {
        ((k67) obj).e(((cl3) this.b).a, (e67) this.c, (h57) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    @Override // defpackage.fw9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua2.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.iy2
    public mm9 c(int i, ajc ajcVar, int[] iArr) {
        gy2 gy2Var = (gy2) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        ls5 i2 = qs5.i();
        for (int i3 = 0; i3 < ajcVar.a; i3++) {
            i2.b(new hy2(i, ajcVar, i3, gy2Var, iArr[i3], str, str2));
        }
        return i2.g();
    }

    @Override // defpackage.q51
    public Object d(p51 p51Var) {
        int i = this.a;
        d73 d73Var = d73.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 3:
                Executor executor = (Executor) obj3;
                String str = (String) obj2;
                vt4 vt4Var = (vt4) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                fr6 fr6Var = new fr6(atomicBoolean, 0);
                kq9 kq9Var = p51Var.c;
                if (kq9Var != null) {
                    kq9Var.a(fr6Var, d73Var);
                }
                executor.execute(new gr6(atomicBoolean, p51Var, vt4Var, 0));
                return str;
            default:
                d82 d82Var = (d82) obj3;
                p82 p82Var = (p82) obj2;
                lu4 lu4Var = (lu4) obj;
                x0 x0Var = new x0((w26) d82Var.get(r0f.I), 26);
                kq9 kq9Var2 = p51Var.c;
                if (kq9Var2 != null) {
                    kq9Var2.a(x0Var, d73Var);
                }
                return z87.v(k27.a(d82Var), null, p82Var, new qq4(lu4Var, p51Var, null, 17), 1);
        }
    }

    @Override // defpackage.lfb
    public Object h() {
        tw2 tw2Var = (tw2) this.b;
        ld0 ld0Var = (ld0) this.c;
        jc0 jc0Var = (jc0) this.d;
        hw9 hw9Var = tw2Var.d;
        hw9Var.getClass();
        c69 c69Var = ld0Var.c;
        String str = jc0Var.a;
        String str2 = ld0Var.a;
        String p = mwe.p("SQLiteEventStore");
        if (Log.isLoggable(p, 3)) {
            Log.d(p, "Storing event with priority=" + c69Var + ", name=" + str + " for destination " + str2);
        }
        ((Long) hw9Var.C(new ua2(6, hw9Var, jc0Var, ld0Var))).getClass();
        tw2Var.a.i0(ld0Var, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.d;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.cancel();
        }
        return Tasks.forResult(null);
    }
}
