package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dve  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public dve(w2f w2fVar, String str, String str2, d8f d8fVar, hfe hfeVar) {
        this.a = 2;
        this.b = str;
        this.d = str2;
        this.c = d8fVar;
        this.e = hfeVar;
        this.f = w2fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        w2f w2fVar;
        lne lneVar;
        l6f l6fVar;
        lne lneVar2;
        switch (this.a) {
            case 0:
                Bundle bundle = (Bundle) this.e;
                wne wneVar = (wne) this.f;
                String str = (String) this.b;
                a6f a6fVar = ((mve) this.d).a;
                a6fVar.W();
                try {
                    wneVar.N(a6fVar.e0(bundle, (d8f) this.c));
                    return;
                } catch (RemoteException e) {
                    a6fVar.c().f.g(str, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.d;
                synchronized (atomicReference2) {
                    try {
                        w2fVar = (w2f) this.f;
                        lneVar = w2fVar.d;
                    } catch (RemoteException e2) {
                        ppe ppeVar = ((lte) ((w2f) this.f).a).f;
                        lte.m(ppeVar);
                        ppeVar.f.h("(legacy) Failed to get conditional properties; remote exception", null, (String) this.b, e2);
                        ((AtomicReference) this.d).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.d;
                    }
                    if (lneVar == null) {
                        ppe ppeVar2 = ((lte) w2fVar.a).f;
                        lte.m(ppeVar2);
                        ppeVar2.f.h("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.b, (String) this.e);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        atomicReference2.set(lneVar.t((String) this.b, (String) this.e, (d8f) this.c));
                    } else {
                        atomicReference2.set(lneVar.n(null, (String) this.b, (String) this.e));
                    }
                    w2fVar.k0();
                    atomicReference = (AtomicReference) this.d;
                    atomicReference.notify();
                    return;
                }
            case 2:
                hfe hfeVar = (hfe) this.e;
                String str2 = (String) this.d;
                String str3 = (String) this.b;
                w2f w2fVar2 = (w2f) this.f;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        lneVar2 = w2fVar2.d;
                    } catch (RemoteException e3) {
                        ppe ppeVar3 = ((lte) w2fVar2.a).f;
                        lte.m(ppeVar3);
                        ppeVar3.f.h("Failed to get conditional properties; remote exception", str3, str2, e3);
                    }
                    if (lneVar2 == null) {
                        lte lteVar = (lte) w2fVar2.a;
                        ppe ppeVar4 = lteVar.f;
                        lte.m(ppeVar4);
                        ppeVar4.f.g(str3, str2, "Failed to get conditional properties; not connected to service");
                        l6fVar = lteVar.E;
                        lte.k(l6fVar);
                        l6fVar.R0(hfeVar, arrayList);
                        return;
                    }
                    arrayList = l6f.S0(lneVar2.t(str3, str2, (d8f) this.c));
                    w2fVar2.k0();
                    l6fVar = ((lte) w2fVar2.a).E;
                    lte.k(l6fVar);
                    l6fVar.R0(hfeVar, arrayList);
                    return;
                } catch (Throwable th) {
                    l6f l6fVar2 = ((lte) w2fVar2.a).E;
                    lte.k(l6fVar2);
                    l6fVar2.R0(hfeVar, arrayList);
                    throw th;
                }
            default:
                dne dneVar = (dne) this.d;
                CancellationToken cancellationToken = (CancellationToken) this.c;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.e;
                lge lgeVar = (lge) this.f;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
                AtomicBoolean atomicBoolean = dneVar.c;
                try {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            dneVar.a();
                            atomicBoolean.set(true);
                        }
                        if (cancellationToken.isCancellationRequested()) {
                            cancellationTokenSource.cancel();
                            return;
                        }
                        Object call = lgeVar.call();
                        if (cancellationToken.isCancellationRequested()) {
                            cancellationTokenSource.cancel();
                            return;
                        } else {
                            taskCompletionSource.setResult(call);
                            return;
                        }
                    } catch (RuntimeException e4) {
                        throw new vc7("Internal error has occurred when executing ML Kit tasks", e4);
                    }
                } catch (Exception e5) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                        return;
                    } else {
                        taskCompletionSource.setException(e5);
                        return;
                    }
                }
        }
    }

    public /* synthetic */ dve(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public dve(w2f w2fVar, AtomicReference atomicReference, String str, String str2, d8f d8fVar) {
        this.a = 1;
        this.d = atomicReference;
        this.b = str;
        this.e = str2;
        this.c = d8fVar;
        this.f = w2fVar;
    }
}
