package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s30  reason: default package */
/* loaded from: classes.dex */
public final class s30 extends Handler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s30(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    private final void a(Message message) {
        int size;
        kve[] kveVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        oaa oaaVar = (oaa) this.b;
        do {
            synchronized (((HashMap) oaaVar.c)) {
                try {
                    size = ((ArrayList) oaaVar.e).size();
                    if (size <= 0) {
                        return;
                    }
                    kveVarArr = new kve[size];
                    ((ArrayList) oaaVar.e).toArray(kveVarArr);
                    ((ArrayList) oaaVar.e).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (size <= 0);
        kve kveVar = kveVarArr[0];
        throw null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        v57 v57Var;
        u57 u57Var;
        s30 s30Var;
        u57 u57Var2;
        t30 t30Var = null;
        switch (this.a) {
            case 0:
                u30 u30Var = (u30) this.b;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                AtomicReference atomicReference = u30Var.d;
                                IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                                while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                                }
                            } else {
                                try {
                                    u30Var.a.setParameters((Bundle) message.obj);
                                } catch (RuntimeException e) {
                                    AtomicReference atomicReference2 = u30Var.d;
                                    while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
                                    }
                                }
                            }
                        } else {
                            u30Var.e.c();
                        }
                    } else {
                        t30 t30Var2 = (t30) message.obj;
                        int i2 = t30Var2.a;
                        MediaCodec.CryptoInfo cryptoInfo = t30Var2.c;
                        long j = t30Var2.d;
                        int i3 = t30Var2.e;
                        try {
                            if (Build.VERSION.SDK_INT >= 31) {
                                u30Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                            } else {
                                synchronized (u30.D) {
                                    u30Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                                }
                            }
                        } catch (RuntimeException e2) {
                            AtomicReference atomicReference3 = u30Var.d;
                            while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                            }
                        }
                        t30Var = t30Var2;
                    }
                } else {
                    t30 t30Var3 = (t30) message.obj;
                    try {
                        u30Var.a.queueInputBuffer(t30Var3.a, 0, t30Var3.b, t30Var3.d, t30Var3.e);
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = u30Var.d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                    t30Var = t30Var3;
                }
                if (t30Var != null) {
                    ArrayDeque arrayDeque = u30.C;
                    synchronized (arrayDeque) {
                        arrayDeque.add(t30Var);
                    }
                    return;
                }
                return;
            case 1:
                a(message);
                return;
            default:
                if (message.what == 1) {
                    synchronized (((u57) this.b).b) {
                        v57Var = (v57) ((WeakReference) ((u57) this.b).d).get();
                        u57Var = (u57) this.b;
                        s30Var = (s30) u57Var.e;
                    }
                    if (v57Var != null) {
                        synchronized (v57Var.d) {
                            u57Var2 = v57Var.h;
                        }
                        if (u57Var == u57Var2 && s30Var != null) {
                            v57Var.d((z57) message.obj);
                            ((u57) this.b).b(v57Var, s30Var);
                            v57Var.d(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
