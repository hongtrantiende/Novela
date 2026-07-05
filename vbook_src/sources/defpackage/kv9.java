package defpackage;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kv9  reason: default package */
/* loaded from: classes.dex */
public final class kv9 {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final jla a = new jla(0);
    public final Context b;
    public final p88 c;
    public final ScheduledThreadPoolExecutor d;
    public final Messenger e;
    public Messenger f;
    public tge g;

    /* JADX WARN: Type inference failed for: r0v1, types: [p88, java.lang.Object] */
    public kv9(Context context) {
        this.b = context;
        ?? obj = new Object();
        obj.b = 0;
        obj.c = context;
        this.c = obj;
        this.e = new Messenger(new hjf(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ux7("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final void a(String str, Bundle bundle) {
        jla jlaVar = this.a;
        synchronized (jlaVar) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) jlaVar.remove(str);
                if (taskCompletionSource == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
                    sb.append("Missing callback for ");
                    sb.append(str);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task b(Bundle bundle) {
        String num;
        synchronized (kv9.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        jla jlaVar = this.a;
        synchronized (jlaVar) {
            jlaVar.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.D() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (kv9.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, c8f.a);
                }
                intent.putExtra("app", i);
            } finally {
            }
        }
        intent.putExtra("kid", nk2.v(new StringBuilder(String.valueOf(num).length() + 5), "|ID|", num, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.a.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(f73.c, new yx9(20, this, num, this.d.schedule(new og(taskCompletionSource, 15), 30L, TimeUnit.SECONDS)));
            return taskCompletionSource.getTask();
        }
        int D = this.c.D();
        Context context2 = this.b;
        if (D == 2) {
            if (Build.VERSION.SDK_INT < 34) {
                context2.sendBroadcast(intent);
            } else {
                context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            context2.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(f73.c, new yx9(20, this, num, this.d.schedule(new og(taskCompletionSource, 15), 30L, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }
}
