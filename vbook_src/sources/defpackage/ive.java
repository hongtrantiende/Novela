package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ive  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ive implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5f b;

    public /* synthetic */ ive(r5f r5fVar, int i) {
        this.a = i;
        this.b = r5fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r5f r5fVar = this.b;
                synchronized (r5fVar) {
                    if (r5fVar.a == 1) {
                        r5fVar.b("Timed out while binding");
                    }
                }
                return;
            case 1:
                break;
            default:
                this.b.b("Service disconnected");
                return;
        }
        while (true) {
            r5f r5fVar2 = this.b;
            synchronized (r5fVar2) {
                try {
                    if (r5fVar2.a == 2) {
                        ArrayDeque arrayDeque = r5fVar2.d;
                        if (arrayDeque.isEmpty()) {
                            r5fVar2.d();
                            return;
                        }
                        e8f e8fVar = (e8f) arrayDeque.poll();
                        SparseArray sparseArray = r5fVar2.e;
                        int i = e8fVar.a;
                        sparseArray.put(i, e8fVar);
                        ((ScheduledExecutorService) r5fVar2.f.d).schedule(new w1f(r5fVar2, false, e8fVar, 2), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(e8fVar)));
                        }
                        vdf vdfVar = r5fVar2.f;
                        Messenger messenger = r5fVar2.b;
                        int i2 = e8fVar.c;
                        Message obtain = Message.obtain();
                        obtain.what = i2;
                        obtain.arg1 = i;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", e8fVar.a());
                        bundle.putString("pkg", ((Context) vdfVar.c).getPackageName());
                        bundle.putBundle("data", e8fVar.d);
                        obtain.setData(bundle);
                        try {
                            hvc hvcVar = r5fVar2.c;
                            Messenger messenger2 = (Messenger) hvcVar.b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                tge tgeVar = (tge) hvcVar.c;
                                if (tgeVar != null) {
                                    tgeVar.a.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                            }
                        } catch (RemoteException e) {
                            r5fVar2.b(e.getMessage());
                        }
                    } else {
                        return;
                    }
                } finally {
                }
            }
        }
    }
}
