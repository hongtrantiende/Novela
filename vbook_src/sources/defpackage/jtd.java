package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jtd  reason: default package */
/* loaded from: classes.dex */
public final class jtd {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final bud b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final gud i;
    public itd m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final dud k = new IBinder.DeathRecipient() { // from class: dud
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            jtd jtdVar = jtd.this;
            int i = 0;
            jtdVar.b.b("reportBinderDeath", new Object[0]);
            if (jtdVar.j.get() == null) {
                jtdVar.b.b("%s : Binder has died.", jtdVar.c);
                ArrayList arrayList = jtdVar.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((cud) obj).a(new RemoteException(String.valueOf(jtdVar.c).concat(" : Binder has died.")));
                }
                jtdVar.d.clear();
                synchronized (jtdVar.f) {
                    jtdVar.e();
                }
                return;
            }
            vm1.h();
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [dud] */
    public jtd(Context context, bud budVar, String str, Intent intent, gud gudVar) {
        this.a = context;
        this.b = budVar;
        this.c = str;
        this.h = intent;
        this.i = gudVar;
    }

    public static void b(jtd jtdVar, cud cudVar) {
        IInterface iInterface = jtdVar.n;
        bud budVar = jtdVar.b;
        ArrayList arrayList = jtdVar.d;
        int i = 0;
        if (iInterface == null && !jtdVar.g) {
            budVar.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(cudVar);
            itd itdVar = new itd(jtdVar);
            jtdVar.m = itdVar;
            jtdVar.g = true;
            if (!jtdVar.a.bindService(jtdVar.h, itdVar, 1)) {
                budVar.b("Failed to bind to the service.", new Object[0]);
                jtdVar.g = false;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((cud) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (jtdVar.g) {
            budVar.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(cudVar);
        } else {
            cudVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(cud cudVar, TaskCompletionSource taskCompletionSource) {
        a().post(new eud(this, cudVar.c(), taskCompletionSource, cudVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new htd(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
