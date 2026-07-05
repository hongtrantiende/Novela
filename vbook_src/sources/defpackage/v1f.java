package defpackage;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v1f  reason: default package */
/* loaded from: classes.dex */
public final class v1f {
    public final iye a;

    public v1f(iye iyeVar) {
        this.a = iyeVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fze, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public static g0 b(Task task) {
        ?? obj = new Object();
        obj.D = task;
        xk9 xk9Var = new xk9((Object) obj, 22);
        e73 e73Var = e73.a;
        task.addOnCompleteListener(e73Var, xk9Var);
        return dv4.a(obj, fv.class, s1f.b, e73Var);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, vz0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k32] */
    public final g0 a(rwa rwaVar) {
        String sb;
        iye iyeVar = this.a;
        String simpleName = wye.class.getSimpleName();
        Looper looper = iyeVar.g;
        am8.t(looper, "Looper must not be null");
        ?? obj = new Object();
        obj.a = new p35(looper);
        am8.p(simpleName);
        obj.b = new mr6(rwaVar, simpleName);
        String p = ru.p();
        if (p == null) {
            sb = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int identityHashCode = System.identityHashCode(wye.class);
            StringBuilder sb2 = new StringBuilder(p.length() + 1 + String.valueOf(identityHashCode).length());
            sb2.append(p);
            sb2.append("|");
            sb2.append(identityHashCode);
            sb = sb2.toString();
        }
        jje jjeVar = new jje(iyeVar, sb, (Object) obj, 5);
        h88 h88Var = h88.K;
        ?? obj2 = new Object();
        obj2.d = obj;
        obj2.b = jjeVar;
        obj2.c = h88Var;
        obj2.e = new mb4[]{sxd.k};
        obj2.a = false;
        mr6 mr6Var = (mr6) ((k32) obj2.d).b;
        am8.t(mr6Var, "Key must not be null");
        k32 k32Var = (k32) obj2.d;
        o40 o40Var = new o40((vz0) obj2, k32Var, (mb4[]) obj2.e, obj2.a);
        xk9 xk9Var = new xk9((vz0) obj2, mr6Var);
        am8.t((mr6) k32Var.b, "Listener has already been released.");
        yz4 yz4Var = iyeVar.k;
        yz4Var.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        yz4Var.b(taskCompletionSource, 0, iyeVar);
        vud vudVar = new vud(new evd(new wud(o40Var, xk9Var), taskCompletionSource), yz4Var.E.get(), iyeVar);
        ovd ovdVar = yz4Var.J;
        ovdVar.sendMessage(ovdVar.obtainMessage(8, vudVar));
        return b(taskCompletionSource.getTask());
    }
}
