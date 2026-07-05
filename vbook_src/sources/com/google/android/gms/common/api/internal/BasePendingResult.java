package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import defpackage.is9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends is9> {
    public static final ro j = new ro(2);
    public is9 e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public BasePendingResult(qud qudVar) {
        Looper mainLooper;
        if (qudVar != null) {
            mainLooper = qudVar.a.g;
        } else {
            mainLooper = Looper.getMainLooper();
        }
        new ovd(mainLooper, 0);
        new WeakReference(qudVar);
    }

    public final void a(pvd pvdVar) {
        synchronized (this.a) {
            try {
                if (d()) {
                    pvdVar.a(this.f);
                } else {
                    this.c.add(pvdVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract is9 b(Status status);

    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        if (this.b.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void e(is9 is9Var) {
        synchronized (this.a) {
            try {
                if (!this.h) {
                    d();
                    am8.u("Results have already been set", !d());
                    am8.u("Result has already been consumed", !this.g);
                    this.e = is9Var;
                    this.f = is9Var.b();
                    this.b.countDown();
                    ArrayList arrayList = this.c;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((pvd) arrayList.get(i)).a(this.f);
                    }
                    arrayList.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
