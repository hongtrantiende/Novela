package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zye  reason: default package */
/* loaded from: classes.dex */
public final class zye extends BroadcastReceiver {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ gca c;
    public final /* synthetic */ g99 d;
    public final /* synthetic */ Executor e;

    public zye(AtomicBoolean atomicBoolean, Context context, gca gcaVar, g99 g99Var, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = gcaVar;
        this.d = g99Var;
        this.e = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [qoc, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            gca gcaVar = this.c;
            g99 g99Var = this.d;
            Executor executor = this.e;
            ?? obj = new Object();
            obj.E = new poc((qoc) obj, g99Var);
            executor.execute(obj);
            gcaVar.n(obj);
        }
    }
}
