package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fic  reason: default package */
/* loaded from: classes.dex */
public final class fic {
    public final Context a;
    public final ui5 b;
    public final yx9 c;
    public final ScheduledThreadPoolExecutor e;
    public final dic g;
    public final yz d = new jla(0);
    public boolean f = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [yz, jla] */
    public fic(ui5 ui5Var, dic dicVar, yx9 yx9Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = ui5Var;
        this.g = dicVar;
        this.c = yx9Var;
        this.a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public final Task a(cic cicVar) {
        ArrayDeque arrayDeque;
        dic dicVar = this.g;
        synchronized (dicVar) {
            bm1 bm1Var = dicVar.a;
            String str = cicVar.c;
            bm1Var.getClass();
            if (!TextUtils.isEmpty(str) && !str.contains((String) bm1Var.d)) {
                synchronized (((ArrayDeque) bm1Var.e)) {
                    if (((ArrayDeque) bm1Var.e).add(str)) {
                        ((ScheduledThreadPoolExecutor) bm1Var.f).execute(new e09(bm1Var, 3));
                    }
                }
            }
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.d) {
            try {
                String str2 = cicVar.c;
                if (this.d.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.d.get(str2);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.d.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
        return taskCompletionSource.getTask();
    }

    public final synchronized void b(boolean z) {
        this.f = z;
    }

    public final void c() {
        boolean z;
        if (this.g.a() != null) {
            synchronized (this) {
                z = this.f;
            }
            if (!z) {
                e(0L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0 A[Catch: IOException -> 0x008a, TRY_LEAVE, TryCatch #1 {IOException -> 0x008a, blocks: (B:15:0x002d, B:32:0x00d8, B:34:0x00e0, B:20:0x003f, B:22:0x0047, B:24:0x0077, B:27:0x008d, B:29:0x0095, B:31:0x00c5), top: B:82:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fic.d():boolean");
    }

    public final void e(long j) {
        this.e.schedule(new hic(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        b(true);
    }
}
